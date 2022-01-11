package xyz.nucleoid.commonmessages.api;

import java.util.function.Function;

import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import xyz.nucleoid.commonmessages.impl.DynamicCommonMessage;
import xyz.nucleoid.commonmessages.impl.SimpleCommonMessage;

public interface CommonMessage {
	/**
	 * Gets the text representation of a message.
	 * @param player the recipient player
	 * @return the text
	 */
	public Text forPlayer(ServerPlayerEntity player);

	/**
	 * Sends a message to a single player.
	 * @param player the player to send the message to
	 */
	public default void sendTo(ServerPlayerEntity player) {
		player.sendMessage(this.forPlayer(player), false);
	}

	/**
	 * Sends a message to multiple players.
	 * 
	 * <p>To send a message to all players in a {@linkplain xyz.nucleoid.plasmid.game.GameSpace game space}:
	 * 
	 * <pre>{@code
	 *    commonMessage.sendTo(this.gameSpace.getPlayers());
	 * }</pre>
	 * 
	 * @param players the players to send the message to
	 */
	public default void sendTo(Iterable<ServerPlayerEntity> players) {
		for (ServerPlayerEntity player : players) {
			this.sendTo(player);
		}
	}

	public static CommonMessage of(String icon, CommonColor color, Text text) {
		return new SimpleCommonMessage(icon, color, text);
	}

	public static CommonMessage of(String icon, CommonColor color, Function<ServerPlayerEntity, Text> function) {
		return new DynamicCommonMessage(icon, color, function);
	}
}

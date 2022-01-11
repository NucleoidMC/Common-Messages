package xyz.nucleoid.commonmessages.impl;

import java.util.function.Function;

import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import xyz.nucleoid.commonmessages.api.CommonColor;

public class DynamicCommonMessage extends IconCommonMessage {
	private final Function<ServerPlayerEntity, Text> function;

	public DynamicCommonMessage(String icon, CommonColor color, Function<ServerPlayerEntity, Text> function) {
		super(icon, color);

		this.function = function;
	}

	@Override
	public Text getMessage(ServerPlayerEntity player) {
		return this.function.apply(player);
	}
}

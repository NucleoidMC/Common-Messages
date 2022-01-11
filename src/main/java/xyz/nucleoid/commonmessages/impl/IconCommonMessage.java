package xyz.nucleoid.commonmessages.impl;

import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.LiteralText;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.text.TextColor;
import xyz.nucleoid.commonmessages.api.CommonColor;
import xyz.nucleoid.commonmessages.api.CommonMessage;

public abstract class IconCommonMessage implements CommonMessage {
	private final String icon;
	private final CommonColor color;

	public IconCommonMessage(String icon, CommonColor color) {
		this.icon = icon;
		this.color = color;
	}

	public abstract Text getMessage(ServerPlayerEntity player);

	@Override
	public Text forPlayer(ServerPlayerEntity player) {
		Text message = withColor(this.getMessage(player).shallowCopy(), this.color.getMessageColor());
		return withColor(new LiteralText(icon + " ").append(message), this.color.getIconColor());
	}

	private static MutableText withColor(MutableText text, TextColor color) {
		return text.styled(style -> {
			return style.withColor(color);
		});
	}
}

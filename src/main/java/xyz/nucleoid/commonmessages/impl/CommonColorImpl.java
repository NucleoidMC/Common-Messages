package xyz.nucleoid.commonmessages.impl;

import net.minecraft.text.TextColor;
import net.minecraft.util.Formatting;
import xyz.nucleoid.commonmessages.api.CommonColor;

public class CommonColorImpl implements CommonColor {
	private final TextColor iconColor;
	private final TextColor messageColor;

	public CommonColorImpl(TextColor iconColor, TextColor messageColor) {
		this.iconColor = iconColor;
		this.messageColor = messageColor;
	}

	public CommonColorImpl(Formatting iconColor, Formatting messageColor) {
		this(TextColor.fromFormatting(iconColor), TextColor.fromFormatting(messageColor));
	}

	@Override
	public TextColor getIconColor() {
		return this.iconColor;
	}

	public TextColor getMessageColor() {
		return this.messageColor;
	}
}

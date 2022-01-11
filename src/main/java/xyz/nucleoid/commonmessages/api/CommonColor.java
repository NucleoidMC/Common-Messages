package xyz.nucleoid.commonmessages.api;

import net.minecraft.text.TextColor;
import net.minecraft.util.Formatting;
import xyz.nucleoid.commonmessages.impl.CommonColorImpl;

public interface CommonColor {
	public static final CommonColor GENERAL = CommonColor.of(Formatting.DARK_GRAY, Formatting.GRAY);
	public static final CommonColor IMPORTANT = CommonColor.of(TextColor.fromRgb(0xFF8300), TextColor.fromFormatting(Formatting.GOLD));
	public static final CommonColor FAIL = CommonColor.of(Formatting.DARK_RED, Formatting.RED);

	/**
	 * Gets the color used for the icon in a message.
	 */
	public TextColor getIconColor();

	/**
	 * Gets the color used for the primary part of a message that has an icon.
	 */
	public TextColor getMessageColor();

	public static CommonColor of(TextColor iconColor, TextColor messageColor) {
		return new CommonColorImpl(iconColor, messageColor);
	}

	public static CommonColor of(Formatting iconColor, Formatting messageColor) {
		return new CommonColorImpl(iconColor, messageColor);
	}
}

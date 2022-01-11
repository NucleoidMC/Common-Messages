package xyz.nucleoid.commonmessages.impl;

import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import xyz.nucleoid.commonmessages.api.CommonColor;

public class SimpleCommonMessage extends IconCommonMessage {
	private final Text text;

	public SimpleCommonMessage(String icon, CommonColor color, Text text) {
		super(icon, color);

		this.text = text;
	}

	@Override
	public Text getMessage(ServerPlayerEntity player) {
		return this.text;
	}
}

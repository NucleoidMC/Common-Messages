package xyz.nucleoid.commonmessages.api;

import net.minecraft.text.Text;

public final class CommonMessageHelpers {
	private static final String ARROW_RIGHT_ICON = "→";
	private static final String SKULL_ICON = "☠";
	private static final String STAR_ICON = "★";
	private static final String SWORD_ICON = "🗡";

	private CommonMessageHelpers() {
		return;
	}

	public static CommonMessage ofArrowRight(Text text) {
		return CommonMessage.of(ARROW_RIGHT_ICON, CommonColor.GENERAL, text);
	}

	public static CommonMessage ofArrowRightImportant(Text text) {
		return CommonMessage.of(ARROW_RIGHT_ICON, CommonColor.IMPORTANT, text);
	}

	public static CommonMessage ofArrowRightFail(Text text) {
		return CommonMessage.of(ARROW_RIGHT_ICON, CommonColor.FAIL, text);
	}

	public static CommonMessage ofSkull(Text text) {
		return CommonMessage.of(SKULL_ICON, CommonColor.GENERAL, text);
	}

	public static CommonMessage ofSkullImportant(Text text) {
		return CommonMessage.of(SKULL_ICON, CommonColor.IMPORTANT, text);
	}

	public static CommonMessage ofSkullFail(Text text) {
		return CommonMessage.of(SKULL_ICON, CommonColor.FAIL, text);
	}
	
	public static CommonMessage ofStar(Text text) {
		return CommonMessage.of(STAR_ICON, CommonColor.GENERAL, text);
	}
	
	public static CommonMessage ofStarImportant(Text text) {
		return CommonMessage.of(STAR_ICON, CommonColor.IMPORTANT, text);
	}

	public static CommonMessage ofStarFail(Text text) {
		return CommonMessage.of(STAR_ICON, CommonColor.FAIL, text);
	}

	public static CommonMessage ofSword(Text text) {
		return CommonMessage.of(SWORD_ICON, CommonColor.GENERAL, text);
	}

	public static CommonMessage ofSwordImportant(Text text) {
		return CommonMessage.of(SWORD_ICON, CommonColor.IMPORTANT, text);
	}

	public static CommonMessage ofSwordFail(Text text) {
		return CommonMessage.of(SWORD_ICON, CommonColor.FAIL, text);
	}
}

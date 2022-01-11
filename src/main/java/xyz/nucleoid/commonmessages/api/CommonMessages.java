package xyz.nucleoid.commonmessages.api;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.TranslatableText;
import xyz.nucleoid.plasmid.game.common.team.GameTeam;

public final class CommonMessages {
	private CommonMessages() {
		return;
	}

	public static CommonMessage death(LivingEntity entity, DamageSource source) {
		return CommonMessageHelpers.ofSkull(source.getDeathMessage(entity));
	}

	public static CommonMessage eliminated(ServerPlayerEntity player) {
		return CommonMessageHelpers.ofSkullFail(new TranslatableText("text.commonmessages.eliminated", player.getDisplayName()));
	}

	public static CommonMessage eliminatedBy(ServerPlayerEntity target, ServerPlayerEntity source) {
		return CommonMessageHelpers.ofSkullFail(new TranslatableText("text.commonmessages.eliminated.by", target.getDisplayName(), source.getDisplayName()));
	}

	public static CommonMessage eliminatedOutOfBounds(ServerPlayerEntity player) {
		return CommonMessageHelpers.ofSkullFail(new TranslatableText("text.commonmessages.eliminated.out_of_bounds", player.getDisplayName()));
	}

	public static CommonMessage eliminatedOutOfBoundsBy(ServerPlayerEntity target, ServerPlayerEntity source) {
		return CommonMessageHelpers.ofSkullFail(new TranslatableText("text.commonmessages.eliminated.out_of_bounds.by", target.getDisplayName(), source.getDisplayName()));
	}

	public static CommonMessage knockbackEnabled() {
		return CommonMessageHelpers.ofSwordFail(new TranslatableText("text.commonmessages.knockback_enabled"));
	}

	public static CommonMessage nextTurn(ServerPlayerEntity player) {
		return CommonMessageHelpers.ofArrowRightImportant(new TranslatableText("text.commonmessages.next_turn", player.getDisplayName()));
	}

	public static CommonMessage noTurn() {
		return CommonMessageHelpers.ofArrowRightFail(new TranslatableText("text.commonmessages.no_turn"));
	}

	public static CommonMessage noWin() {
		return CommonMessageHelpers.ofStarFail(new TranslatableText("text.commonmessages.no_win"));
	}

	public static CommonMessage noWinAfterRounds(int rounds) {
		return CommonMessageHelpers.ofStarFail(new TranslatableText("text.commonmessages.no_win.after_rounds", rounds));
	}

	public static CommonMessage noWinWithinRounds(int rounds) {
		return CommonMessageHelpers.ofStarFail(new TranslatableText("text.commonmessages.no_win.within_rounds", rounds));
	}

	public static CommonMessage otherTurn(ServerPlayerEntity player) {
		return CommonMessageHelpers.ofArrowRightFail(new TranslatableText("text.commonmessages.other_turn", player.getDisplayName()));
	}

	public static CommonMessage teamEliminated(GameTeam team) {
		return CommonMessageHelpers.ofSkullFail(new TranslatableText("text.commonmessages.team_eliminated", team.config().name()));
	}

	public static CommonMessage teamEliminatedBy(GameTeam target, ServerPlayerEntity source) {
		return CommonMessageHelpers.ofSkullFail(new TranslatableText("text.commonmessages.team_eliminated.by", target.config().name(), source.getDisplayName()));
	}

	public static CommonMessage teamEliminatedByTeam(GameTeam target, GameTeam source) {
		return CommonMessageHelpers.ofSkullFail(new TranslatableText("text.commonmessages.team_eliminated.by_team", target.config().name(), source.config().name()));
	}

	public static CommonMessage teamWin(GameTeam team) {
		return CommonMessageHelpers.ofStarImportant(new TranslatableText("text.commonmessages.team_win", team.config().name()));
	}

	public static CommonMessage teamWinAfterRounds(GameTeam team, int rounds) {
		return CommonMessageHelpers.ofStarImportant(new TranslatableText("text.commonmessages.team_win.after_rounds", team.config().name(), rounds));
	}

	public static CommonMessage win(ServerPlayerEntity player) {
		return CommonMessageHelpers.ofStarImportant(new TranslatableText("text.commonmessages.win", player.getDisplayName()));
	}

	public static CommonMessage winAfterRounds(ServerPlayerEntity player, int rounds) {
		return CommonMessageHelpers.ofStarImportant(new TranslatableText("text.commonmessages.win.after_rounds", player.getDisplayName(), rounds));
	}
}

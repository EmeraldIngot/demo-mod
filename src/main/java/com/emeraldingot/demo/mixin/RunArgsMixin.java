package com.emeraldingot.demo.mixin;


import net.minecraft.client.RunArgs;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(RunArgs.Game.class)
public class RunArgsMixin {
	@ModifyVariable(method = "<init>", at = @At("HEAD"), ordinal = 0)
	private static boolean modifyDemo(boolean isDemo) {
		return true;
	}
}
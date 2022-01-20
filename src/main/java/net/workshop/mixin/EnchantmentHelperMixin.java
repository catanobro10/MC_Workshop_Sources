package net.workshop.mixin;

import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.workshop.item.SpearItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(EnchantmentHelper.class)
public class EnchantmentHelperMixin {

    @Inject(method = "getSweepingMultiplier(Lnet/minecraft/entity/LivingEntity;)F", at = @At(value = "HEAD"), cancellable = false)
    private static void getSweepingMultiplierMixin(LivingEntity entity, CallbackInfoReturnable<Float> info) {
        ItemStack itemStack = entity.getStackInHand(Hand.MAIN_HAND);
        if (itemStack.getItem() instanceof SpearItem) {
            info.setReturnValue(0F);
        }
    }
}

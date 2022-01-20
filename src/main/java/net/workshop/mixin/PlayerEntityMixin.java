package net.workshop.mixin;

import com.mojang.authlib.GameProfile;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.workshop.item.SpearItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PlayerEntity.class)
public abstract class PlayerEntityMixin extends LivingEntity {

    public PlayerEntityMixin(World world, BlockPos pos, float yaw, GameProfile profile) {
        super(EntityType.PLAYER, world);
    }

    @Inject(method = "attack", at = @At(value = "INVOKE", target = "Lnet/minecraft/enchantment/EnchantmentHelper;getSweepingMultiplier(Lnet/minecraft/entity/LivingEntity;)F"))
    public void getSpearHitEffects(Entity target, CallbackInfo info) {
        ItemStack itemStack = this.getStackInHand(Hand.MAIN_HAND);
        if (!this.world.isClient && itemStack.getItem() instanceof SpearItem && target instanceof LivingEntity) {
            ((LivingEntity) target).addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 20, 0, false, true, true));

            world.playSound(attackingPlayer, this.getBlockPos(), SoundEvents.ITEM_TRIDENT_THROW, SoundCategory.PLAYERS, 0.85F, 1.5F);
            world.playSound(attackingPlayer, this.getBlockPos(), SoundEvents.ITEM_TRIDENT_HIT, SoundCategory.PLAYERS, 0.5F, 1.5F);
        }

    }

}

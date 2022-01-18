package net.workshop.item;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class TierEmeraldItem implements ToolMaterial {

    public static final TierEmeraldItem INSTANCE = new TierEmeraldItem();

    @Override
    public int getDurability() {
        return 50;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 15F;
    }

    @Override
    public float getAttackDamage() {
        return 5F;
    }

    @Override
    public int getMiningLevel() {
        return 3;
    }

    @Override
    public int getEnchantability() {
        return 30;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.EMERALD);
    }
}

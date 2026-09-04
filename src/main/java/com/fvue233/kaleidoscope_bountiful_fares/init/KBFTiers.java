package com.fvue233.kaleidoscope_bountiful_fares.init;

import net.hecco.bountifulfares.registry.content.BFItems;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;

public class KBFTiers {
    public static final Tier CERAMIC = new Tier() {
        @Override
        public int getUses() {
            return 250;
        }

        @Override
        public float getSpeed() {
            return 6.0F;
        }

        @Override
        public float getAttackDamageBonus() {
            return 2.0F;
        }

        public int getLevel() {
            return 1;
        }

        @Override
        public int getEnchantmentValue() {
            return 15;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return Ingredient.of(BFItems.CERAMIC_TILE.get());
        }

        @Override
        public TagKey<Block> getIncorrectBlocksForDrops() {
            return null;
        }
    };

    public KBFTiers() {
    }
}

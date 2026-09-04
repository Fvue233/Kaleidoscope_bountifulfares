package com.fvue233.kaleidoscope_bountiful_fares.effect;

import net.hecco.bountifulfares.registry.content.BFEffects;
import net.minecraft.core.Holder;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class ChamomileTeaBuffEffect extends MobEffect {
    private static final List<Holder<?>> REMOVED_EFFECTS = List.of(
            MobEffects.CONFUSION,
            MobEffects.POISON,
            BFEffects.ACIDIC
    );

    public ChamomileTeaBuffEffect(int color) {
        super(MobEffectCategory.NEUTRAL, color);
    }

    @Override
    public boolean applyEffectTick(@NotNull LivingEntity entity, int amplifier) {
        REMOVED_EFFECTS.forEach(effect -> {
            if (entity.hasEffect((Holder<MobEffect>) effect)) {
                entity.removeEffect((Holder<MobEffect>) effect);
            }
        });
        return true;
    }

    @Override
    public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
        return true;
    }
}
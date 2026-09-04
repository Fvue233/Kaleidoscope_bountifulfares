package com.fvue233.kaleidoscope_bountiful_fares.init;


import com.github.ysbbbbbb.kaleidoscopecookery.init.registry.TeacupRegistry;
import net.hecco.bountifulfares.registry.content.BFEffects;
import com.fvue233.kaleidoscope_bountiful_fares.init.KBFEffect;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;

public class KBFTeacups {
    public static ResourceLocation WATER_CUP;
    public static ResourceLocation GREEN_TEA;
    public static ResourceLocation BLACK_TEA;
    public static ResourceLocation CHAMOMILE_TEA;
    public static ResourceLocation HONEYSUCKLE_TEA;
    public static ResourceLocation BELLFLOWER_TEA;
    public static ResourceLocation TORCHFLOWER_TEA;

    public KBFTeacups() {
    }

    public static void init() {
        TeacupRegistry registry = new TeacupRegistry();

        WATER_CUP = registry.registerTeacupData(id("water_cup"),
                TeacupRegistry.TeacupData.create(4));

        GREEN_TEA = registry.registerTeacupData(id("green_tea"),
                TeacupRegistry.TeacupData.create(4)
                        .addEffect(() -> new MobEffectInstance(BFEffects.EBULLIENCE, 6000))
                        .addEffect(() -> new MobEffectInstance(KBFEffect.GREEN_TEA_BUFF, 1)));

        BLACK_TEA = registry.registerTeacupData(id("black_tea"),
                TeacupRegistry.TeacupData.create(4)
                        .addEffect(() -> new MobEffectInstance(BFEffects.EBULLIENCE, 6000))
                        .addEffect(() -> new MobEffectInstance(KBFEffect.BLACK_TEA_BUFF, 1)));

        CHAMOMILE_TEA = registry.registerTeacupData(id("chamomile_tea"),
                TeacupRegistry.TeacupData.create(4)
                        .addEffect(() -> new MobEffectInstance(BFEffects.EBULLIENCE, 6000))
                        .addEffect(() -> new MobEffectInstance(KBFEffect.CHAMOMILE_TEA_BUFF, 1)));

        HONEYSUCKLE_TEA = registry.registerTeacupData(id("honeysuckle_tea"),
                TeacupRegistry.TeacupData.create(4)
                        .addEffect(() -> new MobEffectInstance(BFEffects.EBULLIENCE, 6000))
                        .addEffect(() -> new MobEffectInstance(KBFEffect.HONEYSUCKLE_TEA_BUFF, 1)));

        BELLFLOWER_TEA = registry.registerTeacupData(id("bellflower_tea"),
                TeacupRegistry.TeacupData.create(4)
                        .addEffect(() -> new MobEffectInstance(BFEffects.EBULLIENCE, 6000))
                        .addEffect(() -> new MobEffectInstance(KBFEffect.BELLFLOWER_TEA_BUFF, 1)));

        TORCHFLOWER_TEA = registry.registerTeacupData(id("torchflower_tea"),
                TeacupRegistry.TeacupData.create(4)
                        .addEffect(() -> new MobEffectInstance(BFEffects.EBULLIENCE, 6000))
                        .addEffect(() -> new MobEffectInstance(KBFEffect.TORCHFLOWER_TEA_BUFF, 1)));
    }


    public static ResourceLocation id(String name) {
        return ResourceLocation.fromNamespaceAndPath("kaleidoscope_bountiful_fares", name);
    }
}

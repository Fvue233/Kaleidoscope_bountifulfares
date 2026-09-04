package com.fvue233.kaleidoscope_bountiful_fares.init;

import com.fvue233.kaleidoscope_bountiful_fares.KaleidoscopeBountifulFares; // 假设主类有 MOD_ID
import com.fvue233.kaleidoscope_bountiful_fares.effect.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.effect.MobEffect;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class KBFEffect {
    public static final DeferredRegister<MobEffect> EFFECTS =
            DeferredRegister.create(Registries.MOB_EFFECT, KaleidoscopeBountifulFares.MODID);

    // 六个茶类增益效果，传入十六进制颜色值（可自己修改）
    public static final DeferredHolder<MobEffect, MobEffect> GREEN_TEA_BUFF =
            EFFECTS.register("green_tea_buff", () -> new GreenTeaBuffEffect(0x88C057));

    public static final DeferredHolder<MobEffect, MobEffect> BLACK_TEA_BUFF =
            EFFECTS.register("black_tea_buff", () -> new BlackTeaBuffEffect(0x3D1C00));

    public static final DeferredHolder<MobEffect, MobEffect> BELLFLOWER_TEA_BUFF =
            EFFECTS.register("bellflower_tea_buff", () -> new BellflowerTeaBuffEffect(0x7B68EE));

    public static final DeferredHolder<MobEffect, MobEffect> CHAMOMILE_TEA_BUFF =
            EFFECTS.register("chamomile_tea_buff", () -> new ChamomileTeaBuffEffect(0xFFD700));

    public static final DeferredHolder<MobEffect, MobEffect> HONEYSUCKLE_TEA_BUFF =
            EFFECTS.register("honeysuckle_tea_buff", () -> new HoneysuckleTeaBuffEffect(0xF0E68C));

    public static final DeferredHolder<MobEffect, MobEffect> TORCHFLOWER_TEA_BUFF =
            EFFECTS.register("torchflower_tea_buff", () -> new TorchflowerTeaBuffEffect(0xFF8C00));
}
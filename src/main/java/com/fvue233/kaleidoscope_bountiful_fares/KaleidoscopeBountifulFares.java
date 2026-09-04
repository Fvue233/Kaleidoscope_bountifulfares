package com.fvue233.kaleidoscope_bountiful_fares;

import com.fvue233.kaleidoscope_bountiful_fares.init.KBFCreativeTabs;
import com.fvue233.kaleidoscope_bountiful_fares.init.KBFItems;
import com.fvue233.kaleidoscope_bountiful_fares.init.KBFPlate;
import com.fvue233.kaleidoscope_bountiful_fares.init.KBFTeacups;
import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;

@Mod(KaleidoscopeBountifulFares.MODID)
public class KaleidoscopeBountifulFares {
    public static final String MODID = "kaleidoscope_bountiful_fares";
    public static final Logger LOGGER = LogUtils.getLogger();

    public KaleidoscopeBountifulFares(IEventBus modEventBus, ModContainer modContainer) {
        KBFTeacups.init();
        KBFPlate.init();
        KBFCreativeTabs.register(modEventBus);
        KBFItems.ITEMS.register(modEventBus);
    }
}

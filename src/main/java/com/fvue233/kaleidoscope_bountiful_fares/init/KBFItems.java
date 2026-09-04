package com.fvue233.kaleidoscope_bountiful_fares.init;

import com.github.ysbbbbbb.kaleidoscopecookery.item.KitchenKnifeItem;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.minecraft.world.item.Item;

public final class KBFItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems("kaleidoscope_bountiful_fares");

    public static final DeferredItem<Item> CERAMIC_KITCHEN_KNIFE = ITEMS.register("ceramic_kitchen_knife",
            () -> new KitchenKnifeItem(KBFTiers.CERAMIC));

    private KBFItems() {
    }
}

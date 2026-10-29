package com.fvue233.kaleidoscope_bountiful_fares.init;

import com.github.ysbbbbbb.kaleidoscopecookery.item.KitchenKnifeItem;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.minecraft.world.item.Item;

public final class KBFItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems("kaleidoscope_bountiful_fares");

    public static final DeferredItem<Item> CERAMIC_KITCHEN_KNIFE = ITEMS.register("ceramic_kitchen_knife",
            () -> new KitchenKnifeItem(KBFTiers.CERAMIC));

    public static final DeferredItem<Item> GREEN_TEA_BAG = ITEMS.register("green_tea_bag",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BLACK_TEA_BAG = ITEMS.register("black_tea_bag",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CHAMOMILE_TEA_BAG = ITEMS.register("chamomile_tea_bag",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> HONEYSUCKLE_TEA_BAG = ITEMS.register("honeysuckle_tea_bag",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BELLFLOWER_TEA_BAG = ITEMS.register("bellflower_tea_bag",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TORCHFLOWER_TEA_BAG = ITEMS.register("torchflower_tea_bag",
            () -> new Item(new Item.Properties()));

    private KBFItems() {
    }
}

package com.fvue233.kaleidoscope_bountiful_fares.init;

import com.github.ysbbbbbb.kaleidoscopecookery.init.registry.PlateRegistry;
import com.farcr.nomansland.common.registry.items.NMLItems;
import net.hecco.bountifulfares.registry.content.BFItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.neoforged.fml.ModList;

public class KBFPlate {
    public static ResourceLocation ORANGE_PLATTER;
    public static ResourceLocation PLUM_PLATTER;
    public static ResourceLocation LEMON_PLATTER;
    public static ResourceLocation GOLDEN_APPLE_PLATTER;
    public static ResourceLocation HOARY_APPLE_PLATTER;
    public static ResourceLocation SPONGEKIN_PLATTER;
    public static ResourceLocation BERRY_PLATTER;
    public static ResourceLocation PASSION_PLATTER;
    public static ResourceLocation PEAR_PLATTER;

    public KBFPlate() {
    }

    public static void init() {
        PlateRegistry registry = new PlateRegistry();

        ORANGE_PLATTER = registry.registerPlateData(id("orange_platter"),
                PlateRegistry.PlateData.create(4)
                        .setServingItems(BFItems.ORANGE)
                        .setLootItem(Items.BOWL)
                        .platterAABB());

        PLUM_PLATTER = registry.registerPlateData(id("plum_platter"),
                PlateRegistry.PlateData.create(4)
                        .setServingItems(BFItems.PLUM)
                        .setLootItem(Items.BOWL)
                        .platterAABB());

        LEMON_PLATTER = registry.registerPlateData(id("lemon_platter"),
                PlateRegistry.PlateData.create(4)
                        .setServingItems(BFItems.LEMON)
                        .setLootItem(Items.BOWL)
                        .platterAABB());
        if (!ModList.get().isLoaded("kaleidoscope_chinesefood")) {
            GOLDEN_APPLE_PLATTER = registry.registerPlateData(id("golden_apple_platter"),
                    PlateRegistry.PlateData.create(4)
                            .setServingItems(() -> Items.GOLDEN_APPLE)
                            .setLootItem(Items.BOWL)
                            .platterAABB());
        }

        HOARY_APPLE_PLATTER = registry.registerPlateData(id("hoary_apple_platter"),
                PlateRegistry.PlateData.create(3)
                        .setServingItems(BFItems.HOARY_APPLE)
                        .setLootItem(Items.BOWL)
                        .platterAABB());

        SPONGEKIN_PLATTER = registry.registerPlateData(id("spongekin_platter"),
                PlateRegistry.PlateData.create(3)
                        .setServingItems(BFItems.SPONGEKIN_SLICE)
                        .setLootItem(Items.BOWL)
                        .platterAABB());

        BERRY_PLATTER = registry.registerPlateData(id("berry_platter"),
                PlateRegistry.PlateData.create(4)
                        .addServingItems(BFItems.LAPISBERRIES, BFItems.ELDERBERRIES)
                        .setLootItem(Items.BOWL)
                        .platterAABB());

        PASSION_PLATTER = registry.registerPlateData(id("passion_platter"),
                PlateRegistry.PlateData.create(4)
                        .addServingItems(BFItems.PASSION_FRUIT)
                        .setLootItem(Items.BOWL)
                        .platterAABB());



        if (ModList.get().isLoaded("nomansland")) {
            PEAR_PLATTER = registry.registerPlateData(id("pear_platter"),
                    PlateRegistry.PlateData.create(4)
                            .addServingItems(NMLItems.PEAR)
                            .setLootItem(Items.BOWL)
                            .platterAABB());
        }


    }


    public static ResourceLocation id(String name) {
        return ResourceLocation.fromNamespaceAndPath("kaleidoscope_bountiful_fares", name);
    }
}

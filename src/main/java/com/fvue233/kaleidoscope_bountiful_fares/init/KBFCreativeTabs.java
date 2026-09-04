package com.fvue233.kaleidoscope_bountiful_fares.init;

import com.github.ysbbbbbb.kaleidoscopecookery.init.registry.PlateRegistry;
import com.github.ysbbbbbb.kaleidoscopecookery.init.registry.TeacupRegistry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.neoforged.fml.ModList;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.Objects;

public class KBFCreativeTabs {
    private static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, "kaleidoscope_bountiful_fares");

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> KALEIDOSCOPE_BOUNTIFUL_FOODS =
            CREATIVE_MODE_TABS.register("kaleidoscope_bountiful_foods", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.kaleidoscope_bountiful_fares"))
                    .icon(() -> new ItemStack(Objects.requireNonNull(BuiltInRegistries.ITEM.get(
                            ResourceLocation.fromNamespaceAndPath("bountifulfares", "green_tea_bottle")))))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(TeacupRegistry.getItem(KBFTeacups.WATER_CUP));
                        output.accept(TeacupRegistry.getItem(KBFTeacups.GREEN_TEA));
                        output.accept(TeacupRegistry.getItem(KBFTeacups.BLACK_TEA));
                        output.accept(TeacupRegistry.getItem(KBFTeacups.CHAMOMILE_TEA));
                        output.accept(TeacupRegistry.getItem(KBFTeacups.HONEYSUCKLE_TEA));
                        output.accept(TeacupRegistry.getItem(KBFTeacups.BELLFLOWER_TEA));
                        output.accept(TeacupRegistry.getItem(KBFTeacups.TORCHFLOWER_TEA));

                        output.accept(PlateRegistry.getItem(KBFPlate.HOARY_APPLE_PLATTER));
                        output.accept(PlateRegistry.getItem(KBFPlate.ORANGE_PLATTER));
                        output.accept(PlateRegistry.getItem(KBFPlate.PLUM_PLATTER));
                        output.accept(PlateRegistry.getItem(KBFPlate.LEMON_PLATTER));
                        output.accept(PlateRegistry.getItem(KBFPlate.SPONGEKIN_PLATTER));

                        if (!ModList.get().isLoaded("kaleidoscope_chinesefood")) {
                            output.accept(PlateRegistry.getItem(KBFPlate.GOLDEN_APPLE_PLATTER));
                        }

                        output.accept(KBFItems.CERAMIC_KITCHEN_KNIFE.get());
                    })
                    .build());

    public KBFCreativeTabs() {
    }

    private static void addItemIfExists(CreativeModeTab.Output output, String namespace, String path) {
        Item item = BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(namespace, path));
        if (item != null) {
            output.accept(Objects.requireNonNull(item));
        }
    }

    public static void register(net.neoforged.bus.api.IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}

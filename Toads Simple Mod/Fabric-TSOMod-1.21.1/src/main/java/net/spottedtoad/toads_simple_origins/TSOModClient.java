package net.spottedtoad.toads_simple_origins;

import mod.azure.azurelib.common.render.armor.AzArmorRendererRegistry;
import net.fabricmc.api.ClientModInitializer;
import net.spottedtoad.toads_simple_origins.item.ModItems;
import net.spottedtoad.toads_simple_origins.item.armor.FishBowlRenderer;
import net.spottedtoad.toads_simple_origins.item.custom.FishBowlArmorItem;

public class TSOModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        AzArmorRendererRegistry.register(FishBowlRenderer::new,
                ModItems.FISH_BOWL);
    }
}

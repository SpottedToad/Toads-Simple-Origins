package net.spottedtoad.toads_simple_origins.item.armor;

import mod.azure.azurelib.common.render.armor.AzArmorRenderer;
import mod.azure.azurelib.common.render.armor.AzArmorRendererConfig;
import net.minecraft.util.Identifier;
import net.spottedtoad.toads_simple_origins.TSOMod;

public class FishBowlRenderer extends AzArmorRenderer {
    private static final Identifier MODEL = Identifier.of(
            TSOMod.MOD_ID,
            "geo/fish_bowl.geo.json"
    );

    private static final Identifier TEXTURE = Identifier.of(
            TSOMod.MOD_ID,
            "textures/armor/fish_bowl.png"
    );

    public FishBowlRenderer() {
        super(AzArmorRendererConfig.builder(MODEL, TEXTURE)
                .setBoneProvider(new FishBowlBoneProvider())
                .build()
        );
    }

}
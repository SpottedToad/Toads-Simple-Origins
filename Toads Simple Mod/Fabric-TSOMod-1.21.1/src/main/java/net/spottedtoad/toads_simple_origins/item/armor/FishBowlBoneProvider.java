package net.spottedtoad.toads_simple_origins.item.armor;

import mod.azure.azurelib.common.model.AzBakedModel;
import mod.azure.azurelib.common.model.AzBone;
import mod.azure.azurelib.common.render.armor.bone.AzDefaultArmorBoneProvider;

public class FishBowlBoneProvider extends AzDefaultArmorBoneProvider {
    @Override
    public AzBone getHeadBone(AzBakedModel model){
        return model.getBone("armorHead").orElse(null);
    }
    @Override
    public AzBone getBodyBone(AzBakedModel model){
        return model.getBone("armorBody").orElse(null);
    }
    @Override
    public AzBone getRightArmBone(AzBakedModel model){
        return model.getBone("armorRightArm").orElse(null);
    }
    @Override
    public AzBone getLeftArmBone(AzBakedModel model){
        return model.getBone("armorLeftArm").orElse(null);
    }
    @Override
    public AzBone getRightLegBone(AzBakedModel model){
        return model.getBone("armorRightLeg").orElse(null);
    }
    @Override
    public AzBone getLeftLegBone(AzBakedModel model){
        return model.getBone("armorLeftLeg").orElse(null);
    }
    @Override
    public AzBone getRightBootBone(AzBakedModel model){
        return model.getBone("armorRightBoot").orElse(null);
    }
    @Override
    public AzBone getLeftBootBone(AzBakedModel model){
        return model.getBone("armorLeftBoot").orElse(null);
    }

}

package com.example.tutorialMod.entity.client;
import com.example.TutorialMod;
import com.example.tutorialMod.entity.custom.ChomperEntity;
import com.example.tutorialMod.entity.custom.JackEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;
public class JackModel extends AnimatedGeoModel<JackEntity> {
    @Override
    public ResourceLocation getModelResource(JackEntity object) {
        return new ResourceLocation(TutorialMod.MOD_ID, "geo/jack.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(JackEntity object) {
        return new ResourceLocation(TutorialMod.MOD_ID, "textures/entity/jack_texture.png");
    }

    @Override
    public ResourceLocation getAnimationResource(JackEntity animatable) {
        return new ResourceLocation(TutorialMod.MOD_ID, "animations/jack.animation.json");
    }
}

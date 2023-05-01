package com.example.tutorialMod.entity.client;
import com.example.tutorialMod.entity.custom.JackEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.example.TutorialMod;
import com.example.tutorialMod.entity.custom.JackEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;
public class JackRenderer extends GeoEntityRenderer<JackEntity> {
    public JackRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new JackModel());
        this.shadowRadius = 0.3f;
    }

    @Override
    public ResourceLocation getTextureLocation(JackEntity instance) {
        return new ResourceLocation(TutorialMod.MOD_ID, "textures/entity/jack_texture.png");
    }

    @Override
    public RenderType getRenderType(JackEntity animatable, float partialTicks, PoseStack stack,
                                    @Nullable MultiBufferSource renderTypeBuffer,
                                    @Nullable VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(0.8f, 0.8f, 0.8f);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}

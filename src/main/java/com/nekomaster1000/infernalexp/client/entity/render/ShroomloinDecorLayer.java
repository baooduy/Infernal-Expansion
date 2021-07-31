/*
 * Copyright 2021 Infernal Studios
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.nekomaster1000.infernalexp.client.entity.render;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.nekomaster1000.infernalexp.InfernalExpansion;
import com.nekomaster1000.infernalexp.client.entity.model.ShroomloinModel;
import com.nekomaster1000.infernalexp.entities.ShroomloinEntity;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;

public class ShroomloinDecorLayer extends LayerRenderer<ShroomloinEntity, ShroomloinModel<ShroomloinEntity>> {
    public static final ResourceLocation[] SHROOMLOIN_TEXTURES = new ResourceLocation[]{
        new ResourceLocation(InfernalExpansion.MOD_ID,"textures/entity/shroomloin/1_shroomloin.png"),
        new ResourceLocation(InfernalExpansion.MOD_ID, "textures/entity/shroomloin/2_shroomloin.png"),
        new ResourceLocation(InfernalExpansion.MOD_ID, "textures/entity/shroomloin/3_shroomloin.png"),
        new ResourceLocation(InfernalExpansion.MOD_ID, "textures/entity/shroomloin/4_shroomloin.png"),
        new ResourceLocation(InfernalExpansion.MOD_ID, "textures/entity/shroomloin/5_shroomloin.png")
    };
    private final ShroomloinModel<ShroomloinEntity> model = new ShroomloinModel<>();

    public ShroomloinDecorLayer(IEntityRenderer<ShroomloinEntity, ShroomloinModel<ShroomloinEntity>> entityRendererIn) {
        super(entityRendererIn);
    }

    @Override
    public void render(MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn, ShroomloinEntity entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
        ResourceLocation texture = SHROOMLOIN_TEXTURES[entitylivingbaseIn.getFungusType()];
        renderCopyCutoutModel(this.getEntityModel(), model, texture, matrixStackIn, bufferIn, packedLightIn, entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, partialTicks, 1.0F, 1.0F, 1.0F);
    }
}

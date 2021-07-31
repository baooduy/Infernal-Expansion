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

package com.nekomaster1000.infernalexp.blocks;

import com.nekomaster1000.infernalexp.tileentities.GlowCampfireTileEntity;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.CampfireBlock;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;

public class GlowCampfireBlock extends CampfireBlock {
    public GlowCampfireBlock(boolean smokey, int fireDamage, AbstractBlock.Properties properties) {
        super(smokey, fireDamage, properties);
    }

    public TileEntity createNewTileEntity(IBlockReader worldIn) {
        return new GlowCampfireTileEntity();
    }
}

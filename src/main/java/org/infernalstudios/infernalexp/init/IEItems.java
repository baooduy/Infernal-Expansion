/*
 * Copyright 2022 Infernal Studios
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

package org.infernalstudios.infernalexp.init;

import net.minecraftforge.registries.RegistryObject;
import org.infernalstudios.infernalexp.InfernalExpansion;
import org.infernalstudios.infernalexp.blocks.DullthornsBlockItem;
import org.infernalstudios.infernalexp.items.AscusBombItem;
import org.infernalstudios.infernalexp.items.EntityBucketItem;
import org.infernalstudios.infernalexp.items.GlowcoalItem;
import org.infernalstudios.infernalexp.items.GlowsilkBowItem;
import org.infernalstudios.infernalexp.items.InfernalPaintingItem;
import org.infernalstudios.infernalexp.items.ItemBase;
import org.infernalstudios.infernalexp.items.SlurpSoupItem;
import org.infernalstudios.infernalexp.items.WhipItem;
import org.infernalstudios.infernalexp.items.IESpawnEggItem;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.item.BowItem;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.BowlFoodItem;
import net.minecraft.world.item.StandingAndWallBlockItem;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.sounds.SoundEvents;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

//import org.infernalstudios.infernalexp.util.ModItemTier;

public class IEItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, InfernalExpansion.MOD_ID);

    // Items
    public static final RegistryObject<Item> GLOWCOAL = ITEMS.register("glowcoal", GlowcoalItem::new);
    public static final RegistryObject<Item> DULLROCKS = ITEMS.register("glownuggets", ItemBase::new);
    public static final RegistryObject<Item> BLINDSIGHT_TONGUE = ITEMS.register("blindsight_tongue", ItemBase::new);
    public static final RegistryObject<Item> MOTH_DUST = ITEMS.register("moth_dust", ItemBase::new);
    public static final RegistryObject<Item> MOLTEN_GOLD_CLUSTER = ITEMS.register("molten_gold_cluster", ItemBase::new);
    public static final RegistryObject<Item> GLOWSILK = ITEMS.register("glowsilk", ItemBase::new);
    public static final RegistryObject<Item> SOUL_SALT_CLUMP = ITEMS.register("soul_salt_clump", ItemBase::new);


    // Foods
    public static final RegistryObject<BowlFoodItem> BLINDSIGHT_TONGUE_STEW = registerItem("blindsight_tongue_stew",
        () -> new SlurpSoupItem(new Item.Properties().stacksTo(1).tab(InfernalExpansion.TAB)
            .food(new FoodProperties.Builder().nutrition(6).saturationMod(0.6F)
                .effect(() ->
                    new MobEffectInstance(MobEffects.JUMP, 1200, 1), 1.0F)
                .build())));

    public static final RegistryObject<Item> CURED_JERKY = ITEMS.register("cured_jerky", () -> new Item(new Item.Properties().tab(InfernalExpansion.TAB)
        .food(new FoodProperties.Builder().nutrition(5).saturationMod(0.6F)
            .build())));

    public static final RegistryObject<Item> RAW_HOGCHOP = ITEMS.register("raw_hogchop", () -> new Item(new Item.Properties().tab(InfernalExpansion.TAB)
        .food(new FoodProperties.Builder().nutrition(4).saturationMod(0.3F).meat().build())));

    public static final RegistryObject<Item> COOKED_HOGCHOP = ITEMS.register("cooked_hogchop", () -> new Item(new Item.Properties().tab(InfernalExpansion.TAB)
        .food(new FoodProperties.Builder().nutrition(10).saturationMod(0.8F).meat().build())));


    // Spawn Eggs
    public static final RegistryObject<IESpawnEggItem> VOLINE_SPAWN_EGG = registerItem("voline_spawn_egg", () -> new IESpawnEggItem(IEEntityTypes.VOLINE, 0x2E2631, 0x652833, new Item.Properties().tab(InfernalExpansion.TAB)));
    public static final RegistryObject<IESpawnEggItem> SHROOMLOIN_SPAWN_EGG = registerItem("shroomloin_spawn_egg", () -> new IESpawnEggItem(IEEntityTypes.SHROOMLOIN, 0x854242, 0xFF6500, new Item.Properties().tab(InfernalExpansion.TAB)));
    public static final RegistryObject<IESpawnEggItem> WARPBEETLE_SPAWN_EGG = registerItem("warpbeetle_spawn_egg", () -> new IESpawnEggItem(IEEntityTypes.WARPBEETLE, 0x72EA95, 0x2D3860, new Item.Properties().tab(InfernalExpansion.TAB)));
    // public static final RegistryObject<ModSpawnEggItem> CEROBEETLE_SPAWN_EGG = ITEMS.register("cerobeetle_spawn_egg",() -> new ModSpawnEggItem(ModEntityType.CEROBEETLE, 0x73EB96, 0x409089, new Item.Properties().group(InfernalExpansion.TAB)));
    public static final RegistryObject<IESpawnEggItem> EMBODY_SPAWN_EGG = registerItem("embody_spawn_egg", () -> new IESpawnEggItem(IEEntityTypes.EMBODY, 0x796152, 0x6DEDF1, new Item.Properties().tab(InfernalExpansion.TAB)));
    public static final RegistryObject<IESpawnEggItem> BASALT_GIANT_SPAWN_EGG = registerItem("basalt_giant_spawn_egg", () -> new IESpawnEggItem(IEEntityTypes.BASALT_GIANT, 0x545454, 0xe36412, new Item.Properties().tab(InfernalExpansion.TAB)));
    public static final RegistryObject<IESpawnEggItem> GLOWSQUITO_SPAWN_EGG = registerItem("glowsquito_spawn_egg", () -> new IESpawnEggItem(IEEntityTypes.GLOWSQUITO, 0x383948, 0xe5c092, new Item.Properties().tab(InfernalExpansion.TAB)));
    public static final RegistryObject<IESpawnEggItem> BLACKSTONE_DWARF_SPAWN_EGG = registerItem("blackstone_dwarf_spawn_egg", () -> new IESpawnEggItem(IEEntityTypes.BLACKSTONE_DWARF, 0x1a1a1c, 0x36313f, new Item.Properties().tab(InfernalExpansion.TAB)));
    public static final RegistryObject<IESpawnEggItem> BLINDSIGHT_SPAWN_EGG = registerItem("blindsight_spawn_egg", () -> new IESpawnEggItem(IEEntityTypes.BLINDSIGHT, 0x312c36, 0xfbda74, new Item.Properties().tab(InfernalExpansion.TAB)));
    public static final RegistryObject<IESpawnEggItem> GLOWSILK_MOTH_SPAWN_EGG = registerItem("glowsilk_moth_spawn_egg", () -> new IESpawnEggItem(IEEntityTypes.GLOWSILK_MOTH, 0x724423, 0xe3b064, new Item.Properties().tab(InfernalExpansion.TAB)));
    //  public static final RegistryObject<ModSpawnEggItem> PYRNO_SPAWN_EGG = ITEMS.register("pyrno_spawn_egg", () -> new ModSpawnEggItem(ModEntityType.PYRNO, 0x5D514B, 0xFEE15E, new Item.Properties().group(InfernalExpansion.TAB)));

    // Bucket items
    public static final RegistryObject<EntityBucketItem> VOLINE_BUCKET = registerItem("voline_bucket", () -> new EntityBucketItem(IEEntityTypes.VOLINE::get, Fluids.LAVA, () -> SoundEvents.BUCKET_EMPTY_LAVA, new Item.Properties().stacksTo(1).tab(InfernalExpansion.TAB)));
    public static final RegistryObject<EntityBucketItem> MAGMA_CUBE_BUCKET = registerItem("magma_cube_bucket", () -> new EntityBucketItem(() -> EntityType.MAGMA_CUBE, Fluids.LAVA, () -> SoundEvents.MAGMA_CUBE_SQUISH, new Item.Properties().stacksTo(1).tab(InfernalExpansion.TAB)));
    public static final RegistryObject<EntityBucketItem> STRIDER_BUCKET = registerItem("strider_bucket", () -> new EntityBucketItem(() -> EntityType.STRIDER, Fluids.LAVA, () -> SoundEvents.BUCKET_EMPTY_LAVA, new Item.Properties().stacksTo(1).tab(InfernalExpansion.TAB)));

    // Block items
    public static final RegistryObject<Item> GLOW_TORCH = registerItem("glow_torch", () -> new StandingAndWallBlockItem(IEBlocks.GLOW_TORCH.get(), IEBlocks.GLOW_TORCH_WALL.get(), (new Item.Properties()).tab(InfernalExpansion.TAB)));

    public static final RegistryObject<Item> DULLTHORNS = registerItem("dullthorns", () -> new DullthornsBlockItem(IEBlocks.DULLTHORNS.get()));

    public static final RegistryObject<Item> ASCUS_BOMB = registerItem("ascus_bomb", AscusBombItem::new);
    public static final RegistryObject<Item> INFERNAL_PAINTING = registerItem("infernal_painting", () -> new InfernalPaintingItem((new Item.Properties()).tab(CreativeModeTab.TAB_DECORATIONS)));

    // Record Discs
    public static final RegistryObject<Item> MUSIC_DISC_SOUL_SPUNK = registerItem("music_disc_soul_spunk", () -> new RecordItem(8, () -> IESoundEvents.MUSIC_DISC_SOUL_SPUNK.get(), new Item.Properties().tab(InfernalExpansion.TAB).rarity(Rarity.RARE).stacksTo(1)));
    public static final RegistryObject<Item> MUSIC_DISC_FLUSH = registerItem("music_disc_flush", () -> new RecordItem(7, () -> IESoundEvents.MUSIC_DISC_FLUSH.get(), new Item.Properties().tab(InfernalExpansion.TAB).rarity(Rarity.RARE).stacksTo(1)));

    // Tools
    public static final RegistryObject<BowItem> GLOWSILK_BOW = registerItem("glowsilk_bow", () -> new GlowsilkBowItem(new Item.Properties().durability(384).tab(InfernalExpansion.TAB)));
    public static final RegistryObject<WhipItem> BLINDSIGHT_TONGUE_WHIP = registerItem("blindsight_tongue_whip", () -> new WhipItem(IEItemTiers.BLINDSIGHT_TONGUE, 1.0F, -3.4F, new Item.Properties().tab(InfernalExpansion.TAB)));

    public static final RegistryObject<Item> TAB_ITEM = registerItem("tab_icon", () -> new Item(new Item.Properties()));

    /*
    public static final RegistryObject<SwordItem> FROSTBITTEN_SWORD = ITEMS.register("frostbitten_sword", () -> new SwordItem(ModItemTier.FROSTBITTEN_NETHERITE, 2, -2.4F, new Item.Properties().group(InfernalExpansion.TAB)));
    public static final RegistryObject<PickaxeItem> FROSTBITTEN_PICKAXE = ITEMS.register("frostbitten_pickaxe", () -> new PickaxeItem(ModItemTier.FROSTBITTEN_NETHERITE, 1, -2.4F, new Item.Properties().group(InfernalExpansion.TAB)));
    public static final RegistryObject<AxeItem> FROSTBITTEN_AXE = ITEMS.register("frostbitten_axe", () -> new AxeItem(ModItemTier.FROSTBITTEN_NETHERITE, 4, -3.1F, new Item.Properties().group(InfernalExpansion.TAB)));
    public static final RegistryObject<ShovelItem> FROSTBITTEN_SHOVEL = ITEMS.register("frostbitten_shovel", () -> new ShovelItem(ModItemTier.FROSTBITTEN_NETHERITE, -1, -2.4F, new Item.Properties().group(InfernalExpansion.TAB)));
    public static final RegistryObject<HoeItem> FROSTBITTEN_HOE = ITEMS.register("frostbitten_hoe", () -> new HoeItem(ModItemTier.FROSTBITTEN_NETHERITE, -2, -1.0F, new Item.Properties().group(InfernalExpansion.TAB)));

 */
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
        InfernalExpansion.LOGGER.info("Infernal Expansion: Items Registered!");
    }

    public static <T extends Item> RegistryObject<T> registerItem(String name, Supplier<? extends T> itemSupplier) {
        return ITEMS.register(name, itemSupplier);
    }

}

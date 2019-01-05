package arthurbambou.paintingmod.registery;

import arthurbambou.paintingmod.api.ColoredBlock;
import arthurbambou.paintingmod.api.ColoredStairs;
import arthurbambou.paintingmod.blocks.SoggyClay;
import net.fabricmc.fabric.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {
    public static final List<ColoredBlock> COLORED_BLOCKS = new ArrayList<ColoredBlock>();
    public static final List<ColoredStairs> COLORED_STAIRS = new ArrayList<ColoredStairs>();

    public static Block SOGGY_CLAY;

    public static ColoredBlock STONE;
    public static ColoredBlock GRANITE;
    public static ColoredBlock POLISHED_GRANITE;
    public static ColoredBlock DIORITE;
    public static ColoredBlock POLISHED_DIORITE;
    public static ColoredBlock ANDESITE;
    public static ColoredBlock POLISHED_ANDESITE;
    public static ColoredBlock DIRT;
    public static ColoredBlock COARSE_DIRT;
    public static ColoredBlock COBBLESTONE;
    public static ColoredBlock OAK_PLANK;
    public static ColoredBlock SPRUCE_PLANK;
    public static ColoredBlock BIRCH_PLANK;
    public static ColoredBlock JUNGLE_PLANK;
    public static ColoredBlock ACACIA_PLANK;
    public static ColoredBlock DARK_OAK_PLANK;
    public static ColoredBlock SAND;
    public static ColoredBlock RED_SAND;
    public static ColoredBlock GRAVEL;
    public static ColoredBlock SPONGE;
    public static ColoredBlock WET_SPONGE;
    public static ColoredBlock LAPIS_LAZULI_BLOCK;
    public static ColoredBlock SANDSTONE;
    public static ColoredBlock RED_SANDSTONE;
    public static ColoredBlock GOLD_BLOCK;
    public static ColoredBlock IRON_BLOCK;
    public static ColoredBlock BRICK;
    public static ColoredBlock MOSS_STONE;
    public static ColoredBlock OBSIDIAN;
    public static ColoredBlock DIAMOND_BLOCK;
    public static ColoredBlock ICE;
    public static ColoredBlock SNOW_BLOCK;
    public static ColoredBlock CLAY_BLOCK;
    public static ColoredBlock NETHERRACK;
    public static ColoredBlock SOUL_SAND;
    public static ColoredBlock GLOWSTONE;
    public static ColoredBlock STONE_BRICK;
    public static ColoredBlock CRACKED_STONE_BRICK;
    public static ColoredBlock MOSSY_STONE_BRICK;
    public static ColoredBlock CHISELED_STONE_BRICK;
    public static ColoredBlock NETHER_BRICK;
    public static ColoredBlock END_STONE;
    public static ColoredBlock EMERALD_BLOCK;
    public static ColoredBlock QUARTZ_BLOCK;
    public static ColoredBlock PRISMARINE;
    public static ColoredBlock PRISMARINE_BRICK;
    public static ColoredBlock DARK_PRISMARINE;
    public static ColoredBlock SEA_LANTERN;
    public static ColoredBlock COAL_BLOCK;
    public static ColoredBlock PACKET_ICE;
    public static ColoredBlock PURPUR_BLOCK;
    public static ColoredBlock END_STONE_BRICK;
    public static ColoredBlock MAGMA_BLOCK;
    public static ColoredBlock NETHER_WART_BLOCK;
    public static ColoredBlock OAK_LEAVES;
    public static ColoredBlock SPRUCE_LEAVES;
    public static ColoredBlock BIRCH_LEAVES;
    public static ColoredBlock JUNGLE_LEAVES;
    public static ColoredBlock ACACIA_LEAVES;
    public static ColoredBlock DARK_OAK_LEAVES;
    public static ColoredBlock SLIME_BLOCK;

    public static ColoredStairs OAK_PLANKS_STAIRS;
    public static ColoredStairs SPRUCE_PLANKS_STAIRS;
    public static ColoredStairs BIRCH_PLANKS_STAIRS;
    public static ColoredStairs JUNGLE_PLANKS_STAIRS;
    public static ColoredStairs ACACIA_PLANKS_STAIRS;
    public static ColoredStairs DARK_OAK_PLANKS_STAIRS;
    public static ColoredStairs COBBLESTONE_STAIRS;
    public static ColoredStairs BRICK_STAIRS;
    public static ColoredStairs STONE_BRICK_STAIRS;
    public static ColoredStairs SANDSTONE_STAIRS;
    public static ColoredStairs NETHER_BRICK_STAIRS;
    public static ColoredStairs QUARTZ_STAIRS;
    public static ColoredStairs PURPUR_STAIRS;

    public static void init() {
        SOGGY_CLAY = new SoggyClay(FabricBlockSettings.of(Material.SAND).sounds(BlockSoundGroup.SAND).build(), "soggy_clay");

        STONE = new ColoredBlock("stone", Blocks.STONE);
        GRANITE = new ColoredBlock("granite", Blocks.GRANITE);
        POLISHED_GRANITE = new ColoredBlock("polished_granite", Blocks.POLISHED_GRANITE);
        DIORITE = new ColoredBlock("diorite", Blocks.DIORITE);
        POLISHED_DIORITE = new ColoredBlock("polished_diorite", Blocks.POLISHED_DIORITE);
        ANDESITE = new ColoredBlock("andesite", Blocks.ANDESITE);
        POLISHED_ANDESITE = new ColoredBlock("polished_andesite", Blocks.POLISHED_ANDESITE);
        DIRT = new ColoredBlock("dirt", Blocks.DIRT);
        COARSE_DIRT = new ColoredBlock("coarse_dirt", Blocks.COARSE_DIRT);
        COBBLESTONE = new ColoredBlock("cobblestone", Blocks.COBBLESTONE);
//        OAK_PLANK = new ColoredBlock("oak_plank", Blocks.OAK_PLANKS);
//        SPRUCE_PLANK = new ColoredBlock("spruce_plank", Blocks.SPRUCE_PLANKS);
//        BIRCH_PLANK = new ColoredBlock("birch_plank", Blocks.BIRCH_PLANKS);
//        JUNGLE_PLANK = new ColoredBlock("jungle_plank", Blocks.JUNGLE_PLANKS);
//        ACACIA_PLANK = new ColoredBlock("acacia_plank", Blocks.ACACIA_PLANKS);
//        DARK_OAK_PLANK = new ColoredBlock("dark_oak_plank", Blocks.DARK_OAK_PLANKS);
        SAND = new ColoredBlock("sand", Blocks.SAND);
//        RED_SAND = new ColoredBlock("red_sand", Blocks.RED_SAND);
        GRAVEL = new ColoredBlock("gravel", Blocks.GRAVEL);
        SPONGE = new ColoredBlock("sponge", Blocks.SPONGE);
        WET_SPONGE = new ColoredBlock("wet_sponge", Blocks.SPONGE);
        LAPIS_LAZULI_BLOCK = new ColoredBlock("lapis_lazuli_block", Blocks.LAPIS_BLOCK);
//        SANDSTONE = new ColoredBlock("sandstone", Blocks.SANDSTONE);
//        RED_SANDSTONE = new ColoredBlock("red_sandstone", Blocks.RED_SANDSTONE);
        GOLD_BLOCK = new ColoredBlock("gold_block", Blocks.GOLD_BLOCK);
        IRON_BLOCK = new ColoredBlock("iron_block", Blocks.IRON_BLOCK);
        BRICK = new ColoredBlock("brick", Blocks.BRICKS);
        MOSS_STONE = new ColoredBlock("moss_stone", Blocks.MOSSY_COBBLESTONE);
        OBSIDIAN = new ColoredBlock("obsidian", Blocks.OBSIDIAN);
        DIAMOND_BLOCK = new ColoredBlock("diamond_block", Blocks.DIAMOND_BLOCK);
        ICE = new ColoredBlock("ice", Blocks.ICE);
        SNOW_BLOCK = new ColoredBlock("snow_block", Blocks.SNOW_BLOCK);
        CLAY_BLOCK = new ColoredBlock("clay_block", Blocks.CLAY);
        NETHERRACK = new ColoredBlock("netherrack", Blocks.NETHERRACK);
        SOUL_SAND = new ColoredBlock("soul_sand", Blocks.SOUL_SAND);
        GLOWSTONE = new ColoredBlock("glowstone", Blocks.GLOWSTONE);
        STONE_BRICK = new ColoredBlock("stone_brick", Blocks.STONE_BRICKS);
        CRACKED_STONE_BRICK = new ColoredBlock("cracked_stone_brick", Blocks.CRACKED_STONE_BRICKS);
        MOSSY_STONE_BRICK = new ColoredBlock("mossy_stone_brick", Blocks.MOSSY_STONE_BRICKS);
        CHISELED_STONE_BRICK = new ColoredBlock("chiseled_stone_brick", Blocks.CHISELED_STONE_BRICKS);
        NETHER_BRICK = new ColoredBlock("nether_brick", Blocks.NETHER_BRICKS);
        END_STONE = new ColoredBlock("end_stone", Blocks.END_STONE);
        EMERALD_BLOCK = new ColoredBlock("emerald_block", Blocks.EMERALD_BLOCK);
//        QUARTZ_BLOCK = new ColoredBlock("quartz_block", Blocks.QUARTZ_BLOCK);
        PRISMARINE = new ColoredBlock("prismarine", Blocks.PRISMARINE);
        PRISMARINE_BRICK = new ColoredBlock("prismarine_brick", Blocks.PRISMARINE_BRICKS);
        DARK_PRISMARINE = new ColoredBlock("dark_prismarine", Blocks.DARK_PRISMARINE);
        SEA_LANTERN = new ColoredBlock("sea_lantern", Blocks.SEA_LANTERN);
        COAL_BLOCK = new ColoredBlock("coal_block", Blocks.COAL_BLOCK);
        PACKET_ICE = new ColoredBlock("packet_ice", Blocks.PACKED_ICE);
        PURPUR_BLOCK = new ColoredBlock("purpur_block", Blocks.PURPUR_BLOCK);
        END_STONE_BRICK = new ColoredBlock("end_stone_brick", Blocks.END_STONE_BRICKS);
        MAGMA_BLOCK = new ColoredBlock("magma_block", Blocks.MAGMA_BLOCK);
        NETHER_WART_BLOCK = new ColoredBlock("nether_wart_block", Blocks.NETHER_WART_BLOCK);
//        OAK_LEAVES = new ColoredBlock("oak_leaves", Blocks.OAK_LEAVES);
        SPRUCE_LEAVES = new ColoredBlock("spruce_leaves", Blocks.SPRUCE_LEAVES);
//        BIRCH_LEAVES = new ColoredBlock("birch_leaves", Blocks.BIRCH_LEAVES);
        JUNGLE_LEAVES = new ColoredBlock("jungle_leaves", Blocks.JUNGLE_LEAVES);
//        ACACIA_LEAVES = new ColoredBlock("acacia_leaves", Blocks.ACACIA_LEAVES);
//        DARK_OAK_LEAVES = new ColoredBlock("dark_oak_leaves", Blocks.DARK_OAK_LEAVES);
        SLIME_BLOCK = new ColoredBlock("slime_block", Blocks.SLIME_BLOCK);

//        OAK_PLANKS_STAIRS = new ColoredStairs("oak_planks_stairs", Blocks.OAK_STAIRS);
//        SPRUCE_PLANKS_STAIRS = new ColoredStairs("spruce_planks_stairs", Blocks.SPRUCE_STAIRS);
//        BIRCH_PLANKS_STAIRS = new ColoredStairs("birch_planks_stairs", Blocks.BIRCH_STAIRS);
//        JUNGLE_PLANKS_STAIRS = new ColoredStairs("jungle_planks_stairs", Blocks.JUNGLE_STAIRS);
//        ACACIA_PLANKS_STAIRS = new ColoredStairs("acacia_planks_stairs", Blocks.ACACIA_STAIRS);
//        DARK_OAK_PLANKS_STAIRS = new ColoredStairs("dark_oak_planks_stairs", Blocks.DARK_OAK_STAIRS);
        COBBLESTONE_STAIRS = new ColoredStairs("cobblestone_stairs", Blocks.COBBLESTONE_STAIRS);
        BRICK_STAIRS = new ColoredStairs("brick_stairs", Blocks.BRICK_STAIRS);
        STONE_BRICK_STAIRS = new ColoredStairs("stone_brick_stairs", Blocks.STONE_BRICK_STAIRS);
        SANDSTONE_STAIRS = new ColoredStairs("sandstone_stairs", Blocks.SANDSTONE_STAIRS);
        NETHER_BRICK_STAIRS = new ColoredStairs("nether_brick_stairs", Blocks.NETHER_BRICK_STAIRS);
        QUARTZ_STAIRS = new ColoredStairs("quartz_stairs", Blocks.QUARTZ_STAIRS);
        PURPUR_STAIRS = new ColoredStairs("purpur_stairs", Blocks.PURPUR_STAIRS);

        for (ColoredBlock coloredBlock : COLORED_BLOCKS) {
            coloredBlock.createBlocks();
        }

        for (ColoredStairs coloredStairs : COLORED_STAIRS) {
            coloredStairs.createBlocks();
        }
    }
}

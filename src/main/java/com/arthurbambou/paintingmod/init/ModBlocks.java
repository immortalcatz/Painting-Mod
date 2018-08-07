package com.arthurbambou.paintingmod.init;

import java.util.ArrayList;
import java.util.List;

import com.arthurbambou.paintingmod.Main;
import com.arthurbambou.paintingmod.blocks.SoggyClay;
import com.arthurbambou.paintingmod.blocks.colored.*;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class ModBlocks {
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block SOGGY_CLAY = new SoggyClay("soggy_clay", Material.IRON, Main.PAINTING_MOD);
	
	
	//Stone Blocks
	public static final Block BLACK_STONE = new BlackBlock("stone", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block RED_STONE = new RedBlock("stone", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block GREEN_STONE = new GreenBlock("stone", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block BROWN_STONE = new BrownBlock("stone", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block BLUE_STONE = new BlueBlock("stone", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block PURPLE_STONE = new PurpleBlock("stone", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block CYAN_STONE = new CyanBlock("stone", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block LIGHT_GRAY_STONE = new LightGrayBlock("stone", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block GRAY_STONE = new GrayBlock("stone", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block PINK_STONE = new PinkBlock("stone", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block LIME_STONE = new LimeBlock("stone", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block YELLOW_STONE = new YellowBlock("stone", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block LIGHT_BLUE_STONE = new LightBlueBlock("stone", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block MAGENTA_STONE = new MagentaBlock("stone", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block ORANGE_STONE = new OrangeBlock("stone", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block WHITE_STONE = new WhiteBlock("stone", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);

	//Granite Blocks
	public static final Block BLACK_GRANITE = new BlackBlock("granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block RED_GRANITE = new RedBlock("granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block GREEN_GRANITE = new GreenBlock("granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block BROWN_GRANITE = new BrownBlock("granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block BLUE_GRANITE = new BlueBlock("granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block PURPLE_GRANITE = new PurpleBlock("granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block CYAN_GRANITE = new CyanBlock("granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block LIGHT_GRAY_GRANITE = new LightGrayBlock("granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block GRAY_GRANITE = new GrayBlock("granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block PINK_GRANITE = new PinkBlock("granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block LIME_GRANITE = new LimeBlock("granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block YELLOW_GRANITE = new YellowBlock("granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block LIGHT_BLUE_GRANITE = new LightBlueBlock("granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block MAGENTA_GRANITE = new MagentaBlock("granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block ORANGE_GRANITE = new OrangeBlock("granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block WHITE_GRANITE = new WhiteBlock("granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);

	//Polished Granite Blocks
	public static final Block BLACK_POLISHED_GRANITE = new BlackBlock("polished_granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block RED_POLISHED_GRANITE = new RedBlock("polished_granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block GREEN_POLISHED_GRANITE = new GreenBlock("polished_granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block BROWN_POLISHED_GRANITE = new BrownBlock("polished_granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block BLUE_POLISHED_GRANITE = new BlueBlock("polished_granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block PURPLE_POLISHED_GRANITE = new PurpleBlock("polished_granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block CYAN_POLISHED_GRANITE = new CyanBlock("polished_granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block LIGHT_GRAY_POLISHED_GRANITE = new LightGrayBlock("polished_granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block GRAY_POLISHED_GRANITE = new GrayBlock("polished_granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block PINK_POLISHED_GRANITE = new PinkBlock("polished_granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block LIME_POLISHED_GRANITE = new LimeBlock("polished_granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block YELLOW_POLISHED_GRANITE = new YellowBlock("polished_granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block LIGHT_BLUE_POLISHED_GRANITE = new LightBlueBlock("polished_granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block MAGENTA_POLISHED_GRANITE = new MagentaBlock("polished_granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block ORANGE_POLISHED_GRANITE = new OrangeBlock("polished_granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block WHITE_POLISHED_GRANITE = new WhiteBlock("polished_granite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);

	//Diorite
	public static final Block BLACK_DIORITE= new BlackBlock("diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block RED_DIORITE= new RedBlock("diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block GREEN_DIORITE= new GreenBlock("diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block BROWN_DIORITE= new BrownBlock("diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block BLUE_DIORITE= new BlueBlock("diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block PURPLE_DIORITE= new PurpleBlock("diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block CYAN_DIORITE= new CyanBlock("diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block LIGHT_GRAY_DIORITE= new LightGrayBlock("diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block GRAY_DIORITE= new GrayBlock("diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block PINK_DIORITE= new PinkBlock("diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block LIME_DIORITE= new LimeBlock("diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block YELLOW_DIORITE= new YellowBlock("diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block LIGHT_BLUE_DIORITE= new LightBlueBlock("diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block MAGENTA_DIORITE= new MagentaBlock("diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block ORANGE_DIORITE= new OrangeBlock("diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block WHITE_DIORITE= new WhiteBlock("diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);

	//Polished Diorite
	public static final Block BLACK_POLISHED_DIORITE= new BlackBlock("polished_diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block RED_POLISHED_DIORITE= new RedBlock("polished_diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block GREEN_POLISHED_DIORITE= new GreenBlock("polished_diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block BROWN_POLISHED_DIORITE= new BrownBlock("polished_diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block BLUE_POLISHED_DIORITE= new BlueBlock("polished_diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block PURPLE_POLISHED_DIORITE= new PurpleBlock("polished_diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block CYAN_POLISHED_DIORITE= new CyanBlock("polished_diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block LIGHT_GRAY_POLISHED_DIORITE= new LightGrayBlock("polished_diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block GRAY_POLISHED_DIORITE= new GrayBlock("polished_diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block PINK_POLISHED_DIORITE= new PinkBlock("polished_diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block LIME_POLISHED_DIORITE= new LimeBlock("polished_diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block YELLOW_POLISHED_DIORITE= new YellowBlock("polished_diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block LIGHT_BLUE_POLISHED_DIORITE= new LightBlueBlock("polished_diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block MAGENTA_POLISHED_DIORITE= new MagentaBlock("polished_diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block ORANGE_POLISHED_DIORITE= new OrangeBlock("polished_diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block WHITE_POLISHED_DIORITE= new WhiteBlock("polished_diorite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);

	//Andesite
	public static final Block BLACK_ANDESITE= new BlackBlock("andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block RED_ANDESITE= new RedBlock("andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block GREEN_ANDESITE= new GreenBlock("andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block BROWN_ANDESITE= new BrownBlock("andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block BLUE_ANDESITE= new BlueBlock("andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block PURPLE_ANDESITE= new PurpleBlock("andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block CYAN_ANDESITE= new CyanBlock("andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block LIGHT_GRAY_ANDESITE= new LightGrayBlock("andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block GRAY_ANDESITE= new GrayBlock("andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block PINK_ANDESITE= new PinkBlock("andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block LIME_ANDESITE= new LimeBlock("andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block YELLOW_ANDESITE= new YellowBlock("andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block LIGHT_BLUE_ANDESITE= new LightBlueBlock("andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block MAGENTA_ANDESITE= new MagentaBlock("andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block ORANGE_ANDESITE= new OrangeBlock("andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block WHITE_ANDESITE= new WhiteBlock("andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);

	//Polished Andesite
	public static final Block BLACK_POLISHED_ANDESITE= new BlackBlock("polished_andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block RED_POLISHED_ANDESITE= new RedBlock("polished_andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block GREEN_POLISHED_ANDESITE= new GreenBlock("polished_andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block BROWN_POLISHED_ANDESITE= new BrownBlock("polished_andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block BLUE_POLISHED_ANDESITE= new BlueBlock("polished_andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block PURPLE_POLISHED_ANDESITE= new PurpleBlock("polished_andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block CYAN_POLISHED_ANDESITE= new CyanBlock("polished_andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block LIGHT_GRAY_POLISHED_ANDESITE= new LightGrayBlock("polished_andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block GRAY_POLISHED_ANDESITE= new GrayBlock("polished_andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block PINK_POLISHED_ANDESITE= new PinkBlock("polished_andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block LIME_POLISHED_ANDESITE= new LimeBlock("polished_andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block YELLOW_POLISHED_ANDESITE= new YellowBlock("polished_andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block LIGHT_BLUE_POLISHED_ANDESITE= new LightBlueBlock("polished_andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block MAGENTA_POLISHED_ANDESITE= new MagentaBlock("polished_andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block ORANGE_POLISHED_ANDESITE= new OrangeBlock("polished_andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	public static final Block WHITE_POLISHED_ANDESITE= new WhiteBlock("polished_andesite", Material.ROCK, SoundType.STONE, 1.5F, 30.0F, "pickaxe", 1);
	
	//Dirt
	public static final Block BLACK_DIRT= new BlackBlock("dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0);
	public static final Block RED_DIRT= new RedBlock("dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0);
	public static final Block GREEN_DIRT= new GreenBlock("dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0);
	public static final Block BROWN_DIRT= new BrownBlock("dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0);
	public static final Block BLUE_DIRT= new BlueBlock("dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0);
	public static final Block PURPLE_DIRT= new PurpleBlock("dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0);
	public static final Block CYAN_DIRT= new CyanBlock("dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0);
	public static final Block LIGHT_GRAY_DIRT= new LightGrayBlock("dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0);
	public static final Block GRAY_DIRT= new GrayBlock("dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0);
	public static final Block PINK_DIRT= new PinkBlock("dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0);
	public static final Block LIME_DIRT= new LimeBlock("dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0);
	public static final Block YELLOW_DIRT= new YellowBlock("dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0);
	public static final Block LIGHT_BLUE_DIRT= new LightBlueBlock("dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0);
	public static final Block MAGENTA_DIRT= new MagentaBlock("dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0);
	public static final Block ORANGE_DIRT= new OrangeBlock("dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0);
	public static final Block WHITE_DIRT= new WhiteBlock("dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0);

	//Coarse Dirt
	public static final Block BLACK_COARSE_DIRT= new BlackBlock("coarse_dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0);
	public static final Block RED_COARSE_DIRT= new RedBlock("coarse_dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0);
	public static final Block GREEN_COARSE_DIRT= new GreenBlock("coarse_dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0);
	public static final Block BROWN_COARSE_DIRT= new BrownBlock("coarse_dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0);
	public static final Block BLUE_COARSE_DIRT= new BlueBlock("coarse_dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0);
	public static final Block PURPLE_COARSE_DIRT= new PurpleBlock("coarse_dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0);
	public static final Block CYAN_COARSE_DIRT= new CyanBlock("coarse_dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0);
	public static final Block LIGHT_GRAY_COARSE_DIRT= new LightGrayBlock("coarse_dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0);
	public static final Block GRAY_COARSE_DIRT= new GrayBlock("coarse_dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0);
	public static final Block PINK_COARSE_DIRT= new PinkBlock("coarse_dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0);
	public static final Block LIME_COARSE_DIRT= new LimeBlock("coarse_dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0);
	public static final Block YELLOW_COARSE_DIRT= new YellowBlock("coarse_dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0);
	public static final Block LIGHT_BLUE_COARSE_DIRT= new LightBlueBlock("coarse_dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0);
	public static final Block MAGENTA_COARSE_DIRT= new MagentaBlock("coarse_dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0);
	public static final Block ORANGE_COARSE_DIRT= new OrangeBlock("coarse_dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0);
	public static final Block WHITE_COARSE_DIRT= new WhiteBlock("coarse_dirt", Material.GROUND, SoundType.GROUND, 0.5F, 2.5F, "shovel", 0);

	//Cobblestone
	public static final Block BLACK_COBBLESTONE= new BlackBlock("cobblestone", Material.ROCK, SoundType.STONE, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block RED_COBBLESTONE= new RedBlock("cobblestone", Material.ROCK, SoundType.STONE, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block GREEN_COBBLESTONE= new GreenBlock("cobblestone", Material.ROCK, SoundType.STONE, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block BROWN_COBBLESTONE= new BrownBlock("cobblestone", Material.ROCK, SoundType.STONE, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block BLUE_COBBLESTONE= new BlueBlock("cobblestone", Material.ROCK, SoundType.STONE, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block PURPLE_COBBLESTONE= new PurpleBlock("cobblestone", Material.ROCK, SoundType.STONE, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block CYAN_COBBLESTONE= new CyanBlock("cobblestone", Material.ROCK, SoundType.STONE, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block LIGHT_GRAY_COBBLESTONE= new LightGrayBlock("cobblestone", Material.ROCK, SoundType.STONE, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block GRAY_COBBLESTONE= new GrayBlock("cobblestone", Material.ROCK, SoundType.STONE, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block PINK_COBBLESTONE= new PinkBlock("cobblestone", Material.ROCK, SoundType.STONE, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block LIME_COBBLESTONE= new LimeBlock("cobblestone", Material.ROCK, SoundType.STONE, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block YELLOW_COBBLESTONE= new YellowBlock("cobblestone", Material.ROCK, SoundType.STONE, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block LIGHT_BLUE_COBBLESTONE= new LightBlueBlock("cobblestone", Material.ROCK, SoundType.STONE, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block MAGENTA_COBBLESTONE= new MagentaBlock("cobblestone", Material.ROCK, SoundType.STONE, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block ORANGE_COBBLESTONE= new OrangeBlock("cobblestone", Material.ROCK, SoundType.STONE, 2.0F, 30.0F, "pickaxe", 1);
	public static final Block WHITE_COBBLESTONE= new WhiteBlock("cobblestone", Material.ROCK, SoundType.STONE, 2.0F, 30.0F, "pickaxe", 1);

	//Planks Blocks
	public static final Block BLACK_PLANK = new BlackBlock("plank", Material.WOOD, SoundType.WOOD, 2.0F, 15.0F, "axe", 0);
	public static final Block RED_PLANK = new RedBlock("plank", Material.WOOD, SoundType.WOOD, 2.0F, 15.0F, "axe", 0);
	public static final Block GREEN_PLANK = new GreenBlock("plank", Material.WOOD, SoundType.WOOD, 2.0F, 15.0F, "axe", 0);
	public static final Block BROWN_PLANK = new BrownBlock("plank", Material.WOOD, SoundType.WOOD, 2.0F, 15.0F, "axe", 0);
	public static final Block BLUE_PLANK = new BlueBlock("plank", Material.WOOD, SoundType.WOOD, 2.0F, 15.0F, "axe", 0);
	public static final Block PURPLE_PLANK = new PurpleBlock("plank", Material.WOOD, SoundType.WOOD, 2.0F, 15.0F, "axe", 0);
	public static final Block CYAN_PLANK = new CyanBlock("plank", Material.WOOD, SoundType.WOOD, 2.0F, 15.0F, "axe", 0);
	public static final Block LIGHT_GRAY_PLANK = new LightGrayBlock("plank", Material.WOOD, SoundType.WOOD, 2.0F, 15.0F, "axe", 0);
	public static final Block GRAY_PLANK = new GrayBlock("plank", Material.WOOD, SoundType.WOOD, 2.0F, 15.0F, "axe", 0);
	public static final Block PINK_PLANK = new PinkBlock("plank", Material.WOOD, SoundType.WOOD, 2.0F, 15.0F, "axe", 0);
	public static final Block LIME_PLANK = new LimeBlock("plank", Material.WOOD, SoundType.WOOD, 2.0F, 15.0F, "axe", 0);
	public static final Block YELLOW_PLANK = new YellowBlock("plank", Material.WOOD, SoundType.WOOD, 2.0F, 15.0F, "axe", 0);
	public static final Block LIGHT_BLUE_PLANK = new LightBlueBlock("plank", Material.WOOD, SoundType.WOOD, 2.0F, 15.0F, "axe", 0);
	public static final Block MAGENTA_PLANK = new MagentaBlock("plank", Material.WOOD, SoundType.WOOD, 2.0F, 15.0F, "axe", 0);
	public static final Block ORANGE_PLANK = new OrangeBlock("plank", Material.WOOD, SoundType.WOOD, 2.0F, 15.0F, "axe", 0);
	public static final Block WHITE_PLANK = new WhiteBlock("plank", Material.WOOD, SoundType.WOOD, 2.0F, 15.0F, "axe", 0);
	
	//Sand
	public static final Block BLACK_SAND= new BlackBlock("sand", Material.SAND, SoundType.SAND, 0.5F, 2.5F, "shovel", 0);
	public static final Block RED_SAND= new RedBlock("sand", Material.SAND, SoundType.SAND, 0.5F, 2.5F, "shovel", 0);
	public static final Block GREEN_SAND= new GreenBlock("sand", Material.SAND, SoundType.SAND, 0.5F, 2.5F, "shovel", 0);
	public static final Block BROWN_SAND= new BrownBlock("sand", Material.SAND, SoundType.SAND, 0.5F, 2.5F, "shovel", 0);
	public static final Block BLUE_SAND= new BlueBlock("sand", Material.SAND, SoundType.SAND, 0.5F, 2.5F, "shovel", 0);
	public static final Block PURPLE_SAND= new PurpleBlock("sand", Material.SAND, SoundType.SAND, 0.5F, 2.5F, "shovel", 0);
	public static final Block CYAN_SAND= new CyanBlock("sand", Material.SAND, SoundType.SAND, 0.5F, 2.5F, "shovel", 0);
	public static final Block LIGHT_GRAY_SAND= new LightGrayBlock("sand", Material.SAND, SoundType.SAND, 0.5F, 2.5F, "shovel", 0);
	public static final Block GRAY_SAND= new GrayBlock("sand", Material.SAND, SoundType.SAND, 0.5F, 2.5F, "shovel", 0);
	public static final Block PINK_SAND= new PinkBlock("sand", Material.SAND, SoundType.SAND, 0.5F, 2.5F, "shovel", 0);
	public static final Block LIME_SAND= new LimeBlock("sand", Material.SAND, SoundType.SAND, 0.5F, 2.5F, "shovel", 0);
	public static final Block YELLOW_SAND= new YellowBlock("sand", Material.SAND, SoundType.SAND, 0.5F, 2.5F, "shovel", 0);
	public static final Block LIGHT_BLUE_SAND= new LightBlueBlock("sand", Material.SAND, SoundType.SAND, 0.5F, 2.5F, "shovel", 0);
	public static final Block MAGENTA_SAND= new MagentaBlock("sand", Material.SAND, SoundType.SAND, 0.5F, 2.5F, "shovel", 0);
	public static final Block ORANGE_SAND= new OrangeBlock("sand", Material.SAND, SoundType.SAND, 0.5F, 2.5F, "shovel", 0);
	public static final Block WHITE_SAND= new WhiteBlock("sand", Material.SAND, SoundType.SAND, 0.5F, 2.5F, "shovel", 0);

	//Gravel
	public static final Block BLACK_GRAVEL= new BlackBlock("gravel", Material.GROUND, SoundType.GROUND, 0.6F, 3.0F, "shovel", 0);
	public static final Block RED_GRAVEL= new RedBlock("gravel", Material.GROUND, SoundType.GROUND, 0.6F, 3.0F, "shovel", 0);
	public static final Block GREEN_GRAVEL= new GreenBlock("gravel", Material.GROUND, SoundType.GROUND, 0.6F, 3.0F, "shovel", 0);
	public static final Block BROWN_GRAVEL= new BrownBlock("gravel", Material.GROUND, SoundType.GROUND, 0.6F, 3.0F, "shovel", 0);
	public static final Block BLUE_GRAVEL= new BlueBlock("gravel", Material.GROUND, SoundType.GROUND, 0.6F, 3.0F, "shovel", 0);
	public static final Block PURPLE_GRAVEL= new PurpleBlock("gravel", Material.GROUND, SoundType.GROUND, 0.6F, 3.0F, "shovel", 0);
	public static final Block CYAN_GRAVEL= new CyanBlock("gravel", Material.GROUND, SoundType.GROUND, 0.6F, 3.0F, "shovel", 0);
	public static final Block LIGHT_GRAY_GRAVEL= new LightGrayBlock("gravel", Material.GROUND, SoundType.GROUND, 0.6F, 3.0F, "shovel", 0);
	public static final Block GRAY_GRAVEL= new GrayBlock("gravel", Material.GROUND, SoundType.GROUND, 0.6F, 3.0F, "shovel", 0);
	public static final Block PINK_GRAVEL= new PinkBlock("gravel", Material.GROUND, SoundType.GROUND, 0.6F, 3.0F, "shovel", 0);
	public static final Block LIME_GRAVEL= new LimeBlock("gravel", Material.GROUND, SoundType.GROUND, 0.6F, 3.0F, "shovel", 0);
	public static final Block YELLOW_GRAVEL= new YellowBlock("gravel", Material.GROUND, SoundType.GROUND, 0.6F, 3.0F, "shovel", 0);
	public static final Block LIGHT_BLUE_GRAVEL= new LightBlueBlock("gravel", Material.GROUND, SoundType.GROUND, 0.6F, 3.0F, "shovel", 0);
	public static final Block MAGENTA_GRAVEL= new MagentaBlock("gravel", Material.GROUND, SoundType.GROUND, 0.6F, 3.0F, "shovel", 0);
	public static final Block ORANGE_GRAVEL= new OrangeBlock("gravel", Material.GROUND, SoundType.GROUND, 0.6F, 3.0F, "shovel", 0);
	public static final Block WHITE_GRAVEL= new WhiteBlock("gravel", Material.GROUND, SoundType.GROUND, 0.6F, 3.0F, "shovel", 0);

	//Sponge
	public static final Block BLACK_SPONGE= new BlackBlock("sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0);
	public static final Block RED_SPONGE= new RedBlock("sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0);
	public static final Block GREEN_SPONGE= new GreenBlock("sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0);
	public static final Block BROWN_SPONGE= new BrownBlock("sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0);
	public static final Block BLUE_SPONGE= new BlueBlock("sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0);
	public static final Block PURPLE_SPONGE= new PurpleBlock("sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0);
	public static final Block CYAN_SPONGE= new CyanBlock("sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0);
	public static final Block LIGHT_GRAY_SPONGE= new LightGrayBlock("sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0);
	public static final Block GRAY_SPONGE= new GrayBlock("sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0);
	public static final Block PINK_SPONGE= new PinkBlock("sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0);
	public static final Block LIME_SPONGE= new LimeBlock("sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0);
	public static final Block YELLOW_SPONGE= new YellowBlock("sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0);
	public static final Block LIGHT_BLUE_SPONGE= new LightBlueBlock("sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0);
	public static final Block MAGENTA_SPONGE= new MagentaBlock("sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0);
	public static final Block ORANGE_SPONGE= new OrangeBlock("sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0);
	public static final Block WHITE_SPONGE= new WhiteBlock("sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0);

	//Wet Sponge
	public static final Block BLACK_WET_SPONGE= new BlackBlock("wet_sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0);
	public static final Block RED_WET_SPONGE= new RedBlock("wet_sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0);
	public static final Block GREEN_WET_SPONGE= new GreenBlock("wet_sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0);
	public static final Block BROWN_WET_SPONGE= new BrownBlock("wet_sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0);
	public static final Block BLUE_WET_SPONGE= new BlueBlock("wet_sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0);
	public static final Block PURPLE_WET_SPONGE= new PurpleBlock("wet_sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0);
	public static final Block CYAN_WET_SPONGE= new CyanBlock("wet_sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0);
	public static final Block LIGHT_GRAY_WET_SPONGE= new LightGrayBlock("wet_sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0);
	public static final Block GRAY_WET_SPONGE= new GrayBlock("wet_sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0);
	public static final Block PINK_WET_SPONGE= new PinkBlock("wet_sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0);
	public static final Block LIME_WET_SPONGE= new LimeBlock("wet_sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0);
	public static final Block YELLOW_WET_SPONGE= new YellowBlock("wet_sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0);
	public static final Block LIGHT_BLUE_WET_SPONGE= new LightBlueBlock("wet_sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0);
	public static final Block MAGENTA_WET_SPONGE= new MagentaBlock("wet_sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0);
	public static final Block ORANGE_WET_SPONGE= new OrangeBlock("wet_sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0);
	public static final Block WHITE_WET_SPONGE= new WhiteBlock("wet_sponge", Material.SPONGE, SoundType.SLIME, 0.6F, 3.0F, "null", 0);
}

package fr.arthurbambou.paintingmod.api.coloredblocks;

import fr.arthurbambou.paintingmod.api.ColoredObject;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPressurePlate;

public abstract class ColoredPressurePlate extends ColoredObject {
    public boolean isWeighted;
    public int maxWeight;
    public BlockPressurePlate.Sensitivity sensitivity;

    public ColoredPressurePlate(Block replace, BlockPressurePlate.Sensitivity sensitivity, String modID) {
        super(replace, modID);
        this.isWeighted = false;
        this.sensitivity = sensitivity;
    }

    public ColoredPressurePlate(Block replace, BlockPressurePlate.Sensitivity sensitivity, String modID, String name) {
        super(replace, modID, name);
        this.isWeighted = false;
        this.sensitivity = sensitivity;
    }

    public ColoredPressurePlate(Block replace, int maxWeight, String modID) {
        super(replace, modID);
        this.isWeighted = true;
        this.maxWeight = maxWeight;
    }

    public ColoredPressurePlate(Block replace, int maxWeight, String modID, String name) {
        super(replace, modID, name);
        this.isWeighted = true;
        this.maxWeight = maxWeight;
    }
}

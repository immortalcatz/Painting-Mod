package arthurbambou.paintingmod.blocks;

import arthurbambou.paintingmod.PaintingMod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.block.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class SoggyClay extends Block {
    public SoggyClay(Settings var1, String name) {
        super(var1);
        Registry.BLOCK.register(new Identifier(PaintingMod.MODID, name), this);
        Registry.ITEM.register(new Identifier(PaintingMod.MODID, name), new BlockItem(this, new Item.Settings().itemGroup(PaintingMod.MOD_BLOCKS)));
    }
}

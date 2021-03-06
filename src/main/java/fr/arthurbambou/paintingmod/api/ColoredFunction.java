package fr.arthurbambou.paintingmod.api;

import fr.arthurbambou.paintingmod.PaintingMod;
import fr.arthurbambou.paintingmod.api.interfaces.Functions;
import fr.arthurbambou.paintingmod.registry.ModItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.registries.ForgeRegistryEntry;

public abstract class ColoredFunction extends ForgeRegistryEntry<ColoredFunction> implements Comparable<ColoredFunction>, IStringSerializable, Functions {

    public ColoredFunction(ResourceLocation resourceLocation) {
        setRegistryName(resourceLocation);
    }

    @Override
    public int compareTo(ColoredFunction o) {
        return compareTo(o);
    }

    @Override
    public String getName() {
        return getRegistryName().getPath();
    }

    public void usedpaintbrush (EntityPlayer player) {
        if (!player.isCreative()) {
            player.getHeldItemMainhand().shrink(1);
            player.inventory.addItemStackToInventory(new ItemStack(ModItems.PAINTBRUSHES.get(0)));
        }
    }

    public void usedHeatGun(EntityPlayer player) {
        if (!player.isCreative()) {
            ItemStack itemStack = player.getHeldItemMainhand();
            itemStack.damageItem(1, player);
        }
    }
}

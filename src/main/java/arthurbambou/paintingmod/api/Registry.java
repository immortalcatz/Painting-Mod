package arthurbambou.paintingmod.api;

import java.util.ArrayList;
import java.util.List;

public class Registry {
    private static final List<ColoredBlock> COMMON_BLOCKS = new ArrayList<ColoredBlock>() {};
    private static final List<ColoredStairs> COLORED_STAIRS_LIST = new ArrayList<ColoredStairs>();
    private static final List<ColoredSlab> COLORED_SLAB_LIST = new ArrayList<ColoredSlab>();
    private static final List<ColoredWall> COLORED_WALL_LIST = new ArrayList<ColoredWall>();
    private static final List<ColoredFenceGate> COLORED_FENCE_GATE_LIST = new ArrayList<ColoredFenceGate>();

    public static List<ColoredBlock> getCommonBlocks() {
        return COMMON_BLOCKS;
    }

    public static List<ColoredStairs> getColoredStairsList() {
        return COLORED_STAIRS_LIST;
    }

    public static List<ColoredSlab> getColoredSlabList() {
        return COLORED_SLAB_LIST;
    }

    public static List<ColoredWall> getColoredWallList() {
        return COLORED_WALL_LIST;
    }

    public static List<ColoredFenceGate> getColoredFenceGateList() {
        return COLORED_FENCE_GATE_LIST;
    }

    public static void registerCommonBlocks(ColoredBlock coloredBlock) {
        String modID = coloredBlock.black.getDropTableId().getNamespace();
        COMMON_BLOCKS.add(coloredBlock);
        System.out.println("[PaintingMod API] registered colored block : " + modID + ":" +coloredBlock.getName());
    }

    public static void registerColoredStairs(ColoredStairs coloredStairs) {
        String modID = coloredStairs.black.getDropTableId().getNamespace();
        COLORED_STAIRS_LIST.add(coloredStairs);
        System.out.println("[PaintingMod API] registered colored stairs : " + modID + ":" + coloredStairs.getName());
    }

    public static void registerColoredSlab(ColoredSlab coloredSlab) {
        String modID = coloredSlab.black.getDropTableId().getNamespace();
        COLORED_SLAB_LIST.add(coloredSlab);
        System.out.println("[PaintingMod API] registered colored slab : " + modID + ":" + coloredSlab.getName());
    }

    public static void registerColoredWall(ColoredWall coloredWall) {
        String modID = coloredWall.black.getDropTableId().getNamespace();
        COLORED_WALL_LIST.add(coloredWall);
        System.out.println("[PaintingMod API] registered colored wall : " + modID + ":" + coloredWall.getName());
    }

    public static void registerColoredFenceGate(ColoredFenceGate coloredWall) {
        String modID = coloredWall.black.getDropTableId().getNamespace();
        COLORED_FENCE_GATE_LIST.add(coloredWall);
        System.out.println("[PaintingMod API] registered colored fence gate : " + modID + ":" + coloredWall.getName());
    }
}
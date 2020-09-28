package me.Cake_Manic;

import java.util.ArrayList;

public class BlocksRegistry {

    private static ArrayList<BlockBase> blocks = new ArrayList<>();

    public static ArrayList<BlockBase> getBlocks() {
        return blocks;
    }
}

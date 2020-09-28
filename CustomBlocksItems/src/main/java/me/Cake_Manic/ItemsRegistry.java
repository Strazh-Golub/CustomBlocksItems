package me.Cake_Manic;

import java.util.ArrayList;

public class ItemsRegistry {

    private static ArrayList<ItemBase> items = new ArrayList<>();

    public static ArrayList<ItemBase> getItems() {
        return items;
    }
}

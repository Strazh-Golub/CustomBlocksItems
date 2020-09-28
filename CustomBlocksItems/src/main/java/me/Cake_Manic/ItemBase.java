package me.Cake_Manic;

import org.bukkit.inventory.ItemStack;

public class ItemBase extends ItemStack {

    public ItemBase()
    {
        ItemsRegistry.getItems().add(this);
    }

}

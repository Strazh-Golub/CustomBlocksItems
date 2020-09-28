package me.Cake_Manic;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public final class CustomBlocksItems extends JavaPlugin {

    Logger logger = getLogger();

    @Override
    public void onEnable() {
        // Plugin startup logic

        //add blocks
        logger.info("Added Custom Blocks!");

        //add items
        logger.info("Added Custom Items!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic

        //remove blocks
        logger.info("Removed Custom Blocks!");

        //remove items
        logger.info("Removed Custom Items!");
    }
}

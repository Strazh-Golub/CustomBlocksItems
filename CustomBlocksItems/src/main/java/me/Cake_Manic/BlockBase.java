package me.Cake_Manic;

import org.bukkit.*;
import org.bukkit.block.*;
import org.bukkit.block.data.BlockData;
import org.bukkit.entity.Entity;
import org.bukkit.inventory.ItemStack;
import org.bukkit.metadata.MetadataValue;
import org.bukkit.plugin.Plugin;
import org.bukkit.util.BoundingBox;
import org.bukkit.util.RayTraceResult;
import org.bukkit.util.Vector;

import java.util.Collection;
import java.util.List;

public interface BlockBase extends Block {
    @Override
    byte getData();

    @Override
    BlockData getBlockData();

    @Override
    Block getRelative(int modX, int modY, int modZ);

    @Override
    Block getRelative(BlockFace face);

    @Override
    Block getRelative(BlockFace face, int distance);

    @Override
    Material getType();

    @Override
    byte getLightLevel();

    @Override
    byte getLightFromSky();

    @Override
    byte getLightFromBlocks();

    @Override
    World getWorld();

    @Override
    int getX();

    @Override
    int getY();

    @Override
    int getZ();

    @Override
    Location getLocation();

    @Override
    Location getLocation(Location loc);

    @Override
    Chunk getChunk();

    @Override
    void setBlockData(BlockData data);

    @Override
    void setBlockData(BlockData data, boolean applyPhysics);

    @Override
    void setType(Material type);

    @Override
    void setType(Material type, boolean applyPhysics);

    @Override
    BlockFace getFace(Block block);

    @Override
    BlockState getState();

    @Override
    Biome getBiome();

    @Override
    void setBiome(Biome bio);

    @Override
    boolean isBlockPowered();

    @Override
    boolean isBlockIndirectlyPowered();

    @Override
    boolean isBlockFacePowered(BlockFace face);

    @Override
    boolean isBlockFaceIndirectlyPowered(BlockFace face);

    @Override
    int getBlockPower(BlockFace face);

    @Override
    int getBlockPower();

    @Override
    boolean isEmpty();

    @Override
    boolean isLiquid();

    @Override
    double getTemperature();

    @Override
    double getHumidity();

    @Override
    PistonMoveReaction getPistonMoveReaction();

    @Override
    boolean breakNaturally();

    @Override
    boolean breakNaturally(ItemStack tool);

    @Override
    boolean applyBoneMeal(BlockFace face);

    @Override
    Collection<ItemStack> getDrops();

    @Override
    Collection<ItemStack> getDrops(ItemStack tool);

    @Override
    Collection<ItemStack> getDrops(ItemStack tool, Entity entity);

    @Override
    boolean isPassable();

    @Override
    RayTraceResult rayTrace(Location start, Vector direction, double maxDistance, FluidCollisionMode fluidCollisionMode);

    @Override
    BoundingBox getBoundingBox();

    @Override
    void setMetadata(String metadataKey, MetadataValue newMetadataValue);

    @Override
    List<MetadataValue> getMetadata(String metadataKey);

    @Override
    boolean hasMetadata(String metadataKey);

    @Override
    void removeMetadata(String metadataKey, Plugin owningPlugin);
}

package net.dtp.endmod.block;

import net.dtp.endmod.EndMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

/**
 * This class contains all the blocks of the mod.
 */
public class ModBlocks {
  // List of blocks
  // TODO: Change properties of blocks here
  public static final Block ENRICHED_ENDERITE_BLOCK = registerBlock("enriched_enderite_block",
      new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
  public static final Block DRAINED_ENDERITE_BLOCK = registerBlock("drained_enderite_block",
      new Block(FabricBlockSettings.copyOf(Blocks.RAW_IRON_BLOCK)));
  public static final Block ENDERITE_ORE = registerBlock("enderite_ore",
      new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
          FabricBlockSettings.copyOf(Blocks.END_STONE)));

  /**
   * Registers a new block.
   *
   * @param name Name of the block
   * @param block The block to be registered
   * @return The registered block
   */
  private static Block registerBlock(String name, Block block) {
    registerBlockItem(name, block);
    return Registry.register(Registries.BLOCK, new Identifier(EndMod.MOD_ID, name), block);
  }

  /**
   * Registers the item for a new block.
   *
   * @param name Name of the block
   * @param block The block to be registered
   * @return The registered block item
   */
  private static Item registerBlockItem(String name, Block block) {
    return Registry.register(Registries.ITEM, new Identifier(EndMod.MOD_ID, name),
        new BlockItem(block, new FabricItemSettings()));
  }

  /**
   * Registers all the blocks within the mod.
   */
  public static void registerModBlocks() {
    EndMod.LOGGER.info("Registering Mod Blocks for " + EndMod.MOD_ID);
  }
}

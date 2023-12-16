package net.dtp.endmod.item;

import net.dtp.endmod.EndModDtp;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

/**
 * This class contains all the items for this mod.
 */
public class ModItems {
  // List of items
  public static final Item ENDERITE = registerItem("enderite", new Item(new FabricItemSettings()));
  public static final Item RAW_ENDERITE =
      registerItem("raw_enderite", new Item(new FabricItemSettings()));

  /**
   * Registers a new item.
   *
   * @param name Name of the item
   * @param item The item
   * @return Registry with the new item
   */
  private static Item registerItem(String name, Item item) {
    return Registry.register(Registries.ITEM, new Identifier(EndModDtp.MOD_ID, name), item);
  }

  /**
   * Keeps track of all the items in the Mod.
   */
  public static void registerModItems() {
    // Output for debugging
    EndModDtp.LOGGER.info("Registering mod items for " + EndModDtp.MOD_ID);
  }
}

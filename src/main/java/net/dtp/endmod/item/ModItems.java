package net.dtp.endmod.item;

import net.dtp.endmod.EndMod;
import net.dtp.endmod.item.custom.EnderitePickaxeItem;
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
  public static final Item ENRICHED_ENDERITE =
      registerItem("enriched_enderite", new Item(new FabricItemSettings()));
  public static final Item DRAINED_ENDERITE =
      registerItem("drained_enderite", new Item(new FabricItemSettings()));
  public static final Item ENDERITE_PICKAXE =
      registerItem("enderite_pickaxe", new EnderitePickaxeItem(new FabricItemSettings().maxDamage(1500)));

  /**
   * Registers a new item.
   *
   * @param name Name of the item
   * @param item The item
   * @return Registry with the new item
   */
  private static Item registerItem(String name, Item item) {
    return Registry.register(Registries.ITEM, new Identifier(EndMod.MOD_ID, name), item);
  }

  /**
   * Keeps track of all the items in the Mod.
   */
  public static void registerModItems() {
    // Output for debugging
    EndMod.LOGGER.info("Registering mod items for " + EndMod.MOD_ID);
  }
}

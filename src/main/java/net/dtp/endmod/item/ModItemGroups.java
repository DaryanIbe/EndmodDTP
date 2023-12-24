package net.dtp.endmod.item;

import net.dtp.endmod.EndMod;
import net.dtp.endmod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

/**
 * The item groups within the mod.
 */
public class ModItemGroups {
  // List of all the item groups
  public static final ItemGroup ENDERITE_GROUP = Registry.register(Registries.ITEM_GROUP,
      new Identifier(EndMod.MOD_ID, "enderite"),
      FabricItemGroup.builder().displayName(Text.translatable("itemgroup.enderite"))
          .icon(() -> new ItemStack(ModItems.ENRICHED_ENDERITE))
          .entries((displayContext, entries) -> {
            entries.add(ModItems.ENRICHED_ENDERITE);
            entries.add(ModItems.DRAINED_ENDERITE);
            entries.add(ModBlocks.ENRICHED_ENDERITE_BLOCK);
            entries.add(ModBlocks.DRAINED_ENDERITE_BLOCK);
            entries.add(ModBlocks.ENDERITE_ORE);
            entries.add(ModItems.ENDERITE_PICKAXE);
          }).build());

  /**
   * Registers all the item groups within the mod.
   */
  public static void registerItemGroups() {
    EndMod.LOGGER.info("Registering Item Groups for " + EndMod.MOD_ID);
  }
}

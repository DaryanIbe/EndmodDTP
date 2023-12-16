package net.dtp.endmod.item;

import net.dtp.endmod.EndModDtp;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

/**
 * The item groups within th mod.
 */
public class ModItemGroups {
  public static final ItemGroup ENDERITE_GROUP = Registry.register(Registries.ITEM_GROUP,
      new Identifier(EndModDtp.MOD_ID, "enderite"),
      FabricItemGroup.builder().displayName(Text.translatable("itemgroup.enderite"))
          .icon(() -> new ItemStack(ModItems.ENDERITE)).entries((displayContext, entries) -> {
            entries.add(ModItems.ENDERITE);
            entries.add(ModItems.RAW_ENDERITE);
          }).build());

  public static void registerItemGroups() {
    EndModDtp.LOGGER.info("Registering Item Groups for " + EndModDtp.MOD_ID);
  }
}

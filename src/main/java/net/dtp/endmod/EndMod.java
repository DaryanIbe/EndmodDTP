package net.dtp.endmod;

import net.dtp.endmod.block.ModBlocks;
import net.dtp.endmod.item.ModItemGroups;
import net.dtp.endmod.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This is a little end mod by DTP.
 */
public class EndMod implements ModInitializer {
  public static final String MOD_ID = "endmod";
  public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

  @Override
  public void onInitialize() {
    ModItemGroups.registerItemGroups();
    ModItems.registerModItems();
    ModBlocks.registerModBlocks();
  }
}
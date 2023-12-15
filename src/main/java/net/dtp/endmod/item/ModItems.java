package net.dtp.endmod.item;

import net.dtp.endmod.EndModDTP;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    // List of items
    public static final Item ENDERITE = registerItem("enderite", new Item(new FabricItemSettings()));
    public static final Item RAW_ENDERITE = registerItem("raw_enderite", new Item(new FabricItemSettings()));

    /**
     * Adds items to the correct creative inventory tab
     * @param entries The items to be added
     */
    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(ENDERITE);
        entries.add(RAW_ENDERITE);
    }

    /**
     * Registers a new item.
     * @param name Name of the item
     * @param item The item
     * @return Registry with the new item
     */
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(EndModDTP.MOD_ID, name), item);
    }

    /**
     * Keeps track of all the items in the Mod
     */
    public static void registerModItems() {
        // Output for debugging
        EndModDTP.LOGGER.info("Registering mod items for " + EndModDTP.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}

package com.honeyglaze.item;

import com.honeyglaze.HoneyGlaze;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    //step 1: create custom item
    public static final Item GRAPE = registerItems("grape", new Item(new Item.Settings().food(ModFoodComponents.GRAPE)));
    public static final Item GRAPE_SEEDS = registerItems("grape_seeds", new Item(new Item.Settings()));

    private static Item registerItems(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(HoneyGlaze.MOD_ID, name), item);
    }

    //register items
    public static void registerModItems(){
        HoneyGlaze.LOGGER.info("Registering ModItems" + HoneyGlaze.MOD_ID);
        // add to creative mode tab
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(fabricItemGroupEntries -> {
            // step 2: do entries.add(itemName) after add to en_us.json
            fabricItemGroupEntries.add(GRAPE);
            fabricItemGroupEntries.add(GRAPE_SEEDS);
        });
    }

}

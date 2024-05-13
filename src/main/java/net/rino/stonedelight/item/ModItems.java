package net.rino.stonedelight.item;


import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.rino.stonedelight.StoneDelight;

public class ModItems {
    //物品定义
    public static final Item STONE = registerItem("stone" , new Item(new FabricItemSettings()));
    //处理全部物品
    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(STONE);
    }
    //注册物品
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(StoneDelight.MOD_ID, name), item);
    }
    //打印注册物品
    public static void registerModItems() {
        StoneDelight.LOGGER.info("Registering Items for" + StoneDelight.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}

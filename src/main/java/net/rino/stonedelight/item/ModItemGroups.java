package net.rino.stonedelight.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.rino.stonedelight.StoneDelight;
import net.rino.stonedelight.block.ModBlocks;

public class ModItemGroups {
    //注册创造栏列表
    public static final String MOD_TABLIST = "itemgroup.stone";
    public static final ItemGroup STONE_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(StoneDelight.MOD_ID, "stone"),
            FabricItemGroup.builder().displayName(Text.translatable(MOD_TABLIST))
                    .icon(()->new ItemStack(ModItems.STONE)).
                    entries((displayContext, entries) -> {
                        //放置到物品栏列表的物品
                        entries.add(ModItems.STONE);

                        entries.add(ModBlocks.STONEBLOCKSS);
                    }).build());
    public static void registerItemGroups() {
        StoneDelight.LOGGER.info("Registering ItemGroup for" + StoneDelight.MOD_ID);
    }
}

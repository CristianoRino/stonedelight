package net.rino.stonedelight.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.util.Identifier;
import net.rino.stonedelight.StoneDelight;
import net.rino.stonedelight.block.ModBlocks;
import net.rino.stonedelight.item.ModItems;
import net.minecraft.data.client.*;
import net.minecraft.item.Item;
import java.util.Optional;

public class ModModelGenerator extends FabricModelProvider {
    public ModModelGenerator(FabricDataOutput output) {
        super(output);
    }
    //生成方块模型
    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STONEBLOCKSS);
    }
    //生成物品模型
    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        //普通物品
        itemModelGenerator.register(ModItems.STONE, Models.GENERATED);
        //方块的物品状态
        itemModelGenerator.register(ModBlocks.STONEBLOCKSS.asItem(), registerItemBlockModel(ModBlocks.STONEBLOCKSS));
    }
    private static Model registerItemBlockModel(Block parent, TextureKey... requiredTextureKeys) {
        String name = ModelIds.getBlockModelId(parent).getPath();
        return new Model(Optional.of(new Identifier(StoneDelight.MOD_ID, name)), Optional.empty(), requiredTextureKeys);
    }
}

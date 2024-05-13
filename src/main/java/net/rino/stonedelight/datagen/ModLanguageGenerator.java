package net.rino.stonedelight.datagen;

import net.rino.stonedelight.block.ModBlocks;
import net.rino.stonedelight.item.ModItems;
import net.rino.stonedelight.item.ModItemGroups;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
public class ModLanguageGenerator extends FabricLanguageProvider {
    //生成语言文件
    public ModLanguageGenerator(FabricDataOutput dataOutput) {
        super(dataOutput,"en_us");
    }
    //生成翻译条目
    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add(ModItems.STONE,"stone");
        translationBuilder.add(ModBlocks.STONEBLOCKSS, "stoneblock");
        translationBuilder.add(ModItemGroups.MOD_TABLIST,"Stone Delight");
    }
}

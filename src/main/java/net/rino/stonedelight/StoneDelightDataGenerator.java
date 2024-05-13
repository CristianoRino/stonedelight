package net.rino.stonedelight;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.rino.stonedelight.datagen.ModLanguageGenerator;
import net.rino.stonedelight.datagen.ModModelGenerator;

public class StoneDelightDataGenerator implements DataGeneratorEntrypoint {
	//生成文件
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModModelGenerator::new);
		pack.addProvider(ModLanguageGenerator::new);
	}
}

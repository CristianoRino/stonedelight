package net.rino.stonedelight;

import net.fabricmc.api.ModInitializer;

import net.rino.stonedelight.block.ModBlocks;
import net.rino.stonedelight.item.ModItemGroups;
import net.rino.stonedelight.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StoneDelight implements ModInitializer {

	public static final String MOD_ID = "stonedelight";
    public static final Logger LOGGER = LoggerFactory.getLogger("MOD_ID");

	@Override
	public void onInitialize() {

		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
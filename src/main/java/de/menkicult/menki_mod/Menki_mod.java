package de.menkicult.menki_mod;

import de.menkicult.menki_mod.Blocks.ModBlocks;
import de.menkicult.menki_mod.Items.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.ComponentTooltipAppenderRegistry;
import net.minecraft.core.component.DataComponents;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Menki_mod implements ModInitializer {

    public static final String MOD_ID = "menkimod";

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {

        LOGGER.info("Starting Menki Mod");

        ModItems.initialize();
        ModBlocks.initialize();

    }
}

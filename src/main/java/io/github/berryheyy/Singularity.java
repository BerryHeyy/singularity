package io.github.berryheyy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.fabricmc.api.ModInitializer;
import net.minecraft.client.MinecraftClient;

public class Singularity implements ModInitializer
{
    public static final Logger LOGGER = LoggerFactory.getLogger(Reference.MOD_ID);
    public static final MinecraftClient mcClient = MinecraftClient.getInstance();

    public static Singularity INSTANCE;

    @Override
    public void onInitialize()
    {
        Singularity.INSTANCE = this;
        LOGGER.info("Initializing.");

        
    }
    
}

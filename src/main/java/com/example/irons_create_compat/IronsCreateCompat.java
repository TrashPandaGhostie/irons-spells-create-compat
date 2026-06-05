package com.example.irons_create_compat;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;
import com.mojang.logging.LogUtils;

@Mod(IronsCreateCompat.MOD_ID)
public class IronsCreateCompat {

    public static final String MOD_ID = "irons_create_compat";
    private static final Logger LOGGER = LogUtils.getLogger();

    public IronsCreateCompat(IEventBus modEventBus) {
        LOGGER.info("[IronsCreateCompat] Loaded! Rings and necklaces can now be crushed.");
    }
}

package com.beetmacol.dimensiontools;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DimensionTools implements ModInitializer {

	public static Logger logger = LogManager.getLogger(DimensionTools.class);

	@Override
	public void onInitialize() {
		logger.info("DimensionTools mod initialized.");
	}
}

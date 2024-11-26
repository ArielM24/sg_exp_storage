package com.sg.exp_storage;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sg.exp_storage.events.RecoverExpEvent;
import com.sg.exp_storage.events.StoreExpEvent;

public class SGExpStorage implements ModInitializer {
	public static final String MOD_ID = "sg_exp_storage";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static final int EXPERIENCE_PER_BOTTLE = 30;

	@Override
	public void onInitialize() {
		StoreExpEvent.registerStoreXP();
		RecoverExpEvent.registerUseExperienceBottle();
	}
}
package com.sg.exp_storage;

import com.sg.exp_storage.events.RecoverExpEvent;
import com.sg.exp_storage.events.StoreExpEvent;

import net.fabricmc.api.ClientModInitializer;

public class SGExpStorageClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		StoreExpEvent.registerStoreXP();
		RecoverExpEvent.registerUseExperienceBottle();
	}
}
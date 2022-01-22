package net.workshop;

import net.fabricmc.api.ModInitializer;
import net.workshop.init.*;

public class main implements ModInitializer {

	public static final String MOD_NAME = "workshop";

	@Override
	public void onInitialize() {

		ItemInit.init();
		BlockInit.init();
	}
}

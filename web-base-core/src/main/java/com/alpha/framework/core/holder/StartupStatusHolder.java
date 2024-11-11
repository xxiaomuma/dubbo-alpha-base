package com.alpha.framework.core.holder;

import java.util.concurrent.atomic.AtomicBoolean;

public class StartupStatusHolder {

	private static AtomicBoolean STARTUP = new AtomicBoolean(false);

	public static boolean tryStartup() {
		return STARTUP.compareAndSet(false, true);
	}

	public static boolean isStartup() {
		return STARTUP.get();
	}
}

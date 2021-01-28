package com.motherland.battlebox;

import org.bukkit.plugin.java.JavaPlugin;


public class Main extends JavaPlugin {
	@Override
	public void onEnable() {
	// Команды
		this.getCommand("Launch").setExecutor(new Launch());
		this.getCommand("Hello").setExecutor(new Hello());
		this.getCommand("Ggledpog").setExecutor(new Ggledpog());
		this.getCommand("Blin").setExecutor(new Blin());
		this.getCommand("Igsft").setExecutor(new Igsft());
	}
	
	@Override
	public void onDisable() {
		
	}
}

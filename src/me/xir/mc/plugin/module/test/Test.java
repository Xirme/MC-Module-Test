package me.xir.mc.plugin.module.test;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import me.xir.mc.plugin.core.MC_Core;
import me.xir.mc.plugin.module.test.commands.CheckMySQL;

public class Test extends JavaPlugin implements Listener {
	
	public void onEnable() {
		this.getLogger().info("[MC-Module: Test] was disabled.");
		
		this.getCommand("checkmysql").setExecutor(new CheckMySQL(this));
	}
	
	public void onDisable() {
		this.getLogger().info("[MC-Module: Test] was disabled.");
	}
}

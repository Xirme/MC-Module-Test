package me.xir.mc.plugin.module.test.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.xir.mc.plugin.core.MySQL.MySQL;
import me.xir.mc.plugin.module.test.Test;

public class CheckMySQL extends MySQL {
	
	public void onCommand(CommandSender sender, Command cmd, String commandLabel) {
		if (commandLabel.equalsIgnoreCase("checkmysql")) {
			if (sender instanceof Player) {
				if (checkConnection() != true) {
					sender.sendMessage("[MC-Core] Something went wrong with MySQL.");
				} else {
					sender.sendMessage("[MC-Core] Connection to MySQL was successful.");
				}
			}
		}
	}
}

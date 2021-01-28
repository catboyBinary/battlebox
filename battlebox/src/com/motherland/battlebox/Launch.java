package com.motherland.battlebox;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Launch implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (label.equalsIgnoreCase("launch")) {
			if(sender instanceof Player) {
				Player p = (Player) sender;
				if(p.hasPermission("launch.use")) {
					if(args.length == 0) {
						p.setVelocity(p.getLocation().getDirection().multiply(1.5).setY(1));
						return true;
					} else if(args.length == 1) {
						p.setVelocity(p.getLocation().getDirection().multiply(Float.parseFloat(args[0])).setY(Float.parseFloat(args[0])));
						return true;
					} else {
						p.sendMessage("wrong args bruh");
						return true;
					}
				}
				p.sendMessage("у вас нет прав");
				return true;
			} else {
				sender.sendMessage(ChatColor.AQUA + "*console flies away*");
				return true;
			}
		}
		return false;
	}

}

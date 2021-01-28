package com.motherland.battlebox;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Blin implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender arg0, Command arg1, String arg2, String[] arg3) {
		if(arg2.equalsIgnoreCase("blin")) {
			if(arg0 instanceof Player) {
				Player p = (Player) arg0;
				p.chat("блин(");
				p.setHealth(0);
				return true;
			}
		}
		return false;
	}
	
}

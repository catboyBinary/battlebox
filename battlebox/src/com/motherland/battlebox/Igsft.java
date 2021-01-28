package com.motherland.battlebox;

import java.util.List;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class Igsft implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender arg0, Command arg1, String arg2, String[] arg3) {
		if(arg2.equalsIgnoreCase("igsft")) {
			if(arg0 instanceof Player) {
				Player p = (Player) arg0;
				List<Player> a = p.getWorld().getPlayers();
				if(arg3.length == 0) {
					for(Player i : a) {
						i.getInventory().addItem(new ItemStack(Material.END_CRYSTAL));
						i.getInventory().addItem(new ItemStack(Material.BEDROCK));
					}
				} else {
					int b = Integer.parseInt(arg3[0]);
					while(b > 0) {
						for(Player i : a) {
							i.getInventory().addItem(new ItemStack(Material.END_CRYSTAL));
							i.getInventory().addItem(new ItemStack(Material.BEDROCK));
						}
					b -= 1;
					}
				}
				return true;
			}
		}
		return false;
	}

}

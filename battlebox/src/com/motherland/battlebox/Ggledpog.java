package com.motherland.battlebox;

import java.util.List;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class Ggledpog implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender arg0, Command arg1, String arg2, String[] arg3) {
		if(arg2.equalsIgnoreCase("ggledpog")) {
			if(arg0 instanceof Player) {
				Player p = (Player) arg0;
				List<Player> a = p.getWorld().getPlayers();
				for(Player i : a) {
					i.getInventory().addItem(new ItemStack(Material.SUNFLOWER));
				}
				return true;
			}
		}
		return false;
	}

}

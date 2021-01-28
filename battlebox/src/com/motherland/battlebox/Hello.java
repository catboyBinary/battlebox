package com.motherland.battlebox;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.TextComponent;

public class Hello implements CommandExecutor{
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (label.equalsIgnoreCase("hello")) {
			if(sender instanceof Player) {
				Player p = (Player) sender;
				if(p.hasPermission("hello.use")) {
					TextComponent msg = new TextComponent("иди нахуй");
					msg.setColor(ChatColor.AQUA);
					msg.setBold(true);
					msg.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/summon pig"));
					p.sendMessage(msg);
					return true;
				}
				p.sendMessage("ты дебил але.. у вас нет прав крч");
				return true;
			} else {
				sender.sendMessage(ChatColor.AQUA + "ты че тут делаешь еблан");
				return true;
			}
		}
		return false;
	}
}

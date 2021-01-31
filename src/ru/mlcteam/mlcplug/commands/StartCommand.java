package ru.mlcteam.mlcplug.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import ru.mlcteam.mlcplug.Start;

public class StartCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender.hasPermission("MLC.hui")) {
            Start.start_players();
            return true;
        } else {
            return false;
        }
    }
}

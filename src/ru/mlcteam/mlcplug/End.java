package ru.mlcteam.mlcplug;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import ru.mlcteam.mlcplug.teamwork.TeamsList;

import java.util.List;

public class End extends TeamsList {
    public static void end_players() {
        List<String> all_players = getFirst_team().getPlayers();
        all_players.addAll(getSecond_team().getPlayers());
        for (String player : all_players) {
            Player target = Bukkit.getServer().getPlayer(player);
            if (target != null) {
                target.teleport(new Location(target.getWorld(), -20.0, 39, -1));
            }
        }
    }
}

package ru.mlcteam.mlcplug.onlineplayers;

import org.bukkit.entity.Player;

public class OnlinePlayersTransactions implements OnlinePlayers {
    public static void replacePutIfAbsent(Player player, OnlinePlayerInfo playerInfo) {
        players.putIfAbsent(player, playerInfo);
        players.computeIfPresent(player, (key, val) -> val = playerInfo);
    }

    public static OnlinePlayerInfo getInfoElseDefault(Player player) {
        return players.getOrDefault(player, new OnlinePlayerInfo());
    }

    public static boolean containsPlayer(Player player) {
        return players.containsKey(player);
    }
}

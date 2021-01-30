package ru.mlcteam.mlcplug.onlineplayers;

import org.bukkit.entity.Player;

import java.util.HashMap;

public interface OnlinePlayers {
    HashMap<Player, OnlinePlayerInfo> players = new HashMap<>();
}

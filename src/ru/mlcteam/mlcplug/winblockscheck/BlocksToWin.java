package ru.mlcteam.mlcplug.winblockscheck;

import org.bukkit.Location;

import java.util.HashMap;

public interface BlocksToWin {
    HashMap<Location, BlocksWin> blocks_locations = new HashMap<>();
}

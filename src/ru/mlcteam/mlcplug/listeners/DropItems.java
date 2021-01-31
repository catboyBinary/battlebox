package ru.mlcteam.mlcplug.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;

public class DropItems implements Listener {
    @EventHandler
    public void on_drop_item(PlayerDropItemEvent e) {
        if (!e.getPlayer().hasPermission("MLC.hui")) {
            e.setCancelled(true);
        }
    }
}

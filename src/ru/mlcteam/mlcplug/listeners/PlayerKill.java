package ru.mlcteam.mlcplug.listeners;

import org.bukkit.*;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerRespawnEvent;
import ru.mlcteam.mlcplug.onlineplayers.OnlinePlayerInfo;
import ru.mlcteam.mlcplug.onlineplayers.OnlinePlayersTransactions;

public class PlayerKill implements Listener {
    private static Location respawn_location;

    @EventHandler
    public static void on_player_respawn(PlayerRespawnEvent e) {
        if (respawn_location != null) {
            e.setRespawnLocation(respawn_location);
        }
    }

    @EventHandler
    public void on_player_kill(PlayerDeathEvent e) {
        Player killed = e.getEntity();
        Player killer = killed.getKiller();
        if (killer != null) {
            OnlinePlayerInfo killer_info = OnlinePlayersTransactions.getInfoElseDefault(killer);
            OnlinePlayerInfo killed_info = OnlinePlayersTransactions.getInfoElseDefault(killed);
            killer_info.setKill_count(killer_info.getKill_count() + 1);
            killed.getWorld().spawnParticle(Particle.TOTEM, killed.getLocation(), 50);
            killer.playSound(killer.getLocation(), Sound.ENTITY_FIREWORK_ROCKET_TWINKLE, 1, 1);
            Bukkit.getServer().broadcastMessage(killed.getDisplayName() + " was killed by " + killer.getDisplayName() + "! (" + killer_info.getKill_count() + ")");
            World killed_world = killed.getWorld();
            if (killed_info.getTeam().equals("RED")) {
                respawn_location = new Location(killed_world, 22.0, 24.0, 0.0);
            } else {
                respawn_location = new Location(killed_world, -21.0, 24.0, 0.0);
            }
            OnlinePlayersTransactions.replacePutIfAbsent(killer, killer_info);
            OnlinePlayersTransactions.replacePutIfAbsent(killed, killed_info);
        }
    }
}

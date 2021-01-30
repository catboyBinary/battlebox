package ru.mlcteam.mlcplug.listeners;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import ru.mlcteam.mlcplug.kitpack.Kit1;
import ru.mlcteam.mlcplug.kitpack.Kit2;
import ru.mlcteam.mlcplug.kitpack.Kit3;
import ru.mlcteam.mlcplug.kitpack.KitDefault;
import ru.mlcteam.mlcplug.onlineplayers.OnlinePlayerInfo;
import ru.mlcteam.mlcplug.onlineplayers.OnlinePlayersTransactions;

public class ButtonListener implements Listener {
    @EventHandler
    public static void on_click_button_event(PlayerInteractEvent e) {
        if (e.getAction().equals(Action.RIGHT_CLICK_BLOCK) && e.getClickedBlock() != null && e.getClickedBlock().getType().equals(Material.STONE_BUTTON)) {
            Player player = e.getPlayer();
            OnlinePlayerInfo current_info = OnlinePlayersTransactions.getInfoElseDefault(player);
            if (current_info.getKit().isEmpty()) {
                e.getPlayer().getInventory().clear();
                new KitDefault(player);
                double block_loc = e.getClickedBlock().getLocation().getX();
                if (block_loc > 0.0) {
                    current_info.setTeam("RED");
                }
                else {
                    current_info.setTeam("BLUE");
                }
                switch (String.valueOf(Math.abs(block_loc))) {
                    case "24.0":
                        current_info.setKit("kit 1");
                        new Kit1(player);
                        break;
                    case "22.0":
                        current_info.setKit("kit 2");
                        new Kit2(player);
                        break;
                    case "20.0":
                        current_info.setKit("kit 3");
                        new Kit3(player);
                        break;
                }
                OnlinePlayersTransactions.replacePutIfAbsent(player, current_info);
            }
        }
    }
}

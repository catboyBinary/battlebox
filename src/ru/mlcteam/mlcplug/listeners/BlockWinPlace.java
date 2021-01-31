package ru.mlcteam.mlcplug.listeners;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import ru.mlcteam.mlcplug.End;
import ru.mlcteam.mlcplug.Start;
import ru.mlcteam.mlcplug.winblockscheck.BlocksToWin;
import ru.mlcteam.mlcplug.winblockscheck.BlocksWin;
import ru.mlcteam.mlcplug.winblockscheck.BlocksWinCheck;

public class BlockWinPlace implements Listener, BlocksToWin {
    public BlockWinPlace() {
        World main_world = Bukkit.getServer().getWorld("world3");
        for (double i = -1; i <= 1; i++) {
            for (double j = -1; j <= 1; j++) {
                Location loca = new Location(main_world, i, 23.0, j);
                if (main_world != null) {
                    main_world.getBlockAt(loca).setType(Material.WHITE_WOOL);
                }
                blocks_locations.put(loca, new BlocksWin());
            }
        }
    }

    @EventHandler
    public void on_block_place(BlockPlaceEvent e) {
        Block block = e.getBlock();
        Location block_location = block.getLocation();
        if (blocks_locations.containsKey(block_location)) {
            BlocksWin block_info = blocks_locations.get(block_location);
            Material block_type = block.getType();
            if (block_type.equals(Material.RED_WOOL)) {
                block_info.setColor("RED");
            } else if (block_type.equals(Material.BLUE_WOOL)) {
                block_info.setColor("BLUE");
            }
            block_info.setState(true);
            blocks_locations.replace(block_location, block_info);
            switch (BlocksWinCheck.checkForWin()) {
                case 1:
                    Bukkit.getLogger().info("RED WON!");
                    End.end_players();
                    Start.start_players();
                    break;
                case 2:
                    Bukkit.getLogger().info("BLUE WON!");
                    End.end_players();
                    Start.start_players();
                    break;
                default:
                    Bukkit.getLogger().info("-");
                    break;
            }
        }
        else {
            e.setCancelled(true);
        }
    }
}

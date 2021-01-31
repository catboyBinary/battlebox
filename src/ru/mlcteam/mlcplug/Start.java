package ru.mlcteam.mlcplug;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.potion.PotionData;
import org.bukkit.potion.PotionType;
import org.bukkit.util.Vector;
import ru.mlcteam.mlcplug.teamwork.TeamsList;

public class Start extends TeamsList {
    public static void start_players() {
        new_team_pair();
        World server_world = Bukkit.getServer().getWorld("world3");
        ItemStack potion_harm = new ItemStack(Material.SPLASH_POTION);
        ItemStack potion_heal = new ItemStack(Material.SPLASH_POTION);
        PotionMeta pot_harm_meta = (PotionMeta) potion_harm.getItemMeta();
        PotionMeta pot_heal_meta = (PotionMeta) potion_heal.getItemMeta();
        if (pot_harm_meta != null) {
            pot_harm_meta.setBasePotionData(new PotionData(PotionType.INSTANT_DAMAGE));
            potion_harm.setItemMeta(pot_harm_meta);
        }
        if (pot_heal_meta != null) {
            pot_heal_meta.setBasePotionData(new PotionData(PotionType.INSTANT_HEAL));
            potion_heal.setItemMeta(pot_heal_meta);
        }
        if (server_world != null) {
            Item pot1 = server_world.dropItem(new Location(server_world, 0.5, 22, 14.5), potion_heal);
            pot1.setGravity(false);
            pot1.setVelocity(new Vector(0,0,0));
            Item pot2 = server_world.dropItem(new Location(server_world, 0.5, 22, -13.5), potion_harm);
            pot2.setGravity(false);
            pot2.setVelocity(new Vector(0,0,0));
        }
        for (String player : getFirst_team().getPlayers()) {
            Player p = Bukkit.getServer().getPlayer(player);
            if (p != null) {
                Location tp_loc = new Location(p.getWorld(), 21.0, 24.0, 1.0);
                p.teleport(tp_loc);
            }
        }
        for (String player : getSecond_team().getPlayers()) {
            Player p = Bukkit.getServer().getPlayer(player);
            if (p != null) {
                Location tp_loc = new Location(p.getWorld(), -21.0, 24.0, 1.0);
                p.teleport(tp_loc);
            }
        }
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "function b1n4ry:start");
    }
}

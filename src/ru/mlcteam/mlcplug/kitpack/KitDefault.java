package ru.mlcteam.mlcplug.kitpack;

import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import ru.mlcteam.mlcplug.Kits;

public class KitDefault extends Kits {
    public KitDefault(Player player, String team) {
        addItem(setUnbreakable(new ItemStack(Material.STONE_SWORD)));
        addItem(setUnbreakable(new ItemStack(Material.SHEARS)));
        addItem(setUnbreakable(new ItemStack(Material.BOW)));
        addItem(new ItemStack(Material.ARROW, 8));
        ItemStack boots = new ItemStack(Material.LEATHER_BOOTS);
        LeatherArmorMeta boots_meta = (LeatherArmorMeta) boots.getItemMeta();
        if (team.equals("RED")) {
            addItem(new ItemStack(Material.RED_WOOL, 64));
            if (boots_meta != null) {
                boots_meta.setColor(Color.RED);
            }
        }
        else {
            addItem(new ItemStack(Material.BLUE_WOOL, 64));
            if (boots_meta != null) {
                boots_meta.setColor(Color.BLUE);
            }
        }
        boots.setItemMeta(boots_meta);
        player.getInventory().setBoots(boots);
        distItems(player);
    }
}

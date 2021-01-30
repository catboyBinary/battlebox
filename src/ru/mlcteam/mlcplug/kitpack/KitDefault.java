package ru.mlcteam.mlcplug.kitpack;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import ru.mlcteam.mlcplug.Kits;

public class KitDefault extends Kits {
    public KitDefault(Player player) {
        addItem(setUnbreakable(new ItemStack(Material.STONE_SWORD)));
        addItem(setUnbreakable(new ItemStack(Material.SHEARS)));
        addItem(setUnbreakable(new ItemStack(Material.BOW)));
        addItem(new ItemStack(Material.ARROW, 8));
        distItems(player);
    }
}

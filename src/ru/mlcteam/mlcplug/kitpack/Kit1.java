package ru.mlcteam.mlcplug.kitpack;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import ru.mlcteam.mlcplug.Kits;

public class Kit1 extends Kits {
    public Kit1(Player player) {
        addItem(setUnbreakable(new ItemStack(Material.CROSSBOW)));
        addItem(new ItemStack(Material.ARROW, 8));
        distItems(player);
    }
}

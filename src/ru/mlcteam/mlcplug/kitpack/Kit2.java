package ru.mlcteam.mlcplug.kitpack;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import ru.mlcteam.mlcplug.Kits;

public class Kit2 extends Kits {
    public Kit2(Player player) {
        addItem(setEnchantment(setUnbreakable(new ItemStack(Material.STONE_SWORD)), Enchantment.KNOCKBACK, 2));
        distItems(player);
    }
}
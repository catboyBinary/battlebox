package ru.mlcteam.mlcplug.kitpack;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import ru.mlcteam.mlcplug.Kits;

public class Kit3 extends Kits {
    public Kit3(Player player) {
        addItem(setEnchantment(setUnbreakable(new ItemStack(Material.CHAINMAIL_CHESTPLATE)), Enchantment.PROTECTION_ENVIRONMENTAL, 2));
        distItems(player);
    }
}
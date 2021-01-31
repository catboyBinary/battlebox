package ru.mlcteam.mlcplug;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public abstract class Kits {
    private static final List<ItemStack> items = new ArrayList<>();

    public static ItemStack setUnbreakable(ItemStack item) {
        ItemMeta m = item.getItemMeta();
        m.setUnbreakable(true);
        item.setItemMeta(m);
        return item;
    }

    public static ItemStack setEnchantment(ItemStack item, Enchantment enchant, int level) {
        item.addEnchantment(enchant, level);
        return item;
    }

    public static void addItem(ItemStack item) {
        items.add(item);
    }

    public static void distItems(Player player) {
        Inventory inv = player.getInventory();
        for (ItemStack item : items) {
            inv.addItem(item);
        }
        items.clear();
    }
}

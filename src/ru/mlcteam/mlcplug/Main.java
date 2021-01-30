package ru.mlcteam.mlcplug;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import ru.mlcteam.mlcplug.listeners.BlockWinPlace;
import ru.mlcteam.mlcplug.listeners.ButtonListener;
import ru.mlcteam.mlcplug.listeners.DropItems;
import ru.mlcteam.mlcplug.listeners.PlayerKill;

public class Main extends JavaPlugin {
    private static final PluginManager PM = Bukkit.getPluginManager();

    @Override
    public void onEnable() {
        PM.registerEvents(new ButtonListener(), this);
        PM.registerEvents(new DropItems(), this);
        PM.registerEvents(new PlayerKill(), this);
        PM.registerEvents(new BlockWinPlace(), this);
    }
}

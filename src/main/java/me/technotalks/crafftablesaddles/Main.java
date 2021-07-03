package me.technotalks.crafftablesaddles;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println(ChatColor.GOLD+"Crafftable Saddles has loaded!");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}

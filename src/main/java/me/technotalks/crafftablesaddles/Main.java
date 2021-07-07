package me.technotalks.crafftablesaddles;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.IOException;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        UpdateChecker updateChecker = new UpdateChecker();
        try {
            if (updateChecker.getLatestVersion().equals(getDescription().getVersion())) {
                getLogger().info(ChatColor.GOLD+"You are running the latest version of Craftable Saddles!");
            } else {
                getLogger().info(ChatColor.RED+"You are running version "+getDescription().getVersion()+"! The latest version is "+updateChecker.getLatestVersion()+"! Please update!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (Bukkit.getBukkitVersion().contains("1.8")) {
            System.out.println("[CraftableSaddles] Loaded 1.8 mehthod! Please note that only 1.8 & 1.17 are supported, no other versions are at the current release!");
            legacyRecipe.legacyloadRecipe();
        }else {
            System.out.println("[CraftableSaddles] Loaded 1.17 method! Please note that only 1.8 & 1.17 are supported, no other versions are at the current release");
            Recipe.loadRecipe();
        }

        Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.GOLD+"Craftable Saddles has loaded!");
    }



    @Override
    public void onDisable() {
        System.out.println(ChatColor.GOLD+"Craftable Saddles has unloaded");
        // Plugin shutdown logic
    }
}

package me.technotalks.crafftablesaddles;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.IOException;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        UpdateChecker updateChecker = new UpdateChecker();
        try {
            if (updateChecker.getLatestVersion().equals(getDescription().getVersion())) {
                getLogger().info("You are running the latest version of Craftable Saddles!");
            } else {
                getLogger().info("You are running version "+getDescription().getVersion()+"! The latest version is "+updateChecker.getLatestVersion()+"! Please update!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (Bukkit.getBukkitVersion().contains("1.8")) {
            System.out.println("[CraftableSaddles] Loaded legacy method! (1.8)");
            System.out.println("[CraftableSaddles] If the version in ()'s does not match your server version then this is a ERROR, Please contact Support!");
            legacyRecipe.legacyloadRecipe();
        }else if(Bukkit.getBukkitVersion().contains("1.9")){
            System.out.println("[CraftableSaddles] Loaded legacy method! (1.9)");
            System.out.println("[CraftableSaddles] If the version in ()'s does not match your server version then this is a ERROR, Please contact Support!");
            legacyRecipe.legacyloadRecipe();
        }else if(Bukkit.getBukkitVersion().contains("1.10")){
            System.out.println("[CraftableSaddles] Loaded legacy method! (1.10)");
            System.out.println("[CraftableSaddles] If the version in ()'s does not match your server version then this is a ERROR, Please contact Support!");
            legacyRecipe.legacyloadRecipe();
        }else if(Bukkit.getBukkitVersion().contains("1.11")){
            System.out.println("[CraftableSaddles] Loaded legacy method! (1.11)");
            System.out.println("[CraftableSaddles] If the version in ()'s does not match your server version then this is a ERROR, Please contact Support!");
            legacyRecipe.legacyloadRecipe();
        }else {
            System.out.println("[CraftableSaddles] Loaded Updated method! If you are seeing this and you are not on version 1.12+ then this is a ERROR, Please contact Support!");
            Recipe.loadRecipe();
        }

        Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.GOLD+"Craftable Saddles has loaded!");
    }



    @Override
    public void onDisable() {
        System.out.println(ChatColor.GOLD+"Craftable Saddles has unloaded");
    }
}

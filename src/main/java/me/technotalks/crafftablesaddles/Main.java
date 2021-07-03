package me.technotalks.crafftablesaddles;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println(ChatColor.GOLD+"Craftable Saddles has loaded!");
        loadRecipe();
    }

    private void loadRecipe() {
        ItemStack item = new ItemStack(Material.SADDLE);
        ShapedRecipe recipe = new ShapedRecipe(item);
        recipe.shape("LXL","ILI","LXL");
        recipe.setIngredient('L', Material.LEATHER);
        recipe.setIngredient('X', Material.STRING);
        recipe.setIngredient('I', Material.IRON_INGOT);
        Bukkit.getServer().addRecipe(recipe);
    }

    @Override
    public void onDisable() {
        System.out.println(ChatColor.GOLD+"Craftable Saddles has unloaded");
        // Plugin shutdown logic
    }
}

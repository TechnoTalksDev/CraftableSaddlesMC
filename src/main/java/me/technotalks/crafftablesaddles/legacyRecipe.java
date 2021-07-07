package me.technotalks.crafftablesaddles;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

public class legacyRecipe {

    public static void legacyloadRecipe() {
        ItemStack item = new ItemStack(Material.SADDLE);
        ShapedRecipe recipe = new ShapedRecipe(item);
        recipe.shape("LXL","ILI","LXL");
        recipe.setIngredient('L', Material.LEATHER);
        recipe.setIngredient('X', Material.STRING);
        recipe.setIngredient('I', Material.IRON_INGOT);
        Bukkit.getServer().addRecipe(recipe);
    }

}

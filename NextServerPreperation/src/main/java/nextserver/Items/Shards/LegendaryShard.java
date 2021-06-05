package nextserver.Items.Shards;

import nextserver.Items.Zeus.*;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class LegendaryShard {
    public static ItemStack LegendaryShard;

    public static ItemStack init() {
        legendaryShard();
        return null;
    }

    public static void legendaryShard() {
        ItemStack item = new ItemStack(Material.PAPER, 1);
        ItemMeta meta = item.getItemMeta();
        meta.addEnchant(Enchantment.DAMAGE_ARTHROPODS, 1, false);
        meta.setDisplayName("Legendary Shard");
        List<String> lore = new ArrayList<>();
        lore.add("Used to craft the weapons of gods.");
        meta.setLore(lore);
        item.setItemMeta(meta);
        LegendaryShard = item;


        ShapedRecipe ag = new ShapedRecipe(NamespacedKey.minecraft("aegis"), Aegis.Aegis);
        ag.shape("FLF", "FFF", "FFF");
        ag.setIngredient('L', item);
        ag.setIngredient('F', Material.FIRE_CHARGE);
        Bukkit.addRecipe(ag);

        ShapedRecipe zc = new ShapedRecipe(NamespacedKey.minecraft("zcrown"), ZeusCrown.ZeusCrown);
        zc.shape("FFF", "FLF", "   ");
        zc.setIngredient('F', Material.FIRE_CHARGE);
        zc.setIngredient('L', item);
        Bukkit.addRecipe(zc);
        ShapedRecipe zl = new ShapedRecipe(NamespacedKey.minecraft("zleg"), ZeusLegs.ZeusLegs);
        zl.shape("FFF", "FLF", "FLF");
        zl.setIngredient('F', Material.FIRE_CHARGE);
        zl.setIngredient('L', item);
        Bukkit.addRecipe(zl);
        ShapedRecipe zb = new ShapedRecipe(NamespacedKey.minecraft("zboots"), ZeusBoots.ZeusBoots);
        zb.shape("FLF", "FLF", "   ");
        zb.setIngredient('F', Material.FIRE_CHARGE);
        zb.setIngredient('L', item);
        Bukkit.addRecipe(zb);
    }
}

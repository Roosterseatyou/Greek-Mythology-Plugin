package nextserver.Items.Zeus;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class ZeusSword {
    public static ItemStack ZeusSword;

    public static ItemStack init() {
        zeusSword();
        return null;
    }

    public static void zeusSword() {
        ItemStack item = new ItemStack(Material.IRON_SWORD, 1);
        ItemMeta meta = item.getItemMeta();
        List<String> lore = new ArrayList<>();
        lore.add("The Dice of Zeus will Always Fall Luckily");
        meta.setDisplayName("Sword of Zeus");
        meta.addEnchant(Enchantment.LOOT_BONUS_MOBS, 10, true);
        meta.setUnbreakable(true);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        meta.setLore(lore);
        item.setItemMeta(meta);
        ZeusSword = item;
    }
}

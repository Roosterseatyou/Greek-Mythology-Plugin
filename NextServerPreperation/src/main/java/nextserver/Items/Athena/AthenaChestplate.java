package nextserver.Items.Athena;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class AthenaChestplate {
    public static ItemStack AthenaChest;

    public static ItemStack init() {
        athenaChest();
        return null;
    }

    public static void athenaChest() {
        ItemStack item = new ItemStack(Material.GOLDEN_CHESTPLATE, 1);
        ItemMeta meta = item.getItemMeta();
        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.GRAY+"Wisdom X");
        meta.setDisplayName("Helm of Athena");
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 10, true);
        meta.setUnbreakable(true);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        meta.setLore(lore);
        item.setItemMeta(meta);
        AthenaChest = item;
    }
}

package nextserver.Items.Athena;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class AthenaLeggings {
    public static ItemStack AthenaLegs;

    public static ItemStack init() {
        athenaLegs();
        return null;
    }

    public static void athenaLegs() {
        ItemStack item = new ItemStack(Material.GOLDEN_LEGGINGS, 1);
        ItemMeta meta = item.getItemMeta();
        List<String> lore = new ArrayList<>();
        lore.add(ChatColor.GRAY+"Wisdom X");
        meta.setDisplayName("Pants of Athena");
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 10, true);
        meta.setUnbreakable(true);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        meta.setLore(lore);
        item.setItemMeta(meta);
        AthenaLegs = item;
    }

}

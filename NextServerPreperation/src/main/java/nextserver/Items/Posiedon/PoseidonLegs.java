package nextserver.Items.Posiedon;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;

import java.util.ArrayList;
import java.util.List;

public class PoseidonLegs {
    public static ItemStack poseidonLegs;

    public static ItemStack init() {
        poseidonLegs();
        return null;
    }

    public static void poseidonLegs() {
        ItemStack item = new ItemStack(Material.LEATHER_LEGGINGS, 1);
        LeatherArmorMeta meta = (LeatherArmorMeta) item.getItemMeta();
        List<String> lore = new ArrayList<>();
        meta.setColor(Color.AQUA);
        lore.add(ChatColor.GRAY+"Fish X");
        meta.setDisplayName("Poseidon Fins");
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 10, true);
        meta.addAttributeModifier(Attribute.GENERIC_LUCK, new AttributeModifier("gen_luck", 0.5, AttributeModifier.Operation.ADD_NUMBER));
        meta.setUnbreakable(true);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        meta.setLore(lore);
        item.setItemMeta(meta);
        poseidonLegs = item;
    }
}

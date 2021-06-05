package nextserver.Items.Ares;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.LeatherArmorMeta;

import java.util.ArrayList;
import java.util.List;

public class AresChest {
    public static ItemStack AresChest;

    public static ItemStack init() {
        aresChest();
        return null;
    }

    public static void aresChest() {
        ItemStack item = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
        LeatherArmorMeta meta = (LeatherArmorMeta) item.getItemMeta();
        List<String> lore = new ArrayList<>();
        meta.setColor(Color.fromRGB(71, 1, 1));
        lore.add(ChatColor.GRAY+"Warrior LXIX");
        meta.setDisplayName("Ares's Chestplate");
        lore.add(ChatColor.BLACK+"Server ID: ARES_CHEST");
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 10, true);
        meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, new AttributeModifier("gen_luck", 0.5, AttributeModifier.Operation.ADD_NUMBER));
        meta.setUnbreakable(true);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        meta.setLore(lore);
        item.setItemMeta(meta);
        AresChest = item;
    }
}

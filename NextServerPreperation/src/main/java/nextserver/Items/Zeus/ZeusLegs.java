package nextserver.Items.Zeus;

import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.LeatherArmorMeta;

import java.util.ArrayList;
import java.util.List;

public class ZeusLegs {
    public static ItemStack ZeusLegs;

    public static ItemStack init() {
        zeusLegs();
        return null;
    }

    public static void zeusLegs() {
        ItemStack item = new ItemStack(Material.LEATHER_LEGGINGS, 1);
        LeatherArmorMeta meta = (LeatherArmorMeta) item.getItemMeta();
        List<String> lore = new ArrayList<>();
        meta.setColor(Color.WHITE);
        lore.add("");
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 10, true);
        meta.setDisplayName("Zeus Legs");
        meta.setUnbreakable(true);
        meta.setLore(lore);
        item.setItemMeta(meta);
        ZeusLegs = item;
    }
}

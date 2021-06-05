package nextserver.Items.Zeus;

import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class Aegis {
    public static ItemStack Aegis;

    public static ItemStack init() {
        aegis();
        return null;
    }

    public static void aegis() {
        ItemStack item = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
        LeatherArmorMeta meta = (LeatherArmorMeta) item.getItemMeta();
        List<String> lore = new ArrayList<>();
        meta.setColor(Color.WHITE);
        lore.add("Known to posses Supernatural Abilities...");
        meta.setDisplayName("Aegis");
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 10, true);
        meta.setUnbreakable(true);
        meta.setLore(lore);
        item.setItemMeta(meta);
        Aegis = item;
    }
}

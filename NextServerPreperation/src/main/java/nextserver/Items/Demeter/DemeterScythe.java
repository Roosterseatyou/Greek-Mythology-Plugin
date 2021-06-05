package nextserver.Items.Demeter;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class DemeterScythe {
    public static ItemStack DemeterScythe;

    public static ItemStack init() {
        demeterScythe();
        return null;
    }

    public static void demeterScythe() {
        ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
        ItemMeta meta = item.getItemMeta();
        List<String> lore = new ArrayList<>();
        lore.add("Goddess of Agriculture");
        meta.setDisplayName("Demeter Scythe");
        meta.addEnchant(Enchantment.DAMAGE_ALL, 2, true);
        meta.setUnbreakable(true);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        meta.setLore(lore);
        item.setItemMeta(meta);
        DemeterScythe = item;
    }
}

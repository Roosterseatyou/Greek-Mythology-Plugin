package nextserver.Items.Artemis;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class ArtemisSword {
    public static ItemStack ArtemisSword;

    public static ItemStack init() {
        artemisSword();
        return null;
    }

    public static void artemisSword() {
        ItemStack item = new ItemStack(Material.GOLDEN_SWORD, 1);
        ItemMeta meta = item.getItemMeta();
        List<String> lore = new ArrayList<>();
        lore.add("Goddess of the Hunt");
        meta.setDisplayName("Artemis's Sword");
        meta.addEnchant(Enchantment.LOOT_BONUS_MOBS, 10, true);
        meta.setUnbreakable(true);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        meta.setLore(lore);
        item.setItemMeta(meta);
        ArtemisSword = item;
    }
}

package nextserver.Items.Shards;

import nextserver.Items.Ares.AresBoots;
import nextserver.Items.Ares.AresChest;
import nextserver.Items.Ares.AresHelm;
import nextserver.Items.Ares.AresLegs;
import nextserver.Items.Artemis.ArtemisSword;
import nextserver.Items.Athena.AthenaBoots;
import nextserver.Items.Athena.AthenaChestplate;
import nextserver.Items.Athena.AthenaHelm;
import nextserver.Items.Athena.AthenaLeggings;
import nextserver.Items.Demeter.DemeterScythe;
import nextserver.Items.Hades.HadesHelm;
import nextserver.Items.Posiedon.PoseidonFeet;
import nextserver.Items.Posiedon.PoseidonGils;
import nextserver.Items.Posiedon.PoseidonLegs;
import nextserver.Items.Posiedon.PosiedonCrown;
import nextserver.Items.Zeus.Aegis;
import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;

import java.util.ArrayList;
import java.util.List;

public class OpShard {
    public static ItemStack OpShard;

    public static ItemStack init() {
        opShard();
        return null;
    }

    public static void opShard() {
        //This is an ItemStack. It essentially makes the item a thing.
        ItemStack item = new ItemStack(Material.PRISMARINE_SHARD, 1);
        ItemMeta meta = item.getItemMeta();
        List<String> lore = new ArrayList<>();
        lore.add("Used to craft the Items of Gods");
        meta.setDisplayName("Op Shard");
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
        meta.setUnbreakable(true);
        meta.setLore(lore);
        item.setItemMeta(meta);
        OpShard = item;

        ItemStack i = new ItemStack(Material.EGG);


        //This is a recipe. It makes the crafts possible.
        ShapedRecipe os = new ShapedRecipe(NamespacedKey.minecraft("oshard"), item); // Since the variable "item" is set at line 27, this will make the return item the custom item set above.
        //The "os.shape" is the shape of the recipe. Each letter represents an item, which are set in the os.setIngredient part.
        os.shape("DLD", "DND", "DLD");
        os.setIngredient('L', Material.DIAMOND_BLOCK);
        os.setIngredient('D', Material.DIAMOND);
        os.setIngredient('N', Material.NETHERITE_INGOT);
        Bukkit.addRecipe(os);

        ShapedRecipe ls = new ShapedRecipe(NamespacedKey.minecraft("lshard"), LegendaryShard.LegendaryShard);
        ls.shape("OOO", "ONO", "OOO");
        ls.setIngredient('N', Material.NETHERITE_INGOT);
        ls.setIngredient('O', item);
        Bukkit.addRecipe(ls);

        ShapedRecipe ac = new ShapedRecipe(NamespacedKey.minecraft("achest"), AthenaChestplate.AthenaChest);
        ac.shape("GOG", "GGG", "GGG");
        ac.setIngredient('G', Material.GOLD_INGOT);
        ac.setIngredient('O', item);
        Bukkit.addRecipe(ac);

        ShapedRecipe ah = new ShapedRecipe(NamespacedKey.minecraft("ahelm"), AthenaHelm.AthenaHelm);
        ah.shape("GGG", "GOG", "   ");
        ah.setIngredient('G', Material.GOLD_INGOT);
        ah.setIngredient('O', item);
        Bukkit.addRecipe(ah);
        ShapedRecipe al = new ShapedRecipe(NamespacedKey.minecraft("alegs"), AthenaLeggings.AthenaLegs);
        al.shape("GGG", "GOG", "GOG");
        al.setIngredient('G', Material.GOLD_INGOT);
        al.setIngredient('O', item);
        Bukkit.addRecipe(al);

        ShapedRecipe ab = new ShapedRecipe(NamespacedKey.minecraft("aboot"), AthenaBoots.AthenaBoots);
        ab.shape("GOG", "GOG", "   ");
        ab.setIngredient('G', Material.GOLD_INGOT);
        ab.setIngredient('O', item);
        Bukkit.addRecipe(ab);

        ShapedRecipe pg = new ShapedRecipe(NamespacedKey.minecraft("pgils"), PoseidonGils.poseidonGils);
        pg.shape("FOF", "FFF", "FFF");
        pg.setIngredient('F', Material.COD);
        pg.setIngredient('O', item);
        Bukkit.addRecipe(pg);
        ShapedRecipe ps = new ShapedRecipe(NamespacedKey.minecraft("psandals"), PoseidonFeet.poseidonFeet);
        ps.shape("FOF", "F F", "   ");
        ps.setIngredient('F', Material.COD);
        ps.setIngredient('O', item);
        Bukkit.addRecipe(ps);
        ShapedRecipe pf = new ShapedRecipe(NamespacedKey.minecraft("pfins"), PoseidonLegs.poseidonLegs);
        pf.shape("FFF", "FOF", "F F");
        pf.setIngredient('F', Material.COD);
        pf.setIngredient('O', item);
        Bukkit.addRecipe(pf);
        ShapedRecipe pc = new ShapedRecipe(NamespacedKey.minecraft("pcrown"), PosiedonCrown.poseidonHelm);
        pc.shape("FFF", "FOF", "   ");
        pc.setIngredient('F', Material.COD);
        pc.setIngredient('O', item);
        Bukkit.addRecipe(pc);
        ShapedRecipe hh = new ShapedRecipe(NamespacedKey.minecraft("hhelm"), HadesHelm.hadesHelm);
        hh.shape("BBB", "BOB", "   ");
        hh.setIngredient('B', Material.BONE_BLOCK);
        hh.setIngredient('O', item);
        Bukkit.addRecipe(hh);
        ShapedRecipe arh = new ShapedRecipe(NamespacedKey.minecraft("areshelm"), AresHelm.AresHelm);
        arh.shape("DDD", "DOD", " S ");
        arh.setIngredient('D', Material.GOLD_INGOT);
        arh.setIngredient('O', item);
        arh.setIngredient('S', Material.IRON_SWORD);
        Bukkit.addRecipe(arh);
        ShapedRecipe arc = new ShapedRecipe(NamespacedKey.minecraft("archest"), AresChest.AresChest);
        arc.shape("DOD", "DID", "DDD");
        arc.setIngredient('D', Material.GOLD_INGOT);
        arc.setIngredient('O', item);
        arc.setIngredient('I', Material.IRON_SWORD);
        Bukkit.addRecipe(arc);
        ShapedRecipe arl = new ShapedRecipe(NamespacedKey.minecraft("arlegs"), AresLegs.AresLegs);
        arl.shape("DDD", "DOD", "DID");
        arl.setIngredient('D', Material.GOLD_INGOT);
        arl.setIngredient('O', item);
        arl.setIngredient('I', Material.IRON_SWORD);
        Bukkit.addRecipe(arl);
        ShapedRecipe arb = new ShapedRecipe(NamespacedKey.minecraft("arboots"), AresBoots.AresBoots);
        arb.shape("DOD", "DID", "   ");
        arb.setIngredient('D', Material.GOLD_INGOT);
        arb.setIngredient('O', item);
        arb.setIngredient('I', Material.IRON_SWORD);
        Bukkit.addRecipe(arb);
        ShapedRecipe asw = new ShapedRecipe(NamespacedKey.minecraft("arsword"), ArtemisSword.ArtemisSword);
        asw.shape(" D ", " O ", " S ");
        asw.setIngredient('D', Material.ROTTEN_FLESH, 64);
        asw.setIngredient('O', item);
        asw.setIngredient('S', Material.STICK);
        Bukkit.addRecipe(asw);
        ShapedRecipe ds = new ShapedRecipe(NamespacedKey.minecraft("dscythe"), DemeterScythe.DemeterScythe);
        ds.shape(" OO", " S ", " S ");
        ds.setIngredient('O', item);
        ds.setIngredient('S', Material.STICK);
        Bukkit.addRecipe(ds);




    }
}

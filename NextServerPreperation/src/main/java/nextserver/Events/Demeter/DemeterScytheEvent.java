package nextserver.Events.Demeter;

import nextserver.Items.Demeter.DemeterScythe;
import nextserver.Utils.Utils;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.data.Ageable;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Objects;

public class DemeterScytheEvent implements Listener {
    public boolean isFullyGrown(Block block) {
        if(block.getBlockData() instanceof Ageable) {
            Ageable crop = (Ageable) block.getBlockData();
            return (crop.getMaximumAge() == crop.getAge());
        }
        return false;
    }
    @EventHandler
    public void onDemeterScythe(BlockBreakEvent e) {
        int r = Utils.randomInteger(4, 14);
        Player p = e.getPlayer();
        Block b = e.getBlock();
        Location loc = b.getLocation();
        ItemStack carrots = new ItemStack(Material.CARROT, r);
        ItemStack pot = new ItemStack(Material.POTATO, r);
        ItemStack w = new ItemStack(Material.WHEAT, r);
        ItemStack ws = new ItemStack(Material.WHEAT_SEEDS, r);
        ItemStack br = new ItemStack(Material.BEETROOT, r);
        ItemStack co = new ItemStack(Material.COCOA_BEANS, r);
        if (Objects.equals(p.getInventory().getItemInMainHand(), DemeterScythe.DemeterScythe)) {
            if (e.getBlock().getType().equals(Material.CARROTS)) {
                if (isFullyGrown(loc.getBlock())) {
                    e.setDropItems(false);
                    loc.getWorld().dropItemNaturally(loc, carrots);
                }
            }
            if (e.getBlock().getType().equals(Material.POTATOES)) {
                if (isFullyGrown(loc.getBlock())) {
                    e.setDropItems(false);
                    loc.getWorld().dropItemNaturally(loc, pot);
                }
            }
            if (e.getBlock().getType().equals(Material.WHEAT)) {
                if (isFullyGrown(loc.getBlock())) {
                    e.setDropItems(false);
                    loc.getWorld().dropItemNaturally(loc, w);
                    loc.getWorld().dropItemNaturally(loc, ws);
                }
            }
            if (e.getBlock().getType().equals(Material.BEETROOTS)) {
                if (isFullyGrown(loc.getBlock())) {
                    e.setDropItems(false);
                    loc.getWorld().dropItemNaturally(loc, br);
                }
            }
            if (e.getBlock().getType().equals(Material.COCOA)) {
                if (isFullyGrown(loc.getBlock())) {
                    e.setDropItems(false);
                    loc.getWorld().dropItemNaturally(loc, co);
                }
            }
            if(b.getType().equals(Material.DIRT)){
                p.sendMessage("E"+r);
            }
        }
    }
}

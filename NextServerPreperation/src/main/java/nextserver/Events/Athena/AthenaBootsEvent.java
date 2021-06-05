package nextserver.Events.Athena;

import nextserver.Items.Athena.AthenaBoots;
import nextserver.Utils.Utils;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Collection;
import java.util.Objects;

public class AthenaBootsEvent implements Listener {
    @EventHandler
    public void onAthenaMine(BlockBreakEvent e) {
        int rInt = Utils.randomInteger(1, 4);
        ItemStack gold = new ItemStack(Material.GOLD_INGOT, rInt);
        Player p = e.getPlayer();
        if (Objects.equals(p.getInventory().getBoots(), AthenaBoots.AthenaBoots)) {
            Block b = e.getBlock();
            Location loc = b.getLocation();
            Collection<ItemStack> drops = b.getDrops(p.getInventory().getItemInMainHand());
            if(b.getType() != Material.COAL_ORE)
                return;
            drops.add(gold);
            loc.getWorld().dropItemNaturally(loc, gold);
        }
    }
}

package nextserver.Events.Athena;

import com.destroystokyo.paper.event.player.PlayerArmorChangeEvent;
import nextserver.Items.Athena.AthenaLeggings;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerToggleSneakEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class AthenaLegsEvent implements Listener {
    @EventHandler
    public void onAthenaWear(BlockBreakEvent e) {
        Player p = e.getPlayer();
        if (Objects.equals(p.getInventory().getLeggings(), AthenaLeggings.AthenaLegs)) {
            Block b = e.getBlock();
            Collection<ItemStack> drops = b.getDrops(p.getInventory().getItemInMainHand(), p);
            if(p.getGameMode() != GameMode.SURVIVAL)
                return;
            p.getInventory().addItem(drops.iterator().next());
            p.sendMessage("p");
        }
    }
}

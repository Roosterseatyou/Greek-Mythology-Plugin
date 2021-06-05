package nextserver.Events.Zeus;

import nextserver.Items.Zeus.Aegis;
import nextserver.Utils.Utils;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import javax.swing.*;
import java.util.HashMap;
import java.util.UUID;


public class AegisEvent implements Listener {

    private HashMap<UUID, Long> cooldown = new HashMap<UUID, Long>();


    @EventHandler
    public void onAegisUse(PlayerInteractEvent e){
        Player p =e.getPlayer();
        if(e.getAction() == Action.RIGHT_CLICK_AIR) {
            if (p.getInventory().getChestplate() != null && p.getInventory().getChestplate().equals(Aegis.Aegis)) {
                if (cooldown.containsKey(p.getUniqueId()) && cooldown.get(p.getUniqueId()) > System.currentTimeMillis()) {
                    long remainingtime = cooldown.get(p.getUniqueId()) - System.currentTimeMillis();
                    e.setCancelled(true);
                    p.sendMessage(ChatColor.translateAlternateColorCodes('&', "[Aegis]&0 : &6 You still have " + remainingtime / 1000 + " seconds left!"));
                } else {
                    cooldown.put(p.getUniqueId(), (long) (System.currentTimeMillis() + 3000));
                    Location loc = p.getLocation();
                    Block b = Utils.getTargetBlock(p, 50);
                    Location bloc = b.getLocation();
                    bloc.getWorld().strikeLightning(bloc);
                }
            }
        }
    }
}

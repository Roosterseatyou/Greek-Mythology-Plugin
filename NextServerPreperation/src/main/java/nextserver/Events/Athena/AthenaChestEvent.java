package nextserver.Events.Athena;

import nextserver.Items.Athena.AthenaChestplate;
import nextserver.Utils.Utils;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerToggleSneakEvent;

import java.util.Collection;
import java.util.Locale;

public class AthenaChestEvent implements Listener {
    @EventHandler
    public void onAthenaShift(PlayerToggleSneakEvent e){
        Player p = e.getPlayer();
        if(p.getInventory().getChestplate() != null && p.getInventory().getChestplate().equals(AthenaChestplate.AthenaChest)){
            Location loc = p.getLocation();
            Collection<Player> near = loc.getNearbyPlayers(100);
            String x = "" + Utils.randomFromCollection(near).getLocation().getX();
            String y = ""+ Utils.randomFromCollection(near).getLocation().getY();
            String z = "" + Utils.randomFromCollection(near).getLocation().getZ();
            if(x.contains(".")) x = x.substring(0, x.indexOf("."));
            if(y.contains(".")) y = y.substring(0, y.indexOf("."));
            if(z.contains(".")) z = z.substring(0, z.indexOf("."));
            p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c[Athena &6Chestplate] &0: &6"+Utils.randomFromCollection(near).getName()+" is at "+x+" "+y+" "+z+"!"));

        }
    }
}

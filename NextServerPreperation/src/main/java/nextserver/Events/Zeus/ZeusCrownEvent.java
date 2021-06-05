package nextserver.Events.Zeus;

import net.md_5.bungee.api.ChatMessageType;
import nextserver.Items.Zeus.ZeusCrown;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import java.util.Objects;

public class ZeusCrownEvent implements Listener {
    @EventHandler
    public void onZeusCrown(PlayerInteractEvent e){
        Player p = e.getPlayer();
        Location loc = p.getLocation();
        if(p.getInventory().getHelmet() != null && p.getInventory().getHelmet().equals(ZeusCrown.ZeusCrown)){
            if(p.isSneaking() && e.getAction().equals(Action.LEFT_CLICK_AIR)){
                loc.getWorld().setStorm(true);
                loc.getWorld().setThundering(true);
                p.sendActionBar(ChatColor.translateAlternateColorCodes('&', "&6&l[Zeus Crown ] &0: &rSet the weather to Storm..."));
            }
            if(e.getAction().equals(Action.RIGHT_CLICK_BLOCK)){
                if(loc.getWorld().isClearWeather()) {
                }else {
                    p.sendActionBar(ChatColor.translateAlternateColorCodes('&', "&6&l[Zeus Crown ] &0: &rSet the weather to Clear..."));
                    loc.getWorld().setStorm(false);
                    loc.getWorld().setThundering(false);
                }
            }
        }
    }
}

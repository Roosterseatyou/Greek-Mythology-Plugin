package nextserver.Events.Zeus;

import nextserver.Items.Zeus.ZeusSword;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import java.util.Collection;


public class ZeusSwordEvent implements Listener {
    public static <T> T random(Collection<T> coll) {
        int num = (int) (Math.random() * coll.size());
        for(T t: coll) if (--num < 0) return t;
        throw new AssertionError();
    }
    @EventHandler
    public void onZeusSearch(PlayerInteractEvent e) {
        Player p = e.getPlayer();
        if (e.getAction().equals(Action.LEFT_CLICK_AIR)) {
            Location loc = p.getLocation();
            Collection<Player> list = loc.getNearbyPlayers(100);
            if (p.getInventory().getItemInMainHand().equals(ZeusSword.ZeusSword)) {
                p.sendMessage(ChatColor.translateAlternateColorCodes('&', "[Ze&6us &rSwo&6rd] &0: &b" + random(list) + " is Nearby!"));
            }
        }
    }
}



package nextserver.Events.Zeus;

import nextserver.Items.Zeus.ZeusLegs;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerToggleSneakEvent;

import java.util.Collection;
import java.util.HashMap;
import java.util.UUID;

public class ZeusLegsEvent implements Listener {

    //A hashmap is a temporary storage container that will reset whenever the plugin disables, such as during  restart or a reload.
    private HashMap<UUID, Long> cooldown = new HashMap<UUID, Long>();

    public static <T> T random(Collection<T> coll) {
        int num = (int) (Math.random() * coll.size());
        for(T t: coll) if (--num < 0) return t;
        throw new AssertionError();
    }

    @EventHandler
    public void onZeusShift(PlayerToggleSneakEvent e){
        Player p = e.getPlayer();
        if(p.getInventory().getLeggings() != null && p.getInventory().getLeggings().equals(ZeusLegs.ZeusLegs)){
            if (cooldown.containsKey(p.getUniqueId()) && cooldown.get(p.getUniqueId()) > System.currentTimeMillis()) {
                long remainingtime = cooldown.get(p.getUniqueId()) - System.currentTimeMillis(); //a UUID or a Unique ID is assigned to each Minecraft account, and is used to store data about the player.
                e.setCancelled(true);
                p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6[Zeus &rLegs] &0: &6You still have "+remainingtime/1000+" seconds left!"));
            }else {
                cooldown.put(p.getUniqueId(), (long) (System.currentTimeMillis() + 20000));
                Location loc = p.getLocation();
                Collection<Player> near = loc.getNearbyPlayers(100);
                if(random(near).equals(p)){

                }else{
                    Location nearloc = random(near).getLocation();
                    loc.getWorld().strikeLightning(nearloc);
                }
            }
        }
    }
}

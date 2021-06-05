package nextserver.Events.Poseidon;

import nextserver.Items.Posiedon.PoseidonGils;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

import java.util.Objects;

public class PoseidonGilsEvent implements Listener {

    @EventHandler
    public void onPoseidonDrown(EntityDamageEvent e){
        if(e.getEntity() instanceof Player){
            Player p = (Player) e.getEntity();
            if(Objects.equals(p.getInventory().getChestplate(), PoseidonGils.poseidonGils)){
                if(e.getCause().equals(EntityDamageEvent.DamageCause.DROWNING)) {
                    e.setCancelled(true);
                }
            }
        }
    }
}

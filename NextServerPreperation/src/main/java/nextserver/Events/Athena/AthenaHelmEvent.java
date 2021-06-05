package nextserver.Events.Athena;

import nextserver.Items.Athena.AthenaHelm;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;

import java.util.Objects;

public class AthenaHelmEvent implements Listener {
    @EventHandler
    public void onAthenaAttack(EntityDamageByEntityEvent e) {
        if (e.getDamager() instanceof Player) {
            Player p = (Player) e.getDamager();
            Entity entity;
            int dam = (int) e.getDamage();
            if (Objects.equals(p.getInventory().getHelmet(), AthenaHelm.AthenaHelm)) {
                if (p.getHealth() >=17) {
                } else {
                    if(dam >=1) {
                        p.setHealth(p.getHealth() + 3.5);
                    }
                }
            }
        }
    }
}

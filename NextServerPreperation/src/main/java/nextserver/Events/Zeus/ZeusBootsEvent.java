package nextserver.Events.Zeus;

import nextserver.Items.Zeus.ZeusBoots;
import com.destroystokyo.paper.event.player.PlayerArmorChangeEvent;
import org.bukkit.GameMode;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.jetbrains.annotations.NotNull;

import java.util.*;

public class ZeusBootsEvent implements Listener {

    @EventHandler
    public void onZeusWear(PlayerArmorChangeEvent e) {
        Player p = e.getPlayer();
            if(Objects.equals(p.getInventory().getBoots(), ZeusBoots.ZeusBoots)) {
                p.setAllowFlight(true);
                if (p.getGameMode().equals(GameMode.CREATIVE)){
                    p.setAllowFlight(true);
            }
        }
    }
    @EventHandler
    public void onZeusBootsFail(EntityDamageByEntityEvent e) {
        if (e.getEntity() instanceof Player) {
            Player p = (Player) e.getEntity();
            if (p.getInventory().getBoots() != null && p.getInventory().getBoots().equals(ZeusBoots.ZeusBoots)) {
                if (p.getGameMode().equals(GameMode.CREATIVE)) {
                } else {
                    p.setAllowFlight(false);
                }
            }
        }
    }
}

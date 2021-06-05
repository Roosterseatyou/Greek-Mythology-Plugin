package nextserver.Events.Hades;

import com.destroystokyo.paper.event.player.PlayerArmorChangeEvent;
import nextserver.Items.Hades.HadesHelm;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Objects;

public class HadesHelmEvent implements Listener {
    @EventHandler
    public void onHadesHelm(PlayerArmorChangeEvent e) {
        Player p = e.getPlayer();
        if (Objects.equals(p.getInventory().getHelmet(), HadesHelm.hadesHelm)) {
            p.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, Integer.MAX_VALUE, 0, false, false));
            p.sendMessage("E");
        }
        if (!Objects.equals(p.getInventory().getHelmet(), HadesHelm.hadesHelm)) {
            p.removePotionEffect(PotionEffectType.INVISIBILITY);

        }
    }
}

package nextserver.Events.Ares;

import nextserver.Items.Ares.AresHelm;
import org.bukkit.ChatColor;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AresHelmEvent implements Listener {
    @EventHandler
    public void onAresAttack(EntityDamageByEntityEvent e) {
        if (e.getDamager() instanceof Player) {
            Player p = (Player) e.getDamager();
            if (!(p.getInventory().getHelmet() == null)) {
                ItemStack helm = p.getInventory().getHelmet();
                ItemMeta helmMeta = helm.getItemMeta();
                List<String> helmLore = new ArrayList<>();
                List<String> id = Objects.requireNonNull(helmMeta.getLore());
                if (id.contains(ChatColor.BLACK+"Server ID: ARES_HELMET")) {
                    LivingEntity victim = (LivingEntity) e.getEntity();
                    int victimHealth = (int) victim.getHealth();
                    p.sendActionBar(ChatColor.translateAlternateColorCodes('&', "&4[Ares &6Helm] &0: &cOpponents heath: " + victimHealth + "!"));
                }
            }
        }
    }
}

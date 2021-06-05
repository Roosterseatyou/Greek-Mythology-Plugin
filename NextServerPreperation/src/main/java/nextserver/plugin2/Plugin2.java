package nextserver.plugin2;

import nextserver.Events.Ares.AresHelmEvent;
import nextserver.Events.Athena.*;
import nextserver.Events.Demeter.DemeterScytheEvent;
import nextserver.Events.Hades.HadesHelmEvent;
import nextserver.Events.Zeus.*;
import nextserver.Items.Ares.AresBoots;
import nextserver.Items.Ares.AresChest;
import nextserver.Items.Ares.AresHelm;
import nextserver.Items.Ares.AresLegs;
import nextserver.Items.Artemis.ArtemisSword;
import nextserver.Items.Athena.*;
import nextserver.Items.Athena.AthenaChestplate;
import nextserver.Items.Demeter.DemeterScythe;
import nextserver.Items.Hades.HadesHelm;
import nextserver.Items.Posiedon.PoseidonFeet;
import nextserver.Items.Posiedon.PoseidonGils;
import nextserver.Items.Posiedon.PoseidonLegs;
import nextserver.Items.Posiedon.PosiedonCrown;
import nextserver.Items.Shards.LegendaryShard;
import nextserver.Items.Shards.OpShard;
import nextserver.Items.Zeus.*;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class Plugin2 extends JavaPlugin {
    private static Plugin2 instance;
    private static long seed;
    public Plugin2() {
    }

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new HadesHelmEvent(), this);
        getServer().getPluginManager().registerEvents(new DemeterScytheEvent(), this);
        getServer().getPluginManager().registerEvents(new AresHelmEvent(), this);
        getServer().getPluginManager().registerEvents(new AthenaBootsEvent(), this);
        getServer().getPluginManager().registerEvents(new AthenaLegsEvent(), this);
        getServer().getPluginManager().registerEvents(new AthenaHelmEvent(), this);
        getServer().getPluginManager().registerEvents(new AegisEvent(), this);
        getServer().getPluginManager().registerEvents(new ZeusLegsEvent(), this);
        getServer().getPluginManager().registerEvents(new ZeusSwordEvent(), this);
        getServer().getPluginManager().registerEvents(new ZeusBootsEvent(), this);
        getServer().getPluginManager().registerEvents(new ZeusCrownEvent(), this);
        getServer().getPluginManager().registerEvents(new AthenaChestEvent(), this);
        DemeterScythe.init();
        ArtemisSword.init();
        AresBoots.init();
        AresLegs.init();
        AresChest.init();
        AresHelm.init();
        HadesHelm.init();
        PoseidonGils.init();
        PosiedonCrown.init();
        PoseidonLegs.init();
        PoseidonFeet.init();
        AthenaLeggings.init();
        AthenaBoots.init();
        AthenaChestplate.init();
        AthenaHelm.init();
        ZeusCrown.init();
        Aegis.init();
        ZeusLegs.init();
        ZeusSword.init();
        ZeusBoots.init();
        LegendaryShard.init();
        OpShard.init();
        instance = this;
        seed = System.currentTimeMillis();
        getServer().getConsoleSender().sendMessage(ChatColor.DARK_RED + "This Plugin is not to be implemented until the next server update and is still very experimental!");
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage("Zeus: Goodbye Cruel World!!!");
        // Plugin shutdown logic
    }
    public static long getSeed() {
        return seed;
    }

    public static Plugin2 getInstance() {
        return instance;
    }
}


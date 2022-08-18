package de.creperozelot.listener;

import cn.nukkit.Player;
import cn.nukkit.entity.Entity;
import cn.nukkit.event.entity.EntityDamageEvent;
import de.creperozelot.creperozelot;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;

public class TeamFire implements Listener {
    private creperozelot plugin;

    public void TeamFire(creperozelot plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onDamage(EntityDamageEvent event) {
        Entity player = event.getEntity();
    }
}

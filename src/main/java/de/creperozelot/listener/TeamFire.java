package de.creperozelot.listener;

import cn.nukkit.Player;
import cn.nukkit.entity.Entity;
import cn.nukkit.event.entity.EntityDamageEvent;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;

public class TeamFire implements Listener {

    @EventHandler
    public void onDamage(EntityDamageEvent event) {
        Player player = (Player) event.getEntity();
        EntityDamageEvent.DamageCause DamageCause = player.getLastDamageCause().getCause();
        Entity DamageCauseEntity = player.getLastDamageCause().getEntity();

        if (DamageCause == EntityDamageEvent.DamageCause.ENTITY_ATTACK) {

            //Player Cancel Damage Event on Attack Teammember

            if (player.getName().equalsIgnoreCase("creperozelot")) {
                if (DamageCauseEntity.getName().equalsIgnoreCase("GodVikthor")) {
                    event.setCancelled(true);
                }
            }






        }
    }
}

package de.creperozelot.start;

import cn.nukkit.Player;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.block.BlockBreakEvent;
import cn.nukkit.event.block.BlockPlaceEvent;
import cn.nukkit.event.entity.EntityDamageByEntityEvent;
import cn.nukkit.event.entity.EntityDamageEvent;
import cn.nukkit.event.player.PlayerMoveEvent;
import de.creperozelot.StaticCache;

public class StartFreze implements Listener {

    @EventHandler(ignoreCancelled = true)
    public void onDamage(EntityDamageEvent event) {
        if (event.getEntity() instanceof Player &&
                StaticCache.START_FREZE) {
            event.setCancelled(true);
            return;
        }
        if (event instanceof EntityDamageByEntityEvent && (
                (EntityDamageByEntityEvent)event).getDamager() instanceof Player &&
                StaticCache.START_FREZE)
            event.setCancelled(true);
    }

    @EventHandler(ignoreCancelled = true)
    public void onPlace(BlockPlaceEvent event) {
        if (StaticCache.START_FREZE)
            event.setCancelled(true);
    }

    @EventHandler(ignoreCancelled = true)
    public void onMove(PlayerMoveEvent event) {
        if (StaticCache.START_FREZE) {
            event.setCancelled(true);
        }
    }

    @EventHandler(ignoreCancelled = true)
    public void onBreak(BlockBreakEvent event) {
        if (StaticCache.START_FREZE)
            event.setCancelled(true);
    }

}

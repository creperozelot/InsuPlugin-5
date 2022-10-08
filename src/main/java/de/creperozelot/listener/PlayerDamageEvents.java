package de.creperozelot.listener;

import cn.nukkit.Player;
import cn.nukkit.block.Block;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.block.BlockPlaceEvent;
import cn.nukkit.event.entity.EntityDamageEvent;
import cn.nukkit.level.Level;
import cn.nukkit.math.Vector3;
import de.creperozelot.StaticCache;
import de.creperozelot.creperozelot;

public class PlayerDamageEvents implements Listener {

    @EventHandler
    public void onPlayerDamage(EntityDamageEvent event) {
        Player player = (Player) event.getEntity();
        Block block = player.getLevel().getBlock((Vector3)player.getLocation().subtract(0.0D, 1.0D, 0.0D));
        Block block1 = player.getLevel().getBlock((Vector3)player.getLocation());
        if (StaticCache.EVENT_HOTGRASS && block.getId() == 2) {
            player.setOnFire(60);
            player.sendTitle(creperozelot.colorize("&a&lHotGrass"), creperozelot.colorize("&6Du darfst dich nicht auf grass Befinden"), 0, 40, 20);
        }
    }
}

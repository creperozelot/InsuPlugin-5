package de.creperozelot.listener;

import cn.nukkit.block.Block;
import cn.nukkit.Player;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerEvent;
import cn.nukkit.math.Vector3;
import de.creperozelot.StaticCache;

public class OnPlayerDamage implements Listener {

    @EventHandler

    public void OnPlayerDamage(PlayerEvent event) {
        Player player = event.getPlayer();
        Block block = player.getLevel().getBlock((Vector3)player.getLocation().subtract(0.0D, 1.0D, 0.0D));
        //Set on Fire on Player Hotgrass True
        if (player.isOnFire() && StaticCache.EVENT_HOTGRASS && block.getId() == 2) {
            player.setOnFire(3);
        }

    }

}

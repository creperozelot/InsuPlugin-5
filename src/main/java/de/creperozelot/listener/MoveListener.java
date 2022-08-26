package de.creperozelot.listener;

import de.creperozelot.StaticCache;
import de.creperozelot.creperozelot;
import cn.nukkit.Player;
import cn.nukkit.block.Block;
import cn.nukkit.entity.Entity;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerMoveEvent;
import cn.nukkit.math.Vector3;
import cn.nukkit.potion.Effect;

public class MoveListener implements Listener {
    private creperozelot plugin;

    public MoveListener(creperozelot plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onMove(PlayerMoveEvent event) {
        Player player = event.getPlayer();
        Block block = player.getLevel().getBlock((Vector3)player.getLocation().subtract(0.0D, 1.0D, 0.0D));
        Block block1 = player.getLevel().getBlock((Vector3)player.getLocation());
        if (StaticCache.EVENT_WATERDANAGE) {
            if (block1.getId() == 8) {
                player.sendTitle(creperozelot.colorize("&6&lWasser ist Säure"), creperozelot.colorize("&6Halte dich von Wasser fern"), 0, 40, 20);
                        player.addEffect(Effect.getEffect(19).setDuration(60).setAmplifier(1).setVisible(false));
            }
            if (block instanceof de.creperozelot.events.Water)
                block.onEntityCollide((Entity)player);
            if (player.isInsideOfWater()) {
                player.sendTitle(creperozelot.colorize("&6&lWasser ist Säure"), creperozelot.colorize("&6Halte dich von Wasser fern"), 0, 40, 20);
                        player.addEffect(Effect.getEffect(19).setDuration(60).setAmplifier(2).setVisible(false));
            }
            if (player.isSwimming()) {
                player.sendTitle(creperozelot.colorize("&6&lWasser ist Säure"), creperozelot.colorize("&6Halte dich von Wasser fern"), 0, 40, 20);
                        player.addEffect(Effect.getEffect(19).setDuration(60).setAmplifier(2).setVisible(false));
            }
        }
        if (StaticCache.EVENT_HOTGRASS && block.getId() == 2) {
            player.setOnFire(60);
            player.sendTitle(creperozelot.colorize("&a&lHot Grass"), creperozelot.colorize("&6Du darfst dich nicht auf grass Befinden"), 0, 40, 20);
        }
    }
}

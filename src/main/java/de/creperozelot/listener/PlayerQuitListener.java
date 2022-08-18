package de.creperozelot.listener;

import cn.nukkit.Player;
import de.creperozelot.creperozelot;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerQuitEvent;

public class PlayerQuitListener implements Listener {
    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event) {
        Player player = event.getPlayer();

        event.setQuitMessage(creperozelot.prefix + "&a" + player.getName() + " &fhat das Spiel verlassen.");

    }
}

package de.creperozelot.listener;

import de.creperozelot.creperozelot;

import cn.nukkit.Player;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerChatEvent;

public class ChatLIstener implements Listener {

    public ChatLIstener() {

    }

    @EventHandler
    public void ChatListener(PlayerChatEvent event) {
        Player player = event.getPlayer();
        String message = event.getMessage();


        if (player.getName().equalsIgnoreCase("creperozelot")) {
            event.setFormat(creperozelot.prefix + player.getDisplayName() + " >> §e" + message);
        } else if (player.getName().equalsIgnoreCase("ToadenationNr1")) {
            event.setFormat(creperozelot.prefix + player.getDisplayName() + " >> §e" + message);
        } else if (player.getName().equalsIgnoreCase("GodVikthor")) {
            event.setFormat(creperozelot.prefix + player.getDisplayName() + " >> §e" + message);
        } else {
            event.setFormat(creperozelot.prefix + player.getDisplayName() + " >> " + message);
        }
    }
}

package de.creperozelot.listener;

import cn.nukkit.Player;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerMoveEvent;
import de.creperozelot.creperozelot;

public class TeamLiveListener implements Listener {

    private final creperozelot plugin;

    public TeamLiveListener(creperozelot plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onMove(PlayerMoveEvent event) {
        Player player = event.getPlayer();

        if (creperozelot.getInstance().getConfig().getBoolean("Start")) {
            //Zeigt Teammates Leben an
            if (player.getName().equalsIgnoreCase("sHowLater")); {
             player.sendActionBar(creperozelot.colorize("&c&lLeben von deinem Teammate ist &4{Teammate-Live}"));
            }

            if (player.getName().equalsIgnoreCase("")); {
                player.sendActionBar(creperozelot.colorize("&c&lLeben von deinem Teammate ist &4{Teammate-Live}"));
            }

            }
        }
    }


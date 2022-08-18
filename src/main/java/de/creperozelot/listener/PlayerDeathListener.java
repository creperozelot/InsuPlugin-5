package de.creperozelot.listener;


import cn.nukkit.level.Sound;
import de.creperozelot.creperozelot;
import cn.nukkit.Player;
import cn.nukkit.Server;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerDeathEvent;
import cn.nukkit.level.Level;

import java.util.concurrent.TimeUnit;

public class PlayerDeathListener implements Listener {

    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent event) {
        Player player = event.getEntity();
        Server server = Server.getInstance();
        Level level = player.getLevel();

        event.setDeathMessage(creperozelot.prefix + "&fDer Spieler&a " + player.getName() + " &fist ausgeschieden.");
        for (Player AllOnlinePlayers : Server.getInstance().getOnlinePlayers().values()){
            AllOnlinePlayers.sendTitle("&6&l" + player.getName(), "&c† Ist Ausgeschieden †", 1, 3, 1);
            level.addSound(AllOnlinePlayers.getPosition(), Sound.RANDOM_TOTEM);
        }
        server.removeWhitelist(player.getName());
        player.setGamemode(3);

        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        player.kick(creperozelot.prefix + "&cSystem" + "\n&cDu bist Ausgeschieden.", false);
    }
}

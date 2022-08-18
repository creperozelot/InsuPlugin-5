package de.creperozelot.listener;

import de.creperozelot.team.TeamSystem;

import cn.nukkit.Server;
import cn.nukkit.Player;
import cn.nukkit.level.Level;
import cn.nukkit.level.Sound;
import cn.nukkit.scheduler.Task;
import de.creperozelot.creperozelot;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerJoinEvent;


public class PlayerJoinListener implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        Server server = Server.getInstance();
        Level level = player.getLevel();

        (new TeamSystem()).setTeam(player);

        if (player.getName().equalsIgnoreCase("GodVikthor")) {
            player.setGamemode(3);
        }



        event.setJoinMessage(creperozelot.prefix + "&a" + player.getName() + " &fhat das Spiel betreten.");
        player.sendTitle("&6&lWillkommen bei", "&a&lIN&2&lSU&r&4&l 5");

        server.getScheduler().scheduleDelayedTask(new Task() {
            @Override
            public void onRun(int i) {
                player.sendMessage(creperozelot.prefix + "&fDu hast &a&lIN&2&lSU&r&f betreten. Es sind &a" + server.getOnlinePlayers().values().size() + " &fSpieler Online.");
                level.addSound(player.getPosition(), Sound.MOB_ENDERDRAGON_FLAP);

            }
        }, 20 * 2);

    }
}

package de.creperozelot.tasks;

import de.creperozelot.creperozelot;
import cn.nukkit.Player;
import cn.nukkit.Server;
import cn.nukkit.scheduler.Task;

import java.util.concurrent.TimeUnit;


public class WatingForHost extends Task {


    @Override
    public void onRun(int i) {
        if (!creperozelot.getInstance().getConfig().getBoolean("start")) {
            for (Player player : Server.getInstance().getOnlinePlayers().values()) {
                if (!(Server.getInstance().getPlayerExact(creperozelot.getInstance().getConfig().getString("hoster")) != null)) {
                    player.sendActionBar("&a&lWarte auf Host | " + Server.getInstance().getOnlinePlayers().values().size() + " &a&lSpieler Online", 0, 5, 1);

                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    player.sendActionBar("&a&lWarte auf Host. | " + Server.getInstance().getOnlinePlayers().values().size() + " &a&lSpieler Online", 0, 5, 1);

                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    player.sendActionBar("&a&lWarte auf Host.. | " + Server.getInstance().getOnlinePlayers().values().size() + " &a&lSpieler Online", 0, 5, 1);

                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    player.sendActionBar("&a&lWarte auf Host... | " + Server.getInstance().getOnlinePlayers().values().size() + " &a&lSpieler Online", 0, 5, 1);
                } else {
                    player.sendActionBar("&a&lWarte auf Start | " + Server.getInstance().getOnlinePlayers().values().size() + " &a&lSpieler Online", 0, 5, 1);

                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    player.sendActionBar("&a&lWarte auf Start. | " + Server.getInstance().getOnlinePlayers().values().size() + " &a&lSpieler Online", 0, 5, 1);

                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    player.sendActionBar("&a&lWarte auf Start.. | " + Server.getInstance().getOnlinePlayers().values().size() + " &a&lSpieler Online", 0, 5, 1);

                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    player.sendActionBar("&a&lWarte auf Start... | " + Server.getInstance().getOnlinePlayers().values().size() + " &a&lSpieler Online", 0, 5, 1);


                }

            }
        } else {
            for (Player player : Server.getInstance().getOnlinePlayers().values()) {
                player.sendActionBar(creperozelot.colorize("&c&lLeben von deinem Partner : %insert%"), 0, 60, 20);
            }
        }

    }

}

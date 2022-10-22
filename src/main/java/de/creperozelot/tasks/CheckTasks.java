package de.creperozelot.tasks;

import cn.nukkit.Player;
import cn.nukkit.Server;
import de.creperozelot.creperozelot;

import cn.nukkit.scheduler.Task;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

public class CheckTasks extends Task {
    public void onRun(int i) {
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:mm");
        String formattedDate = myDateObj.format(myFormatObj);
        if (formattedDate.equalsIgnoreCase("20:20")) {
            Server.getInstance().broadcastMessage(creperozelot.prefix + creperozelot.colorize("&6&lINSU endet in 10 Minuten..."));
        } else if (formattedDate.equalsIgnoreCase("20:25")) {
            Server.getInstance().broadcastMessage(creperozelot.prefix + creperozelot.colorize("&6&lINSU endet in 5 Minuten..."));
        } else if (formattedDate.equalsIgnoreCase("20:26")) {
            Server.getInstance().broadcastMessage(creperozelot.prefix + creperozelot.colorize("&6&lINSU endet in 4 Minuten..."));
        } else if (formattedDate.equalsIgnoreCase("20:27")) {
            Server.getInstance().broadcastMessage(creperozelot.prefix + creperozelot.colorize("&6&lINSU endet in 3 Minuten..."));
        } else if (formattedDate.equalsIgnoreCase("20:28")) {
            Server.getInstance().broadcastMessage(creperozelot.prefix + creperozelot.colorize("&6&lINSU endet in 2 Minuten..."));
        } else if (formattedDate.equalsIgnoreCase("20:29")) {
            Server.getInstance().broadcastMessage(creperozelot.prefix + creperozelot.colorize("&6&lINSU endet in 1 Minute..."));
        } else if (formattedDate.equalsIgnoreCase("20:30")) {
            for (Player player : Server.getInstance().getOnlinePlayers().values()) {
                player.kick(creperozelot.colorize("&a&lGlückwunsch du hast für HEUTE überlebt \n &e&lBis Morgen :)"), false);

                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                Server.getInstance().shutdown();
            }
        }
    }
}

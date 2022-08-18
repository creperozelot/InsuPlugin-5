package de.creperozelot.tasks;

import cn.nukkit.Player;
import cn.nukkit.Server;
import de.creperozelot.creperozelot;

import cn.nukkit.scheduler.Task;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CheckTasks extends Task {
    public void onRun(int i) {
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:mm");
        String formattedDate = myDateObj.format(myFormatObj);
        if (formattedDate.equalsIgnoreCase("19:35")) {
            for (Player player : Server.getInstance().getOnlinePlayers().values()) {
                player.kick("Aufnahmezeit ist abgelaufen!", false);
                Server.getInstance().broadcastMessage((new creperozelot()).prefix + "Spieler wurde gekickt, da die Aufnahmezeit abgelaufen ist!");
            }
        }
    }
}

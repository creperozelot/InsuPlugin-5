package de.creperozelot.tasks;

import de.creperozelot.creperozelot;
import cn.nukkit.Player;
import cn.nukkit.Server;
import cn.nukkit.scheduler.Task;

public class KickCountdown extends Task {
    public void onRun(int i) {
        for (Player player : Server.getInstance().getOnlinePlayers().values()) {
            if (player != null && (
                    !player.isOp())) {
                Server.getInstance().removeWhitelist(player.getName());
                Server.getInstance().getLogger().info((new creperozelot()).prefix + player.getDisplayName() + " gekickt, da der Spieler gestorben ist!");
                player.kick("bist ausgeschieden!\nGlbeim nMal.", false);
            }

        }
    }
}

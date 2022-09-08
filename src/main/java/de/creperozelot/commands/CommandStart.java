package de.creperozelot.commands;

import cn.nukkit.Player;
import cn.nukkit.Server;
import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;
import cn.nukkit.level.Location;
import cn.nukkit.math.Vector3;
import de.creperozelot.StaticCache;
import de.creperozelot.creperozelot;

import java.util.concurrent.TimeUnit;

public class CommandStart extends Command {


    public CommandStart(String name, String description, String usageMessage, String[] aliases) {
        super(name, description, usageMessage, aliases);
        this.setPermission("insu.admin.start");
    }

    @Override
    public boolean execute(CommandSender commandSender, String s, String[] args) {
        if (!((commandSender instanceof Player))) return false;
        if (!commandSender.hasPermission(this.getPermission())) {
            commandSender.sendMessage(creperozelot.colorize("&cDu hast keine Berechtigung für diesen Command."));
            return false;
        }

        Player player = (Player) commandSender;
        boolean ran = creperozelot.getInstance().getConfig().getBoolean("start", false);

        if (ran) {
            player.sendMessage(creperozelot.colorize(creperozelot.prefix + "&cDas Projekt wurde bereits Gestartet."));
            return true;
        }

        creperozelot.getInstance().getConfig().set("start", true);
        creperozelot.getInstance().getConfig().save();

        player.sendMessage(creperozelot.colorize(creperozelot.prefix + "&aDas Projekt wurde Gestartet."));
        StaticCache.COUNTDOWN_ACTIVE = true;

        /**
         int countdown_s = 121;
        while (countdown_s >= 0) {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            countdown_s--;

            //Send Player Message (CountDown)
            if (countdown_s == 120 || countdown_s == 100 || countdown_s == 60 || countdown_s == 30 || countdown_s == 20 || countdown_s <= 10) {
                player.sendMessage(creperozelot.prefix + creperozelot.colorize("&a&lIN&2&lSU&r&f Startet in &a" + countdown_s + "&f Sekunden"));
            } else if (countdown_s == 75) {
                    for (Player AllOnlinePlayers : Server.getInstance().getOnlinePlayers().values()) {
                        Location fly_1 = new Location(-28, 173, -89, 1.0, 1.0);
                        Location fly_2 = new Location(-139, 117, 300);
                        Location fly_3 = new Location(-294, 142, -78);
                        Location fly_4 = new Location(-125, 100, 116);
                        Location fly_5 = new Location(102, 83, 155);
                        AllOnlinePlayers.setGamemode(3);
                        AllOnlinePlayers.teleport(fly_1);
                    }
            }
        }
         **/

        player.sendMessage("countdown ready");

        //StaticCache.START_FREZE = true;

        return true;
    }
}

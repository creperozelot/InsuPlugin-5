package de.creperozelot.commands;

import cn.nukkit.level.Location;
import cn.nukkit.potion.Effect;
import de.creperozelot.StaticCache;
import de.creperozelot.creperozelot;
import cn.nukkit.Player;
import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;
import cn.nukkit.Server;
import cn.nukkit.level.Level;
import cn.nukkit.level.Sound;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

public class CommandStartContinue extends Command {
    Location RollLade = new Location(-224, 63, 301);
    Location MallowWasBistDuWiederSoMad = new Location(293, 63, -319);
    Location Darkside = new Location(-321, 63, -273);
    Location Pinkplayer = new Location(345, 63, -51);
    Location ELEMAO = new Location(-90, 189, -44);
    Location DieCoolen = new Location(100, 63, -7);
    Location Vodafone = new Location(-311, 63, 117);
    Location DerPoleUndDerItaliener = new Location(127, 63, -347);
    Location L0STYS = new Location(-440, 63, -72);
    Location FORRUSSIA = new Location(126, 63, -197);
    Location Qajos = new Location(266, 63, -77);
    Location Eulenfänger = new Location(457, 63, -189);
    Location Bigbababubatz = new Location(-145, 63, -423);
    Location DieKrabbelstube = new Location(499, 63, -84);
    Location SAO = new Location(-66, 63, 215);
    Location randomteam = new Location(260, 139, -204);
    Location Heheheha = new Location(122, 63, 440);
    Location Ingodingos = new Location(208, 84, -270);
    Location Tam_Plums = new Location(456, 64, 102);
    Location KeineAhnung = new Location(-258, 130, 42);
    Location Gamatisch = new Location(-68, 134, 12);
    Location AmogUsIstBesserAlsValo = new Location(-57, 87, 86);
    Location NoYTRank = new Location(-83, 126, -175);
    Location tutti_frutti = new Location(-198, 63, -352);
    Location GamilinoUndBenno = new Location(-210, 105, 117);

    public CommandStartContinue(String name, String description, String usageMessage, String[] aliases) {
        super(name, description, usageMessage, aliases);
        this.setPermission("insu.admin.startcontinue");
    }

    @Override
    public boolean execute(CommandSender commandSender, String s, String[] args) {
        if (!((commandSender instanceof Player))) {
            return false;
        }
        Player player = (Player) commandSender;
        if (!commandSender.hasPermission(this.getPermission())) {
            commandSender.sendMessage("&cDu hast keine Berechtigung für diesen Command.");
            return false;
        }

        if (creperozelot.getInstance().getConfig().getBoolean("start")) {
            player.sendMessage(creperozelot.prefix + creperozelot.colorize("&aStart Forgesetzt."));

            for (Player AllOnlinePlayers : Server.getInstance().getOnlinePlayers().values()) {
                AllOnlinePlayers.sendActionBar(creperozelot.colorize("&e&lStarte Insu... (Teleportiere Teams...)"));
            }


        } else {
            player.sendMessage(creperozelot.prefix + creperozelot.colorize("&cDu musst erst Starten bevor du denn Start Fortsetzen kannst,"));
        }

        return true;
    }

}

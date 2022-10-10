package de.creperozelot.commands;

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

public class CommandEventLowMining extends Command {

    public CommandEventLowMining(String name, String description, String usageMessage, String[] aliases) {
        super(name, description, usageMessage, aliases);
        this.setPermission("insu.admin.blindniss");
    }

    @Override
    public boolean execute(CommandSender commandSender, String s, String[] args) {
        if (!((commandSender instanceof Player))) {
            return false;
        }
        if (!commandSender.hasPermission(this.getPermission())) {
            commandSender.sendMessage("&cDu hast keine Berechtigung für diesen Command.");
            return false;
        }

        Player player = (Player) commandSender;

        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                StaticCache.EVENT_ACTIVE = false;
            }
        }, 1000 * 60 * 10);

        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                StaticCache.EVENT_MINING_FATIQUE = false;
            }
        }, 1000 * 60 * 2);

        player.sendMessage(creperozelot.colorize(creperozelot.prefix + "&fDu hast das Event &e&lMining-Fatique&a Aktiviert."));


        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                for (Player AllOnlinePlayers : Server.getInstance().getOnlinePlayers().values()) {
                    AllOnlinePlayers.sendTitle(creperozelot.colorize("&6&lEvent &e&lMining-Fatique &a"), creperozelot.colorize("&cWurde Beendet"), 10, 60, 40);
                    Level level = AllOnlinePlayers.getLevel();
                    level.addSound(AllOnlinePlayers.getPosition(), Sound.RANDOM_LEVELUP);
                }
            }
        }, 1000 * 60 * 2);

        Server.getInstance().broadcastMessage(creperozelot.prefix + creperozelot.colorize("&6Event &e&lMining-Fatique&r&a wird Gestartet..."));

        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Server.getInstance().broadcastMessage(creperozelot.prefix + creperozelot.colorize("&6Event &e&lMining-Fatique&r&a ist Aktiv in &45"));

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Server.getInstance().broadcastMessage(creperozelot.prefix + creperozelot.colorize("&6Event &e&lMining-Fatique&r&a ist Aktiv in &64"));

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Server.getInstance().broadcastMessage(creperozelot.prefix + creperozelot.colorize("&6Event &e&lMining-Fatique&r&a ist Aktiv in &e3"));


        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Server.getInstance().broadcastMessage(creperozelot.prefix + creperozelot.colorize("&6Event &e&lMining-Fatique&r&a ist Aktiv in &22"));


        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Server.getInstance().broadcastMessage(creperozelot.prefix + creperozelot.colorize("&6Event &e&lMining-Fatique&r&a ist Aktiv in &a1"));

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        for (Player AllOnlinePlayers : Server.getInstance().getOnlinePlayers().values()) {
            AllOnlinePlayers.sendTitle(creperozelot.colorize("&6&lEvent &e&lMining-Fatique"), creperozelot.colorize("&aStart"), 0, 40, 0);
            Level level = AllOnlinePlayers.getLevel();
            level.addSound(AllOnlinePlayers.getPosition(), Sound.RANDOM_LEVELUP);
        }

        StaticCache.EVENT_MINING_FATIQUE = true;
        StaticCache.EVENT_ACTIVE = true;

        return true;
    }

}

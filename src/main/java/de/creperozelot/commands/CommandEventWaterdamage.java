package de.creperozelot.commands;

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

public class CommandEventWaterdamage extends Command {

    public CommandEventWaterdamage(String name, String description, String usageMessage, String[] aliases) {
        super(name, description, usageMessage, aliases);
        this.setPermission("insu.admin.waterdamage");
    }

    @Override
    public boolean execute(CommandSender commandSender, String s, String[] args) {
        if (!(commandSender instanceof Player)) {
            return false;
        }
        if (!commandSender.hasPermission(this.getPermission())) {
            commandSender.sendMessage("&cDu hast keine Berechtigung für diesen Command.");
            return false;
        }

        Player player = (Player) commandSender;

        if (StaticCache.EVENT_ACTIVE) {
            player.sendMessage(creperozelot.prefix + "&cDu kannst events nur alle 10 Minuten ausführen");
            return true;
        }

        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                StaticCache.EVENT_ACTIVE = false;
            }
        }, 1000 * 60 * 10);

        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                StaticCache.EVENT_WATERDANAGE = false;
            }
        }, 1000 * 60 * 1);

        player.sendMessage(creperozelot.colorize(creperozelot.prefix + "&fDu hast das Event &1WaterDamage&a Aktiviert."));


        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                for (Player AllOnlinePlayers : Server.getInstance().getOnlinePlayers().values()) {
                    AllOnlinePlayers.sendTitle(creperozelot.colorize("&6&lEvent &1&lWater &c&lDamage"), creperozelot.colorize("&cWurde Beendet"), 0, 60, 40);
                    Level level = AllOnlinePlayers.getLevel();
                    level.addSound(AllOnlinePlayers.getPosition(), Sound.RANDOM_LEVELUP);
                }
            }
        }, 1000 * 60 * 1);

        Server.getInstance().broadcastMessage(creperozelot.prefix + creperozelot.colorize("&6Event &1&lWater &c&lDamage&r&a wird Gestartet..."));

        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Server.getInstance().broadcastMessage(creperozelot.prefix + creperozelot.colorize("&6Event &1&lWater &c&lDamage&r&a ist Aktiv in &45"));

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Server.getInstance().broadcastMessage(creperozelot.prefix + creperozelot.colorize("&6Event &1&lWater &c&lDamage&r&a ist Aktiv in &64"));

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Server.getInstance().broadcastMessage(creperozelot.prefix + creperozelot.colorize("&6Event &1&lWater &c&lDamage&r&a ist Aktiv in &e3"));


        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Server.getInstance().broadcastMessage(creperozelot.prefix + creperozelot.colorize("&6Event &1&lWater &c&lDamage&r&a ist Aktiv in &22"));


        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Server.getInstance().broadcastMessage(creperozelot.prefix + creperozelot.colorize("&6Event &1&lWater &c&lDamage&r&a ist Aktiv in &a1"));

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        for (Player AllOnlinePlayers : Server.getInstance().getOnlinePlayers().values()) {
            AllOnlinePlayers.sendTitle(creperozelot.colorize("&6&lEvent &1&lWater &c&lDamage"), creperozelot.colorize("&aStart"), 0, 40, 0);
            Level level = AllOnlinePlayers.getLevel();
            level.addSound(AllOnlinePlayers.getPosition(), Sound.RANDOM_LEVELUP);
        }
        StaticCache.EVENT_ACTIVE = true;
        StaticCache.EVENT_WATERDANAGE = true;

        return true;
    }

}

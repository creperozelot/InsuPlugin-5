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

public class CommandEventBlindniss extends Command {

    public CommandEventBlindniss(String name, String description, String usageMessage, String[] aliases) {
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

        if (StaticCache.EVENT_ACTIVE) {
            player.sendMessage(creperozelot.prefix + "&cDu kannst events nur alle 10 Minuten ausführen");
            return true;
        }

        StaticCache.EVENT_ACTIVE = true;
        StaticCache.EVENT_BLINDNISS = true;

        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                StaticCache.EVENT_ACTIVE = false;
            }
        }, 1000 * 60 * 10);

        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                StaticCache.EVENT_BLINDNISS = false;
            }
        }, 1000 * 60 * 2);

        player.sendMessage(creperozelot.colorize(creperozelot.prefix + "&fDu hast das Event &8Blindniss&f Aktiviert."));

        for (Player AllOnlinePlayers : Server.getInstance().getOnlinePlayers().values()) {
            Level level = AllOnlinePlayers.getLevel();


            new Timer().schedule(new TimerTask() {
                @Override
                public void run() {
                    AllOnlinePlayers.sendTitle(creperozelot.colorize("&6&lEvent &8&lBlindniss"), creperozelot.colorize("&fWird &cBeendet"), 0, 60, 40);
                    level.addSound(AllOnlinePlayers.getPosition(), Sound.RANDOM_LEVELUP);
                }
            }, 1000 * 60 * 2 + 8);

            AllOnlinePlayers.sendTitle(creperozelot.colorize("&6&lEvent &8&lBlindniss"), creperozelot.colorize("&fWird Gestartet..."), 20, 60, 0);

            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            AllOnlinePlayers.sendTitle(creperozelot.colorize("&6&lEvent &8&lBlindniss"), creperozelot.colorize("&fStart in &45"), 0, 40, 0);

            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            AllOnlinePlayers.sendTitle(creperozelot.colorize("&6&lEvent &8&lBlindniss"), creperozelot.colorize("&fStart in &c4"), 0, 40, 0);

            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            AllOnlinePlayers.sendTitle(creperozelot.colorize("&6&lEvent &8&lBlindniss"), creperozelot.colorize("&fStart in &e3"), 0, 40, 0);

            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            AllOnlinePlayers.sendTitle(creperozelot.colorize("&6&lEvent &8&lBlindniss"), creperozelot.colorize("&fStart in &22"), 0, 40, 0);

            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            AllOnlinePlayers.sendTitle(creperozelot.colorize("&6&lEvent &8&lBlindniss"), creperozelot.colorize("&fStart in &a1"), 0, 40, 0);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            AllOnlinePlayers.sendTitle(creperozelot.colorize("&6&lEvent &8&lBlindniss"), creperozelot.colorize("&aStart"), 0, 40, 0);
            level.addSound(AllOnlinePlayers.getPosition(), Sound.RANDOM_LEVELUP);
            AllOnlinePlayers.addEffect(Effect.getEffect(15).setDuration(120).setAmplifier(5).setVisible(false));
        }

        return true;
    }

}

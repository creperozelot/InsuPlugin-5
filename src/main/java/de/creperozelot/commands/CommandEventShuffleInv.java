package de.creperozelot.commands;

import cn.nukkit.inventory.PlayerInventory;
import cn.nukkit.item.Item;
import cn.nukkit.potion.Effect;
import de.creperozelot.StaticCache;
import de.creperozelot.creperozelot;
import cn.nukkit.Player;
import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;
import cn.nukkit.Server;
import cn.nukkit.level.Level;
import cn.nukkit.level.Sound;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

public class CommandEventShuffleInv extends Command {

    public CommandEventShuffleInv(String name, String description, String usageMessage, String[] aliases) {
        super(name, description, usageMessage, aliases);
        this.setPermission("insu.admin.shuffleinv");
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


        player.sendMessage(creperozelot.colorize(creperozelot.prefix + "&fDu hast das Event &8Blindniss&f Aktiviert."));

        for (Player AllOnlinePlayers : Server.getInstance().getOnlinePlayers().values()) {
            Level level = AllOnlinePlayers.getLevel();


            AllOnlinePlayers.sendTitle(creperozelot.colorize("&6&lEvent &8&lInv Chaos"), creperozelot.colorize("&fWird Gestartet..."), 20, 60, 0);

            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            AllOnlinePlayers.sendTitle(creperozelot.colorize("&6&lEvent &8&lInv Chaos"), creperozelot.colorize("&fStart in &45"), 0, 40, 0);

            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            AllOnlinePlayers.sendTitle(creperozelot.colorize("&6&lEvent &8&lInv Chaos"), creperozelot.colorize("&fStart in &c4"), 0, 40, 0);

            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            AllOnlinePlayers.sendTitle(creperozelot.colorize("&6&lEvent &8&lInv Chaos"), creperozelot.colorize("&fStart in &e3"), 0, 40, 0);

            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            AllOnlinePlayers.sendTitle(creperozelot.colorize("&6&lEvent &8&lInv Chaos"), creperozelot.colorize("&fStart in &22"), 0, 40, 0);

            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            AllOnlinePlayers.sendTitle(creperozelot.colorize("&6&lEvent &8&lInv Chaos"), creperozelot.colorize("&fStart in &a1"), 0, 40, 0);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            AllOnlinePlayers.sendTitle(creperozelot.colorize("&6&lEvent &8&lInv Chaos"), creperozelot.colorize("&aStart"), 0, 40, 0);
            level.addSound(AllOnlinePlayers.getPosition(), Sound.RANDOM_LEVELUP);

            //invchaos
            PlayerInventory inventory = AllOnlinePlayers.getInventory();
            List<Item> list = new ArrayList<>(inventory.getContents().values());
            Collections.shuffle(list);
            Map<Integer, Item> contents = new HashMap<>();
            int i = 0;
            for (Item item : list) {
                contents.put(Integer.valueOf(i), item);
                i++;
            }

            return true;
        }

        return false;
    }

}

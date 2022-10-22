package de.creperozelot.commands;

import cn.nukkit.Player;
import cn.nukkit.Server;
import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;
import cn.nukkit.item.Item;
import de.creperozelot.StaticCache;
import de.creperozelot.creperozelot;

import java.util.*;

public class CommandEventGlueckstreffer extends Command {

    public CommandEventGlueckstreffer(String name, String description, String usageMessage, String[] aliases) {
        super(name, description, usageMessage, aliases);
        this.setPermission("insu.admin.glueckstreffer");
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

        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                StaticCache.EVENT_ACTIVE = false;
            }
        }, 1000 * 60 * 10);

        player.sendMessage(creperozelot.colorize(creperozelot.prefix + "&fDu hast das Event &a&lGlückstreffer&a Aktiviert."));

        for (Player AllOnlinePlayer : Server.getInstance().getOnlinePlayers().values()) {
            Random random = new Random();
            int int_random = random.nextInt(10);

            if (int_random == 8) {
                Item diamond = Item.get(264, 0, 2);
                AllOnlinePlayer.getInventory().addItem(diamond);
                AllOnlinePlayer.sendMessage(creperozelot.prefix + creperozelot.colorize("&aJa Supper, du hast &b&lDiamanten&r&a Gewonnen."));
            } else {
                AllOnlinePlayer.sendMessage(creperozelot.prefix + creperozelot.colorize("&aJa Supper, du hast &c&lKEINE&r &b&lDiamanten&r&a Gewonnen. :)"));
            }
        }
        return true;
    }


}

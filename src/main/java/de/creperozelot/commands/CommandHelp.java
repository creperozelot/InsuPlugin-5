package de.creperozelot.commands;

import cn.nukkit.Player;
import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;
import de.creperozelot.creperozelot;

public class CommandHelp extends Command {

    public CommandHelp(String name, String description, String usageMessage, String[] aliases) {
        super(name, description, usageMessage, aliases);
        this.setPermission("insu.admin.help");
    }

    @Override
    public boolean execute(CommandSender commandSender, String s, String[] args) {

        if(commandSender instanceof Player) {

            Player player = (Player) commandSender;

            if (player.hasPermission("insu.admin.help")) {

                player.sendMessage(creperozelot.colorize("&a======&a&lIN&2&lSU======"));
                player.sendMessage(creperozelot.colorize("&a/help&f - Zeigt diese Nachricht an."));
                player.sendMessage("");
                player.sendMessage(creperozelot.colorize("&a/sethost&f - Stellt den Hoster ein."));
                player.sendMessage("");
                player.sendMessage(creperozelot.colorize("&a/tp&f - Teleportiert dich zu einem Spieler."));
                player.sendMessage("");
                player.sendMessage(creperozelot.colorize("&a/spec&f - Setzt dich in den Zuschauer modus."));
                player.sendMessage("");
                player.sendMessage(creperozelot.colorize("&a/insui&f - Öffnet das Insu Verwaltungs Interface."));
                player.sendMessage("");
                player.sendMessage(creperozelot.colorize("&a/start&f - Startet das Insu Projekt."));
                player.sendMessage(creperozelot.colorize("&a======&a&lIN&2&lSU======"));


            } else {
                commandSender.sendMessage(creperozelot.colorize("&cDu hast keine Berechtigung für diesen Command."));
            }


        }




        return true;
    }
}

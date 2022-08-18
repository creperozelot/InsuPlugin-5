package de.creperozelot.commands;

import de.creperozelot.creperozelot;
import cn.nukkit.Player;
import cn.nukkit.Server;
import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;
import cn.nukkit.potion.Effect;
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

                player.sendMessage("&a======&a&lIN&2&lSU======");
                player.sendMessage("&a/help&f - Zeigt diese Nachricht an.");
                player.sendMessage("");
                player.sendMessage("&a/sethost&f - Stellt den Hoster ein.");
                player.sendMessage("");
                player.sendMessage("&a/tp&f - Teleportiert dich zu einem Spieler.");
                player.sendMessage("");
                player.sendMessage("&a/spec&f - Setzt dich in den Zuschauer modus.");
                player.sendMessage("&a======&a&lIN&2&lSU======");


            } else {
                commandSender.sendMessage("&cDu hast keine Berechtigung für diesen Command.");
            }


        }




        return true;
    }
}

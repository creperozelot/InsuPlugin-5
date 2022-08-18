package de.creperozelot.commands;

import de.creperozelot.creperozelot;
import cn.nukkit.Player;
import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;

public class CommandSpectate extends Command {

    public CommandSpectate(String name, String description, String usageMessage, String[] aliases) {
        super(name, description, usageMessage, aliases);
        this.setPermission("insu.admin.spectate");
    }

    @Override
    public boolean execute(CommandSender commandSender, String s, String[] args) {

        if (commandSender instanceof Player) {
            Player player = (Player) commandSender;

            if (player.getName().equalsIgnoreCase("GodVikthor")) {
                player.sendMessage(creperozelot.colorize(creperozelot.prefix + "&fDu kannst &cnicht&f in den &aSpectator&f Mode &bAlbert..."));
            }

            if (player.hasPermission("insu.admin.spectate")) {
                if (player.gamemode == 0 || player.gamemode == 1 || player.gamemode == 2) {
                    player.setGamemode(3);
                    player.sendMessage(creperozelot.colorize(creperozelot.prefix + "&fDu bist nun im &aSpectator &fMode"));
                } else {
                    player.setGamemode(1);
                    player.sendMessage(creperozelot.colorize(creperozelot.prefix + "&fDu bist nun &cnicht mehr&f im &aSpectator &fMode"));
                }
            } else {
                player.sendMessage(creperozelot.colorize("&cDu hast keine Berechtigung für diesen Command."));
            }
        } else {
            commandSender.sendMessage(creperozelot.colorize("&cDu kannst diesen Befehl nur als Spieler ausführen."));
        }
        return true;
    }
}

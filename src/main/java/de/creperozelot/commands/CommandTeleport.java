package de.creperozelot.commands;

import cn.nukkit.Player;
import cn.nukkit.Server;
import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;
import de.creperozelot.creperozelot;

public class CommandTeleport extends Command {

    public CommandTeleport(String name, String description, String usageMessage, String[] aliases) {
        super(name, description, usageMessage, aliases);
        this.setPermission("insu.admin.teleport");
    }

    @Override
    public boolean execute(CommandSender commandSender, String s, String[] args) {

        if (commandSender instanceof Player) {
            Player player = (Player) commandSender;

            if (player.hasPermission("insu.admin.teleport")) {
                if (args.length == 1) {
                    String name = args[0];

                    Player target = Server.getInstance().getPlayerExact(name);

                    if (target != null) {
                        player.teleport(target);
                        player.sendMessage(creperozelot.colorize(creperozelot.prefix + "&aDu wurdest zu &2" + name + " &aTeleportiert."));
                        target.sendMessage(creperozelot.colorize(creperozelot.prefix + "&Der Spieler &2" + player.getName() + " &a hat sich zu dir Teleportiert."));
                    } else {
                        player.sendMessage(creperozelot.colorize("&cDer Spieler &4" + name + " &cist nicht Online."));
                    }

                } else {
                    player.sendMessage(this.getUsage());
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

package de.creperozelot.commands;

import de.creperozelot.creperozelot;
import cn.nukkit.Player;
import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;

public class Commandsethost extends Command {





    public Commandsethost(String name, String description, String usageMessage, String[] aliases) {
        super(name, description, usageMessage, aliases);
        this.setPermission("insu.admin.sethost");
    }

    @Override
    public boolean execute(CommandSender commandSender, String s, String[] args) {

        String hoster = args[0];

        if(commandSender instanceof Player) {

            Player player = (Player) commandSender;

            if (player.hasPermission("insu.admin.sethost")) {

                if (hoster.length() > 2) {
                    creperozelot.getInstance().getConfig().set("hoster", hoster);
                    creperozelot.getInstance().getConfig().save();
                    player.sendMessage(creperozelot.prefix + "&fDu hast den Hoster erfolgreich auf &a" + creperozelot.getInstance().getConfig().getString("hoster") + " &fgesetzt.");

                } else {
                    player.sendMessage(creperozelot.colorize(creperozelot.prefix + "&cDu musst mind. 3 Zeichen Angeben."));
                }
            } else {
                commandSender.sendMessage("&cDu hast keine Berechtigung für diesen Command.");
            }


        }
        return true;
    }


}

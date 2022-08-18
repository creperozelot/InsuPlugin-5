package de.creperozelot.commands;

import de.creperozelot.creperozelot;

import cn.nukkit.Player;
import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;

public class CommandTest2 extends Command {


    public CommandTest2(String name, String description, String usageMessage, String[] aliases) {
        super(name, description, usageMessage, aliases);
        this.setPermission("insu.dev.test");
    }


    @Override
    public boolean execute(CommandSender commandSender, String s, String[] args) {


            Player player = (Player) commandSender;

            if (player.hasPermission("insu.dev.test")) {
                if (creperozelot.getInstance().getConfig().getBoolean("test")) {
                    creperozelot.getInstance().getConfig().set("test", false);
                    creperozelot.getInstance().getConfig().save();
                } else {
                    creperozelot.getInstance().getConfig().set("test", true);
                    creperozelot.getInstance().getConfig().save();
                }
            } else {
                commandSender.sendMessage(creperozelot.colorize("&cDu hast keine Berechtigung für diesen Command."));
            }


        return true;
    }

}

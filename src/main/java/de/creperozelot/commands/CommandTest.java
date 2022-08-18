package de.creperozelot.commands;


import cn.nukkit.Player;
import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;
import de.creperozelot.creperozelot;

public class CommandTest extends Command {


    public CommandTest(String name, String description, String usageMessage, String[] aliases) {
        super(name, description, usageMessage, aliases);
        this.setPermission("insu.dev.test");
    }




    @Override
    public boolean execute(CommandSender commandSender, String s, String[] args) {



        if (commandSender instanceof Player){
            Player player = (Player) commandSender;

            if (player.hasPermission("insu.dev.test")) {
                commandSender.sendMessage("" +new Storage().EventRunning);
            } else {
                commandSender.sendMessage(creperozelot.colorize("&cDu hast keine Berechtigung für diesen Command."));
            }
        } else {
                commandSender.sendMessage("" +new Storage().EventRunning);
        }




        return true;
    }
}

package de.creperozelot.commands;

import de.creperozelot.creperozelot;

import cn.nukkit.Player;
import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;

public class CommandTest2 extends Command {
    boolean HotGrass = new Storage().Hotgrass;


    public CommandTest2(String name, String description, String usageMessage, String[] aliases) {
        super(name, description, usageMessage, aliases);
        this.setPermission("insu.dev.test");
    }




    @Override
    public boolean execute(CommandSender commandSender, String s, String[] args) {



        if (commandSender instanceof Player){
            Player player = (Player) commandSender;

            if (player.hasPermission("insu.dev.test")) {
                player.sendMessage("test " + HotGrass);
            } else {
                commandSender.sendMessage(creperozelot.colorize("&cDu hast keine Berechtigung für diesen Command."));
            }
        } else {
            commandSender.sendMessage("test " + HotGrass);
        }




        return true;
    }
}

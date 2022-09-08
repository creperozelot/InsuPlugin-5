package de.creperozelot.commands;


import cn.nukkit.Player;
import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;
import de.creperozelot.StaticCache;
import de.creperozelot.creperozelot;

public class CommandUndoStart extends Command {


    public CommandUndoStart(String name, String description, String usageMessage, String[] aliases) {
        super(name, description, usageMessage, aliases);
        this.setPermission("insu.dev.undostart");
    }




    @Override
    public boolean execute(CommandSender commandSender, String s, String[] args) {



        if (commandSender instanceof Player){
            Player player = (Player) commandSender;

            if (player.hasPermission("insu.dev.undostart")) {
                StaticCache.START_FREZE = false;
                commandSender.sendMessage(creperozelot.prefix + creperozelot.colorize("&aDu hast den Start &cDeaktiviert!"));
                creperozelot.getInstance().getConfig().set("start", false);
            } else {
                commandSender.sendMessage(creperozelot.colorize("&cDu hast keine Berechtigung."));
            }
        } else {
            StaticCache.START_FREZE = false;
            commandSender.sendMessage(creperozelot.prefix + creperozelot.colorize("&aDu hast den Start &cDeaktiviert!"));
            creperozelot.getInstance().getConfig().set("start", false);
        }




        return true;
    }
}

package de.creperozelot.commands;

import cn.nukkit.Player;
import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;
import de.creperozelot.creperozelot;

public class CommandStart extends Command {

    public CommandStart(String name, String description, String usageMessage, String[] aliases) {
        super(name, description, usageMessage, aliases);
        this.setPermission("insu.admin.start");
    }

    @Override
    public boolean execute(CommandSender commandSender, String s, String[] args) {
        if (!((commandSender instanceof Player))) return false;
        if (!commandSender.hasPermission(this.getPermission())) {
            commandSender.sendMessage(creperozelot.colorize("&cDu hast keine Berechtigung für diesen Command."));
            return false;
        }

        Player player = (Player) commandSender;
        boolean ran = creperozelot.getInstance().getConfig().getBoolean("start", false);

        if (ran) {
            player.sendMessage(creperozelot.colorize(creperozelot.prefix + "&cDas Projekt wurde bereits Gestartet."));
            return true;
        }

        creperozelot.getInstance().getConfig().set("start", true);
        creperozelot.getInstance().getConfig().save();

        player.sendMessage(creperozelot.colorize(creperozelot.prefix + "&aDas Projekt wurde Gestartet."));

        return true;
    }
}

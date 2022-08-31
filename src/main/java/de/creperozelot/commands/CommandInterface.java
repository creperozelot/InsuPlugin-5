package de.creperozelot.commands;

import cn.nukkit.form.element.ElementButton;
import cn.nukkit.form.window.FormWindowCustom;
import cn.nukkit.form.window.FormWindowSimple;
import de.creperozelot.creperozelot;
import cn.nukkit.Player;
import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;

public class CommandInterface extends Command {

    public CommandInterface(String name, String description, String usageMessage, String[] aliases) {
        super(name, description, usageMessage, aliases);
        this.setPermission("insu.admin.spectate");
    }

    @Override
    public boolean execute(CommandSender commandSender, String s, String[] args) {

        if (commandSender instanceof Player) {
            Player player = (Player) commandSender;


            if (player.hasPermission("insu.admin.spectate")) {

                FormWindowSimple formWindowSimple = new FormWindowSimple("§c§lInsu Manager", "Hier kannst du Events Starten und andere Dinge vornehmen.");
                formWindowSimple.addButton(new ElementButton("§aHotgrass"));


            } else {
                player.sendMessage(creperozelot.colorize("&cDu hast keine Berechtigung für diesen Command."));
            }
        } else {
            commandSender.sendMessage(creperozelot.colorize("&cDu kannst diesen Befehl nur als Spieler ausführen."));
        }
        return false;
    }
}

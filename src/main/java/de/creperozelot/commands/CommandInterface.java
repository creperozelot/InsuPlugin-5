package de.creperozelot.commands;

import cn.nukkit.form.element.ElementButton;
import cn.nukkit.form.window.FormWindow;
import cn.nukkit.form.window.FormWindowSimple;
import de.creperozelot.creperozelot;
import cn.nukkit.Player;
import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;

public class CommandInterface extends Command {

    public CommandInterface(String name, String description, String usageMessage, String[] aliases) {
        super(name, description, usageMessage, aliases);
        this.setPermission("insu.admin.interface");
    }

    @Override
    public boolean execute(CommandSender commandSender, String s, String[] args) {

        if (commandSender instanceof Player) {
            Player player = (Player) commandSender;


            if (player.hasPermission("insu.admin.interface")) {
                FormWindowSimple gui = new FormWindowSimple("Insu Admin Interface", "Starte Events und Verwalte INSU über dieses Interface.");
                gui.addButton(new ElementButton("WaterDamage"));
                gui.addButton(new ElementButton("HotGrass"));
                gui.addButton(new ElementButton("Inv-Chaos"));
                gui.addButton(new ElementButton("Blindniss"));
                gui.addButton(new ElementButton("Mining-fatique"));
                gui.addButton(new ElementButton("Glückstreffer"));
                gui.addButton(new ElementButton("Lootdrops"));
                player.showFormWindow((FormWindow)gui);
            } else {
                player.sendMessage(creperozelot.colorize("&cDu hast keine Berechtigung für diesen Command."));
            }
        } else {
            commandSender.sendMessage(creperozelot.colorize("&cDu kannst diesen Befehl nur als Spieler ausführen."));
        }
        return false;
    }
}

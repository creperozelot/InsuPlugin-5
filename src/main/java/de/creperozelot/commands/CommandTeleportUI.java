package de.creperozelot.commands;

import cn.nukkit.Player;
import cn.nukkit.Server;
import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;
import cn.nukkit.form.element.Element;
import cn.nukkit.form.element.ElementDropdown;
import cn.nukkit.form.window.FormWindow;
import cn.nukkit.form.window.FormWindowCustom;
import de.creperozelot.creperozelot;

import java.util.Arrays;
import java.util.List;

public class CommandTeleportUI extends Command {


    public CommandTeleportUI(String name, String description, String usageMessage, String[] aliases) {
        super(name, description, usageMessage, aliases);
        this.setPermission("insu.admin.teleport");
    }

    @Override
    public boolean execute(CommandSender commandSender, String s, String[] args) {

        if (commandSender instanceof Player) {
            Player player = (Player) commandSender;

            if (player.hasPermission("insu.admin.teleport")) {
                int TPUIFORM = 178913281;

                FormWindowCustom gui = new FormWindowCustom(creperozelot.colorize("&6&lTeleport &a&lInterface"));
                for (Player AllOnlinePlayers : Server.getInstance().getOnlinePlayers().values()) {
                    List<String> pl = Arrays.asList(new String[] { AllOnlinePlayers.getName() });
                    gui.addElement((Element)new ElementDropdown("Select", pl));
                    player.showFormWindow((FormWindow)gui, TPUIFORM);
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

package de.creperozelot.commands;

import de.creperozelot.StaticCache;
import de.creperozelot.creperozelot;
import cn.nukkit.Player;
import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

public class CommandEventHotGrass extends Command {
    public CommandEventHotGrass(String name, String description, String usageMessage, String[] aliases) {
        super(name, description, usageMessage, aliases);
        this.setPermission("insu.admin.hotgrass");
    }

    @Override
    public boolean execute(CommandSender commandSender, String s, String[] args) {
        if (!((commandSender instanceof Player))) return false;
        if (!commandSender.hasPermission(this.getPermission())) {
            commandSender.sendMessage("&cDu hast keine Berechtigung für diesen Command.");
            return false;
        }

        Player player = (Player) commandSender;

        if (StaticCache.EVENT_ACTIVE) {
            player.sendMessage(creperozelot.prefix + "&cDu kannst events nur alle 10 Minuten ausführen");
            return true;
        }

        StaticCache.EVENT_ACTIVE = true;
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                StaticCache.EVENT_ACTIVE = false;
            }
        }, 1000*60*10);
        player.sendMessage(creperozelot.prefix + "&fDu hast das Event &aHotGrass&f Aktiviert.");

        return true;
    }
}

package de.creperozelot.commands;

import cn.nukkit.Player;
import cn.nukkit.Server;
import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;
import cn.nukkit.item.Item;
import de.creperozelot.StaticCache;
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
        Item insuadmin = Item.get(377, 0, 1);
        Item teleporter = Item.get(345, 0, 1);
        insuadmin.setCustomName("§c§lINSU Manager");
        insuadmin.setLore("§5Der §c§lINSU Manager §5Steuert die Events und anderen", "§5Wichtige funktionen.");
        teleporter.setCustomName("§a§lTeleport System");
        teleporter.setLore("§5Das §a§lTeleport System §5ist da um sich zu einem Spieler", "§5zu Teleportieren.");

        Player player_creperozelot = Server.getInstance().getPlayerExact("creperozelot");
        Player Levi_GPP = Server.getInstance().getPlayerExact("creperozelot");
        Player GodVikthor = Server.getInstance().getPlayerExact("creperozelot");
        Player Connorbryan14 = Server.getInstance().getPlayerExact("creperozelot");




        if (ran) {
            player.sendMessage(creperozelot.colorize(creperozelot.prefix + "&cDas Projekt wurde bereits Gestartet."));
            return true;
        }

        for (Player AllOnlinePlayers : Server.getInstance().getOnlinePlayers().values()) {
            AllOnlinePlayers.getInventory().clearAll();
        }



        if (!(player_creperozelot == null)) {
            player_creperozelot.getInventory().setItem(0, insuadmin);
            player_creperozelot.getInventory().setItem(2, teleporter);
        }

        if (!(Levi_GPP == null)) {
            Levi_GPP.getInventory().setItem(0, insuadmin);
            Levi_GPP.getInventory().setItem(2, teleporter);
        }

        if (!(GodVikthor == null)) {
            GodVikthor.getInventory().setItem(0, insuadmin);
            GodVikthor.getInventory().setItem(2, teleporter);
        }

        if (!(Connorbryan14 == null)) {
            Connorbryan14.getInventory().setItem(0, insuadmin);
            Connorbryan14.getInventory().setItem(2, teleporter);
        }

        creperozelot.getInstance().getConfig().set("start", true);
        creperozelot.getInstance().getConfig().save();

        player.sendMessage(creperozelot.colorize(creperozelot.prefix + "&aDas Projekt wurde Gestartet."));
        StaticCache.COUNTDOWN_ACTIVE = true;
        return true;
    }
}

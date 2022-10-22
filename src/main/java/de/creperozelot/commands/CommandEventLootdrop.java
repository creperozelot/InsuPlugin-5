package de.creperozelot.commands;

import cn.nukkit.Player;
import cn.nukkit.Server;
import cn.nukkit.block.Block;
import cn.nukkit.block.BlockChest;
import cn.nukkit.block.BlockID;
import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;
import cn.nukkit.item.Item;
import cn.nukkit.level.Level;
import cn.nukkit.level.Location;
import de.creperozelot.StaticCache;
import de.creperozelot.creperozelot;

import java.util.Timer;
import java.util.TimerTask;

public class CommandEventLootdrop extends Command {

    public CommandEventLootdrop(String name, String description, String usageMessage, String[] aliases) {
        super(name, description, usageMessage, aliases);
        this.setPermission("insu.admin.lootdrop");
    }

    @Override
    public boolean execute(CommandSender commandSender, String s, String[] args) {
        if (!((commandSender instanceof Player))) {
            return false;
        }
        if (!commandSender.hasPermission(this.getPermission())) {
            commandSender.sendMessage("&cDu hast keine Berechtigung für diesen Command.");
            return false;
        }

        Player player = (Player) commandSender;

        if (StaticCache.EVENT_ACTIVE) {
            player.sendMessage(creperozelot.colorize(creperozelot.prefix + "&cDu kannst events nur alle 10 Minuten ausführen"));
            return true;
        }

        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                StaticCache.EVENT_ACTIVE = false;
            }
        }, 1000 * 60 * 10);

        StaticCache.EVENT_ACTIVE = true;

        int max_z = -306;
        int min_z = 308;
        int max_x = -266;
        int min_x = -115;

        int random_x = (int) Math.floor(Math.random() * (max_x - min_x + 1) + min_x);
        int random_z = (int) Math.floor(Math.random() * (max_z - min_z + 1) + min_z);

        Level level = player.getLevel();
        int get_y = level.getHighestBlockAt(random_x, random_z);
        Location location = new Location(random_x, get_y, random_z);
        Server.getInstance().broadcastMessage(creperozelot.prefix + creperozelot.colorize("&a Die Chest ist bei &lX : " + random_x + creperozelot.colorize(" &a&lY : " + get_y + creperozelot.colorize("&a&l Z : " + random_z))));

        Block chest = Block.get(BlockID.CHEST);


        player.getLevel().setBlock(location, chest);


        BlockChest c = (BlockChest) level.getBlock(location);

        c.createBlockEntity();

        int item1_select = (int) Math.floor(Math.random() * (700 - 1 + 1) + 1);
        int item2_select = (int) Math.floor(Math.random() * (700 - 1 + 1) + 1);
        int item3_select = (int) Math.floor(Math.random() * (700 - 1 + 1) + 1);

        Item item1 = Item.get(item1_select);

        Item item2 = Item.get(item2_select);

        Item item3 = Item.get(item3_select);

        c.getBlockEntity().getInventory().setItem(11, item1);
        c.getBlockEntity().getInventory().setItem(13, item2);
        c.getBlockEntity().getInventory().setItem(15, item3);



        return true;
    }
}

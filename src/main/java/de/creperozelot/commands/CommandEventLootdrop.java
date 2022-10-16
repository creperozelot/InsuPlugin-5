package de.creperozelot.commands;

import cn.nukkit.Player;
import cn.nukkit.Server;
import cn.nukkit.block.Block;
import cn.nukkit.block.BlockChest;
import cn.nukkit.block.BlockID;
import cn.nukkit.blockentity.BlockEntity;
import cn.nukkit.blockentity.BlockEntityChest;
import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;
import cn.nukkit.inventory.Inventory;
import cn.nukkit.inventory.InventoryHolder;
import cn.nukkit.item.Item;
import cn.nukkit.item.ItemDiamond;
import cn.nukkit.item.ItemID;
import cn.nukkit.level.Level;
import cn.nukkit.level.Location;
import cn.nukkit.level.Position;
import cn.nukkit.math.BlockFace;
import cn.nukkit.math.Vector3;
import de.creperozelot.StaticCache;
import de.creperozelot.creperozelot;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

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
            player.sendMessage(creperozelot.prefix + "&cDu kannst events nur alle 10 Minuten ausführen");
            return true;
        }

        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                StaticCache.EVENT_ACTIVE = false;
            }
        }, 1000 * 60 * 10);

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

        Item diamond = Item.get(ItemID.DIAMOND);
        diamond.setCount(2);
        player.getLevel().setBlock(location, chest);

        Level world = Server.getInstance().getLevelByName("world");

        BlockChest c = (BlockChest) world.getBlock(location.getLocation());
        

        BlockEntityChest chestinv = (BlockEntityChest) level.getBlockEntity(new Vector3(location.getX(), location.getY(), location.getZ()));
        chestinv.getInventory().addItem(diamond);

        ((BlockEntityChest) level.getBlockEntity(new Vector3(random_x, get_y, random_z))).getInventory().setItem(1, diamond);


        return true;
    }
}

package de.creperozelot.commands;

import cn.nukkit.inventory.PlayerInventory;
import cn.nukkit.item.Item;
import de.creperozelot.StaticCache;
import de.creperozelot.creperozelot;
import cn.nukkit.Player;
import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;
import cn.nukkit.Server;
import cn.nukkit.level.Level;
import cn.nukkit.level.Sound;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

public class CommandEventShuffleInv extends Command {



    public CommandEventShuffleInv(String name, String description, String usageMessage, String[]aliases){
            super(name, description, usageMessage, aliases);
            this.setPermission("insu.admin.shuffleinv");
        }



        @Override
        public boolean execute (CommandSender commandSender, String s, String[]args){
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

            new Timer().schedule(new TimerTask() {
                @Override
                public void run() {
                    StaticCache.EVENT_SHUFFLEINV = false;
                }
            }, 1000 * 60 * 2);

            player.sendMessage(creperozelot.colorize(creperozelot.prefix + "&fDu hast das Event &c&lInvChaos&a Aktiviert."));

            for (Player AllOnlinePlayers : Server.getInstance().getOnlinePlayers().values()) {
                AllOnlinePlayers.sendTitle(creperozelot.colorize("&6&lEvent &f&lInv-Chaos"), creperozelot.colorize("&aStart"), 10, 40, 0);
                Level level = AllOnlinePlayers.getLevel();
                level.addSound(AllOnlinePlayers.getPosition(), Sound.RANDOM_LEVELUP);
            }

            StaticCache.EVENT_SHUFFLEINV = true;
            StaticCache.EVENT_ACTIVE = true;


            for (Player AllOnlinePlayers : Server.getInstance().getOnlinePlayers().values()) {
                PlayerInventory AllOnlinePlayersInv = AllOnlinePlayers.getInventory();
                List<Item> AllOnlinePlayerList = new ArrayList<>(AllOnlinePlayersInv.getContents().values());
                Collections.shuffle(AllOnlinePlayerList);
                Map<Integer, Item> AllOnlinePlayersContents = new HashMap<>();
                int AllOnlinePlayersi = 0;
                for (Item item : AllOnlinePlayerList) {
                    AllOnlinePlayersContents.put(Integer.valueOf(AllOnlinePlayersi), item);
                    AllOnlinePlayersi++;
                }
                AllOnlinePlayersInv.setContents(AllOnlinePlayersContents);
                creperozelot.updateInventory(player);
            }
            return true;
        }

}

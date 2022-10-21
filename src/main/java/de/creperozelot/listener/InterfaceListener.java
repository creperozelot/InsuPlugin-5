package de.creperozelot.listener;

import cn.nukkit.Player;
import cn.nukkit.Server;
import cn.nukkit.block.Block;
import cn.nukkit.block.BlockChest;
import cn.nukkit.block.BlockID;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerFormRespondedEvent;
import cn.nukkit.form.window.FormWindowCustom;
import cn.nukkit.form.window.FormWindowSimple;
import cn.nukkit.inventory.PlayerInventory;
import cn.nukkit.item.Item;
import cn.nukkit.level.Level;
import cn.nukkit.level.Location;
import cn.nukkit.level.Sound;
import cn.nukkit.potion.Effect;
import de.creperozelot.StaticCache;
import de.creperozelot.creperozelot;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class InterfaceListener implements Listener {

    @EventHandler
    public void onFormResponse(PlayerFormRespondedEvent event) {
        Player player = event.getPlayer();
        if (event.getWindow() instanceof FormWindowSimple) {
            FormWindowSimple gui = (FormWindowSimple) event.getWindow();
            String responseName = gui.getResponse().getClickedButton().getText();
            if (responseName.equals("WaterDamage")) {

                if (StaticCache.EVENT_ACTIVE) {
                    player.sendMessage(creperozelot.prefix + creperozelot.colorize("&cDu kannst events nur alle 10 Minuten ausführen"));
                } else {

                    new Timer().schedule(new TimerTask() {
                        @Override
                        public void run() {
                            StaticCache.EVENT_ACTIVE = false;
                        }
                    }, 1000 * 60 * 10);

                    new Timer().schedule(new TimerTask() {
                        @Override
                        public void run() {
                            StaticCache.EVENT_WATERDANAGE = false;
                        }
                    }, 1000 * 60 * 1);

                    player.sendMessage(creperozelot.colorize(creperozelot.prefix + "&fDu hast das Event &1WaterDamage&a Aktiviert."));


                    new Timer().schedule(new TimerTask() {
                        @Override
                        public void run() {
                            for (Player AllOnlinePlayers : Server.getInstance().getOnlinePlayers().values()) {
                                AllOnlinePlayers.sendTitle(creperozelot.colorize("&6&lEvent &1&lWater &c&lDamage"), creperozelot.colorize("&cWurde Beendet"), 0, 60, 40);
                                Level level = AllOnlinePlayers.getLevel();
                                level.addSound(AllOnlinePlayers.getPosition(), Sound.RANDOM_LEVELUP);
                            }
                        }
                    }, 1000 * 60 * 1);

                    Server.getInstance().broadcastMessage(creperozelot.prefix + creperozelot.colorize("&6Event &1&lWater &c&lDamage&r&a wird Gestartet..."));

                    try {
                        TimeUnit.SECONDS.sleep(3);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    Server.getInstance().broadcastMessage(creperozelot.prefix + creperozelot.colorize("&6Event &1&lWater &c&lDamage&r&a ist Aktiv in &45"));

                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    Server.getInstance().broadcastMessage(creperozelot.prefix + creperozelot.colorize("&6Event &1&lWater &c&lDamage&r&a ist Aktiv in &64"));

                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    Server.getInstance().broadcastMessage(creperozelot.prefix + creperozelot.colorize("&6Event &1&lWater &c&lDamage&r&a ist Aktiv in &e3"));


                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    Server.getInstance().broadcastMessage(creperozelot.prefix + creperozelot.colorize("&6Event &1&lWater &c&lDamage&r&a ist Aktiv in &22"));


                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    Server.getInstance().broadcastMessage(creperozelot.prefix + creperozelot.colorize("&6Event &1&lWater &c&lDamage&r&a ist Aktiv in &a1"));

                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    for (Player AllOnlinePlayers : Server.getInstance().getOnlinePlayers().values()) {
                        AllOnlinePlayers.sendTitle(creperozelot.colorize("&6&lEvent &1&lWater &c&lDamage"), creperozelot.colorize("&aStart"), 0, 40, 0);
                        Level level = AllOnlinePlayers.getLevel();
                        level.addSound(AllOnlinePlayers.getPosition(), Sound.RANDOM_LEVELUP);
                    }
                    StaticCache.EVENT_ACTIVE = true;
                    StaticCache.EVENT_WATERDANAGE = true;
                }
            }

            if (responseName.equals("HotGrass")) {

                if (StaticCache.EVENT_ACTIVE) {
                    player.sendMessage(creperozelot.prefix + creperozelot.colorize("&cDu kannst events nur alle 10 Minuten ausführen"));
                } else {


                    new Timer().schedule(new TimerTask() {
                        @Override
                        public void run() {
                            StaticCache.EVENT_ACTIVE = false;
                        }
                    }, 1000 * 60 * 10);

                    new Timer().schedule(new TimerTask() {
                        @Override
                        public void run() {
                            StaticCache.EVENT_HOTGRASS = false;
                        }
                    }, 1000 * 60 * 1);

                    player.sendMessage(creperozelot.colorize(creperozelot.prefix + "&fDu hast das Event &2HotGrass&a Aktiviert."));


                    new Timer().schedule(new TimerTask() {
                        @Override
                        public void run() {
                            for (Player AllOnlinePlayers : Server.getInstance().getOnlinePlayers().values()) {
                                AllOnlinePlayers.sendTitle(creperozelot.colorize("&6&lEvent &2&lHot Grass &a"), creperozelot.colorize("&cWurde Beendet"), 10, 60, 40);
                                Level level = AllOnlinePlayers.getLevel();
                                level.addSound(AllOnlinePlayers.getPosition(), Sound.RANDOM_LEVELUP);
                            }
                        }
                    }, 1000 * 60 * 1);

                    Server.getInstance().broadcastMessage(creperozelot.prefix + creperozelot.colorize("&6Event &2&lHot Grass&r&a wird Gestartet..."));

                    try {
                        TimeUnit.SECONDS.sleep(3);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    Server.getInstance().broadcastMessage(creperozelot.prefix + creperozelot.colorize("&6Event &2&lHot Grass&r&a ist Aktiv in &45"));

                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    Server.getInstance().broadcastMessage(creperozelot.prefix + creperozelot.colorize("&6Event &2&lHot Grass&r&a ist Aktiv in &64"));

                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    Server.getInstance().broadcastMessage(creperozelot.prefix + creperozelot.colorize("&6Event &2&lHot Grass&r&a ist Aktiv in &e3"));


                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    Server.getInstance().broadcastMessage(creperozelot.prefix + creperozelot.colorize("&6Event &2&lHot Grass&r&a ist Aktiv in &22"));


                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    Server.getInstance().broadcastMessage(creperozelot.prefix + creperozelot.colorize("&6Event &2&lHot Grass&r&a ist Aktiv in &a1"));

                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    for (Player AllOnlinePlayers : Server.getInstance().getOnlinePlayers().values()) {
                        AllOnlinePlayers.sendTitle(creperozelot.colorize("&6&lEvent &2&lHot Grass"), creperozelot.colorize("&aStart"), 0, 40, 0);
                        Level level = AllOnlinePlayers.getLevel();
                        level.addSound(AllOnlinePlayers.getPosition(), Sound.RANDOM_LEVELUP);
                    }

                    StaticCache.EVENT_ACTIVE = true;
                    StaticCache.EVENT_HOTGRASS = true;

                }
            }

            if (responseName.equals("Inv-Chaos")) {

                if (StaticCache.EVENT_ACTIVE) {
                    player.sendMessage(creperozelot.prefix + creperozelot.colorize("&cDu kannst events nur alle 10 Minuten ausführen"));
                } else {

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
                }
            }

            if (responseName.equals("Blindniss")) {

                if (StaticCache.EVENT_ACTIVE) {
                    player.sendMessage(creperozelot.prefix + creperozelot.colorize("&cDu kannst events nur alle 10 Minuten ausführen"));
                } else {


                    new Timer().schedule(new TimerTask() {
                        @Override
                        public void run() {
                            StaticCache.EVENT_ACTIVE = false;
                        }
                    }, 1000 * 60 * 10);

                    new Timer().schedule(new TimerTask() {
                        @Override
                        public void run() {
                            StaticCache.EVENT_BLINDNISS = false;
                        }
                    }, 1000 * 60 * 2);

                    player.sendMessage(creperozelot.colorize(creperozelot.prefix + "&fDu hast das Event &8&lBlindniss&a Aktiviert."));


                    new Timer().schedule(new TimerTask() {
                        @Override
                        public void run() {
                            for (Player AllOnlinePlayers : Server.getInstance().getOnlinePlayers().values()) {
                                AllOnlinePlayers.sendTitle(creperozelot.colorize("&6&lEvent &8&lBlindniss &a"), creperozelot.colorize("&cWurde Beendet"), 10, 60, 40);
                                Level level = AllOnlinePlayers.getLevel();
                                level.addSound(AllOnlinePlayers.getPosition(), Sound.RANDOM_LEVELUP);
                            }
                        }
                    }, 1000 * 60 * 2);

                    Server.getInstance().broadcastMessage(creperozelot.prefix + creperozelot.colorize("&6Event &8&lBlindniss&r&a wird Gestartet..."));

                    try {
                        TimeUnit.SECONDS.sleep(3);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    Server.getInstance().broadcastMessage(creperozelot.prefix + creperozelot.colorize("&6Event &8&lBlindniss&r&a ist Aktiv in &45"));

                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    Server.getInstance().broadcastMessage(creperozelot.prefix + creperozelot.colorize("&6Event &8&lBlindniss&r&a ist Aktiv in &64"));

                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    Server.getInstance().broadcastMessage(creperozelot.prefix + creperozelot.colorize("&6Event &8&lBlindniss&r&a ist Aktiv in &e3"));


                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    Server.getInstance().broadcastMessage(creperozelot.prefix + creperozelot.colorize("&6Event &8&lBlindniss&r&a ist Aktiv in &22"));


                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    Server.getInstance().broadcastMessage(creperozelot.prefix + creperozelot.colorize("&6Event &8&lBlindniss&r&a ist Aktiv in &a1"));

                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    for (Player AllOnlinePlayers : Server.getInstance().getOnlinePlayers().values()) {
                        AllOnlinePlayers.sendTitle(creperozelot.colorize("&6&lEvent &8&lBlindniss"), creperozelot.colorize("&aStart"), 0, 40, 0);
                        AllOnlinePlayers.addEffect(Effect.getEffect(Effect.BLINDNESS).setAmplifier(2).setDuration(20 * 60 * 2));
                        Level level = AllOnlinePlayers.getLevel();
                        level.addSound(AllOnlinePlayers.getPosition(), Sound.RANDOM_LEVELUP);
                    }

                    StaticCache.EVENT_ACTIVE = true;
                    StaticCache.EVENT_BLINDNISS = true;
                }
            }


            if (responseName.equals("Mining-fatique")) {

                if (StaticCache.EVENT_ACTIVE) {
                    player.sendMessage(creperozelot.prefix + creperozelot.colorize("&cDu kannst events nur alle 10 Minuten ausführen"));
                } else {
                    new Timer().schedule(new TimerTask() {
                        @Override
                        public void run() {
                            StaticCache.EVENT_ACTIVE = false;
                        }
                    }, 1000 * 60 * 10);

                    new Timer().schedule(new TimerTask() {
                        @Override
                        public void run() {
                            StaticCache.EVENT_MINING_FATIQUE = false;
                        }
                    }, 1000 * 60 * 2);

                    player.sendMessage(creperozelot.colorize(creperozelot.prefix + "&fDu hast das Event &e&lMining-Fatique&a Aktiviert."));


                    new Timer().schedule(new TimerTask() {
                        @Override
                        public void run() {
                            for (Player AllOnlinePlayers : Server.getInstance().getOnlinePlayers().values()) {
                                AllOnlinePlayers.sendTitle(creperozelot.colorize("&6&lEvent &e&lMining-Fatique &a"), creperozelot.colorize("&cWurde Beendet"), 10, 60, 40);
                                Level level = AllOnlinePlayers.getLevel();
                                level.addSound(AllOnlinePlayers.getPosition(), Sound.RANDOM_LEVELUP);
                            }
                        }
                    }, 1000 * 60 * 2);

                    Server.getInstance().broadcastMessage(creperozelot.prefix + creperozelot.colorize("&6Event &e&lMining-Fatique&r&a wird Gestartet..."));

                    try {
                        TimeUnit.SECONDS.sleep(3);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    Server.getInstance().broadcastMessage(creperozelot.prefix + creperozelot.colorize("&6Event &e&lMining-Fatique&r&a ist Aktiv in &45"));

                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    Server.getInstance().broadcastMessage(creperozelot.prefix + creperozelot.colorize("&6Event &e&lMining-Fatique&r&a ist Aktiv in &64"));

                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    Server.getInstance().broadcastMessage(creperozelot.prefix + creperozelot.colorize("&6Event &e&lMining-Fatique&r&a ist Aktiv in &e3"));


                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    Server.getInstance().broadcastMessage(creperozelot.prefix + creperozelot.colorize("&6Event &e&lMining-Fatique&r&a ist Aktiv in &22"));


                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    Server.getInstance().broadcastMessage(creperozelot.prefix + creperozelot.colorize("&6Event &e&lMining-Fatique&r&a ist Aktiv in &a1"));

                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    for (Player AllOnlinePlayers : Server.getInstance().getOnlinePlayers().values()) {
                        AllOnlinePlayers.sendTitle(creperozelot.colorize("&6&lEvent &e&lMining-Fatique"), creperozelot.colorize("&aStart"), 0, 40, 0);
                        AllOnlinePlayers.addEffect(Effect.getEffect(Effect.MINING_FATIGUE).setAmplifier(2).setDuration(20 * 60 * 2));
                        Level level = AllOnlinePlayers.getLevel();
                        level.addSound(AllOnlinePlayers.getPosition(), Sound.RANDOM_LEVELUP);
                    }

                    StaticCache.EVENT_MINING_FATIQUE = true;
                    StaticCache.EVENT_ACTIVE = true;
                }
            }

            if (responseName.equals("Glückstreffer")) {

                if (StaticCache.EVENT_ACTIVE) {
                    player.sendMessage(creperozelot.prefix + creperozelot.colorize("&cDu kannst events nur alle 10 Minuten ausführen"));
                } else {
                    new Timer().schedule(new TimerTask() {
                        @Override
                        public void run() {
                            StaticCache.EVENT_ACTIVE = false;
                        }
                    }, 1000 * 60 * 10);

                    player.sendMessage(creperozelot.colorize(creperozelot.prefix + "&fDu hast das Event &a&lGlückstreffer&a Aktiviert."));

                    for (Player AllOnlinePlayer : Server.getInstance().getOnlinePlayers().values()) {
                        Random random = new Random();
                        int int_random = random.nextInt(10);

                        if (int_random == 8) {
                            Item diamond = Item.get(264, 0, 2);
                            AllOnlinePlayer.getInventory().addItem(diamond);
                            AllOnlinePlayer.sendMessage(creperozelot.prefix + creperozelot.colorize("&aJa Super, du hast &b&lDiamanten&r&a Gewonnen."));
                        } else {
                            AllOnlinePlayer.sendMessage(creperozelot.prefix + creperozelot.colorize("&aJa Super, du hast &c&lKEINE&r &b&lDiamanten&r&a Gewonnen. :)"));
                        }
                    }
                    StaticCache.EVENT_ACTIVE = true;
                }
            }

            if (responseName.equals("Lootdrops")) {

                if (StaticCache.EVENT_ACTIVE) {
                    player.sendMessage(creperozelot.colorize(creperozelot.prefix + "&cDu kannst events nur alle 10 Minuten ausführen"));
                } else {
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

                    Level world = Server.getInstance().getLevelByName("world");

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
                }

            }

        }

    }



    //Begin TpUI
    @EventHandler
    public void onTeleportResponseUI(PlayerFormRespondedEvent event) {
        Player p = event.getPlayer();
        if (event.getWindow() instanceof FormWindowCustom) {
            FormWindowCustom window = (FormWindowCustom)event.getWindow();
            if (event.getFormID() == 178913281) {
                if (event.wasClosed())
                    return;
                String response = window.getResponse().getDropdownResponse(0).getElementContent();
                Player player = Server.getInstance().getPlayer(response);
                if (player instanceof Player) {
                    p.teleport((Location)player);
                    p.sendMessage(creperozelot.prefix + creperozelot.colorize("Teleport zu &a") + player.getName() + creperozelot.colorize(" &ferfolgreich"));
                    return;
                }
                p.sendMessage(creperozelot.prefix + "Player is not online");
                return;
            }
            }
        }

}

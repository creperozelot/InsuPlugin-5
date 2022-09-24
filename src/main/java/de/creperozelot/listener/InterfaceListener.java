package de.creperozelot.listener;

import cn.nukkit.Player;
import cn.nukkit.Server;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerFormRespondedEvent;
import cn.nukkit.form.window.FormWindowCustom;
import cn.nukkit.form.window.FormWindowSimple;
import cn.nukkit.level.Level;
import cn.nukkit.level.Location;
import cn.nukkit.level.Sound;
import cn.nukkit.potion.Effect;
import de.creperozelot.StaticCache;
import de.creperozelot.creperozelot;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

public class InterfaceListener implements Listener {

    @EventHandler
    public void onFormResponse(PlayerFormRespondedEvent event) {
        Player player = event.getPlayer();
        if (event.getWindow() instanceof FormWindowSimple) {
            FormWindowSimple gui = (FormWindowSimple)event.getWindow();
            String responseName = gui.getResponse().getClickedButton().getText();
            if (responseName.equals("WaterDamage"))
                //WaterDamage
                if (StaticCache.EVENT_ACTIVE) {
                    player.sendMessage(creperozelot.prefix + "&cDu kannst events nur alle 10 Minuten ausführen");
                } else {
                    StaticCache.EVENT_ACTIVE = true;
                    StaticCache.EVENT_WATERDANAGE = true;

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

                    for (Player AllOnlinePlayers : Server.getInstance().getOnlinePlayers().values()) {
                        Level level = AllOnlinePlayers.getLevel();

                        new Timer().schedule(new TimerTask() {
                            @Override
                            public void run() {
                                AllOnlinePlayers.sendTitle(creperozelot.colorize("&6&lEvent &1&lWaterDamage"), creperozelot.colorize("&fWird &cBeendet"), 0, 60, 40);
                                level.addSound(AllOnlinePlayers.getPosition(), Sound.RANDOM_LEVELUP);
                            }
                        }, 1000 * 60 * 10);

                        AllOnlinePlayers.sendTitle(creperozelot.colorize("&6&lEvent &1&lWaterDamage"), creperozelot.colorize("&fWird Gestartet..."), 20, 60, 0);

                        try {
                            TimeUnit.SECONDS.sleep(3);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }

                        AllOnlinePlayers.sendTitle(creperozelot.colorize("&6&lEvent &1&lWaterDamage"), creperozelot.colorize("&fStart in &45"), 0, 40, 0);

                        try {
                            TimeUnit.SECONDS.sleep(1);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }

                        AllOnlinePlayers.sendTitle(creperozelot.colorize("&6&lEvent &1&lWaterDamage"), creperozelot.colorize("&fStart in &c4"), 0, 40, 0);

                        try {
                            TimeUnit.SECONDS.sleep(1);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }

                        AllOnlinePlayers.sendTitle(creperozelot.colorize("&6&lEvent &1&lWaterDamage"), creperozelot.colorize("&fStart in &e3"), 0, 40, 0);

                        try {
                            TimeUnit.SECONDS.sleep(1);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }

                        AllOnlinePlayers.sendTitle(creperozelot.colorize("&6&lEvent &1&lWaterDamage"), creperozelot.colorize("&fStart in &22"), 0, 40, 0);

                        try {
                            TimeUnit.SECONDS.sleep(1);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }

                        AllOnlinePlayers.sendTitle(creperozelot.colorize("&6&lEvent &1&lWaterDamage"), creperozelot.colorize("&fStart in &a1"), 0, 40, 0);
                        try {
                            TimeUnit.SECONDS.sleep(1);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }

                        AllOnlinePlayers.sendTitle(creperozelot.colorize("&6&lEvent &1&lWaterDamge"), creperozelot.colorize("&aStart"), 0, 40, 0);
                        level.addSound(AllOnlinePlayers.getPosition(), Sound.RANDOM_LEVELUP);
                    }
                }

            if (responseName.equals("HotGrass"))
                if (StaticCache.EVENT_ACTIVE) {
                    player.sendMessage(creperozelot.prefix + "&cDu kannst events nur alle 10 Minuten ausführen");
                } else {

                    StaticCache.EVENT_ACTIVE = true;
                    StaticCache.EVENT_HOTGRASS = true;

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
                    }, 1000 * 60 * 2);

                    player.sendMessage(creperozelot.colorize(creperozelot.prefix + "&fDu hast das Event &aHotGrass&f Aktiviert."));

                    for (Player AllOnlinePlayers : Server.getInstance().getOnlinePlayers().values()) {
                        Level level = AllOnlinePlayers.getLevel();


                        new Timer().schedule(new TimerTask() {
                            @Override
                            public void run() {
                                AllOnlinePlayers.sendTitle(creperozelot.colorize("&6&lEvent &a&lHotgrass"), creperozelot.colorize("&fWird &cBeendet"), 0, 60, 40);
                                level.addSound(AllOnlinePlayers.getPosition(), Sound.RANDOM_LEVELUP);
                            }
                        }, 1000 * 60 * 2);

                        AllOnlinePlayers.sendTitle(creperozelot.colorize("&6&lEvent &a&lHotgrass"), creperozelot.colorize("&fWird Gestartet..."), 20, 60, 0);

                        try {
                            TimeUnit.SECONDS.sleep(3);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }

                        AllOnlinePlayers.sendTitle(creperozelot.colorize("&6&lEvent &a&lHotgrass"), creperozelot.colorize("&fStart in &45"), 0, 40, 0);

                        try {
                            TimeUnit.SECONDS.sleep(1);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }

                        AllOnlinePlayers.sendTitle(creperozelot.colorize("&6&lEvent &a&lHotgrass"), creperozelot.colorize("&fStart in &c4"), 0, 40, 0);

                        try {
                            TimeUnit.SECONDS.sleep(1);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }

                        AllOnlinePlayers.sendTitle(creperozelot.colorize("&6&lEvent &a&lHotgrass"), creperozelot.colorize("&fStart in &e3"), 0, 40, 0);

                        try {
                            TimeUnit.SECONDS.sleep(1);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }

                        AllOnlinePlayers.sendTitle(creperozelot.colorize("&6&lEvent &a&lHotgrass"), creperozelot.colorize("&fStart in &22"), 0, 40, 0);

                        try {
                            TimeUnit.SECONDS.sleep(1);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }

                        AllOnlinePlayers.sendTitle(creperozelot.colorize("&6&lEvent &a&lHotgrass"), creperozelot.colorize("&fStart in &a1"), 0, 40, 0);
                        try {
                            TimeUnit.SECONDS.sleep(1);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }

                        AllOnlinePlayers.sendTitle(creperozelot.colorize("&6&lEvent &a&lHotgrass"), creperozelot.colorize("&aStart"), 0, 40, 0);
                        level.addSound(AllOnlinePlayers.getPosition(), Sound.RANDOM_LEVELUP);
                    }
                }
            if (responseName.equals("Inv-Chaos"))
                //Event Editieren (Player Shuffle (Player Invs nicht vermischen))
            if (responseName.equals("Blindniss"))
                if (StaticCache.EVENT_ACTIVE) {
                    player.sendMessage(creperozelot.prefix + "&cDu kannst events nur alle 10 Minuten ausführen");
                } else {

                    StaticCache.EVENT_ACTIVE = true;
                    StaticCache.EVENT_BLINDNISS = true;

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

                    player.sendMessage(creperozelot.colorize(creperozelot.prefix + "&fDu hast das Event &8Blindniss&f Aktiviert."));

                    for (Player AllOnlinePlayers : Server.getInstance().getOnlinePlayers().values()) {
                        Level level = AllOnlinePlayers.getLevel();


                        new Timer().schedule(new TimerTask() {
                            @Override
                            public void run() {
                                AllOnlinePlayers.sendTitle(creperozelot.colorize("&6&lEvent &8&lBlindniss"), creperozelot.colorize("&fWird &cBeendet"), 0, 60, 40);
                                level.addSound(AllOnlinePlayers.getPosition(), Sound.RANDOM_LEVELUP);
                            }
                        }, 1000 * 60 * 2 + 8);

                        AllOnlinePlayers.sendTitle(creperozelot.colorize("&6&lEvent &8&lBlindniss"), creperozelot.colorize("&fWird Gestartet..."), 20, 60, 0);

                        try {
                            TimeUnit.SECONDS.sleep(3);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }

                        AllOnlinePlayers.sendTitle(creperozelot.colorize("&6&lEvent &8&lBlindniss"), creperozelot.colorize("&fStart in &45"), 0, 40, 0);

                        try {
                            TimeUnit.SECONDS.sleep(1);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }

                        AllOnlinePlayers.sendTitle(creperozelot.colorize("&6&lEvent &8&lBlindniss"), creperozelot.colorize("&fStart in &c4"), 0, 40, 0);

                        try {
                            TimeUnit.SECONDS.sleep(1);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }

                        AllOnlinePlayers.sendTitle(creperozelot.colorize("&6&lEvent &8&lBlindniss"), creperozelot.colorize("&fStart in &e3"), 0, 40, 0);

                        try {
                            TimeUnit.SECONDS.sleep(1);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }

                        AllOnlinePlayers.sendTitle(creperozelot.colorize("&6&lEvent &8&lBlindniss"), creperozelot.colorize("&fStart in &22"), 0, 40, 0);

                        try {
                            TimeUnit.SECONDS.sleep(1);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }

                        AllOnlinePlayers.sendTitle(creperozelot.colorize("&6&lEvent &8&lBlindniss"), creperozelot.colorize("&fStart in &a1"), 0, 40, 0);
                        try {
                            TimeUnit.SECONDS.sleep(1);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }

                        AllOnlinePlayers.sendTitle(creperozelot.colorize("&6&lEvent &8&lBlindniss"), creperozelot.colorize("&aStart"), 0, 40, 0);
                        level.addSound(AllOnlinePlayers.getPosition(), Sound.RANDOM_LEVELUP);
                        AllOnlinePlayers.addEffect(Effect.getEffect(15).setDuration(120).setAmplifier(5).setVisible(false));
                    }
                }
            if (responseName.equals("Mining-fatique"))
                if (StaticCache.EVENT_ACTIVE) {
                    player.sendMessage(creperozelot.prefix + "&cDu kannst events nur alle 10 Minuten ausführen");
                } else {

                    StaticCache.EVENT_ACTIVE = true;
                    StaticCache.EVENT_MINING_FATIQUE = true;

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

                    player.sendMessage(creperozelot.colorize(creperozelot.prefix + "&fDu hast das Event &e&lMining Fatique&r&f Aktiviert."));

                    for (Player AllOnlinePlayers : Server.getInstance().getOnlinePlayers().values()) {
                        Level level = AllOnlinePlayers.getLevel();


                        new Timer().schedule(new TimerTask() {
                            @Override
                            public void run() {
                                AllOnlinePlayers.sendTitle(creperozelot.colorize("&6&lEvent &e&lMining Fatique&f"), creperozelot.colorize("&fWird &cBeendet"), 0, 60, 40);
                                level.addSound(AllOnlinePlayers.getPosition(), Sound.RANDOM_LEVELUP);
                            }
                        }, 1000 * 60 * 2 + 8);

                        AllOnlinePlayers.sendTitle(creperozelot.colorize("&6&lEvent &e&lMining Fatique&f"), creperozelot.colorize("&fWird Gestartet..."), 20, 60, 0);

                        try {
                            TimeUnit.SECONDS.sleep(3);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }

                        AllOnlinePlayers.sendTitle(creperozelot.colorize("&6&lEvent &e&lMining Fatique&f"), creperozelot.colorize("&fStart in &45"), 0, 40, 0);

                        try {
                            TimeUnit.SECONDS.sleep(1);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }

                        AllOnlinePlayers.sendTitle(creperozelot.colorize("&6&lEvent &e&lMining Fatique&f"), creperozelot.colorize("&fStart in &c4"), 0, 40, 0);

                        try {
                            TimeUnit.SECONDS.sleep(1);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }

                        AllOnlinePlayers.sendTitle(creperozelot.colorize("&6&lEvent &e&lMining Fatique&f"), creperozelot.colorize("&fStart in &e3"), 0, 40, 0);

                        try {
                            TimeUnit.SECONDS.sleep(1);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }

                        AllOnlinePlayers.sendTitle(creperozelot.colorize("&6&lEvent &e&lMining Fatique&f"), creperozelot.colorize("&fStart in &22"), 0, 40, 0);

                        try {
                            TimeUnit.SECONDS.sleep(1);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }

                        AllOnlinePlayers.sendTitle(creperozelot.colorize("&6&lEvent &e&lMining Fatique&f"), creperozelot.colorize("&fStart in &a1"), 0, 40, 0);
                        try {
                            TimeUnit.SECONDS.sleep(1);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }

                        AllOnlinePlayers.sendTitle(creperozelot.colorize("&6&lEvent &e&lMining Fatique&f"), creperozelot.colorize("&aStart"), 0, 40, 0);
                        level.addSound(AllOnlinePlayers.getPosition(), Sound.RANDOM_LEVELUP);
                        AllOnlinePlayers.addEffect(Effect.getEffect(4).setDuration(120).setAmplifier(3).setVisible(false));
                    }
                    if (responseName.equals("Glückstreffer"))
                        player.sendMessage("changed your game mode successfully to ");
                    if (responseName.equals("Lootdrops"))
                        player.setGamemode(3);
                    return;
                }
            if (responseName.equals("Lootdrop")) {

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

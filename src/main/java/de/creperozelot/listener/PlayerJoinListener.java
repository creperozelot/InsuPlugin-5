package de.creperozelot.listener;

import cn.nukkit.entity.Entity;
import cn.nukkit.event.entity.EntityDamageByBlockEvent;
import cn.nukkit.event.entity.EntityDamageEvent;
import cn.nukkit.event.server.DataPacketReceiveEvent;
import cn.nukkit.item.Item;
import cn.nukkit.level.Location;
import cn.nukkit.network.protocol.SetLocalPlayerAsInitializedPacket;
import cn.nukkit.potion.Effect;
import de.creperozelot.team.TeamSystem;

import cn.nukkit.Server;
import cn.nukkit.Player;
import cn.nukkit.level.Level;
import cn.nukkit.level.Sound;
import cn.nukkit.scheduler.Task;
import de.creperozelot.creperozelot;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerJoinEvent;

import java.util.concurrent.TimeUnit;


public class PlayerJoinListener implements Listener {



    @EventHandler
    public void onPlayerfirstJoin(PlayerJoinEvent event) {
        Location spawn = new Location(0, 0, 0);
        Location RollLade = new Location(-224, 63, 301);
        Location MallowWasBistDuWiederSoMad = new Location(293, 63, -319);
        Location Darkside = new Location(-321, 63, -273);
        Location Pinkplayer = new Location(345, 63, -51);
        Location ELEMAO = new Location(-90, 189, -44);
        Location DieCoolen = new Location(100, 63, -7);
        Location Vodafone = new Location(-311, 63, 117);
        Location DerPoleUndDerItaliener = new Location(127, 63, -347);
        Location L0STYS = new Location(-440, 63, -72);
        Location FORRUSSIA = new Location(126, 63, -197);
        Location Qajos = new Location(266, 63, -77);
        Location Eulenfänger = new Location(457, 63, -189);
        Location Bigbababubatz = new Location(-145, 63, -423);
        Location DieKrabbelstube = new Location(499, 63, -84);
        Location SAO = new Location(-66, 63, 215);
        Location randomteam = new Location(260, 139, -204);
        Location Heheheha = new Location(122, 63, 440);
        Location Ingodingos = new Location(208, 84, -270);
        Location Tam_Plums = new Location(456, 64, 102);
        Location KeineAhnung = new Location(-258, 130, 42);
        Location Gamatisch = new Location(-68, 134, 12);
        Location AmogUsIstBesserAlsValo = new Location(-57, 87, 86);
        Location NoYTRank = new Location(-83, 126, -175);
        Location tutti_frutti = new Location(-198, 63, -352);
        Location GamilinoUndBenno = new Location(-210, 105, 117);

        //PLayer Variables
        Player player_creperozelot = Server.getInstance().getPlayerExact("creperozelot");
        Player GodVikthor = Server.getInstance().getPlayerExact("GodVikthor");
        Player Levi_GPP = Server.getInstance().getPlayerExact("Levi_GPP");
        Player HowLater = Server.getInstance().getPlayerExact("HowLater");
        Player JRollylp = Server.getInstance().getPlayerExact("JRollylp");
        Player GedankeAmeise1 = Server.getInstance().getPlayerExact("GedankeAmeise1");
        Player Mxllow1143 = Server.getInstance().getPlayerExact("Mxllow1143");
        Player Dilonxy = Server.getInstance().getPlayerExact("Dilonxy");
        Player UltraRobbe08 = Server.getInstance().getPlayerExact("UltraRobbe08");
        Player Wabel_Ghost = Server.getInstance().getPlayerExact("Wabel Ghost");
        Player Greenplayer_Tv = Server.getInstance().getPlayerExact("Greenplayer Tv");
        Player F0ngiMG = Server.getInstance().getPlayerExact("F0ngiMG");
        Player xF1lmx = Server.getInstance().getPlayerExact("xF1lmx");
        Player NeunMatt54321 = Server.getInstance().getPlayerExact("NeunMatt54321");
        Player OliverLP5499 = Server.getInstance().getPlayerExact("OliverLP5499");
        Player MaximalFlame = Server.getInstance().getPlayerExact("MaximalFlame");
        Player zeyyco = Server.getInstance().getPlayerExact("MotteBlatt18479");
        Player KilianCrafterYT = Server.getInstance().getPlayerExact("KilianCrafterYT");
        Player LDread = Server.getInstance().getPlayerExact("LDread");
        Player Sculky = Server.getInstance().getPlayerExact("Sculky");
        Player SMIBII_YT = Server.getInstance().getPlayerExact("SMIBII_YT");
        Player TOADENATION = Server.getInstance().getPlayerExact("TOADENATION");
        Player Qwuanda = Server.getInstance().getPlayerExact("Qwuanda");
        Player Jonas_TV5 = Server.getInstance().getPlayerExact("Jonas TV5");
        Player UltimatePhil794 = Server.getInstance().getPlayerExact("UltimatePhil794");
        Player Todesbanane1203 = Server.getInstance().getPlayerExact("Todesbanane1203");
        Player GrafTepid = Server.getInstance().getPlayerExact("GrafTepid");
        Player LitschiiYT = Server.getInstance().getPlayerExact("LitschiiYT");
        Player VictorJu4751 = Server.getInstance().getPlayerExact("VictorJu4751");
        Player NURnyraee = Server.getInstance().getPlayerExact("NURnyraee");
        Player Djalami007 = Server.getInstance().getPlayerExact("Djalami007");
        Player Straussiiii = Server.getInstance().getPlayerExact("Straussiiii");
        Player ytDoomS = Server.getInstance().getPlayerExact("ytDoomS");
        Player GunmetalNine15 = Server.getInstance().getPlayerExact("GunmetalNine15");
        Player MetallNatter2 = Server.getInstance().getPlayerExact("MetallNatter2");
        Player LodgedGuitar93 = Server.getInstance().getPlayerExact("LodgedGuitar93");
        Player IchB1nE1neB1ene = Server.getInstance().getPlayerExact("IchB1nE1neB1ene");
        Player FabiDE14 = Server.getInstance().getPlayerExact("FabiDE14");
        Player BennoMCyt = Server.getInstance().getPlayerExact("BennoMCyt");
        Player GamilinoMC = Server.getInstance().getPlayerExact("GamilinoMC");
        Player AreaNull = Server.getInstance().getPlayerExact("AreaNull");
        Player Ilyco187 = Server.getInstance().getPlayerExact("Ilyco187");
        Player Linus123455 = Server.getInstance().getPlayerExact("Linus123455");
        Player DoncaMilloLp = Server.getInstance().getPlayerExact("DoncaMilloLp");
        Player DanielGamerYt31 = Server.getInstance().getPlayerExact("DanielGamerYt31");
        Player The_Noah_YT = Server.getInstance().getPlayerExact("The Noah YT");
        Player DerHeroGamer007 = Server.getInstance().getPlayerExact("DerHeroGamer007");
        Player ToastbrotGHG = Server.getInstance().getPlayerExact("ToastbrotGHG");
        Player zPqndaFNA = Server.getInstance().getPlayerExact("zPqndaFNA");
        Player vamiiz = Server.getInstance().getPlayerExact("vamiiz");
        Player F3yson_HD = Server.getInstance().getPlayerExact("F3yson HD");
        Player zCrxyy = Server.getInstance().getPlayerExact("zCrxyy");



        Player player = event.getPlayer();
        Server server = Server.getInstance();
        Level level = player.getLevel();

        if (creperozelot.getInstance().getConfig().getBoolean("start")) {




           if (Server.getInstance().getConfig().getBoolean("HowLater")) {
                HowLater.teleport(RollLade);
            }
           if (Server.getInstance().getConfig().getBoolean("JRollylp")) {
                JRollylp.teleport(RollLade);
            }
           if (Server.getInstance().getConfig().getBoolean("GedankeAmeise1")) {
                GedankeAmeise1.teleport(MallowWasBistDuWiederSoMad);
            }
           if (Server.getInstance().getConfig().getBoolean("Mxllow1143")) {
                GedankeAmeise1.teleport(MallowWasBistDuWiederSoMad);
            }
           if (Server.getInstance().getConfig().getBoolean("Dilonxy")) {
                Dilonxy.teleport(Darkside);
            }
           if (Server.getInstance().getConfig().getBoolean("UltraRobbe08")) {
                UltraRobbe08.teleport(Darkside);
            }
           if (Server.getInstance().getConfig().getBoolean("Wabel Ghost")) {
                Wabel_Ghost.teleport(Pinkplayer);
            }
           if (Server.getInstance().getConfig().getBoolean("GreenplayerTv")) {
                Greenplayer_Tv.teleport(Pinkplayer);
            }
           if (Server.getInstance().getConfig().getBoolean("F0ngiMG")) {
                F0ngiMG.teleport(ELEMAO);
            }
           if (Server.getInstance().getConfig().getBoolean("xF1lmx")) {
                xF1lmx.teleport(ELEMAO);
            }
           if (Server.getInstance().getConfig().getBoolean("NeunMatt54321")) {
                NeunMatt54321.teleport(DieCoolen);
            }
           if (Server.getInstance().getConfig().getBoolean("OliverLP5449")) {
                OliverLP5499.teleport(DieCoolen);

            }


            if (Server.getInstance().getConfig().getBoolean("MaximalFlame")) {
                if (Server.getInstance().getConfig().getBoolean("MaximalFlame")) {
                    MaximalFlame.setSpawn(Vodafone);
                    Server.getInstance().getConfig().set("MaximalFlame", false);
                    Server.getInstance().getConfig().save();
                }

            }

           /**
           if (player.getName().equalsIgnoreCase("MaximalFlame")) {
               if (Server.getInstance().getConfig().getBoolean(player.getName().replace(" ", "_"))) {
                   try {
                       TimeUnit.SECONDS.sleep(10);
                   } catch (InterruptedException e) {
                       throw new RuntimeException(e);
                   }
                   player.teleport(Vodafone);
               }
           }
           **/

           if (Server.getInstance().getConfig().getBoolean("MotteBlatt18479")) {
                zeyyco.teleport(Vodafone);
            }
           if (Server.getInstance().getConfig().getBoolean("KillianCrafterYT")) {
                KilianCrafterYT.teleport(DerPoleUndDerItaliener);
            }
           if (Server.getInstance().getConfig().getBoolean("LDread")) {
                LDread.teleport(L0STYS);
            }
           if (Server.getInstance().getConfig().getBoolean("Sculky")) {
                Sculky.teleport(L0STYS);
            }
           if (Server.getInstance().getConfig().getBoolean("SMIBII_YT")) {
                SMIBII_YT.teleport(FORRUSSIA);
            }
           if (Server.getInstance().getConfig().getBoolean("ToadenationNr1")) {
                TOADENATION.teleport(FORRUSSIA);
            }
           if (Server.getInstance().getConfig().getBoolean("Jonas_TV5")) {
                //WAITING FOR TEAM
            }
           if (Server.getInstance().getConfig().getBoolean("UltimatePhil794")) {
                UltimatePhil794.teleport(Eulenfänger);
            }
           if (Server.getInstance().getConfig().getBoolean("Todesbanane1203")) {
                Todesbanane1203.teleport(Eulenfänger);
            }
           if (Server.getInstance().getConfig().getBoolean("GrafTepid")) {
                GrafTepid.teleport(Bigbababubatz);
            }
           if (Server.getInstance().getConfig().getBoolean("LitschiiYT")) {
                LitschiiYT.teleport(Bigbababubatz);
            }
           if (Server.getInstance().getConfig().getBoolean("VictorJu4751")) {
                VictorJu4751.teleport(DieKrabbelstube);
            }
           if (Server.getInstance().getConfig().getBoolean("NURnyraee")) {
                NURnyraee.teleport(DieKrabbelstube);
            }
           if (Server.getInstance().getConfig().getBoolean("Djalami007")) {
                Djalami007.teleport(SAO);
            }
           if (Server.getInstance().getConfig().getBoolean("Straussiiii")) {
                Straussiiii.teleport(SAO);
            }
           if (Server.getInstance().getConfig().getBoolean("ytDoomS")) {
                ytDoomS.teleport(randomteam);
            }
           if (Server.getInstance().getConfig().getBoolean("GunmetalNine15")) {
                GunmetalNine15.teleport(randomteam);
            }
           if (Server.getInstance().getConfig().getBoolean("MetallNatter2")) {
                MetallNatter2.teleport(Heheheha);
            }
           if (Server.getInstance().getConfig().getBoolean("LodgedGuitar93")) {
                LodgedGuitar93.teleport(Heheheha);
            }
           if (Server.getInstance().getConfig().getBoolean("IchB1nE1neB1ene")) {
                IchB1nE1neB1ene.teleport(Ingodingos);
            }
           if (Server.getInstance().getConfig().getBoolean("FabiDE14")) {
                FabiDE14.teleport(Ingodingos);
            }
           if (Server.getInstance().getConfig().getBoolean("BennoMCyt")) {
                BennoMCyt.teleport(GamilinoUndBenno);
            }
           if (Server.getInstance().getConfig().getBoolean("GamilinoMC")) {
                GamilinoMC.teleport(GamilinoUndBenno);
            }
           if (Server.getInstance().getConfig().getBoolean("AreaNull")) {
                AreaNull.teleport(Tam_Plums);
            }
           if (Server.getInstance().getConfig().getBoolean("Ilyco187")) {
                Ilyco187.teleport(Tam_Plums);
            }
           if (Server.getInstance().getConfig().getBoolean("Linus123455")) {
                Linus123455.teleport(KeineAhnung);
            }
           if (Server.getInstance().getConfig().getBoolean("DoncaMilloLp")) {
                DoncaMilloLp.teleport(KeineAhnung);
            }
           if (Server.getInstance().getConfig().getBoolean("DanielGamerYT31")) {
                DanielGamerYt31.teleport(Gamatisch);
            }
           if (Server.getInstance().getConfig().getBoolean("The_Noah_YT")) {
                The_Noah_YT.teleport(AmogUsIstBesserAlsValo);
            }
           if (Server.getInstance().getConfig().getBoolean("DerHeroGamer007")) {
                DerHeroGamer007.teleport(AmogUsIstBesserAlsValo);
            }
           if (Server.getInstance().getConfig().getBoolean("ToastbrotGHG")) {
                ToastbrotGHG.teleport(tutti_frutti);
            }
           if (Server.getInstance().getConfig().getBoolean("zPqndaFNA")) {
                zPqndaFNA.teleport(NoYTRank);
            }
           if (Server.getInstance().getConfig().getBoolean("vamiiz")) {
                vamiiz.teleport(NoYTRank);
            }
            if (Server.getInstance().getConfig().getBoolean("F3yson HD")) {
                F3yson_HD.teleport(NoYTRank);
            }
            if (Server.getInstance().getConfig().getBoolean("zCrxyy")) {
                zCrxyy.setSpawn(NoYTRank);
            }
        }
    }

   /** @EventHandler
    public  void onPlayerJoinDamage(EntityDamageByBlockEvent event) {
        Player player = (Player) event.getEntity();
        EntityDamageEvent.DamageCause cause = player.getLastDamageCause().getCause();


        if (cause == EntityDamageEvent.DamageCause.SUFFOCATION) {
            player.getLastDamageCause().setCancelled(true);
        }
    } **/

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        Location playerpos = new Location(player.getX(), player.getY() + 1, player.getZ());
        Server server = Server.getInstance();
        Level level = player.getLevel();
        Item insuadmin = Item.get(377, 0, 1);
        Item teleporter = Item.get(345, 0, 1);
        insuadmin.setCustomName("§c§lINSU Manager");
        insuadmin.setLore("§5Der §c§lINSU Manager §5Steuert die Events und anderen", "§5Wichtige funktionen.");
        teleporter.setCustomName("§a§lTeleport System");
        teleporter.setLore("§5Das §a§lTeleport System §5ist da um sich zu einem Spieler", "§5zu Teleportieren.");

        (new TeamSystem()).setTeam(player);
        (new TeamSystem()).setPlayerTeam(player);

        player.addEffect(Effect.getEffect(Effect.RESISTANCE).setDuration(20 * 20).setVisible(false).setAmplifier(254));
        player.teleport(playerpos);

        if (player.getName().equalsIgnoreCase("GodVikthor")) {
            player.setGamemode(3);
            player.getInventory().clearAll();
            player.getInventory().setItem(0, insuadmin);
            player.getInventory().setItem(4, teleporter);
        }

        if (player.getName().equalsIgnoreCase("creperozelot")) {
            player.setGamemode(3);
            player.getInventory().clearAll();
            player.getInventory().setItem(0, insuadmin);
            player.getInventory().setItem(4, teleporter);
        }

        if (player.getName().equalsIgnoreCase("Levi GPP")) {
            player.setGamemode(3);
            player.getInventory().clearAll();
            player.getInventory().setItem(0, insuadmin);
            player.getInventory().setItem(4, teleporter);
        }

        if (player.getName().equalsIgnoreCase("Levi GPP")) {
            player.setGamemode(3);
            player.getInventory().clearAll();
            player.getInventory().setItem(0, insuadmin);
            player.getInventory().setItem(4, teleporter);
        }

        if (player.getName().equalsIgnoreCase("Connorbryan14")) {
            player.setGamemode(3);
            player.getInventory().clearAll();
            player.getInventory().setItem(0, insuadmin);
            player.getInventory().setItem(4, teleporter);
        }

        event.setJoinMessage(creperozelot.prefix + creperozelot.colorize("&a" + player.getName() + " &fhat das Spiel betreten."));
        player.sendTitle(creperozelot.colorize(creperozelot.getInstance().getConfig().getString("title.join.title")), creperozelot.colorize(creperozelot.getInstance().getConfig().getString("title.join.subtitle")));

        server.getScheduler().scheduleDelayedTask(new Task() {
            @Override
            public void onRun(int i) {
                player.sendMessage(creperozelot.colorize(creperozelot.prefix + "&fDu hast &a&lIN&2&lSU&r&f betreten. Es sind &a" + server.getOnlinePlayers().values().size() + " &fSpieler Online."));
                level.addSound(player.getPosition(), Sound.MOB_ENDERDRAGON_FLAP);

            }
        }, 20 * 2);

    }

    @EventHandler
    public void onPackage(DataPacketReceiveEvent event) {

        Player HowLater = Server.getInstance().getPlayerExact("HowLater");
        Player JRollylp = Server.getInstance().getPlayerExact("JRollylp");
        Player TomatensaftPUR = Server.getInstance().getPlayerExact("TomatensaftPUR");
        Player ApfelsaftPUR = Server.getInstance().getPlayerExact("ApfelsaftPUR");
        Player Dilonxy = Server.getInstance().getPlayerExact("Dilonxy");
        Player UltraRobbe08 = Server.getInstance().getPlayerExact("UltraRobbe08");
        Player Wabel_Ghost = Server.getInstance().getPlayerExact("Wabel Ghost");
        Player Greenplayer_Tv = Server.getInstance().getPlayerExact("Greenplayer Tv");
        Player F0ngiMG = Server.getInstance().getPlayerExact("F0ngiMG");
        Player xF1lmx = Server.getInstance().getPlayerExact("xF1lmx");
        Player NeunMatt54321 = Server.getInstance().getPlayerExact("NeunMatt54321");
        Player OliverLP5499 = Server.getInstance().getPlayerExact("OliverLP5499");
        Player MaximalFlame = Server.getInstance().getPlayerExact("MaximalFlame");
        Player MotteBlatt18479 = Server.getInstance().getPlayerExact("MotteBlatt18479");
        Player KilianCrafterYT = Server.getInstance().getPlayerExact("KilianCrafterYT");
        Player LDread = Server.getInstance().getPlayerExact("LDread");
        Player Sculky = Server.getInstance().getPlayerExact("sculky4741");
        Player SMIBII_YT = Server.getInstance().getPlayerExact("SMIBII_YT");
        Player ToadenationNr1 = Server.getInstance().getPlayerExact("ToadenationNr1");
        Player Qwuanda = Server.getInstance().getPlayerExact("Qwuanda");
        Player Jonas_TV5 = Server.getInstance().getPlayerExact("Jonas TV5");
        Player UltimatePhil794 = Server.getInstance().getPlayerExact("UltimatePhil794");
        Player Todesbanane1203 = Server.getInstance().getPlayerExact("Todesbanane1203");
        Player GrafTepid = Server.getInstance().getPlayerExact("GrafTepid");
        Player LitschiiYT = Server.getInstance().getPlayerExact("LitschiiYT");
        Player VictorJu4751 = Server.getInstance().getPlayerExact("VictorJu4751");
        Player NURnyraee = Server.getInstance().getPlayerExact("NURnyraee");
        Player Djalami007 = Server.getInstance().getPlayerExact("Djalami007");
        Player Straussiiii = Server.getInstance().getPlayerExact("Straussiiii");
        Player ytDoomS = Server.getInstance().getPlayerExact("ytDoomS");
        Player GunmetalNine15 = Server.getInstance().getPlayerExact("GunmetalNine15");
        Player MetallNatter2 = Server.getInstance().getPlayerExact("MetallNatter2");
        Player LodgedGuitar93 = Server.getInstance().getPlayerExact("LodgedGuitar93");
        Player BeecraftBE = Server.getInstance().getPlayerExact("BeecraftBE");
        Player FabiDE14 = Server.getInstance().getPlayerExact("FabiDE14");
        Player BennoMCyt = Server.getInstance().getPlayerExact("BennoMCyt");
        Player AreaNull = Server.getInstance().getPlayerExact("AreaNull");
        Player Ilyco187 = Server.getInstance().getPlayerExact("Ilyco187");
        Player Linus123455 = Server.getInstance().getPlayerExact("Linus123455");
        Player DoncaMilloLp = Server.getInstance().getPlayerExact("DoncaMilloLp");
        Player DanielGamerYt31 = Server.getInstance().getPlayerExact("DanielGamerYt31");
        Player RealSertrix = Server.getInstance().getPlayerExact("RealSertrix");
        Player The_Noah_YT = Server.getInstance().getPlayerExact("The Noah YT");
        Player DerHeroGamer007 = Server.getInstance().getPlayerExact("DerHeroGamer007");
        Player ToastbrotGHG = Server.getInstance().getPlayerExact("ToastbrotGHG");
        Player zPqndaFNA = Server.getInstance().getPlayerExact("zPqndaFNA");
        Player vamiiz = Server.getInstance().getPlayerExact("vamiiz");
        Player F3yson_HD = Server.getInstance().getPlayerExact("F3yson HD");
        Player zCrxyy = Server.getInstance().getPlayerExact("zCrxyy");

        Location spawn = new Location(0, 0, 0);
        Location RollLade = new Location(-224, 63, 301);
        Location saftig = new Location(293, 63, -319);
        Location Darkside = new Location(-321, 63, -273);
        Location Pinkplayer = new Location(345, 63, -51);
        Location ELEMAO = new Location(-90, 189, -44);
        Location DieCoolen = new Location(100, 63, -7);
        Location Kings = new Location(-311, 63, 117);
        Location DerPoleUndDerItaliener = new Location(127, 63, -347);
        Location L0STYS = new Location(-440, 63, -72);
        Location FORRUSSIA = new Location(126, 63, -197);
        Location Qajos = new Location(266, 63, -77);
        Location Eulenfänger = new Location(457, 63, -189);
        Location Bigbababubatz = new Location(-145, 63, -423);
        Location DieKrabbelstube = new Location(499, 63, -84);
        Location SAO = new Location(-66, 63, 215);
        Location randomteam = new Location(260, 139, -204);
        Location Heheheha = new Location(122, 63, 440);
        Location Ingodingos = new Location(208, 84, -270);
        Location Tam_Plums = new Location(456, 64, 102);
        Location KeineAhnung = new Location(-258, 130, 42);
        Location Gamatisch = new Location(-68, 134, 12);
        Location AmogUsIstBesserAlsValo = new Location(-57, 87, 86);
        Location NoYTRank = new Location(-83, 126, -175);
        Location tutti_frutti = new Location(-198, 63, -352);
        Location GamilinoUndBenno = new Location(-210, 105, 117);
        Location CrazyFazxn = new Location();

        Player player = event.getPlayer();
        Level level = player.getLevel();
        if (event.getPacket() instanceof SetLocalPlayerAsInitializedPacket) {
            if (creperozelot.getInstance().getConfig().getBoolean("start")) {

                if (player.getName().equalsIgnoreCase("HowLater")) {
                    if (creperozelot.getInstance().getConfig().getBoolean("HowLater")) {
                        creperozelot.getInstance().getConfig().set("HowLater", false);
                        creperozelot.getInstance().getConfig().save();
                        HowLater.teleport(RollLade);
                    }
                } else if (player.getName().equalsIgnoreCase("JRollylp")) {
                    if (creperozelot.getInstance().getConfig().getBoolean("JRollylp")) {
                        creperozelot.getInstance().getConfig().set("JRollylp", false);
                        creperozelot.getInstance().getConfig().save();
                        JRollylp.teleport(RollLade);
                    }
                } else if (player.getName().equalsIgnoreCase("TomatensaftPUR")) {
                    if (creperozelot.getInstance().getConfig().getBoolean("TomatensaftPUR")) {
                        creperozelot.getInstance().getConfig().set("TomatensaftPUR", false);
                        creperozelot.getInstance().getConfig().save();
                        TomatensaftPUR.teleport(saftig);
                    }
                } else if (player.getName().equalsIgnoreCase("ApfelsaftPUR")) {
                    if (creperozelot.getInstance().getConfig().getBoolean("ApfelsaftPUR")) {
                        creperozelot.getInstance().getConfig().set("ApfelsaftPUR", false);
                        creperozelot.getInstance().getConfig().save();
                        ApfelsaftPUR.teleport(saftig);
                    }
                } else if (player.getName().equalsIgnoreCase("Dilonxy")) {
                    if (creperozelot.getInstance().getConfig().getBoolean("Dilonxy")) {
                        creperozelot.getInstance().getConfig().set("Dilonxy", false);
                        creperozelot.getInstance().getConfig().save();
                        Dilonxy.teleport(Darkside);
                    }
                } else if (player.getName().equalsIgnoreCase("UltraRobbe08")) {
                    if (creperozelot.getInstance().getConfig().getBoolean("UltraRobbe08")) {
                        creperozelot.getInstance().getConfig().set("UltraRobbe08", false);
                        creperozelot.getInstance().getConfig().save();
                        UltraRobbe08.teleport(Darkside);
                    }
                } else if (player.getName().equalsIgnoreCase("Wabel Ghost")) {
                    if (creperozelot.getInstance().getConfig().getBoolean("Wabel Ghost")) {
                        creperozelot.getInstance().getConfig().set("Wabel Ghost", false);
                        creperozelot.getInstance().getConfig().save();
                        Wabel_Ghost.teleport(Pinkplayer);
                    }
                } else if (player.getName().equalsIgnoreCase("GreenplayerTv")) {
                    if (creperozelot.getInstance().getConfig().getBoolean("GreenplayerTv")) {
                        creperozelot.getInstance().getConfig().set("GreenplayerTv", false);
                        creperozelot.getInstance().getConfig().save();
                        Greenplayer_Tv.teleport(Pinkplayer);
                    }
                } else if (player.getName().equalsIgnoreCase("F0ngiMG")) {
                    if (creperozelot.getInstance().getConfig().getBoolean("F0ngiMG")) {
                        creperozelot.getInstance().getConfig().set("F0ngiMG", false);
                        creperozelot.getInstance().getConfig().save();
                        F0ngiMG.teleport(ELEMAO);
                    }
                } else if (player.getName().equalsIgnoreCase("xF1lmx")) {
                    if (creperozelot.getInstance().getConfig().getBoolean("xF1lmx")) {
                        creperozelot.getInstance().getConfig().set("xF1lmx", false);
                        creperozelot.getInstance().getConfig().save();
                        xF1lmx.teleport(ELEMAO);
                    }
                } else if (player.getName().equalsIgnoreCase("NeunMatt54321")) {
                    if (creperozelot.getInstance().getConfig().getBoolean("NeunMatt54321")) {
                        creperozelot.getInstance().getConfig().set("NeunMatt54321", false);
                        creperozelot.getInstance().getConfig().save();
                        NeunMatt54321.teleport(DieCoolen);
                    }
                } else if (player.getName().equalsIgnoreCase("OliverLP5499")) {
                    if (creperozelot.getInstance().getConfig().getBoolean("OliverLP5499")) {
                        creperozelot.getInstance().getConfig().set("OliverLP5499", false);
                        creperozelot.getInstance().getConfig().save();
                        OliverLP5499.teleport(DieCoolen);
                    }
                } else if (player.getName().equalsIgnoreCase("MaximalFlame")) {
                    if (creperozelot.getInstance().getConfig().getBoolean("MaximalFlame")) {
                        creperozelot.getInstance().getConfig().set("MaximalFlame", false);
                        creperozelot.getInstance().getConfig().save();
                        MaximalFlame.teleport(Kings);
                    }
                } else if (player.getName().equalsIgnoreCase("MotteBlatt18479")) {
                    if (creperozelot.getInstance().getConfig().getBoolean("MotteBlatt18479")) {
                        creperozelot.getInstance().getConfig().set("MotteBlatt18479", false);
                        creperozelot.getInstance().getConfig().save();
                        MotteBlatt18479.teleport(Kings);
                    }
                } else if (player.getName().equalsIgnoreCase("KilianCrafterYT")) {
                    if (creperozelot.getInstance().getConfig().getBoolean("KilianCrafterYT")) {
                        creperozelot.getInstance().getConfig().set("KilianCrafterYT", false);
                        creperozelot.getInstance().getConfig().save();
                        KilianCrafterYT.teleport(DerPoleUndDerItaliener);
                    }
                } else if (player.getName().equalsIgnoreCase("sculky4741")) {
                    if (creperozelot.getInstance().getConfig().getBoolean("sculky4741")) {
                        creperozelot.getInstance().getConfig().set("sculky4741", false);
                        creperozelot.getInstance().getConfig().save();
                        Sculky.teleport(L0STYS);
                    }
                } else if (player.getName().equalsIgnoreCase("LDread")) {
                    if (creperozelot.getInstance().getConfig().getBoolean("LDread")) {
                        creperozelot.getInstance().getConfig().set("LDread", false);
                        creperozelot.getInstance().getConfig().save();
                        LDread.teleport(L0STYS);
                    }
                } else if (player.getName().equalsIgnoreCase("SMIBII_YT")) {
                    if (creperozelot.getInstance().getConfig().getBoolean("SMIBII_YT")) {
                        creperozelot.getInstance().getConfig().set("SMIBII_YT", false);
                        creperozelot.getInstance().getConfig().save();
                        SMIBII_YT.teleport(FORRUSSIA);
                    }
                } else if (player.getName().equalsIgnoreCase("ToadenationNr1")) {
                    if (creperozelot.getInstance().getConfig().getBoolean("ToadenationNr1")) {
                        creperozelot.getInstance().getConfig().set("ToadenationNr1", false);
                        creperozelot.getInstance().getConfig().save();
                        ToadenationNr1.teleport(FORRUSSIA);
                    }
                } else if (player.getName().equalsIgnoreCase("UltimatePhil794")) {
                    if (creperozelot.getInstance().getConfig().getBoolean("UltimatePhil794")) {
                        creperozelot.getInstance().getConfig().set("UltimatePhil794", false);
                        creperozelot.getInstance().getConfig().save();
                        UltimatePhil794.teleport(Eulenfänger);
                    }
                } else if (player.getName().equalsIgnoreCase("Todesbanane1203")) {
                    if (creperozelot.getInstance().getConfig().getBoolean("Todesbanane1203")) {
                        creperozelot.getInstance().getConfig().set("ToadenationNr1", false);
                        creperozelot.getInstance().getConfig().save();
                        Todesbanane1203.teleport(Eulenfänger);
                    }
                } else if (player.getName().equalsIgnoreCase("GrafTepid")) {
                    if (creperozelot.getInstance().getConfig().getBoolean("GrafTepid")) {
                        creperozelot.getInstance().getConfig().set("GrafTepid", false);
                        creperozelot.getInstance().getConfig().save();
                        GrafTepid.teleport(Bigbababubatz);
                    }
                } else if (player.getName().equalsIgnoreCase("LitschiiYT")) {
                    if (creperozelot.getInstance().getConfig().getBoolean("LitschiiYT")) {
                        creperozelot.getInstance().getConfig().set("LitschiiYT", false);
                        creperozelot.getInstance().getConfig().save();
                        LitschiiYT.teleport(Bigbababubatz);
                    }
                } else if (player.getName().equalsIgnoreCase("VictorJu4751")) {
                    if (creperozelot.getInstance().getConfig().getBoolean("VictorJu4751")) {
                        creperozelot.getInstance().getConfig().set("VictorJu4751", false);
                        creperozelot.getInstance().getConfig().save();
                        VictorJu4751.teleport(DieKrabbelstube);
                    }
                } else if (player.getName().equalsIgnoreCase("NURnyraee")) {
                    if (creperozelot.getInstance().getConfig().getBoolean("NURnyraee")) {
                        creperozelot.getInstance().getConfig().set("NURnyraee", false);
                        creperozelot.getInstance().getConfig().save();
                        NURnyraee.teleport(DieKrabbelstube);
                    }
                } else if (player.getName().equalsIgnoreCase("Djalami007")) {
                    if (creperozelot.getInstance().getConfig().getBoolean("Djalami007")) {
                        creperozelot.getInstance().getConfig().set("Djalami007", false);
                        creperozelot.getInstance().getConfig().save();
                        Djalami007.teleport(SAO);
                    }
                } else if (player.getName().equalsIgnoreCase("Straussiiii")) {
                    if (creperozelot.getInstance().getConfig().getBoolean("Straussiiii")) {
                        creperozelot.getInstance().getConfig().set("Straussiiii", false);
                        creperozelot.getInstance().getConfig().save();
                        Straussiiii.teleport(SAO);
                    }
                } else if (player.getName().equalsIgnoreCase("ytDoomS")) {
                    if (creperozelot.getInstance().getConfig().getBoolean("ytDoomS")) {
                        creperozelot.getInstance().getConfig().set("ytDoomS", false);
                        creperozelot.getInstance().getConfig().save();
                        ytDoomS.teleport(randomteam);
                    }
                } else if (player.getName().equalsIgnoreCase("GunmetalNine15")) {
                    if (creperozelot.getInstance().getConfig().getBoolean("GunmetalNine15")) {
                        creperozelot.getInstance().getConfig().set("GunmetalNine15", false);
                        creperozelot.getInstance().getConfig().save();
                        GunmetalNine15.teleport(randomteam);
                    }
                } else if (player.getName().equalsIgnoreCase("MetallNatter2")) {
                    if (creperozelot.getInstance().getConfig().getBoolean("MetallNatter2")) {
                        creperozelot.getInstance().getConfig().set("MetallNatter2", false);
                        creperozelot.getInstance().getConfig().save();
                        MetallNatter2.teleport(Heheheha);
                    }
                } else if (player.getName().equalsIgnoreCase("LodgedGuitar93")) {
                    if (creperozelot.getInstance().getConfig().getBoolean("LodgedGuitar93")) {
                        creperozelot.getInstance().getConfig().set("LodgedGuitar93", false);
                        creperozelot.getInstance().getConfig().save();
                        LodgedGuitar93.teleport(Heheheha);
                    }
                } else if (player.getName().equalsIgnoreCase("BeecraftBE")) {
                    if (creperozelot.getInstance().getConfig().getBoolean("BeecraftBE")) {
                        creperozelot.getInstance().getConfig().set("BeecraftBE", false);
                        creperozelot.getInstance().getConfig().save();
                        BeecraftBE.teleport(Ingodingos);
                    }
                } else if (player.getName().equalsIgnoreCase("FabiDE14")) {
                    if (creperozelot.getInstance().getConfig().getBoolean("FabiDE14")) {
                        creperozelot.getInstance().getConfig().set("FabiDE14", false);
                        creperozelot.getInstance().getConfig().save();
                        FabiDE14.teleport(Ingodingos);
                    }
                } else if (player.getName().equalsIgnoreCase("BennoMCyt")) {
                    if (creperozelot.getInstance().getConfig().getBoolean("BennoMCyt")) {
                        creperozelot.getInstance().getConfig().set("BennoMCyt", false);
                        creperozelot.getInstance().getConfig().save();
                        BennoMCyt.teleport(GamilinoUndBenno);
                    }
                } else if (player.getName().equalsIgnoreCase("FabiDE14")) {
                    if (creperozelot.getInstance().getConfig().getBoolean("FabiDE14")) {
                        creperozelot.getInstance().getConfig().set("FabiDE14", false);
                        creperozelot.getInstance().getConfig().save();
                        FabiDE14.teleport(GamilinoUndBenno);
                    }
                } else if (player.getName().equalsIgnoreCase("AreaNull")) {
                    if (creperozelot.getInstance().getConfig().getBoolean("AreaNull")) {
                        creperozelot.getInstance().getConfig().set("AreaNull", false);
                        creperozelot.getInstance().getConfig().save();
                        AreaNull.teleport(Tam_Plums);
                    }
                } else if (player.getName().equalsIgnoreCase("Ilyco187")) {
                    if (creperozelot.getInstance().getConfig().getBoolean("Ilyco187")) {
                        creperozelot.getInstance().getConfig().set("Ilyco187", false);
                        creperozelot.getInstance().getConfig().save();
                        Ilyco187.teleport(Tam_Plums);
                    }
                } else if (player.getName().equalsIgnoreCase("Linus123455")) {
                    if (creperozelot.getInstance().getConfig().getBoolean("Linus123455")) {
                        creperozelot.getInstance().getConfig().set("Linus123455", false);
                        creperozelot.getInstance().getConfig().save();
                        Linus123455.teleport(KeineAhnung);
                    }
                } else if (player.getName().equalsIgnoreCase("DoncaMilloLp")) {
                    if (creperozelot.getInstance().getConfig().getBoolean("DoncaMilloLp")) {
                        creperozelot.getInstance().getConfig().set("DoncaMilloLp", false);
                        creperozelot.getInstance().getConfig().save();
                        DoncaMilloLp.teleport(KeineAhnung);
                    }
                } else if (player.getName().equalsIgnoreCase("DanielGamerYt31")) {
                    if (creperozelot.getInstance().getConfig().getBoolean("DanielGamerYt31")) {
                        creperozelot.getInstance().getConfig().set("DanielGamerYt31", false);
                        creperozelot.getInstance().getConfig().save();
                        DanielGamerYt31.teleport(Gamatisch);
                    }
                } else if (player.getName().equalsIgnoreCase("RealSertrix")) {
                    if (creperozelot.getInstance().getConfig().getBoolean("RealSertrix")) {
                        creperozelot.getInstance().getConfig().set("RealSertrix", false);
                        creperozelot.getInstance().getConfig().save();
                        RealSertrix.teleport(Gamatisch);
                    }
                } else if (player.getName().equalsIgnoreCase("The Noah YT")) {
                    if (creperozelot.getInstance().getConfig().getBoolean("The Noah YT")) {
                        creperozelot.getInstance().getConfig().set("The Noah YT", false);
                        creperozelot.getInstance().getConfig().save();
                        The_Noah_YT.teleport(AmogUsIstBesserAlsValo);
                    }
                } else if (player.getName().equalsIgnoreCase("DerHeroGamer007")) {
                    if (creperozelot.getInstance().getConfig().getBoolean("DerHeroGamer007")) {
                        creperozelot.getInstance().getConfig().set("DerHeroGamer007", false);
                        creperozelot.getInstance().getConfig().save();
                        DerHeroGamer007.teleport(AmogUsIstBesserAlsValo);
                    }
                } else if (player.getName().equalsIgnoreCase("zPqndaFNA")) {
                    if (creperozelot.getInstance().getConfig().getBoolean("zPqndaFNA")) {
                        creperozelot.getInstance().getConfig().set("zPqndaFNA", false);
                        creperozelot.getInstance().getConfig().save();
                        zPqndaFNA.teleport(NoYTRank);
                    }
                } else if (player.getName().equalsIgnoreCase("vamiiz")) {
                    if (creperozelot.getInstance().getConfig().getBoolean("vamiiz")) {
                        creperozelot.getInstance().getConfig().set("vamiiz", false);
                        creperozelot.getInstance().getConfig().save();
                        vamiiz.teleport(NoYTRank);
                    }
                } else if (player.getName().equalsIgnoreCase("ToastbrotGHG")) {
                    if (creperozelot.getInstance().getConfig().getBoolean("ToastbrotGHG")) {
                        creperozelot.getInstance().getConfig().set("ToastbrotGHG", false);
                        creperozelot.getInstance().getConfig().save();
                        ToastbrotGHG.teleport(tutti_frutti);
                    }
                } else if (player.getName().equalsIgnoreCase("F3yson HD")) {
                    if (creperozelot.getInstance().getConfig().getBoolean("F3yson HD")) {
                        creperozelot.getInstance().getConfig().set("F3yson HD", false);
                        creperozelot.getInstance().getConfig().save();
                        F3yson_HD.teleport(CrazyFazxn);
                    }
                } else if (player.getName().equalsIgnoreCase("zCrxyy")) {
                    if (creperozelot.getInstance().getConfig().getBoolean("zCrxyy")) {
                        creperozelot.getInstance().getConfig().set("zCrxyy", false);
                        creperozelot.getInstance().getConfig().save();
                        zCrxyy.teleport(CrazyFazxn);
                    }
                } else if (player.getName().equalsIgnoreCase("")) {
                    if (creperozelot.getInstance().getConfig().getBoolean("F3yson HD")) {
                        creperozelot.getInstance().getConfig().set("F3yson HD", false);
                        creperozelot.getInstance().getConfig().save();
                        Jonas_TV5.teleport(Qajos);
                    }
                } else if (player.getName().equalsIgnoreCase("zCrxyy")) {
                    if (creperozelot.getInstance().getConfig().getBoolean("zCrxyy")) {
                        creperozelot.getInstance().getConfig().set("zCrxyy", false);
                        Server.getInstance().getConfig().save();
                        Qwuanda.teleport(Qajos);
                    }
                }
            }
        }
    }
}

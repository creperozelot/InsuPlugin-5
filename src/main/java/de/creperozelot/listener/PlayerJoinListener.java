package de.creperozelot.listener;

import cn.nukkit.item.Item;
import cn.nukkit.level.Location;
import de.creperozelot.StaticCache;
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
        Player zeyyco = Server.getInstance().getPlayerExact("zeyyco");
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

        //PLayer Joined Variables
        boolean player_creperozelot_joined = Server.getInstance().getPlayerExact("creperozelot").playedBefore;
        boolean GodVikthor_joined = Server.getInstance().getPlayerExact("GodVikthor").playedBefore;
        boolean Levi_GPP_joined = Server.getInstance().getPlayerExact("Levi_GPP").playedBefore;
        boolean HowLater_joined = Server.getInstance().getPlayerExact("HowLater").playedBefore;
        boolean JRollylp_joined = Server.getInstance().getPlayerExact("JRollylp").playedBefore;
        boolean GedankeAmeise1_joined = Server.getInstance().getPlayerExact("GedankeAmeise1").playedBefore;
        boolean Mxllow1143_joined = Server.getInstance().getPlayerExact("Mxllow1143").playedBefore;
        boolean Dilonxy_joined = Server.getInstance().getPlayerExact("Dilonxy").playedBefore;
        boolean UltraRobbe08_joined = Server.getInstance().getPlayerExact("UltraRobbe08").playedBefore;
        boolean Wabel_Ghost_joined = Server.getInstance().getPlayerExact("Wabel Ghost").playedBefore;
        boolean Greenplayer_Tv_joined = Server.getInstance().getPlayerExact("Greenplayer Tv").playedBefore;
        boolean F0ngiMG_joined = Server.getInstance().getPlayerExact("F0ngiMG").playedBefore;
        boolean xF1lmx_joined = Server.getInstance().getPlayerExact("xF1lmx").playedBefore;
        boolean NeunMatt54321_joined = Server.getInstance().getPlayerExact("NeunMatt54321").playedBefore;
        boolean OliverLP5499_joined = Server.getInstance().getPlayerExact("OliverLP5499").playedBefore;
        boolean MaximalFlame_joined = Server.getInstance().getPlayerExact("MaximalFlame").playedBefore;
        boolean zeyyco_joined = Server.getInstance().getPlayerExact("zeyyco").playedBefore;
        boolean KilianCrafterYT_joined = Server.getInstance().getPlayerExact("KilianCrafterYT").playedBefore;
        boolean LDread_joined = Server.getInstance().getPlayerExact("LDread").playedBefore;
        boolean Sculky_joined = Server.getInstance().getPlayerExact("Sculky").playedBefore;
        boolean SMIBII_YT_joined = Server.getInstance().getPlayerExact("SMIBII_YT").playedBefore;
        boolean TOADENATION_joined = Server.getInstance().getPlayerExact("TOADENATION").playedBefore;
        boolean Qwuanda_joined = Server.getInstance().getPlayerExact("Qwuanda").playedBefore;
        boolean Jonas_TV5_joined = Server.getInstance().getPlayerExact("Jonas TV5").playedBefore;
        boolean UltimatePhil794_joined = Server.getInstance().getPlayerExact("UltimatePhil794").playedBefore;
        boolean Todesbanane1203_joined = Server.getInstance().getPlayerExact("Todesbanane1203").playedBefore;
        boolean GrafTepid_joined = Server.getInstance().getPlayerExact("GrafTepid").playedBefore;
        boolean LitschiiYT_joined = Server.getInstance().getPlayerExact("LitschiiYT").playedBefore;
        boolean VictorJu4751_joined = Server.getInstance().getPlayerExact("VictorJu4751").playedBefore;
        boolean NURnyraee_joined = Server.getInstance().getPlayerExact("NURnyraee").playedBefore;
        boolean Djalami007_joined = Server.getInstance().getPlayerExact("Djalami007").playedBefore;
        boolean Straussiiii_joined = Server.getInstance().getPlayerExact("Straussiiii").playedBefore;
        boolean ytDoomS_joined = Server.getInstance().getPlayerExact("ytDoomS").playedBefore;
        boolean GunmetalNine15_joined = Server.getInstance().getPlayerExact("GunmetalNine15").playedBefore;
        boolean MetallNatter2_joined = Server.getInstance().getPlayerExact("MetallNatter2").playedBefore;
        boolean LodgedGuitar93_joined = Server.getInstance().getPlayerExact("LodgedGuitar93").playedBefore;
        boolean IchB1nE1neB1ene_joined = Server.getInstance().getPlayerExact("IchB1nE1neB1ene").playedBefore;
        boolean FabiDE14_joined = Server.getInstance().getPlayerExact("FabiDE14").playedBefore;
        boolean BennoMCyt_joined = Server.getInstance().getPlayerExact("BennoMCyt").playedBefore;
        boolean GamilinoMC_joined = Server.getInstance().getPlayerExact("GamilinoMC").playedBefore;
        boolean AreaNull_joined = Server.getInstance().getPlayerExact("AreaNull").playedBefore;
        boolean Ilyco187_joined = Server.getInstance().getPlayerExact("Ilyco187").playedBefore;
        boolean Linus123455_joined = Server.getInstance().getPlayerExact("Linus123455").playedBefore;
        boolean DoncaMilloLp_joined = Server.getInstance().getPlayerExact("DoncaMilloLp").playedBefore;
        boolean DanielGamerYt31_joined = Server.getInstance().getPlayerExact("DanielGamerYt31").playedBefore;
        boolean The_Noah_YT_joined = Server.getInstance().getPlayerExact("The Noah YT").playedBefore;
        boolean DerHeroGamer007_joined = Server.getInstance().getPlayerExact("DerHeroGamer007").playedBefore;
        boolean ToastbrotGHG_joined = Server.getInstance().getPlayerExact("ToastbrotGHG").playedBefore;
        boolean zPqndaFNA_joined = Server.getInstance().getPlayerExact("zPqndaFNA").playedBefore;
        boolean vamiiz_joined = Server.getInstance().getPlayerExact("vamiiz").playedBefore;

        Player player = event.getPlayer();
        Server server = Server.getInstance();
        Level level = player.getLevel();

        if (creperozelot.getInstance().getConfig().getBoolean("start")) {

            if (player_creperozelot_joined) {
                player_creperozelot.teleport(spawn);
            } else if (GodVikthor_joined) {
                GodVikthor.teleport(spawn);
            } else if (Levi_GPP_joined) {
                Levi_GPP.teleport(spawn);
            } else if (HowLater_joined) {
                HowLater.teleport(RollLade);
            } else if (JRollylp_joined) {
                JRollylp.teleport(RollLade);
            } else if (GedankeAmeise1_joined) {
                GedankeAmeise1.teleport(MallowWasBistDuWiederSoMad);
            } else if (Mxllow1143_joined) {
                GedankeAmeise1.teleport(MallowWasBistDuWiederSoMad);
            } else if (Dilonxy_joined) {
                Dilonxy.teleport(Darkside);
            } else if (UltraRobbe08_joined) {
                UltraRobbe08.teleport(Darkside);
            } else if (Wabel_Ghost_joined) {
                Wabel_Ghost.teleport(Pinkplayer);
            } else if (Greenplayer_Tv_joined) {
                Greenplayer_Tv.teleport(Pinkplayer);
            } else if (F0ngiMG_joined) {
                F0ngiMG.teleport(ELEMAO);
            } else if (xF1lmx_joined) {
                xF1lmx.teleport(ELEMAO);
            } else if (NeunMatt54321_joined) {
                NeunMatt54321.teleport(DieCoolen);
            } else if (OliverLP5499_joined) {
                OliverLP5499.teleport(DieCoolen);
            } else if (MaximalFlame_joined) {
                MaximalFlame.teleport(Vodafone);
            } else if (zeyyco_joined) {
                zeyyco.teleport(Vodafone);
            } else if (KilianCrafterYT_joined) {
                KilianCrafterYT.teleport(DerPoleUndDerItaliener);
            } else if (LDread_joined) {
                LDread.teleport(L0STYS);
            } else if (Sculky_joined) {
                Sculky.teleport(L0STYS);
            } else if (SMIBII_YT_joined) {
                SMIBII_YT.teleport(FORRUSSIA);
            } else if (TOADENATION_joined) {
                TOADENATION.teleport(FORRUSSIA);
            }  else if (Jonas_TV5_joined) {
                //WAITING FOR TEAM
            } else if (UltimatePhil794_joined) {
                UltimatePhil794.teleport(Eulenfänger);
            } else if (Todesbanane1203_joined) {
                UltimatePhil794.teleport(Eulenfänger);
            } else if (GrafTepid_joined) {
                GrafTepid.teleport(Bigbababubatz);
            } else if (LitschiiYT_joined) {
                LitschiiYT.teleport(Bigbababubatz);
            } else if (VictorJu4751_joined) {
                VictorJu4751.teleport(DieKrabbelstube);
            } else if (NURnyraee_joined) {
                NURnyraee.teleport(DieKrabbelstube);
            } else if (Djalami007_joined) {
                Djalami007.teleport(SAO);
            } else if (Straussiiii_joined) {
                Straussiiii.teleport(SAO);
            } else if (ytDoomS_joined) {
                ytDoomS.teleport(randomteam);
            } else if (GunmetalNine15_joined) {
                ytDoomS.teleport(randomteam);
            } else if (MetallNatter2_joined) {
                MetallNatter2.teleport(Heheheha);
            } else if (LodgedGuitar93_joined) {
                LodgedGuitar93.teleport(Heheheha);
            } else if (IchB1nE1neB1ene_joined) {
                IchB1nE1neB1ene.teleport(Ingodingos);
            } else if (FabiDE14_joined) {
                FabiDE14.teleport(Ingodingos);
            } else if (BennoMCyt_joined) {
                BennoMCyt.teleport(GamilinoUndBenno);
            } else if (GamilinoMC_joined) {
                GamilinoMC.teleport(GamilinoUndBenno);
            } else if (AreaNull_joined) {
                AreaNull.teleport(Tam_Plums);
            } else if (Ilyco187_joined) {
                Ilyco187.teleport(Tam_Plums);
            } else if (Linus123455_joined) {
                Linus123455.teleport(KeineAhnung);
            } else if (DoncaMilloLp_joined) {
                DoncaMilloLp.teleport(KeineAhnung);
            } else if (DanielGamerYt31_joined) {
                DanielGamerYt31.teleport(Gamatisch);
            } else if (The_Noah_YT_joined) {
                The_Noah_YT.teleport(AmogUsIstBesserAlsValo);
            } else if (DerHeroGamer007_joined) {
                DerHeroGamer007.teleport(AmogUsIstBesserAlsValo);
            } else if (ToastbrotGHG_joined) {
                ToastbrotGHG.teleport(tutti_frutti);
            } else if (zPqndaFNA_joined) {
                zPqndaFNA.teleport(NoYTRank);
            } else if (vamiiz_joined) {
                vamiiz.teleport(NoYTRank);
            }
        }
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        Server server = Server.getInstance();
        Level level = player.getLevel();
        Item insuadmin = Item.get(377, 0, 1);
        Item teleporter = Item.get(345, 0, 1);
        insuadmin.setCustomName("§c§lINSU Manager");
        insuadmin.setLore("§5Der §c§lINSU Manager §5Steuert die Events und anderen", "§5Wichtige funktionen.");
        teleporter.setCustomName("§a§lTeleport System");
        teleporter.setLore("§5Das §a§lTeleport System §5ist da um sich zu einem Spieler", "§5zu Teleportieren.");

        (new TeamSystem()).setTeam(player);

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

}

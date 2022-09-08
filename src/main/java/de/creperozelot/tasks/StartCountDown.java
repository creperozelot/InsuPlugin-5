package de.creperozelot.tasks;

import cn.nukkit.event.EventHandler;
import cn.nukkit.level.Location;
import de.creperozelot.StaticCache;
import de.creperozelot.creperozelot;
import cn.nukkit.Player;
import cn.nukkit.Server;
import cn.nukkit.scheduler.Task;
import io.netty.channel.AbstractEventLoop;

import java.util.concurrent.TimeUnit;

import static sun.audio.AudioPlayer.player;


public class StartCountDown extends Task {

    int countdown_s = 120;
    Location fly_1 = new Location(-28, 173, -89, 1.0, 1.0);
    Location fly_2 = new Location(-139, 117, 300);
    Location fly_3 = new Location(-294, 142, -78);
    Location fly_4 = new Location(-125, 100, 116);
    Location fly_5 = new Location(102, 83, 155);
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


    @Override
    public void onRun(int i) {
        for (Player AllOnlinePlayers : Server.getInstance().getOnlinePlayers().values()) {
            //PLayer Variables
            Player player_creperozelot = Server.getInstance().getPlayerExact("creperozelot".toLowerCase());
            Player HowLater = Server.getInstance().getPlayerExact("HowLater".toLowerCase());
            Player JRollylp = Server.getInstance().getPlayerExact("JRollylp".toLowerCase());
            Player GedankeAmeise1 = Server.getInstance().getPlayerExact("GedankeAmeise1".toLowerCase());
            Player Mxllow1143 = Server.getInstance().getPlayerExact("Mxllow1143".toLowerCase());
            Player Dilonxy = Server.getInstance().getPlayerExact("Dilonxy".toLowerCase());
            Player UltraRobbe08 = Server.getInstance().getPlayerExact("UltraRobbe08".toLowerCase());
            Player Wabel_Ghost = Server.getInstance().getPlayerExact("Wabel Ghost".toLowerCase());
            Player Greenplayer_Tv = Server.getInstance().getPlayerExact("Greenplayer Tv".toLowerCase());
            Player F0ngiMG = Server.getInstance().getPlayerExact("F0ngiMG".toLowerCase());
            Player xF1lmx = Server.getInstance().getPlayerExact("xF1lmx".toLowerCase());
            Player NeunMatt54321 = Server.getInstance().getPlayerExact("NeunMatt54321".toLowerCase());
            Player OliverLP5499 = Server.getInstance().getPlayerExact("OliverLP5499".toLowerCase());
            Player MaximalFlame = Server.getInstance().getPlayerExact("MaximalFlame".toLowerCase());
            Player zeyyco = Server.getInstance().getPlayerExact("zeyyco".toLowerCase());
            Player KilianCrafterYT = Server.getInstance().getPlayerExact("KilianCrafterYT".toLowerCase());
            Player LDread = Server.getInstance().getPlayerExact("LDread".toLowerCase());
            Player Sculky = Server.getInstance().getPlayerExact("Sculky".toLowerCase());
            Player SMIBII_YT = Server.getInstance().getPlayerExact("SMIBII_YT".toLowerCase());
            Player TOADENATION = Server.getInstance().getPlayerExact("TOADENATION".toLowerCase());
            Player byknax = Server.getInstance().getPlayerExact("byknax".toLowerCase());
            Player exzlTW = Server.getInstance().getPlayerExact("exzlTW".toLowerCase());
            Player Qwuanda = Server.getInstance().getPlayerExact("Qwuanda".toLowerCase());
            Player Jonas_TV5 = Server.getInstance().getPlayerExact("Jonas TV5".toLowerCase());
            Player UltimatePhil794 = Server.getInstance().getPlayerExact("UltimatePhil794".toLowerCase());
            Player Todesbanane1203 = Server.getInstance().getPlayerExact("Todesbanane1203".toLowerCase());
            Player GrafTepid = Server.getInstance().getPlayerExact("GrafTepid".toLowerCase());
            Player LitschiiYT = Server.getInstance().getPlayerExact("LitschiiYT".toLowerCase());
            Player VictorJu4751 = Server.getInstance().getPlayerExact("VictorJu4751".toLowerCase());
            Player NURnyraee = Server.getInstance().getPlayerExact("NURnyraee".toLowerCase());
            Player Djalami007 = Server.getInstance().getPlayerExact("Djalami007".toLowerCase());
            Player Straussiiii = Server.getInstance().getPlayerExact("Straussiiii".toLowerCase());
            Player ytDoomS = Server.getInstance().getPlayerExact("ytDoomS".toLowerCase());
            Player GunmetalNine15 = Server.getInstance().getPlayerExact("GunmetalNine15".toLowerCase());
            Player MetallNatter2 = Server.getInstance().getPlayerExact("MetallNatter2".toLowerCase());
            Player LodgedGuitar93 = Server.getInstance().getPlayerExact("LodgedGuitar93".toLowerCase());
            Player IchB1nE1neB1ene = Server.getInstance().getPlayerExact("IchB1nE1neB1ene".toLowerCase());
            Player FabiDE14 = Server.getInstance().getPlayerExact("FabiDE14".toLowerCase());
            Player BennoMCyt = Server.getInstance().getPlayerExact("BennoMCyt".toLowerCase());
            Player GamilinoMC = Server.getInstance().getPlayerExact("GamilinoMC".toLowerCase());
            Player AreaNull = Server.getInstance().getPlayerExact("AreaNull".toLowerCase());
            Player Ilyco187 = Server.getInstance().getPlayerExact("Ilyco187".toLowerCase());
            Player Linus123455 = Server.getInstance().getPlayerExact("Linus123455".toLowerCase());
            Player DoncaMilloLp = Server.getInstance().getPlayerExact("DoncaMilloLp".toLowerCase());
            Player DanielGamerYt31 = Server.getInstance().getPlayerExact("DanielGamerYt31".toLowerCase());
            Player The_Noah_YT = Server.getInstance().getPlayerExact("The Noah YT".toLowerCase());
            Player DerHeroGamer007 = Server.getInstance().getPlayerExact("DerHeroGamer007".toLowerCase());
            Player ToastbrotGHG = Server.getInstance().getPlayerExact("ToastbrotGHG".toLowerCase());

            if (StaticCache.COUNTDOWN_ACTIVE) {

                if (countdown_s > 0) {
                    countdown_s--;

                    if (countdown_s == 120 || countdown_s == 100 || countdown_s == 60 || countdown_s == 30 || countdown_s == 20 || countdown_s <= 10) {
                        AllOnlinePlayers.sendMessage(creperozelot.prefix + creperozelot.colorize("&a&lIN&2&lSU&r&f Startet in &a" + countdown_s + "&f Sekunden"));
                    } else if (countdown_s == 75) {
                        StaticCache.START_FREZE = true;
                        AllOnlinePlayers.setGamemode(3);
                        AllOnlinePlayers.teleport(fly_1);
                    } else if (countdown_s == 70) {
                        AllOnlinePlayers.teleport(fly_2);
                    } else if (countdown_s == 65) {
                        AllOnlinePlayers.teleport(fly_3);
                    } else if (countdown_s == 59) {
                        AllOnlinePlayers.teleport(fly_4);
                    } else if (countdown_s == 54) {
                        AllOnlinePlayers.teleport(fly_5);
                    } else if (countdown_s == 1) {
                        //TP alle spieler zu SPAWN
                        AllOnlinePlayers.teleport(spawn);
                        AllOnlinePlayers.sendMessage(creperozelot.prefix + creperozelot.colorize("&aWarten das Hoster Befehl zum Teleport giebt..."));
                    }

                } else {
                    StaticCache.START_FREZE = false;
                    StaticCache.COUNTDOWN_ACTIVE = false;
                }
            }
        }
    }

}


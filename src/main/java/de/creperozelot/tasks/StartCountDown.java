package de.creperozelot.tasks;

import cn.nukkit.level.Location;
import de.creperozelot.StaticCache;
import de.creperozelot.creperozelot;
import cn.nukkit.Player;
import cn.nukkit.Server;
import cn.nukkit.scheduler.Task;


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
        
        for (Player AllOnlinePlayers : Server.getInstance().getOnlinePlayers().values()) {

            if (StaticCache.COUNTDOWN_ACTIVE) {

                if (countdown_s == 0) {
                    StaticCache.START_FREZE = false;
                    StaticCache.COUNTDOWN_ACTIVE = false;
                    AllOnlinePlayers.sendMessage(creperozelot.prefix + creperozelot.colorize("&ePVP &fist für heute &cDeaktiviert"));
                }

                if (countdown_s > 0) {
                    countdown_s--;

                    if (countdown_s == 120 || countdown_s == 100 || countdown_s == 60 || countdown_s == 30 || countdown_s == 20 || countdown_s <= 10) {
                        AllOnlinePlayers.sendMessage(creperozelot.prefix + creperozelot.colorize("&a&lIN&2&lSU&r&f Startet in &a" + countdown_s + "&f Sekunden"));
                        AllOnlinePlayers.sendTitle(creperozelot.colorize("&6Insu Startet in &a") + countdown_s + creperozelot.colorize(" &fSekunden"));
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
                    } else if (countdown_s == 15) {
                        //TP Gamemaster
                        player_creperozelot.teleport(spawn);
                        GodVikthor.teleport(spawn);
                        Levi_GPP.teleport(spawn);
                        //TP Players
                        HowLater.teleport(RollLade);
                        JRollylp.teleport(RollLade);
                        GedankeAmeise1.teleport(MallowWasBistDuWiederSoMad);
                        Mxllow1143.teleport(MallowWasBistDuWiederSoMad);
                        Dilonxy.teleport(Darkside);
                        UltraRobbe08.teleport(Darkside);
                        Wabel_Ghost.teleport(Pinkplayer);
                        Greenplayer_Tv.teleport(Pinkplayer);
                        F0ngiMG.teleport(ELEMAO);
                        xF1lmx.teleport(ELEMAO);
                        NeunMatt54321.teleport(DieCoolen);
                        OliverLP5499.teleport(DieCoolen);
                        MaximalFlame.teleport(Vodafone);
                        zeyyco.teleport(Vodafone);
                        KilianCrafterYT.teleport(DerPoleUndDerItaliener);
                        LDread.teleport(L0STYS);
                        Sculky.teleport(L0STYS);
                        SMIBII_YT.teleport(FORRUSSIA);
                        TOADENATION.teleport(FORRUSSIA);
                        Qwuanda.teleport(Qajos);
                        Jonas_TV5.teleport(Qajos);
                        UltimatePhil794.teleport(Eulenfänger);
                        Todesbanane1203.teleport(Eulenfänger);
                        GrafTepid.teleport(Bigbababubatz);
                        LitschiiYT.teleport(Bigbababubatz);
                        VictorJu4751.teleport(DieKrabbelstube);
                        NURnyraee.teleport(DieKrabbelstube);
                        Djalami007.teleport(SAO);
                        Straussiiii.teleport(SAO);
                        ytDoomS.teleport(randomteam);
                        GunmetalNine15.teleport(randomteam);
                        MetallNatter2.teleport(Heheheha);
                        LodgedGuitar93.teleport(Heheheha);
                        IchB1nE1neB1ene.teleport(Ingodingos);
                        FabiDE14.teleport(Ingodingos);
                        BennoMCyt.teleport(GamilinoUndBenno);
                        GamilinoMC.teleport(GamilinoUndBenno);
                        AreaNull.teleport(Tam_Plums);
                        Ilyco187.teleport(Tam_Plums);
                        Linus123455.teleport(KeineAhnung);
                        DoncaMilloLp.teleport(KeineAhnung);
                        DanielGamerYt31.teleport(Gamatisch);
                        The_Noah_YT.teleport(AmogUsIstBesserAlsValo);
                        DerHeroGamer007.teleport(AmogUsIstBesserAlsValo);
                        zPqndaFNA.teleport(NoYTRank);
                        vamiiz.teleport(NoYTRank);
                        ToastbrotGHG.teleport(tutti_frutti);

                        AllOnlinePlayers.setGamemode(Player.SURVIVAL);
                    }

                }
            }
        }
    }

}


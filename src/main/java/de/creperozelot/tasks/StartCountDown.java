package de.creperozelot.tasks;

import cn.nukkit.level.Level;
import cn.nukkit.level.Location;
import cn.nukkit.level.Sound;
import de.creperozelot.StaticCache;
import de.creperozelot.creperozelot;
import cn.nukkit.Player;
import cn.nukkit.Server;
import cn.nukkit.scheduler.Task;

import java.util.concurrent.TimeUnit;


public class StartCountDown extends Task {

    int countdown_s = 120;


    @Override
    public void onRun(int i) {

        //PLayer Variables
        Player player_creperozelot = Server.getInstance().getPlayerExact("creperozelot");
        Player GodVikthor = Server.getInstance().getPlayerExact("GodVikthor");
        Player Levi_GPP = Server.getInstance().getPlayerExact("Levi_GPP");
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
        Player Sculky = Server.getInstance().getPlayerExact("Sculky");
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
        Player CuzImQuit = Server.getInstance().getPlayerExact("CuzImQuit");
        Player DerHeroGamer007 = Server.getInstance().getPlayerExact("DerHeroGamer007");
        Player ToastbrotGHG = Server.getInstance().getPlayerExact("ToastbrotGHG");
        Player zPqndaFNA = Server.getInstance().getPlayerExact("zPqndaFNA");
        Player vamiiz = Server.getInstance().getPlayerExact("vamiiz");
        Player zCrxyy = Server.getInstance().getPlayerExact("zCrxyy");
        Player F3yson_HD = Server.getInstance().getPlayerExact("F3yson HD");
        Player RealSertrix = Server.getInstance().getPlayerExact("RealSertrix");
        Player Connorbryan14 = Server.getInstance().getPlayerExact("Connorbryan14");


        if (StaticCache.COUNTDOWN_ACTIVE) {

            if (countdown_s == 0) {
                StaticCache.START_FREZE = false;
                StaticCache.COUNTDOWN_ACTIVE = false;
                for (Player AllOnlinePlayers : Server.getInstance().getOnlinePlayers().values()) {
                    AllOnlinePlayers.sendMessage(creperozelot.prefix + creperozelot.colorize("&ePVP &fist für heute &cDeaktiviert"));
                }
            }

            if (countdown_s > 0) {

                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                countdown_s--;
                Level level = player_creperozelot.getLevel();
                Location fly_1 = new Location(-28, 173, -89, 1.0, 1.0);
                Location fly_2 = new Location(-139, 117, 300);
                Location fly_3 = new Location(-294, 142, -78);
                Location fly_4 = new Location(-125, 100, 116);
                Location fly_5 = new Location(102, 83, 155);
                Location spawn = new Location(126, level.getHighestBlockAt(126, -197) , -197);
                Location RollLade = new Location(-224, 63, 301);
                Location saftig = new Location(293, 63, -319);
                Location Darkside = new Location(-321, 63, -273);
                Location Pinkplayer = new Location(345, 63, -51);
                Location ELEMAO = new Location(-90, 189, -44);
                Location DieCoolen = new Location(100, 63, -7);
                Location DerPoleUndDerItaliener = new Location(127, 63, -347);
                Location L0STYS = new Location(-440, 63, -72);
                Location FORRUSSIA = new Location(126, 63, -197);
                Location Quajos = new Location(-149, 150, -79);
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
                Location CrazyFazxn = new Location(266, 63, -77);
                Location Kings = new Location(-311, 63, 117);

                if (countdown_s == 120 || countdown_s == 100 || countdown_s == 60 || countdown_s == 30 || countdown_s == 20 || countdown_s <= 10) {
                    Server.getInstance().broadcastMessage(creperozelot.prefix + creperozelot.colorize("&a&lIN&2&lSU&r&f Startet in &a" + countdown_s + "&f Sekunden"));
                    for (Player AllOnlinePlayers : Server.getInstance().getOnlinePlayers().values()) {
                        AllOnlinePlayers.sendTitle(creperozelot.colorize("&6Insu Startet in &a") + countdown_s + creperozelot.colorize(" &fSekunden"));
                    }
                } else if (countdown_s == 75) {
                    StaticCache.START_FREZE = true;
                    for (Player AllOnlinePlayers : Server.getInstance().getOnlinePlayers().values()) {
                        AllOnlinePlayers.setGamemode(3);
                        AllOnlinePlayers.teleport(fly_1);
                    }
                } else if (countdown_s == 70) {
                    for (Player AllOnlinePlayers : Server.getInstance().getOnlinePlayers().values()) {
                        AllOnlinePlayers.teleport(fly_2);
                    }
                } else if (countdown_s == 65) {
                    for (Player AllOnlinePlayers : Server.getInstance().getOnlinePlayers().values()) {
                        AllOnlinePlayers.teleport(fly_3);
                    }
                } else if (countdown_s == 59) {
                    for (Player AllOnlinePlayers : Server.getInstance().getOnlinePlayers().values()) {
                        AllOnlinePlayers.teleport(fly_4);
                    }
                } else if (countdown_s == 54) {
                    for (Player AllOnlinePlayers : Server.getInstance().getOnlinePlayers().values()) {
                        AllOnlinePlayers.teleport(fly_5);
                    }
                } else if (countdown_s == 15) {
                    //TP Gamemaster
                    if (!(player_creperozelot == null)) {
                        player_creperozelot.teleport(spawn);
                    }

                    if (!(GodVikthor == null)) {
                        GodVikthor.teleport(spawn);
                    }

                    if (!(Levi_GPP == null)) {
                        Levi_GPP.teleport(spawn);
                    }

                    if (!(Connorbryan14 == null)) {
                        Connorbryan14.teleport(spawn);
                    }

                    //TP Players
                    if (!(HowLater == null)) {
                        HowLater.teleport(RollLade);
                        creperozelot.getInstance().getConfig().set("HowLater", false);
                    }
                    if (!(JRollylp == null)) {
                        JRollylp.teleport(RollLade);
                        creperozelot.getInstance().getConfig().set("JRollylp", false);
                    }
                    if (!(TomatensaftPUR == null)) {
                        TomatensaftPUR.teleport(saftig);
                        creperozelot.getInstance().getConfig().set("TomatensaftPUR", false);
                    }
                    if (!(ApfelsaftPUR == null)) {
                        ApfelsaftPUR.teleport(saftig);
                        creperozelot.getInstance().getConfig().set("ApfelsaftPUR", false);
                    }
                    if (!(Dilonxy == null)) {
                        Dilonxy.teleport(Darkside);
                        creperozelot.getInstance().getConfig().set("Dilonxy", false);
                    }
                    if (!(UltraRobbe08 == null)) {
                        UltraRobbe08.teleport(Darkside);
                        creperozelot.getInstance().getConfig().set("UltraRobbe08", false);
                    }
                    if (!(Wabel_Ghost == null)) {
                        Wabel_Ghost.teleport(Pinkplayer);
                        creperozelot.getInstance().getConfig().set("Wabel_Ghost", false);
                    }
                    if (!(Greenplayer_Tv == null)) {
                        Greenplayer_Tv.teleport(Pinkplayer);
                        creperozelot.getInstance().getConfig().set("Greenplayer_Tv", false);
                    }
                    if (!(F0ngiMG == null)) {
                        F0ngiMG.teleport(ELEMAO);
                        creperozelot.getInstance().getConfig().set("F0ngiMG", false);
                    }
                    if (!(xF1lmx == null)) {
                        xF1lmx.teleport(ELEMAO);
                        creperozelot.getInstance().getConfig().set("xF1lmx", false);
                    }
                    if (!(NeunMatt54321 == null)) {
                        NeunMatt54321.teleport(DieCoolen);
                        creperozelot.getInstance().getConfig().set("NeunMatt54321", false);
                    }
                    if (!(OliverLP5499 == null)) {
                        OliverLP5499.teleport(DieCoolen);
                        creperozelot.getInstance().getConfig().set("OliverLP5499", false);
                    }
                    if (!(MaximalFlame == null)) {
                        MaximalFlame.teleport(Kings);
                        creperozelot.getInstance().getConfig().set("MaximalFlame", false);
                    }
                    if (!(MotteBlatt18479 == null)) {
                        MotteBlatt18479.teleport(Kings);
                        creperozelot.getInstance().getConfig().set("MotteBlatt18479", false);
                    }
                    if (!(KilianCrafterYT == null)) {
                        KilianCrafterYT.teleport(DerPoleUndDerItaliener);
                        creperozelot.getInstance().getConfig().set("KilianCrafterYT", false);
                    }
                    if (!(LDread == null)) {
                        LDread.teleport(L0STYS);
                        creperozelot.getInstance().getConfig().set("LDread", false);
                    }
                    if (!(Sculky == null)) {
                        Sculky.teleport(L0STYS);
                        creperozelot.getInstance().getConfig().set("Sculky", false);
                    }
                    if (!(SMIBII_YT == null)) {
                        SMIBII_YT.teleport(FORRUSSIA);
                        creperozelot.getInstance().getConfig().set("SMIBII_YT", false);
                    }
                    if (!(ToadenationNr1 == null)) {
                        ToadenationNr1.teleport(FORRUSSIA);
                        creperozelot.getInstance().getConfig().set("ToadenationNr1", false);
                    }
                    if (!(Qwuanda == null)) {
                        Qwuanda.teleport(Quajos);
                        creperozelot.getInstance().getConfig().set("Qwuanda", false);
                    }
                    if (!(Jonas_TV5 == null)) {
                        Jonas_TV5.teleport(Quajos);
                        creperozelot.getInstance().getConfig().set("Jonas_TV5", false);
                    }
                    if (!(UltimatePhil794 == null)) {
                        UltimatePhil794.teleport(Eulenfänger);
                        creperozelot.getInstance().getConfig().set("UltimatePhil794", false);
                    }
                    if (!(Todesbanane1203 == null)) {
                        Todesbanane1203.teleport(Eulenfänger);
                        creperozelot.getInstance().getConfig().set("Todesbanane1203", false);
                    }
                    if (!(GrafTepid == null)) {
                        GrafTepid.teleport(Bigbababubatz);
                        creperozelot.getInstance().getConfig().set("GrafTepid", false);
                    }
                    if (!(LitschiiYT == null)) {
                        LitschiiYT.teleport(Bigbababubatz);
                        creperozelot.getInstance().getConfig().set("LitschiiYT", false);
                    }
                    if (!(VictorJu4751 == null)) {
                        VictorJu4751.teleport(DieKrabbelstube);
                        creperozelot.getInstance().getConfig().set("VictorJu4751", false);
                    }
                    if (!(NURnyraee == null)) {
                        NURnyraee.teleport(DieKrabbelstube);
                        creperozelot.getInstance().getConfig().set("NURnyraee", false);
                    }
                    if (!(Djalami007 == null)) {
                        Djalami007.teleport(SAO);
                        creperozelot.getInstance().getConfig().set("Djalami007", false);
                    }
                    if (!(Straussiiii == null)) {
                        Straussiiii.teleport(SAO);
                        creperozelot.getInstance().getConfig().set("Straussiiii", false);
                    }
                    if (!(ytDoomS == null)) {
                        ytDoomS.teleport(randomteam);
                        creperozelot.getInstance().getConfig().set("ytDoomS", false);
                    }
                    if (!(GunmetalNine15 == null)) {
                        GunmetalNine15.teleport(randomteam);
                        creperozelot.getInstance().getConfig().set("GunmetalNine15", false);
                    }
                    if (!(MetallNatter2 == null)) {
                        MetallNatter2.teleport(Heheheha);
                        creperozelot.getInstance().getConfig().set("MetallNatter2", false);
                    }
                    if (!(LodgedGuitar93 == null)) {
                        LodgedGuitar93.teleport(Heheheha);
                        creperozelot.getInstance().getConfig().set("LodgedGuitar93", false);
                    }
                    if (!(BeecraftBE == null)) {
                        BeecraftBE.teleport(Ingodingos);
                        creperozelot.getInstance().getConfig().set("BeecraftBE", false);
                    }
                    if (!(FabiDE14 == null)) {
                        FabiDE14.teleport(Ingodingos);
                        creperozelot.getInstance().getConfig().set("FabiDE14", false);
                    }
                    if (!(BennoMCyt == null)) {
                        BennoMCyt.teleport(GamilinoUndBenno);
                        creperozelot.getInstance().getConfig().set("BennoMCyt", false);
                    }
                    if (!(AreaNull == null)) {
                        AreaNull.teleport(Tam_Plums);
                        creperozelot.getInstance().getConfig().set("AreaNull", false);
                    }
                    if (!(Ilyco187 == null)) {
                        Ilyco187.teleport(Tam_Plums);
                        creperozelot.getInstance().getConfig().set("Ilyco187", false);
                    }
                    if (!(Linus123455 == null)) {
                        Linus123455.teleport(KeineAhnung);
                        creperozelot.getInstance().getConfig().set("Linus123455", false);
                    }
                    if (!(DoncaMilloLp == null)) {
                        DoncaMilloLp.teleport(KeineAhnung);
                        creperozelot.getInstance().getConfig().set("DoncaMilloLP", false);
                    }
                    if (!(DanielGamerYt31 == null)) {
                        DanielGamerYt31.teleport(Gamatisch);
                        creperozelot.getInstance().getConfig().set("DanielGamertYt31", false);
                    }
                    if (!(RealSertrix == null)) {
                        RealSertrix.teleport(Gamatisch);
                        creperozelot.getInstance().getConfig().set("RealSertrix", false);
                    }
                    if (!(CuzImQuit == null)) {
                        CuzImQuit.teleport(AmogUsIstBesserAlsValo);
                        creperozelot.getInstance().getConfig().set("CuzImQuit", false);
                    }
                    if (!(DerHeroGamer007 == null)) {
                        DerHeroGamer007.teleport(AmogUsIstBesserAlsValo);
                        creperozelot.getInstance().getConfig().set("DerHeroGamer007", false);
                    }
                    if (!(zPqndaFNA == null)) {
                        zPqndaFNA.teleport(NoYTRank);
                        creperozelot.getInstance().getConfig().set("zPqndaFNA", false);
                    }
                    if (!(vamiiz == null)) {
                        vamiiz.teleport(NoYTRank);
                        creperozelot.getInstance().getConfig().set("vamiiz", false);
                    }
                    if (!(ToastbrotGHG == null)) {
                        ToastbrotGHG.teleport(tutti_frutti);
                        creperozelot.getInstance().getConfig().set("ToastbrotGHG", false);
                    }
                    if (!(zCrxyy == null)) {
                        zCrxyy.teleport(CrazyFazxn);
                        creperozelot.getInstance().getConfig().set("zCrxyy", false);
                    }
                    if (!(F3yson_HD == null)) {
                        F3yson_HD.teleport(CrazyFazxn);
                        creperozelot.getInstance().getConfig().set("F3yson_HD", false);
                    }

                    creperozelot.getInstance().getConfig().save();

                    for (Player AllOnlinePlayers : Server.getInstance().getOnlinePlayers().values()) {
                        AllOnlinePlayers.setGamemode(0);
                    }
                }

            }
        }
    }

}


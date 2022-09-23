package de.creperozelot.listener;

import cn.nukkit.Player;
import cn.nukkit.Server;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerMoveEvent;
import de.creperozelot.creperozelot;

public class TeamLiveListener implements Listener {

    @EventHandler
    public void onMove(PlayerMoveEvent event) {
        //PLayer Variables
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
        Player LDread = Server.getInstance().getPlayerExact("LDread");
        Player sculky4741 = Server.getInstance().getPlayerExact("sculky4741");
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
        Player BeecraftBE = Server.getInstance().getPlayerExact("BeecraftBE");
        Player FabiDE14 = Server.getInstance().getPlayerExact("FabiDE14");
        Player BennoMCyt = Server.getInstance().getPlayerExact("BennoMCyt");
        Player GamilinoMC = Server.getInstance().getPlayerExact("GamilinoMC");
        Player AreaNull = Server.getInstance().getPlayerExact("AreaNull");
        Player Ilyco187 = Server.getInstance().getPlayerExact("Ilyco187");
        Player Linus123455 = Server.getInstance().getPlayerExact("Linus123455");
        Player DoncaMilloLp = Server.getInstance().getPlayerExact("DoncaMilloLp");
        Player The_Noah_YT = Server.getInstance().getPlayerExact("The Noah YT");
        Player DerHeroGamer007 = Server.getInstance().getPlayerExact("DerHeroGamer007");
        Player zPqndaFNA = Server.getInstance().getPlayerExact("zPqndaFNA");
        Player vamiiz = Server.getInstance().getPlayerExact("vamiiz");
        Player F3yson_HD = Server.getInstance().getPlayerExact("F3yson HD");
        Player zCrxyy = Server.getInstance().getPlayerExact("zCrxyy");
        Player player = event.getPlayer();

        if (creperozelot.getInstance().getConfig().getBoolean("Start")) {
            //Zeigt Teammates Leben an
            if (player.getName().equalsIgnoreCase("HowLater")) ;
            {
                player.sendActionBar(creperozelot.colorize(creperozelot.colorize("&c&lLeben von deinem Teammate ist " + JRollylp.getHealth())));
            }

            if (player.getName().equalsIgnoreCase("JRollylp")) ;
            {
                player.sendActionBar(creperozelot.colorize(creperozelot.colorize("&c&lLeben von deinem Teammate ist &4" + HowLater.getHealth())));
            }

            if (player.getName().equalsIgnoreCase("GedankeAmeise1")) ;
            {
                player.sendActionBar(creperozelot.colorize(creperozelot.colorize("&c&lLeben von deinem Teammate ist &4" + Mxllow1143.getHealth())));
            }

            if (player.getName().equalsIgnoreCase("Mxllow1143")) ;
            {
                player.sendActionBar(creperozelot.colorize(creperozelot.colorize("&c&lLeben von deinem Teammate ist &4" + GedankeAmeise1.getHealth())));
            }

            if (player.getName().equalsIgnoreCase("UltraRobbe08")) ;
            {
                player.sendActionBar(creperozelot.colorize(creperozelot.colorize("&c&lLeben von deinem Teammate ist &4" + Dilonxy.getHealth())));
            }

            if (player.getName().equalsIgnoreCase("Dilonxy")) ;
            {
                player.sendActionBar(creperozelot.colorize(creperozelot.colorize("&c&lLeben von deinem Teammate ist &4" + UltraRobbe08.getHealth())));
            }

            if (player.getName().equalsIgnoreCase("Wabel Ghost")) ;
            {
                player.sendActionBar(creperozelot.colorize(creperozelot.colorize("&c&lLeben von deinem Teammate ist &4" + Greenplayer_Tv.getHealth())));
            }

            if (player.getName().equalsIgnoreCase("Greenplayer Tv")) ;
            {
                player.sendActionBar(creperozelot.colorize(creperozelot.colorize("&c&lLeben von deinem Teammate ist &4" + Wabel_Ghost.getHealth())));
            }

            if (player.getName().equalsIgnoreCase("F0ngiMG")) ;
            {
                player.sendActionBar(creperozelot.colorize(creperozelot.colorize("&c&lLeben von deinem Teammate ist &4" + xF1lmx.getHealth())));
            }

            if (player.getName().equalsIgnoreCase("xF1lmx")) ;
            {
                player.sendActionBar(creperozelot.colorize(creperozelot.colorize("&c&lLeben von deinem Teammate ist &4" + F0ngiMG.getHealth())));
            }

            if (player.getName().equalsIgnoreCase("NeunMatt54321")) ;
            {
                player.sendActionBar(creperozelot.colorize(creperozelot.colorize("&c&lLeben von deinem Teammate ist &4" + OliverLP5499.getHealth())));
            }

            if (player.getName().equalsIgnoreCase("OliverLP5499")) ;
            {
                player.sendActionBar(creperozelot.colorize(creperozelot.colorize("&c&lLeben von deinem Teammate ist &4" + NeunMatt54321.getHealth())));
            }

            if (player.getName().equalsIgnoreCase("MaximalFlame")) ;
            {
                player.sendActionBar(creperozelot.colorize(creperozelot.colorize("&c&lLeben von deinem Teammate ist &4" + zeyyco.getHealth())));
            }

            if (player.getName().equalsIgnoreCase("zeyyco")) ;
            {
                player.sendActionBar(creperozelot.colorize(creperozelot.colorize("&c&lLeben von deinem Teammate ist &4" + MaximalFlame.getHealth())));
            }

            if (player.getName().equalsIgnoreCase("KilianCrafterYT")) ;
            {
                player.sendActionBar(creperozelot.colorize(creperozelot.colorize("&a&l Dir wurde kein Teammate zugewiesen...")));
            }

            if (player.getName().equalsIgnoreCase("LDread")) ;
            {
                player.sendActionBar(creperozelot.colorize(creperozelot.colorize("&c&lLeben von deinem Teammate ist &4" + sculky4741.getHealth())));
            }

            if (player.getName().equalsIgnoreCase("sculky4741")) ;
            {
                player.sendActionBar(creperozelot.colorize(creperozelot.colorize("&c&lLeben von deinem Teammate ist &4" + LDread.getHealth())));
            }

            if (player.getName().equalsIgnoreCase("SMIBII_YT")) ;
            {
                player.sendActionBar(creperozelot.colorize(creperozelot.colorize("&c&lLeben von deinem Teammate ist &4" + TOADENATION.getHealth())));
            }

            if (player.getName().equalsIgnoreCase("TOADENATION")) ;
            {
                player.sendActionBar(creperozelot.colorize(creperozelot.colorize("&c&lLeben von deinem Teammate ist &4" + SMIBII_YT.getHealth())));
            }

            if (player.getName().equalsIgnoreCase("UltimatePhil794")) ;
            {
                player.sendActionBar(creperozelot.colorize(creperozelot.colorize("&c&lLeben von deinem Teammate ist &4" + Todesbanane1203.getHealth())));
            }

            if (player.getName().equalsIgnoreCase("Todesbanane1203")) ;
            {
                player.sendActionBar(creperozelot.colorize(creperozelot.colorize("&c&lLeben von deinem Teammate ist &4" + UltimatePhil794.getHealth())));
            }

            if (player.getName().equalsIgnoreCase("GrafTepid")) ;
            {
                player.sendActionBar(creperozelot.colorize(creperozelot.colorize("&c&lLeben von deinem Teammate ist &4" + LitschiiYT.getHealth())));
            }

            if (player.getName().equalsIgnoreCase("LitschiiYT")) ;
            {
                player.sendActionBar(creperozelot.colorize(creperozelot.colorize("&c&lLeben von deinem Teammate ist &4" + GrafTepid.getHealth())));
            }

            if (player.getName().equalsIgnoreCase("VictorJu4751")) ;
            {
                player.sendActionBar(creperozelot.colorize(creperozelot.colorize("&c&lLeben von deinem Teammate ist &4" + NURnyraee.getHealth())));
            }

            if (player.getName().equalsIgnoreCase("NURnyraee")) ;
            {
                player.sendActionBar(creperozelot.colorize(creperozelot.colorize("&c&lLeben von deinem Teammate ist &4" + VictorJu4751.getHealth())));
            }

            if (player.getName().equalsIgnoreCase("Djalami007")) ;
            {
                player.sendActionBar(creperozelot.colorize(creperozelot.colorize("&c&lLeben von deinem Teammate ist &4" + Straussiiii.getHealth())));
            }

            if (player.getName().equalsIgnoreCase("Straussiiii")) ;
            {
                player.sendActionBar(creperozelot.colorize(creperozelot.colorize("&c&lLeben von deinem Teammate ist &4" + Djalami007.getHealth())));
            }

            if (player.getName().equalsIgnoreCase("ytDoomS")) ;
            {
                player.sendActionBar(creperozelot.colorize(creperozelot.colorize("&c&lLeben von deinem Teammate ist &4" + GunmetalNine15.getHealth())));
            }

            if (player.getName().equalsIgnoreCase("GunmetalNine15")) ;
            {
                player.sendActionBar(creperozelot.colorize(creperozelot.colorize("&c&lLeben von deinem Teammate ist &4" + ytDoomS.getHealth())));
            }

            if (player.getName().equalsIgnoreCase("MetallNatter2")) ;
            {
                player.sendActionBar(creperozelot.colorize(creperozelot.colorize("&c&lLeben von deinem Teammate ist &4" + LodgedGuitar93.getHealth())));
            }

            if (player.getName().equalsIgnoreCase("LodgedGuitar93")) ;
            {
                player.sendActionBar(creperozelot.colorize(creperozelot.colorize("&c&lLeben von deinem Teammate ist &4" + MetallNatter2.getHealth())));
            }

            if (player.getName().equalsIgnoreCase("BeecraftBE")) ;
            {
                player.sendActionBar(creperozelot.colorize(creperozelot.colorize("&c&lLeben von deinem Teammate ist &4" + FabiDE14.getHealth())));
            }

            if (player.getName().equalsIgnoreCase("FabiDE14")) ;
            {
                player.sendActionBar(creperozelot.colorize(creperozelot.colorize("&c&lLeben von deinem Teammate ist &4" + BeecraftBE.getHealth())));
            }

            if (player.getName().equalsIgnoreCase("BennoMCyt")) ;
            {
                player.sendActionBar(creperozelot.colorize(creperozelot.colorize("&c&lLeben von deinem Teammate ist &4" + GamilinoMC.getHealth())));
            }

            if (player.getName().equalsIgnoreCase("GamilinoMC")) ;
            {
                player.sendActionBar(creperozelot.colorize(creperozelot.colorize("&c&lLeben von deinem Teammate ist &4" + BennoMCyt.getHealth())));
            }

            if (player.getName().equalsIgnoreCase("AreaNull")) ;
            {
                player.sendActionBar(creperozelot.colorize(creperozelot.colorize("&c&lLeben von deinem Teammate ist &4" + Ilyco187.getHealth())));
            }

            if (player.getName().equalsIgnoreCase("Ilyco187")) ;
            {
                player.sendActionBar(creperozelot.colorize(creperozelot.colorize("&c&lLeben von deinem Teammate ist &4" + AreaNull.getHealth())));
            }

            if (player.getName().equalsIgnoreCase("Linus123455")) ;
            {
                player.sendActionBar(creperozelot.colorize(creperozelot.colorize("&c&lLeben von deinem Teammate ist &4" + DoncaMilloLp.getHealth())));
            }

            if (player.getName().equalsIgnoreCase("DoncaMilloLp")) ;
            {
                player.sendActionBar(creperozelot.colorize(creperozelot.colorize("&c&lLeben von deinem Teammate ist &4" + Linus123455.getHealth())));
            }

            if (player.getName().equalsIgnoreCase("DanielGamerYt31")) ;
            {
                player.sendActionBar(creperozelot.colorize(creperozelot.colorize("&a&l Dir wurde kein Teammate zugewiesen...")));
            }

            if (player.getName().equalsIgnoreCase("The Noah YT")) ;
            {
                player.sendActionBar(creperozelot.colorize(creperozelot.colorize("&c&lLeben von deinem Teammate ist &4" + DerHeroGamer007.getHealth())));
            }

            if (player.getName().equalsIgnoreCase("DerHeroGamer007")) ;
            {
                player.sendActionBar(creperozelot.colorize(creperozelot.colorize("&c&lLeben von deinem Teammate ist &4" + The_Noah_YT.getHealth())));
            }

            if (player.getName().equalsIgnoreCase("zPqndaFNA")) ;
            {
                player.sendActionBar(creperozelot.colorize(creperozelot.colorize("&c&lLeben von deinem Teammate ist &4" + vamiiz.getHealth())));
            }

            if (player.getName().equalsIgnoreCase("vamiiz")) ;
            {
                player.sendActionBar(creperozelot.colorize(creperozelot.colorize("&c&lLeben von deinem Teammate ist &4" + zPqndaFNA.getHealth())));
            }

            if (player.getName().equalsIgnoreCase("ToastbrotGHG")) ;
            {
                player.sendActionBar(creperozelot.colorize(creperozelot.colorize("&a&l Dir wurde kein Teammate zugewiesen...")));
            }

            if (player.getName().equalsIgnoreCase("F3yson HD")) ;
            {
                player.sendActionBar(creperozelot.colorize(creperozelot.colorize("&c&lLeben von deinem Teammate ist &4" + zCrxyy.getHealth())));
            }

            if (player.getName().equalsIgnoreCase("zCrxyy")) ;
            {
                player.sendActionBar(creperozelot.colorize(creperozelot.colorize("&c&lLeben von deinem Teammate ist &4" + F3yson_HD.getHealth())));
            }

            if (player.getName().equalsIgnoreCase("Jonas TV5")) ;
            {
                player.sendActionBar(creperozelot.colorize(creperozelot.colorize("&c&lLeben von deinem Teammate ist &4" + Qwuanda.getHealth())));
            }

            if (player.getName().equalsIgnoreCase("Qwuanda")) ;
            {
                player.sendActionBar(creperozelot.colorize(creperozelot.colorize("&c&lLeben von deinem Teammate ist &4" + Jonas_TV5.getHealth())));
            }
        }
    }

}


package de.creperozelot.listener;

import cn.nukkit.Player;
import cn.nukkit.Server;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerMoveEvent;
import de.creperozelot.creperozelot;

public class TeamLiveListener implements Listener {

    private final creperozelot plugin;

    public TeamLiveListener(creperozelot plugin) {
        this.plugin = plugin;
    }

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
        Player player = event.getPlayer();

        if (creperozelot.getInstance().getConfig().getBoolean("Start")) {
            //Zeigt Teammates Leben an
            if (player.getName().equalsIgnoreCase("sHowLater")); {
             player.sendActionBar(creperozelot.colorize(creperozelot.colorize("&c&lLeben von deinem Teammate ist " + JRollylp.getHealth())));
            }

            if (player.getName().equalsIgnoreCase("JRollylp")); {
                player.sendActionBar(creperozelot.colorize(creperozelot.colorize("&c&lLeben von deinem Teammate ist &4" + HowLater.getHealth())));
            }

            }
        }
    }


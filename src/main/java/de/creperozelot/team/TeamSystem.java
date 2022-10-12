package de.creperozelot.team;

import de.creperozelot.creperozelot;

import cn.nukkit.Player;

public class TeamSystem {

    //set gamemaster

    public void setTeam(Player player) {
        //copy start
        if (player.getName().equalsIgnoreCase("creperozelot")) {
            player.setNameTag(creperozelot.colorize("&bDeveloper&7 x &f" + player.getName()));
                            player.sendMessage((creperozelot.prefix + "&aDu bist im Team &4GameMaster &a und &bDeveloper"));
        //copy end
        } else if (player.getName().equalsIgnoreCase("TOADENATION")) {
            player.setNameTag(creperozelot.colorize("&eGameMaster&7 x &f") + player.getName());
                            player.sendMessage(creperozelot.prefix + "&aDu bist im Team &eGameMaster");
        } else if (player.getName().equalsIgnoreCase("GodVikthor")) {
            player.setNameTag(creperozelot.colorize("&4GameMaster&7 x &f") + player.getName());
                            player.sendMessage(creperozelot.prefix + "&aDu bist im Team &4GameMaster");
        } else if (player.getName().equalsIgnoreCase("Levi GPP")) {
            player.setNameTag(creperozelot.colorize("&4GameMaster&7 x &f") + player.getName());
                     player.sendMessage(creperozelot.prefix + "&aDu bist im Team &4GameMaster");
        } else if (player.getName().equalsIgnoreCase("Connorbryan14")) {
            player.setNameTag(creperozelot.colorize("&4GameMaster&7 x &f") + player.getName());
                  player.sendMessage(creperozelot.prefix + "&aDu bist im Team &4GameMaster");
        }
    }

    //set team names


    public static String getTeam(Player player) {
        String team = "";
        if (player.getName().equalsIgnoreCase("HowLater")) {
            team = "RollLade";
        } else if (player.getName().equalsIgnoreCase("JRollylp")) {
            team = "RollLade";
        } else if (player.getName().equalsIgnoreCase("GedankeAmeise1")) {
            team = "MallowWasBistDuWiederSoMad";
        } else if (player.getName().equalsIgnoreCase("Mxllow1143")) {
            team = "MallowWasBistDuWiederSoMad";
        } else if (player.getName().equalsIgnoreCase("Dilonxy")) {
            team = "#Darkside\n";
        } else if (player.getName().equalsIgnoreCase("UltraRobbe08")) {
            team = "#Darkside";
        } else if (player.getName().equalsIgnoreCase("Wabel Ghost")) {
            team = "Pinkplayer";
        } else if (player.getName().equalsIgnoreCase("Greenplayer Tv")) {
            team = "Pinkplayer";
        } else if (player.getName().equalsIgnoreCase("F0ngiMG")) {
            team = "ELEMAO";
        } else if (player.getName().equalsIgnoreCase("xF1lmx")) {
            team = "ELEMAO";
        } else if (player.getName().equalsIgnoreCase("NeunMatt54321")) {
            team = "DieCoolen";
        } else if (player.getName().equalsIgnoreCase("OliverLP5499")) {
            team = "DieCoolen";
        } else if (player.getName().equalsIgnoreCase("MaximalFlame")) {
            team = "#Vodafone";
        } else if (player.getName().equalsIgnoreCase("zeyyco")) {
            team = "#Vodafone";
        } else if (player.getName().equalsIgnoreCase("KilianCrafterYT")) {
            team = "DerPoleUndDerItaliener";
        } else if (player.getName().equalsIgnoreCase("LDread")) {
            team = "ELEMAO";
        } else if (player.getName().equalsIgnoreCase("Sculky")) {
            team = "ELEMAO";
        } else if (player.getName().equalsIgnoreCase("SMIBII_YT")) {
            team = "FORRUSSIA";
        } else if (player.getName().equalsIgnoreCase("TOADENATION")) {
            team = "FORRUSSIA";
        } else if (player.getName().equalsIgnoreCase("byknax")) {
            team = "Tittenfreunde";
        } else if (player.getName().equalsIgnoreCase("exzlTW")) {
            team = "Tittenfreunde";
        } else if (player.getName().equalsIgnoreCase("Qwuanda")) {
            team = "Qajos";
        } else if (player.getName().equalsIgnoreCase("Jonas TV5")) {
            team = "Qajos";
        } else if (player.getName().equalsIgnoreCase("UltimatePhil794")) {
            team = "Eulenfänger";
        } else if (player.getName().equalsIgnoreCase("Todesbanane1203")) {
            team = "Eulenfänger";
        } else if (player.getName().equalsIgnoreCase("GrafTepid")) {
            team = "Bigbababubatz";
        } else if (player.getName().equalsIgnoreCase("LitschiiYT")) {
            team = "Bigbababubatz";
        } else if (player.getName().equalsIgnoreCase("VictorJu4751")) {
            team = "DieKrabbelstube";
        } else if (player.getName().equalsIgnoreCase("NURnyraee")) {
            team = "DieKrabbelstube";
        } else if (player.getName().equalsIgnoreCase("Djalami007")) {
            team = "SAO";
        } else if (player.getName().equalsIgnoreCase("Straussiiii")) {
            team = "SAO";
        } else if (player.getName().equalsIgnoreCase("ytDoomS")) {
            team = "#randomteam";
        } else if (player.getName().equalsIgnoreCase("GunmetalNine15")) {
            team = "#randomteam";
        } else if (player.getName().equalsIgnoreCase("MetallNatter2")) {
            team = "Heheheha";
        } else if (player.getName().equalsIgnoreCase("LodgedGuitar93")) {
            team = "Heheheha";
        } else if (player.getName().equalsIgnoreCase("IchB1nE1neB1ene")) {
            team = "#Ingodingos";
        } else if (player.getName().equalsIgnoreCase("FabiDE14")) {
            team = "#Ingodingos";
        } else if (player.getName().equalsIgnoreCase("BennoMCyt")) {
            team = "GamilinoUndBenno";
        } else if (player.getName().equalsIgnoreCase("GamilinoMC")) {
            team = "GamilinoUndBenno";
        } else if (player.getName().equalsIgnoreCase("AreaNull")) {
            team = "Plums";
        } else if (player.getName().equalsIgnoreCase("Ilyco187")) {
            team = "Plums";
        } else if (player.getName().equalsIgnoreCase("Linus123455")) {
            team = "KeineAhnung";
        } else if (player.getName().equalsIgnoreCase("DoncaMilloLp")) {
            team = "KeineAhnung";
        } else if (player.getName().equalsIgnoreCase("DanielGamerYt31")) {
            team = "Gamatisch";
        } else if (player.getName().equalsIgnoreCase("The Noah YT")) {
            team = "#AmogUsIstBesserAlsValo";
        } else if (player.getName().equalsIgnoreCase("DerHeroGamer007")) {
            team = "#AmogUsIstBesserAlsValo";
        } else if (player.getName().equalsIgnoreCase("ToastbrotGHG")) {
            team = "tutti frutti";
        }
        return team;
    }

}

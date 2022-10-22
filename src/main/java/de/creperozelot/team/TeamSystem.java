package de.creperozelot.team;

import de.creperozelot.creperozelot;

import cn.nukkit.Player;

public class TeamSystem {

    //set gamemaster

    public void setTeam(Player player) {
        //copy start
        if (player.getName().equalsIgnoreCase("creperozelot")) {
            player.setNameTag(creperozelot.colorize("&bDeveloper&7 x &f" + player.getName()));
                            player.sendMessage((creperozelot.prefix + creperozelot.colorize("&aDu bist im Team &4GameMaster &a und &bDeveloper")));
        //copy end
        } else if (player.getName().equalsIgnoreCase("ToadenationNr1")) {
            player.setNameTag(creperozelot.colorize("&eGameMaster&7 x &f") + player.getName());
                            player.sendMessage(creperozelot.prefix + creperozelot.colorize("&aDu bist im Team &eGameMaster"));
        } else if (player.getName().equalsIgnoreCase("GodVikthor")) {
            player.setNameTag(creperozelot.colorize("&4GameMaster&7 x &f") + player.getName());
                            player.sendMessage(creperozelot.prefix + creperozelot.colorize("&aDu bist im Team &4GameMaster"));
        } else if (player.getName().equalsIgnoreCase("Levi GPP")) {
            player.setNameTag(creperozelot.colorize("&4GameMaster&7 x &f") + player.getName());
                     player.sendMessage(creperozelot.prefix + creperozelot.colorize("&aDu bist im Team &4GameMaster"));
        } else if (player.getName().equalsIgnoreCase("Connorbryan14")) {
            player.setNameTag(creperozelot.colorize("&4GameMaster&7 x &f") + player.getName());
                  player.sendMessage(creperozelot.prefix + creperozelot.colorize("&aDu bist im Team &4GameMaster"));
        }
    }

    //set team names


    public static String getTeam(Player player) {
        String team = "";
        if (player.getName().equalsIgnoreCase("HowLater")) {
            team = "RollLade";
            player.setNameTag(creperozelot.colorize("&2RollLade x &f") + player.getName());
        } else if (player.getName().equalsIgnoreCase("JRollylp")) {
            team = "RollLade";
            player.setNameTag(creperozelot.colorize("&2RollLade x &f") + player.getName());
        } else if (player.getName().equalsIgnoreCase("TomatensaftPUR")) {
            team = "saftig";
            player.setNameTag(creperozelot.colorize("&2saftig x &f") + player.getName());
        } else if (player.getName().equalsIgnoreCase("TomatensaftPUR")) {
            team = "saftig";
            player.setNameTag(creperozelot.colorize("&2saftig x &f") + player.getName());
        } else if (player.getName().equalsIgnoreCase("ApfelsaftPUR")) {
            team = "saftig";
            player.setNameTag(creperozelot.colorize("&2saftig x &f") + player.getName());
        } else if (player.getName().equalsIgnoreCase("Dilonxy")) {
            team = "#Darkside";
            player.setNameTag(creperozelot.colorize("&2#Darkside x &f") + player.getName());
        } else if (player.getName().equalsIgnoreCase("UltraRobbe08")) {
            team = "#Darkside";
            player.setNameTag(creperozelot.colorize("&2#Darkside x &f") + player.getName());
        } else if (player.getName().equalsIgnoreCase("Wabel Ghost")) {
            team = "Pinkplayer";
            player.setNameTag(creperozelot.colorize("&2Pinkplayer x &f") + player.getName());
        } else if (player.getName().equalsIgnoreCase("Greenplayer Tv")) {
            team = "Pinkplayer";
            player.setNameTag(creperozelot.colorize("&2Pinkplayer x &f") + player.getName());
        } else if (player.getName().equalsIgnoreCase("F0ngiMG")) {
            team = "ELEMAO";
            player.setNameTag(creperozelot.colorize("&2ELEMAO x &f") + player.getName());
        } else if (player.getName().equalsIgnoreCase("xF1lmx")) {
            team = "ELEMAO";
            player.setNameTag(creperozelot.colorize("&2ELEMAO x &f") + player.getName());
        } else if (player.getName().equalsIgnoreCase("NeunMatt54321")) {
            team = "DieCoolen";
            player.setNameTag(creperozelot.colorize("&2DieCoolen x &f") + player.getName());
        } else if (player.getName().equalsIgnoreCase("OliverLP5499")) {
            team = "DieCoolen";
            player.setNameTag(creperozelot.colorize("&2DieCoolen x &f") + player.getName());
        } else if (player.getName().equalsIgnoreCase("MaximalFlame")) {
            team = "#Vodafone";
            player.setNameTag(creperozelot.colorize("&2Kings x &f") + player.getName());
        } else if (player.getName().equalsIgnoreCase("MotteBlatt18479")) {
            team = "#Vodafone";
            player.setNameTag(creperozelot.colorize("&2Kings x &f") + player.getName());
        } else if (player.getName().equalsIgnoreCase("KilianCrafterYT")) {
            team = "DerPoleUndDerItaliener";
            player.setNameTag(creperozelot.colorize("&2DerPoleUndDerItaliener x &f") + player.getName());
        }
        else if (player.getName().equalsIgnoreCase("LDread")) {
            team = "L0STYS";
            player.setNameTag(creperozelot.colorize("&2L0STYS x &f") + player.getName());
        } else if (player.getName().equalsIgnoreCase("Sculky")) {
            team = "L0STYS";
            player.setNameTag(creperozelot.colorize("&2L0STYS x &f") + player.getName());
        }
        else if (player.getName().equalsIgnoreCase("SMIBII_YT")) {
            team = "FORRUSSIA";
            player.setNameTag(creperozelot.colorize("&2FORRUSSIA x &f") + player.getName());
        } else if (player.getName().equalsIgnoreCase("ToadenationNr1")) {
            team = "FORRUSSIA";
            player.setNameTag(creperozelot.colorize("&2FORRUSSIA x &f") + player.getName());
        } else if (player.getName().equalsIgnoreCase("Qwuanda")) {
            team = "Quajos";
            player.setNameTag(creperozelot.colorize("&2Quajos x &f") + player.getName());
        } else if (player.getName().equalsIgnoreCase("Jonas TV5")) {
            team = "Quajos";
            player.setNameTag(creperozelot.colorize("&2Quajos x &f") + player.getName());
        } else if (player.getName().equalsIgnoreCase("UltimatePhil794")) {
            team = "Eulenfänger";
            player.setNameTag(creperozelot.colorize("&2Eulenfänger x &f") + player.getName());
        } else if (player.getName().equalsIgnoreCase("Todesbanane1203")) {
            team = "Eulenfänger";
            player.setNameTag(creperozelot.colorize("&2Eulenfänger x &f") + player.getName());
        } else if (player.getName().equalsIgnoreCase("GrafTepid")) {
            team = "Bigbababubatz";
            player.setNameTag(creperozelot.colorize("&2Bigbababubatz x &f") + player.getName());
        } else if (player.getName().equalsIgnoreCase("LitschiiYT")) {
            team = "Bigbababubatz";
            player.setNameTag(creperozelot.colorize("&2Bigbababubatz x &f") + player.getName());
        } else if (player.getName().equalsIgnoreCase("VictorJu4751")) {
            team = "DieKrabbelstube";
            player.setNameTag(creperozelot.colorize("&2DieKrabbelstube x &f") + player.getName());
        } else if (player.getName().equalsIgnoreCase("NURnyraee")) {
            team = "DieKrabbelstube";
            player.setNameTag(creperozelot.colorize("&2DieKrabbelstube x &f") + player.getName());
        } else if (player.getName().equalsIgnoreCase("Djalami007")) {
            team = "SAO";
            player.setNameTag(creperozelot.colorize("&2SAO x &f") + player.getName());
        } else if (player.getName().equalsIgnoreCase("Straussiiii")) {
            team = "SAO";
            player.setNameTag(creperozelot.colorize("&2SAO x &f") + player.getName());
        } else if (player.getName().equalsIgnoreCase("ytDoomS")) {
            team = "#randomteam";
            player.setNameTag(creperozelot.colorize("&2#randomteam x &f") + player.getName());
        } else if (player.getName().equalsIgnoreCase("GunmetalNine15")) {
            team = "#randomteam";
            player.setNameTag(creperozelot.colorize("&2#randomteam x &f") + player.getName());
        } else if (player.getName().equalsIgnoreCase("MetallNatter2")) {
            team = "Heheheha";
            player.setNameTag(creperozelot.colorize("&2Heheheha x &f") + player.getName());
        } else if (player.getName().equalsIgnoreCase("LodgedGuitar93")) {
            team = "Heheheha";
            player.setNameTag(creperozelot.colorize("&2Heheheha x &f") + player.getName());
        } else if (player.getName().equalsIgnoreCase("BeecraftBE")) {
            team = "#Ingodingos";
            player.setNameTag(creperozelot.colorize("&2#Ingodingos x &f") + player.getName());
        } else if (player.getName().equalsIgnoreCase("FabiDE14")) {
            team = "#Ingodingos";
            player.setNameTag(creperozelot.colorize("&2#Ingodingos x &f") + player.getName());
        } else if (player.getName().equalsIgnoreCase("BennoMCyt")) {
            team = "GamilinoUndBenno";
            player.setNameTag(creperozelot.colorize("&2GamilinoUndBenno x &f") + player.getName());
        }  else if (player.getName().equalsIgnoreCase("AreaNull")) {
            team = "Tam Plums";
            player.setNameTag(creperozelot.colorize("&2Tam Plums x &f") + player.getName());
        } else if (player.getName().equalsIgnoreCase("Ilyco187")) {
            team = "Tam Plums";
            player.setNameTag(creperozelot.colorize("&2Tam Plums x &f") + player.getName());
        } else if (player.getName().equalsIgnoreCase("Linus123455")) {
            team = "KeineAhnung";
            player.setNameTag(creperozelot.colorize("&2KeineAhnung x &f") + player.getName());
        } else if (player.getName().equalsIgnoreCase("DoncaMilloLp")) {
            team = "KeineAhnung";
            player.setNameTag(creperozelot.colorize("&2KeineAhnung x &f") + player.getName());
        } else if (player.getName().equalsIgnoreCase("DanielGamerYt31")) {
            team = "Gamatisch";
            player.setNameTag(creperozelot.colorize("&2Gamatisch x &f") + player.getName());
        } else if (player.getName().equalsIgnoreCase("CuzImQuit")) {
            team = "#AmogUsIstBesserAlsValo";
            player.setNameTag(creperozelot.colorize("&2#AmogUsIstBesserAlsValo x &f") + player.getName());
        } else if (player.getName().equalsIgnoreCase("DerHeroGamer007")) {
            team = "#AmogUsIstBesserAlsValo";
            player.setNameTag(creperozelot.colorize("&2#AmogUsIstBesserAlsValo x &f") + player.getName());
        } else if (player.getName().equalsIgnoreCase("ToastbrotGHG")) {
            team = "tutti frutti";
            player.setNameTag(creperozelot.colorize("&2tutti frutti x &f") + player.getName());
        } else if (player.getName().equalsIgnoreCase("RealSertrix")) {
            team = "Gamatisch";
            player.setNameTag(creperozelot.colorize("&2Gamatisch x &f") + player.getName());
        } else if (player.getName().equalsIgnoreCase("zPqndaFNA")) {
            team = "NoYTRank";
            player.setNameTag(creperozelot.colorize("&2#NoYTRank x &f" + player.getName()));
        } else if (player.getName().equalsIgnoreCase("vamiiz")) {
            team = "NoYTRank";
            player.setNameTag(creperozelot.colorize("&2CrazyFazxn x &f" + player.getName()));
        } else if (player.getName().equalsIgnoreCase("F3yson HD")) {
            team = "CrazyFazxn";
            player.setNameTag(creperozelot.colorize("&2CrazyFazxn x &f" + player.getName()));
        } else if (player.getName().equalsIgnoreCase("zCrxyy")) {
            team = "CrazyFazxn";
            player.setNameTag(creperozelot.colorize("&2CrazyFazxn x &f" + player.getName()));
        }
        return team;
    }

    public void setPlayerTeam(Player player) {
        if (player.getName().equalsIgnoreCase("HowLater")) {
            player.setNameTag(creperozelot.colorize("&2RollLade x &f") + player.getName());
        } else if (player.getName().equalsIgnoreCase("JRollylp")) {
            player.setNameTag(creperozelot.colorize("&2RollLade x &f") + player.getName());
        } else if (player.getName().equalsIgnoreCase("TomatensaftPUR")) {
            player.setNameTag(creperozelot.colorize("&saftig x &f") + player.getName());
        } else if (player.getName().equalsIgnoreCase("ApfelsaftPUR")) {
            player.setNameTag(creperozelot.colorize("&saftig x &f") + player.getName());
        } else if (player.getName().equalsIgnoreCase("Dilonxy")) {
            player.setNameTag(creperozelot.colorize("&2#Darkside x &f") + player.getName());
        } else if (player.getName().equalsIgnoreCase("UltraRobbe08")) {
            player.setNameTag(creperozelot.colorize("&2#Darkside x &f") + player.getName());
        } else if (player.getName().equalsIgnoreCase("Wabel Ghost")) {
            player.setNameTag(creperozelot.colorize("&2Pinkplayer x &f") + player.getName());
        } else if (player.getName().equalsIgnoreCase("Greenplayer Tv")) {
            player.setNameTag(creperozelot.colorize("&2Pinkplayer x &f") + player.getName());
        } else if (player.getName().equalsIgnoreCase("F0ngiMG")) {
            player.setNameTag(creperozelot.colorize("&2ELEMAO x &f") + player.getName());
        } else if (player.getName().equalsIgnoreCase("xF1lmx")) {
            player.setNameTag(creperozelot.colorize("&2ELEMAO x &f") + player.getName());
        } else if (player.getName().equalsIgnoreCase("NeunMatt54321")) {
            player.setNameTag(creperozelot.colorize("&2DieCoolen x &f") + player.getName());
        } else if (player.getName().equalsIgnoreCase("OliverLP5499")) {
            player.setNameTag(creperozelot.colorize("&2DieCoolen x &f") + player.getName());
        } else if (player.getName().equalsIgnoreCase("MaximalFlame")) {
            player.setNameTag(creperozelot.colorize("&2Kings x &f") + player.getName());
        } else if (player.getName().equalsIgnoreCase("MotteBlatt18479")) {
            player.setNameTag(creperozelot.colorize("&2Kings x &f") + player.getName());
        } else if (player.getName().equalsIgnoreCase("KilianCrafterYT")) {
            player.setNameTag(creperozelot.colorize("&2DerPoleUndDerItaliener x &f") + player.getName());
        } else if (player.getName().equalsIgnoreCase("LDread")) {
            player.setNameTag(creperozelot.colorize("&2L0STYS x &f") + player.getName());
        } else if (player.getName().equalsIgnoreCase("Sculky")) {
            player.setNameTag(creperozelot.colorize("&2L0STYS x &f") + player.getName());
        } else if (player.getName().equalsIgnoreCase("SMIBII_YT")) {
            player.setNameTag(creperozelot.colorize("&2FORRUSSIA x &f") + player.getName());
        } else if (player.getName().equalsIgnoreCase("ToadenationNr1")) {
            player.setNameTag(creperozelot.colorize("&2FORRUSSIA x &f") + player.getName());
        } else if (player.getName().equalsIgnoreCase("byknax")) {
            player.setNameTag(creperozelot.colorize("&2Tittenfreunde x &f") + player.getName());
        } else if (player.getName().equalsIgnoreCase("exzlTW")) {
            player.setNameTag(creperozelot.colorize("&2Tittenfreunde x &f") + player.getName());
        } else if (player.getName().equalsIgnoreCase("Qwuanda")) {
            player.setNameTag(creperozelot.colorize("&2Qajos x &f") + player.getName());
        } else if (player.getName().equalsIgnoreCase("Jonas TV5")) {
            player.setNameTag(creperozelot.colorize("&2Qajos x &f") + player.getName());
        } else if (player.getName().equalsIgnoreCase("UltimatePhil794")) {
            player.setNameTag(creperozelot.colorize("&2Eulenfänger x &f") + player.getName());
        } else if (player.getName().equalsIgnoreCase("Todesbanane1203")) {
            player.setNameTag(creperozelot.colorize("&2Eulenfänger x &f") + player.getName());
        } else if (player.getName().equalsIgnoreCase("GrafTepid")) {
            player.setNameTag(creperozelot.colorize("&2Bigbababubatz x &f") + player.getName());
        } else if (player.getName().equalsIgnoreCase("LitschiiYT")) {
            player.setNameTag(creperozelot.colorize("&2Bigbababubatz x &f") + player.getName());
        } else if (player.getName().equalsIgnoreCase("VictorJu4751")) {
            player.setNameTag(creperozelot.colorize("&2DieKrabbelstube x &f") + player.getName());
        } else if (player.getName().equalsIgnoreCase("NURnyraee")) {
            player.setNameTag(creperozelot.colorize("&2DieKrabbelstube x &f") + player.getName());
        } else if (player.getName().equalsIgnoreCase("Djalami007")) {
            player.setNameTag(creperozelot.colorize("&2SAO x &f") + player.getName());
        } else if (player.getName().equalsIgnoreCase("Straussiiii")) {
            player.setNameTag(creperozelot.colorize("&2SAO x &f") + player.getName());
        } else if (player.getName().equalsIgnoreCase("ytDoomS")) {
            player.setNameTag(creperozelot.colorize("&2#randomteam x &f") + player.getName());
        } else if (player.getName().equalsIgnoreCase("GunmetalNine15")) {
            player.setNameTag(creperozelot.colorize("&2#randomteam x &f") + player.getName());
        } else if (player.getName().equalsIgnoreCase("MetallNatter2")) {
            player.setNameTag(creperozelot.colorize("&2Heheheha x &f") + player.getName());
        } else if (player.getName().equalsIgnoreCase("LodgedGuitar93")) {
            player.setNameTag(creperozelot.colorize("&2Heheheha x &f") + player.getName());
        } else if (player.getName().equalsIgnoreCase("BeecraftBE")) {
            player.setNameTag(creperozelot.colorize("&2#Ingodingos x &f") + player.getName());
        } else if (player.getName().equalsIgnoreCase("FabiDE14")) {
            player.setNameTag(creperozelot.colorize("&2#Ingodingos x &f") + player.getName());
        } else if (player.getName().equalsIgnoreCase("BennoMCyt")) {
            player.setNameTag(creperozelot.colorize("&2GamilinoUndBenno x &f") + player.getName());
        }  else if (player.getName().equalsIgnoreCase("AreaNull")) {
            player.setNameTag(creperozelot.colorize("&2Tam Plums x &f") + player.getName());
        } else if (player.getName().equalsIgnoreCase("Ilyco187")) {
            player.setNameTag(creperozelot.colorize("&2Tam Plums x &f") + player.getName());
        } else if (player.getName().equalsIgnoreCase("Linus123455")) {
            player.setNameTag(creperozelot.colorize("&2KeineAhnung x &f") + player.getName());
        } else if (player.getName().equalsIgnoreCase("DoncaMilloLp")) {
            player.setNameTag(creperozelot.colorize("&2KeineAhnung x &f") + player.getName());
        } else if (player.getName().equalsIgnoreCase("DanielGamerYt31")) {
            player.setNameTag(creperozelot.colorize("&2Gamatisch x &f") + player.getName());
        } else if (player.getName().equalsIgnoreCase("CuzImQuit")) {
            player.setNameTag(creperozelot.colorize("&2#AmogUsIstBesserAlsValo x &f") + player.getName());
        } else if (player.getName().equalsIgnoreCase("DerHeroGamer007")) {
            player.setNameTag(creperozelot.colorize("&2#AmogUsIstBesserAlsValo x &f") + player.getName());
        } else if (player.getName().equalsIgnoreCase("ToastbrotGHG")) {
            player.setNameTag(creperozelot.colorize("&2tutti frutti x &f") + player.getName());
        } else if (player.getName().equalsIgnoreCase("zCrxyy")) {
            player.setNameTag(creperozelot.colorize("&2CrazyFazxn x &f") + player.getName());
        } else if (player.getName().equalsIgnoreCase("F3yson HD")) {
            player.setNameTag(creperozelot.colorize("&2CrazyFazxn x &f") + player.getName());
        }  else if (player.getName().equalsIgnoreCase("RealSertrix")) {
            player.setNameTag(creperozelot.colorize("&2Gamatisch x &f") + player.getName());
        }
    }

}

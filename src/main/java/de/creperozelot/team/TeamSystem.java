package de.creperozelot.team;

import de.creperozelot.creperozelot;

import cn.nukkit.Player;

public class TeamSystem {

    //set gamemaster

    public void setTeam(Player player) {
        if (player.getName().equalsIgnoreCase("creperozelot")) {
            player.setNameTag("&4GameMaster&7 | &f" + player.getName());
                    player.setDisplayName("&4GameMaster&7 | &f" + player.getName());
                            player.sendMessage((new creperozelot()).prefix + "&aDu bist im Team &4GameMaster");
                            //copy
        } else if (player.getName().equalsIgnoreCase("TOADENATION")) {
            player.setNameTag("&4GameMaster&7 | &f" + player.getName());
                    player.setDisplayName("&4GameMaster&7 | &f" + player.getName());
                            player.sendMessage((new creperozelot()).prefix + "&aDu bist im Team &4GameMaster");
        } else if (player.getName().equalsIgnoreCase("GodVikthor")) {
            player.setNameTag("&4GameMaster&7 | &f" + player.getName());
                    player.setDisplayName("&4GameMaster&7 | &f" + player.getName());
                            player.sendMessage(creperozelot.prefix + "&aDu bist im Team &4GameMaster");
        }
    }

    //set team names


    public static String getTeam(Player player) {
        String team = "";
        if (player.getName().equalsIgnoreCase("Connorbryan14")) {
            team = "TeamName1";
        } else if (player.getName().equalsIgnoreCase("MaximalFlame")) {
            team = "TeamName2";
        }
        return team;
    }

}

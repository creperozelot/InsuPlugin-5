package de.creperozelot.commands;

import cn.nukkit.inventory.PlayerInventory;
import cn.nukkit.item.Item;
import cn.nukkit.potion.Effect;
import de.creperozelot.StaticCache;
import de.creperozelot.creperozelot;
import cn.nukkit.Player;
import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;
import cn.nukkit.Server;
import cn.nukkit.level.Level;
import cn.nukkit.level.Sound;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

public class CommandEventShuffleInv extends Command {

    public CommandEventShuffleInv(String name, String description, String usageMessage, String[] aliases) {
        super(name, description, usageMessage, aliases);
        this.setPermission("insu.admin.shuffleinv");
    }

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

    @Override
    public boolean execute(CommandSender commandSender, String s, String[] args) {
        if (!((commandSender instanceof Player))) {
            return false;
        }
        if (!commandSender.hasPermission(this.getPermission())) {
            commandSender.sendMessage("&cDu hast keine Berechtigung für diesen Command.");
            return false;
        }

        Player player = (Player) commandSender;

        if (StaticCache.EVENT_ACTIVE) {
            player.sendMessage(creperozelot.prefix + "&cDu kannst events nur alle 10 Minuten ausführen");
            return true;
        }

        StaticCache.EVENT_ACTIVE = true;
        StaticCache.EVENT_BLINDNISS = true;

        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                StaticCache.EVENT_ACTIVE = false;
            }
        }, 1000 * 60 * 10);


        player.sendMessage(creperozelot.colorize(creperozelot.prefix + "&fDu hast das Event &8Blindniss&f Aktiviert."));

        for (Player AllOnlinePlayers : Server.getInstance().getOnlinePlayers().values()) {
            Level level = AllOnlinePlayers.getLevel();


            AllOnlinePlayers.sendTitle(creperozelot.colorize("&6&lEvent &8&lInv Chaos"), creperozelot.colorize("&fWird Gestartet..."), 20, 60, 0);

            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            AllOnlinePlayers.sendTitle(creperozelot.colorize("&6&lEvent &8&lInv Chaos"), creperozelot.colorize("&fStart in &45"), 0, 40, 0);

            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            AllOnlinePlayers.sendTitle(creperozelot.colorize("&6&lEvent &8&lInv Chaos"), creperozelot.colorize("&fStart in &c4"), 0, 40, 0);

            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            AllOnlinePlayers.sendTitle(creperozelot.colorize("&6&lEvent &8&lInv Chaos"), creperozelot.colorize("&fStart in &e3"), 0, 40, 0);

            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            AllOnlinePlayers.sendTitle(creperozelot.colorize("&6&lEvent &8&lInv Chaos"), creperozelot.colorize("&fStart in &22"), 0, 40, 0);

            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            AllOnlinePlayers.sendTitle(creperozelot.colorize("&6&lEvent &8&lInv Chaos"), creperozelot.colorize("&fStart in &a1"), 0, 40, 0);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            AllOnlinePlayers.sendTitle(creperozelot.colorize("&6&lEvent &8&lInv Chaos"), creperozelot.colorize("&aStart"), 0, 40, 0);
            level.addSound(AllOnlinePlayers.getPosition(), Sound.RANDOM_LEVELUP);

            //invchaos HowLater
            PlayerInventory HowLaterInv = HowLater.getInventory();
            List<Item> HowLaterlist = new ArrayList<>(HowLaterInv.getContents().values());
            Collections.shuffle(HowLaterlist);
            Map<Integer, Item> HowLatercontents = new HashMap<>();
            int HowLateri = 0;
            for (Item item : HowLaterlist) {
                HowLatercontents.put(Integer.valueOf(HowLateri), item);
                HowLateri++;
            }

            //invchaos JRollylp
            PlayerInventory JRollylpinventory = JRollylp.getInventory();
            List<Item> JRollylplist = new ArrayList<>(JRollylpinventory.getContents().values());
            Collections.shuffle(JRollylplist);
            Map<Integer, Item> JRollylpcontents = new HashMap<>();
            int JRollylpi = 0;
            for (Item item : JRollylplist) {
                JRollylpcontents.put(Integer.valueOf(JRollylpi), item);
                JRollylpi++;
            }

            //invchaos GedankeAmeise1
            PlayerInventory GedankeAmeise1inventory = GedankeAmeise1.getInventory();
            List<Item> GedankeAmeise1list = new ArrayList<>(GedankeAmeise1inventory.getContents().values());
            Collections.shuffle(GedankeAmeise1list);
            Map<Integer, Item> GedankeAmeise1contents = new HashMap<>();
            int GedankeAmeise1i = 0;
            for (Item item : GedankeAmeise1list) {
                GedankeAmeise1contents.put(Integer.valueOf(GedankeAmeise1i), item);
                GedankeAmeise1i++;
            }

            return true;
        }

        return false;
    }

}

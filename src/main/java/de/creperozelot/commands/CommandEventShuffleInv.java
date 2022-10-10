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

        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                StaticCache.EVENT_ACTIVE = false;
            }
        }, 1000 * 60 * 10);

        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                StaticCache.EVENT_MINING_FATIQUE = false;
            }
        }, 1000 * 60 * 2);

        player.sendMessage(creperozelot.colorize(creperozelot.prefix + "&fDu hast das Event &e&lMining-Fatique&a Aktiviert."));

        for (Player AllOnlinePlayers : Server.getInstance().getOnlinePlayers().values()) {
            AllOnlinePlayers.sendTitle(creperozelot.colorize("&6&lEvent &f&lInv-Chaos"), creperozelot.colorize("&aStart"), 10, 40, 0);
            Level level = AllOnlinePlayers.getLevel();
            level.addSound(AllOnlinePlayers.getPosition(), Sound.RANDOM_LEVELUP);
        }

        StaticCache.EVENT_SHUFFLEINV = true;
        StaticCache.EVENT_ACTIVE = true;

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

            PlayerInventory GedankeAmeise1inventory = GedankeAmeise1.getInventory();
            List<Item> GedankeAmeise1list = new ArrayList<>(GedankeAmeise1inventory.getContents().values());
            Collections.shuffle(GedankeAmeise1list);
            Map<Integer, Item> GedankeAmeise1contents = new HashMap<>();
            int GedankeAmeise1i = 0;
            for (Item item : GedankeAmeise1list) {
                GedankeAmeise1contents.put(Integer.valueOf(GedankeAmeise1i), item);
                GedankeAmeise1i++;
            }

            PlayerInventory Mxllow1143Inventory = Mxllow1143.getInventory();
            List<Item> Mxllow1143List = new ArrayList<>(Mxllow1143Inventory.getContents().values());
            Collections.shuffle(GedankeAmeise1list);
            Map<Integer, Item> Mxllow1143Contents = new HashMap<>();
            int Mxllow1143i = 0;
            for (Item item : Mxllow1143List) {
                Mxllow1143Contents.put(Integer.valueOf(Mxllow1143i), item);
                Mxllow1143i++;
            }

            PlayerInventory DilonxyInventory = Dilonxy.getInventory();
            List<Item> DilonxyList = new ArrayList<>(DilonxyInventory.getContents().values());
            Collections.shuffle(DilonxyList);
            Map<Integer, Item> DilonxyContents = new HashMap<>();
            int Dilonxyi = 0;
            for (Item item : DilonxyList) {
                DilonxyContents.put(Integer.valueOf(Dilonxyi), item);
                Dilonxyi++;
            }

            PlayerInventory UltraRobbe08Inventory = UltraRobbe08.getInventory();
            List<Item> UltraRobbe08List = new ArrayList<>(UltraRobbe08Inventory.getContents().values());
            Collections.shuffle(UltraRobbe08List);
            Map<Integer, Item> UltraRobbe08Contents = new HashMap<>();
            int UltraRobbe08i = 0;
            for (Item item : UltraRobbe08List) {
                UltraRobbe08Contents.put(Integer.valueOf(UltraRobbe08i), item);
                UltraRobbe08i++;
            }

            PlayerInventory Wabel_GhostInventory = Wabel_Ghost.getInventory();
            List<Item> Wabel_GhostList = new ArrayList<>(Wabel_GhostInventory.getContents().values());
            Collections.shuffle(Wabel_GhostList);
            Map<Integer, Item> Wabel_GhostContents = new HashMap<>();
            int Wabel_Ghosti = 0;
            for (Item item : Wabel_GhostList) {
                Wabel_GhostContents.put(Integer.valueOf(Wabel_Ghosti), item);
                Wabel_Ghosti++;
            }

            PlayerInventory Greenplayer_TvInventory = Greenplayer_Tv.getInventory();
            List<Item> Greenplayer_TvList = new ArrayList<>(Greenplayer_TvInventory.getContents().values());
            Collections.shuffle(Greenplayer_TvList);
            Map<Integer, Item> Greenplayer_TvContents = new HashMap<>();
            int Greenplayer_Tvi = 0;
            for (Item item : Greenplayer_TvList) {
                Greenplayer_TvContents.put(Integer.valueOf(Greenplayer_Tvi), item);
                Greenplayer_Tvi++;
            }

            PlayerInventory F0ngiMGInventory = F0ngiMG.getInventory();
            List<Item> F0ngiMGList = new ArrayList<>(F0ngiMGInventory.getContents().values());
            Collections.shuffle(F0ngiMGList);
            Map<Integer, Item> F0ngiMGContents = new HashMap<>();
            int F0ngiMGi = 0;
            for (Item item : F0ngiMGList) {
                F0ngiMGContents.put(Integer.valueOf(F0ngiMGi), item);
                F0ngiMGi++;
            }

            PlayerInventory xF1lmxInventory = xF1lmx.getInventory();
            List<Item> xF1lmxList = new ArrayList<>(xF1lmxInventory.getContents().values());
            Collections.shuffle(xF1lmxList);
            Map<Integer, Item>xF1lmxContents = new HashMap<>();
            int xF1lmxi = 0;
            for (Item item : xF1lmxList) {
                xF1lmxContents.put(Integer.valueOf(xF1lmxi), item);
                xF1lmxi++;
            }

            PlayerInventory NeunMatt54321Inventory = NeunMatt54321.getInventory();
            List<Item> NeunMatt54321List = new ArrayList<>(NeunMatt54321Inventory.getContents().values());
            Collections.shuffle(NeunMatt54321List);
            Map<Integer, Item> NeunMatt54321Contents = new HashMap<>();
            int NeunMatt54321i = 0;
            for (Item item : NeunMatt54321List) {
                NeunMatt54321Contents.put(Integer.valueOf(NeunMatt54321i), item);
                NeunMatt54321i++;
            }

            PlayerInventory OliverLP5499Inventory = OliverLP5499.getInventory();
            List<Item> OliverLP5499List = new ArrayList<>(OliverLP5499Inventory.getContents().values());
            Collections.shuffle(OliverLP5499List);
            Map<Integer, Item> OliverLP5499Contents = new HashMap<>();
            int OliverLP5499i = 0;
            for (Item item : OliverLP5499List) {
                OliverLP5499Contents.put(Integer.valueOf(OliverLP5499i), item);
                OliverLP5499i++;
            }

            PlayerInventory MaximalFlameInventory = MaximalFlame.getInventory();
            List<Item> MaximalFlameList = new ArrayList<>(MaximalFlameInventory.getContents().values());
            Collections.shuffle(MaximalFlameList);
            Map<Integer, Item> MaximalFlameContents = new HashMap<>();
            int MaximalFlamei = 0;
            for (Item item : MaximalFlameList) {
                MaximalFlameContents.put(Integer.valueOf(MaximalFlamei), item);
                MaximalFlamei++;
            }

            PlayerInventory zeyycoInventory = zeyyco.getInventory();
            List<Item> zeyycoList = new ArrayList<>(zeyycoInventory.getContents().values());
            Collections.shuffle(zeyycoList);
            Map<Integer, Item> zeyycoContents = new HashMap<>();
            int zeyycoi = 0;
            for (Item item : zeyycoList) {
                zeyycoContents.put(Integer.valueOf(zeyycoi), item);
                zeyycoi++;
            }

            PlayerInventory KilianCrafterYTInventory = KilianCrafterYT.getInventory();
            List<Item> KilianCrafterYTList = new ArrayList<>(KilianCrafterYTInventory.getContents().values());
            Collections.shuffle(KilianCrafterYTList);
            Map<Integer, Item> KilianCrafterYTContents = new HashMap<>();
            int KilianCrafterYTi = 0;
            for (Item item : KilianCrafterYTList) {
                KilianCrafterYTContents.put(Integer.valueOf(KilianCrafterYTi), item);
                KilianCrafterYTi++;
            }

            return true;
        }
}

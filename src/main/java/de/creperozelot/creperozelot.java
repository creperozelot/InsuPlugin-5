package de.creperozelot;


import cn.nukkit.command.SimpleCommandMap;
import cn.nukkit.item.ItemID;
import cn.nukkit.plugin.PluginBase;
import cn.nukkit.plugin.PluginManager;
import cn.nukkit.scheduler.ServerScheduler;
import cn.nukkit.scheduler.Task;
import cn.nukkit.utils.TextFormat;
import de.creperozelot.Interface.InsuInterfaceActions;
import de.creperozelot.commands.*;
import de.creperozelot.listener.*;
import de.creperozelot.start.StartFreze;
import de.creperozelot.tasks.CheckTasks;
import de.creperozelot.tasks.StartCountDown;
import de.creperozelot.tasks.WatingForHost;

public class creperozelot extends PluginBase {
    private static creperozelot instance;

    public static creperozelot getInstance() {
        return instance;
    }


    public static String prefix = creperozelot.colorize("&a&lIN&2&lSU&r&7 &4&l5&r&7 |&f ");

    @Override
    public void onLoad() {
        instance = this;
    }

    @Override
    public void onEnable() {
        this.saveDefaultConfig();

        //remove Crafting Recipe
        this.getServer().getCraftingManager().getRecipes().removeIf(recipe -> recipe.getResult().getId() == ItemID.STICK);
        //register
        this.registerListener();
        this.registerCommand();
        this.registerTasks();
        getLogger().info("§b========================");
        getLogger().info("");
        getLogger().info("§a§lIN§2§lSU§r§f System §aAktiviert");
        getLogger().info("§aby creperozelot");
        getLogger().info("");
        getLogger().info("§b========================");
    }

    @Override
    public void onDisable() {
        getLogger().info("§b========================");
        getLogger().info("");
        getLogger().info("§a§lIN§2§lSU§r§f System §cDeaktiviert");
        getLogger().info("§aby creperozelot");
        getLogger().info("");
        getLogger().info("§b========================");
    }
    private void registerCommand(){
        SimpleCommandMap commandMap = this.getServer().getCommandMap();
        commandMap.register("hilfe", new CommandTeleport("insu:tpp", "Teleportiert dich zu einem bestimten Spieler.", creperozelot.colorize("&cUsage: /tpp <name>"), new String[]{"teleportplayer"}));
        commandMap.register("hilfe", new CommandSpectate("insu:spectate", "Setzt dich in den Zuschauermodus", creperozelot.colorize("&cUsage: /spectate"), new String[]{"spec"}));
        commandMap.register("hilfe", new Commandsethost("insu:sethost", "Setzt den Host oder auch gennant denn GameMaster", creperozelot.colorize("&cUsage: /sethost <name>"), new String[]{"seth"}));
        commandMap.register("hilfe", new CommandHelp("insu:help", "Zeigt die Hilfe Nachricht für das Insu Plugin an.", creperozelot.colorize("&cUsage: /hilfe"), new String[]{"?", "h"}));
        commandMap.register("hilfe", new CommandEventHotGrass("insu:hotgrass", "Startet das Event HotGrass", creperozelot.colorize("&cUsage: /hotgrass"), new String[]{"hotgrass"}));
        commandMap.register("hilfe", new CommandTest("devinsu:test", "Ein Test command für Entwickler", creperozelot.colorize("&cUsage: /test"), new String[]{"dev:test"}));
        commandMap.register("hilfe", new CommandTest2("devinsu:test2", "Ein Weiterer Entwickler Command", creperozelot.colorize("&cUsage: /test2"), new String[]{"dev:test2"}));
        commandMap.register("hilfe", new CommandStart("insu:start", "Startet das Projekt INSU5", creperozelot.colorize("&cUsage: /start"), new String[]{"start"}));
        commandMap.register("hilfe", new CommandEventWaterdamage("insu:waterdamage", "Startet das Event WaterDamge", creperozelot.colorize("&/Usage: /waterdamage"), new String[]{"waterdamage"}));
        commandMap.register("hilfe", new CommandInterface("insu:interface", "Öffnet das Insu Verwaltungs Interface", "§cUsage /interface", new String[]{"insu", "insuui", "adminmenu"}));
        commandMap.register("hilfe", new CommandEventLowMining("insu:mining-fatique", "Startet das Event Mining Fatique", "§cUsage: /insu:mining-fatique", new String[]{"mining-fatique"}));
        commandMap.register("hilfe", new CommandUndoStart("devinsu:undostart", "Setzt START auf FALSE", "§c/Usage: /undostart", new String[]{"undostart"}));
        commandMap.register("hilfe", new CommandInterface("insu:interface", "Öffnet das INSU verwaltungs Interface", "§c/Usage: /interface", new String[]{"iinsuui", "ui", "events", "i", "insu"}));
        commandMap.register("hilfe", new CommandTeleportUI("insu:tpui", "Teleportier dich zu einem Spieler", "§cUsage: /tpui", new String[]{"tpui", "teleportui", "teleportinterface"}));
    }

    //register Event
    private void registerListener(){
        PluginManager pluginmanager = this.getServer().getPluginManager();
        pluginmanager.registerEvents( new PlayerJoinListener(), this);
        pluginmanager.registerEvents( new PlayerQuitListener(), this);
        pluginmanager.registerEvents( new PlayerDeathListener(), this);
        pluginmanager.registerEvents( new MoveListener(this), this);
        pluginmanager.registerEvents(new ChatLIstener(), this);
        pluginmanager.registerEvents(new StartFreze(), this);
        pluginmanager.registerEvents(new InterfaceListener(), this);
        pluginmanager.registerEvents(new PlayerDamageEvents(), this);
    }

    //register Tasks
    private void registerTasks() {
        ServerScheduler scheduler = getServer().getScheduler();
        scheduler.scheduleRepeatingTask(new CheckTasks(), 20*45);
        scheduler.scheduleRepeatingTask((Task)new WatingForHost(), 20*5);
        scheduler.scheduleRepeatingTask(new StartCountDown(), 20);
        getLogger().info("Registered Tasks");
    }

    public static String colorize(String msg) {
        return TextFormat.colorize('&', msg);
    }
}

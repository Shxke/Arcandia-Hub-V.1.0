package me.beefstew2007.arcandianetwork;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	private static Plugin plugin;
	
    @Override
    public void onEnable() {
    	plugin = this;
    	getCommand("r-reload").setExecutor(new RanksSetup());
		getServer().getPluginManager().registerEvents(new RanksChatListener(), this);
		getServer().getPluginManager().registerEvents(new RanksJoinListener(), this);

    }
    
    @Override
    public void onDisable() {
    	plugin = null;
    }
    
    public static void registerEvents(org.bukkit.plugin.Plugin plugin, Listener... listeners) {
    	for (Listener listener : listeners) {
    		Bukkit.getServer().getPluginManager().registerEvents(listener, plugin);
    	}
    }
    	 
    public static Plugin getPlugin() {
    	return plugin;
    }
    	 
    
}
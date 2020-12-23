package fr.extasio.main;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import fr.extasio.listeners.BlockListener;
import fr.extasio.listeners.MinecartPlace;

public class Main extends JavaPlugin {

	
	@Override
	public void onEnable() {
		PluginManager pm = Bukkit.getPluginManager();
		pm.registerEvents(new BlockListener(), this);
		pm.registerEvents(new MinecartPlace(), this);
	}
	
	@Override
	public void onDisable() {

	}
}

package me.mehul.listeners;

import org.bukkit.plugin.java.JavaPlugin;

import me.mehul.listeners.listenersCmds.ListenerCmds;

public class Main extends JavaPlugin {

	public void onEnable() {
		
		new ListenerCmds(this);
		
		
	}
}

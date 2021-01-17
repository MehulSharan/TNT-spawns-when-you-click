package me.mehul.listeners.listenersCmds;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import me.mehul.listeners.Main;

public class ListenerCmds implements Listener {
	
	private Main plugin;
	
	public ListenerCmds (Main plugin) {
		this.plugin = plugin;
		Bukkit.getPluginManager().registerEvents(this, plugin);	
		
	}
	
	@EventHandler
	public void clickEvent(PlayerInteractEvent e) {
		
		
		Player p = e.getPlayer();
		Action act = e.getAction();
		World w = p.getWorld();
		Location loc = p.getLocation();
		
	int i = 0;	
	for(i = 0;i < 10;i++) {	
		if(act == Action.LEFT_CLICK_AIR ||act == Action.LEFT_CLICK_BLOCK && act == Action.RIGHT_CLICK_AIR || act == Action.RIGHT_CLICK_BLOCK ) {
			
			w.spawnEntity(loc, EntityType.PRIMED_TNT);
			
		}
	}	
		
		
	}

}

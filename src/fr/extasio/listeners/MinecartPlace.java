package fr.extasio.listeners;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.vehicle.VehicleCreateEvent;

public class MinecartPlace implements Listener {

	@EventHandler
	public void onMinecartPlace(VehicleCreateEvent event) {
		int radius = 2;
		Location loc = event.getVehicle().getLocation();
		World world = loc.getWorld();;
		for (int x = -radius; x <= radius; x++) {
		   for (int z = -radius; z <= radius; z++) {
		      Block block = world.getBlockAt(loc.getBlockX()+x, loc.getBlockY(),loc.getBlockZ()+z);
		      Material blocka= block.getLocation().getBlock().getType();
		      if (blocka != Material.AIR && blocka != Material.RAILS) {
		         event.getVehicle().remove();;
		      }
		  }
		}
	}
}

package fr.extasio.listeners;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class BlockListener implements Listener{

	
	@EventHandler
	public void onInteract(PlayerInteractEvent event) {
		Block targetedblock = event.getClickedBlock();
		if(targetedblock != null && targetedblock.getType() == Material.HOPPER||targetedblock.getType() == Material.DROPPER||targetedblock.getType() == Material.DISPENSER) {
			if(event.getPlayer().isOp()) {
				event.setCancelled(false);
			}else {
				event.setCancelled(true);
			}
		}
	}
}

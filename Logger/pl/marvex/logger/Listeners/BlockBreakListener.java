package pl.marvex.logger.Listeners;

import org.bukkit.Location;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

import pl.marvex.logger.Data.PlayerData;

public class BlockBreakListener implements Listener {
	
	@EventHandler
	public void onBreak(BlockBreakEvent e) {
		Location location = e.getPlayer().getLocation();
		int x = (int) location.getX();
		int y = (int) location.getY();
		int z = (int) location.getZ();
		PlayerData.setBreakData(e.getPlayer(), e.getBlock().getType().toString(), x, y, z);
	}

}

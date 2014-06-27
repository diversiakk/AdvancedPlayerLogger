package pl.marvex.logger.Listeners;

import org.bukkit.Location;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

import pl.marvex.logger.Data.PlayerData;

public class BlockPlaceListener implements Listener {


	@EventHandler
	public void onPlace(BlockPlaceEvent e) {
		Location location = e.getPlayer().getLocation();
		int x = (int) location.getX();
		int y = (int) location.getY();
		int z = (int) location.getZ();
		PlayerData.setBlockData(e.getPlayer(), e.getBlock().getType().toString(), x, y, z);
	}

}

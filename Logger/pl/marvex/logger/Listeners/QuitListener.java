package pl.marvex.logger.Listeners;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

import pl.marvex.logger.Data.PlayerData;

public class QuitListener implements Listener {
	
	@EventHandler
	public void onLeave(PlayerQuitEvent e) {
		Player player = e.getPlayer();
		Location location = e.getPlayer().getLocation();
		int x = (int) location.getX();
		int y = (int) location.getY();
		int z = (int) location.getZ();
		PlayerData.setLeaveData(player, x, y, z);
	}

}

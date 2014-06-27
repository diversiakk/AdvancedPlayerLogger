package pl.marvex.logger.Listeners;

import org.bukkit.Location;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import pl.marvex.logger.LoggerPlugin;
import pl.marvex.logger.Data.PlayerData;

public class JoinListener implements Listener {

	LoggerPlugin plugin;


	@EventHandler
	public void onJoin(PlayerJoinEvent e) {
		Location location = e.getPlayer().getLocation();
		int x = (int) location.getX();
		int y = (int) location.getY();
		int z = (int) location.getZ();
		PlayerData.setJoinData(e.getPlayer(), x, y, z);
	}

}

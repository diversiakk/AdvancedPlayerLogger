package pl.marvex.logger.Listeners;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

import pl.marvex.logger.Data.PlayerData;

public class CommandListener implements Listener {

	@EventHandler
	public void onPlayerCommandPreprocess(PlayerCommandPreprocessEvent event) {
		String command = event.getMessage();
		Player player = event.getPlayer();
		Location location = player.getLocation();
		int x = (int) location.getX();
		int y = (int) location.getY();
		int z = (int) location.getZ();
		PlayerData.setCommandData(player, command, x, y, z);
	}

}

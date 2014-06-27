package pl.marvex.logger.Listeners;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;

import pl.marvex.logger.Data.PlayerData;

public class ChatListeners implements Listener {

	@EventHandler
	public void onChat(PlayerChatEvent e) {
		Player p = e.getPlayer();
		Location location = p.getLocation();
		int x = (int) location.getX();
		int y = (int) location.getY();
		int z = (int) location.getZ();
		String message = e.getMessage();
		PlayerData.setChatData(p, message, x, y, z);
	}
	
	
}

package pl.marvex.logger.Listeners;

import java.util.HashMap;
import java.util.Map;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import pl.marvex.logger.Data.PlayerData;

public class GetItemListener implements Listener {

	@EventHandler
	public void InventoryClickGet(InventoryClickEvent e)
	{
		if(e.getClick().isCreativeAction()) {
			Player player = (Player)e.getWhoClicked();
			Location location = player.getLocation();
			int x = (int) location.getX();
			int y = (int) location.getY();
			int z = (int) location.getZ();
			Map<Player, Integer> amount = new HashMap();
			amount.put(player, Integer.valueOf(e.getCursor().getAmount()));
			PlayerData.setCreativeItemData(player, e.getCursor().getType().toString(), amount.get(player), x, y, z);
		}
	}

}

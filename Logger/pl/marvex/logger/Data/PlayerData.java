package pl.marvex.logger.Data;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import pl.marvex.logger.LoggerPlugin;

public class PlayerData {

	LoggerPlugin plugin;

	public PlayerData(LoggerPlugin plugin)
	{
		this.plugin = plugin;
	}

	static Calendar cal = Calendar.getInstance();
	static SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");
	
	public static void setJoinData(Player player, int x, int y, int z) {
		
		cal.getTime();
		ToFile.logToFile("[JOIN] [" + df.format(cal.getTime()) +  "] [UUID: " +player.getUniqueId() + "] [IP: " + player.getAddress() + "] [WORLD: " + player.getWorld().toString() + "] [LOCATION: " + x + ":" + y + ":" + z + "] [GAMEMODE: " + player.getGameMode().toString() +  "] [HEALTH: " + player.getHealth() + "] [OP: " + player.isOp() + "] [ADMINPERM: " + player.hasPermission("apl.admin") + "]", player);
	}
	
	public static void setLeaveData(Player player, int x, int y, int z) {
		
		cal.getTime();

		ToFile.logToFile("[QUIT] [" + df.format(cal.getTime()) +  "] [UUID: " +player.getUniqueId() + "] [IP: " + player.getAddress() + "] [WORLD: " + player.getWorld().toString() + "] [LOCATION: " + x + ":" + y + ":" + z + "] [GAMEMODE: " + player.getGameMode().toString() +  "] [HEALTH: " + player.getHealth() + "] [OP: " + player.isOp() + "] [ADMINPERM: " + player.hasPermission("apl.admin") + "]", player);
	}

	public static void setBlockData(Player player, String block, int x, int y, int z) {
		
		cal.getTime();

		ToFile.logToFile("[BLOCK PLACE] [" + df.format(cal.getTime()) +  "] [UUID: " +player.getUniqueId() + "] [IP: " + player.getAddress() + "] [WORLD: " + player.getWorld().toString() + "] [LOCATION: " + x + ":" + y + ":" + z + "] [GAMEMODE: " + player.getGameMode().toString() +  "] [HEALTH: " + player.getHealth() + "] [OP: " + player.isOp() + "] [ADMINPERM: " + player.hasPermission("apl.admin") + "] [BLOCK: " + block + "]", player); 
	}
	
	public static void setBreakData(Player player, String block, int x, int y, int z) {
		
		cal.getTime();

		ToFile.logToFile("[BLOCK BREAK] [" + df.format(cal.getTime()) +  "] [UUID: " +player.getUniqueId() + "] [IP: " + player.getAddress() + "] [WORLD: " + player.getWorld().toString() + "] [LOCATION: " + x + ":" + y + ":" + z + "] [GAMEMODE: " + player.getGameMode().toString() +  "] [HEALTH: " + player.getHealth() + "] [OP: " + player.isOp() + "] [ADMINPERM: " + player.hasPermission("apl.admin") + "] [BLOCK: " + block + "]", player); 
	}

	public static void setCreativeItemData(Player player, String block, int amount, int x, int y, int z) {
		
		cal.getTime();

		ToFile.logToFile("[BLOCK GET] [" + df.format(cal.getTime()) +  "] [UUID: " +player.getUniqueId() + "] [IP: " + player.getAddress() + "] [WORLD: " + player.getWorld().toString() + "] [LOCATION: " + x + ":" + y + ":" + z + "] [GAMEMODE: " + player.getGameMode().toString() +  "] [HEALTH: " + player.getHealth() + "] [OP: " + player.isOp() + "] [ADMINPERM: " + player.hasPermission("apl.admin") + "] [BLOCK: " + block + "] [AMOUNT: " + amount + "]", player); 
	}
	
	public static void setCommandData(Player player, String command, int x, int y, int z) {
		
		cal.getTime();

		ToFile.logToFile("[COMMAND] [" + df.format(cal.getTime()) +  "] [UUID: " +player.getUniqueId() + "] [IP: " + player.getAddress() + "] [WORLD: " + player.getWorld().toString() + "] [LOCATION: " + x + ":" + y + ":" + z + "] [GAMEMODE: " + player.getGameMode().toString() +  "] [HEALTH: " + player.getHealth() + "] [OP: " + player.isOp() + "] [ADMINPERM: " + player.hasPermission("apl.admin") + "] [CMD: '" + command + "' ]", player); 
	}
	
	public static void setChatData(Player player, String message, int x, int y, int z) {
		
		cal.getTime();

		ToFile.logToFile("[CHAT] [" + df.format(cal.getTime()) +  "] [UUID: " +player.getUniqueId() + "] [IP: " + player.getAddress() + "] [WORLD: " + player.getWorld().toString() + "] [LOCATION: " + x + ":" + y + ":" + z + "] [GAMEMODE: " + player.getGameMode().toString() +  "] [HEALTH: " + player.getHealth() + "] [OP: " + player.isOp() + "] [ADMINPERM: " + player.hasPermission("apl.admin") + "] [MESSAGE: '" + message + "' ]", player); 
	}

}





package pl.marvex.logger.Data;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import pl.marvex.logger.LoggerPlugin;




public class ToFile
{

	LoggerPlugin plugin;

	public static void logToFile(String message, Player player)
	{
		try
		{
			File dataFolder = Bukkit.getServer().getPluginManager().getPlugin("AdvancedPlayerLogger").getDataFolder();
			if (!dataFolder.exists()) {
				dataFolder.mkdir();
			}
			File saveTo = new File(Bukkit.getServer().getPluginManager().getPlugin("AdvancedPlayerLogger").getDataFolder() + File.separator + "data", player.getName() + ".log");
			if (!saveTo.exists()) {
				saveTo.createNewFile();
			}
			FileWriter fw = new FileWriter(saveTo, true);
			PrintWriter pw = new PrintWriter(fw);

			pw.println(message);

			pw.flush();

			pw.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}


}

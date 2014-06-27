package pl.marvex.logger;

import java.io.File;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import pl.marvex.logger.Listeners.BlockBreakListener;
import pl.marvex.logger.Listeners.BlockPlaceListener;
import pl.marvex.logger.Listeners.ChatListeners;
import pl.marvex.logger.Listeners.CommandListener;
import pl.marvex.logger.Listeners.GetItemListener;
import pl.marvex.logger.Listeners.JoinListener;
import pl.marvex.logger.Listeners.QuitListener;

public class LoggerPlugin extends JavaPlugin {

	public static FileConfiguration cfg;
	
	String prefix = "[AdvancedPlayerLogger]";


	public void onEnable() {
		getServer().getPluginManager().registerEvents(new JoinListener(), this);
		getServer().getPluginManager().registerEvents(new BlockPlaceListener(), this);
		getServer().getPluginManager().registerEvents(new GetItemListener(), this);
		getServer().getPluginManager().registerEvents(new CommandListener(), this);
		getServer().getPluginManager().registerEvents(new QuitListener(), this);
		getServer().getPluginManager().registerEvents(new BlockBreakListener(), this);
		getServer().getPluginManager().registerEvents(new ChatListeners(), this);
		try
		{
			File file = new File("plugins/<folder>/config.yml");
			FileConfiguration cfg = getConfig();
			if(!file.exists())
			{
				cfg.addDefault("Config.Messages.JoinVip", "Dziekujemy za zakup vip!");
				cfg.options().copyDefaults(true);
				saveConfig();
			}
		}
		catch(Exception e){ }
	}

	public void onDisable() {

	}

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		Player p = (Player) sender;
		if(label.equalsIgnoreCase("apl")) {
			if (args.length == 1) {
				if(args[0].equalsIgnoreCase("reload")) {
					this.reloadConfig();
					p.sendMessage(ChatColor.GOLD + prefix + ChatColor.RED + " Done!");
				}
		}
		return false;
		
	}
		return false;
	
	
	
	

}
}

/* Main class */
package im.wma.WMATablist;

import me.bubbleguj.supertab.SuperTab;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.ChatColor;


public class WMATablist extends JavaPlugin {
	@EventHandler (priority = EventPriority.HIGHEST)
	public void onJoin(PlayerJoinEvent event) {
		
		ArrayList<String> messages = new ArrayList<String>();
		messages.add("&1Worldwide");
		messages.add("&4Minecraft");
		messages.add("&2Alliance");
		
		SuperTab.setTab(messages);
	}
}

/* Main class */
package im.wma.WMATablist;

import me.bubbleguj.supertab.SuperTab;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.entity.Player.*;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.ChatColor;
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.player.PlayerJoinEvent;
import java.util.ArrayList;

public class WMATablist extends JavaPlugin implements Listener {
	public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
    }
	
	@EventHandler (priority = EventPriority.HIGHEST)
	public void onJoin(PlayerJoinEvent event) {
		
		ArrayList<String> messages = new ArrayList<String>();
		messages.add("&1Worldwide");
		messages.add("&4Minecraft");
		messages.add("&2Alliance");
		
		SuperTab.setTab(messages);
	}
}

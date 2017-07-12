package me.beefstew2007.arcandianetwork;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import net.md_5.bungee.api.ChatColor;

public class RanksChatListener implements Listener {

	@EventHandler
	public void onChat(AsyncPlayerChatEvent event){
		Player p = event.getPlayer();
		if (RanksSetup.owner.contains(p.getName())) {
			event.setFormat(RanksSetup.ownerprefix + p.getName() + " " + ChatColor.GOLD + event.getMessage());
		}
		else if (RanksSetup.dev.contains(p.getName())) {
			event.setFormat(RanksSetup.devprefix + p.getName() + " " + ChatColor.YELLOW + event.getMessage());
		}
		else if (RanksSetup.jrdev.contains(p.getName())) {
			event.setFormat(RanksSetup.jrdevprefix + p.getName() + " " + ChatColor.YELLOW + event.getMessage());
		}
		else if (RanksSetup.admin.contains(p.getName())) {
			event.setFormat(RanksSetup.adminprefix + p.getName() + " " + ChatColor.YELLOW + event.getMessage());
		}
		else if (RanksSetup.staffsr.contains(p.getName())) {
			event.setFormat(RanksSetup.staffsrprefix + p.getName() + " " + ChatColor.YELLOW + event.getMessage());
		}
		else if (RanksSetup.staffjr.contains(p.getName())) {
			event.setFormat(RanksSetup.staffjrprefix + p.getName() + " " + ChatColor.YELLOW + event.getMessage());
		}
		else if (RanksSetup.trainee.contains(p.getName())) {
			event.setFormat(RanksSetup.traineeprefix + p.getName() + " " + ChatColor.YELLOW + event.getMessage());
		}
		else if (RanksSetup.donor.contains(p.getName())) {
			event.setFormat(RanksSetup.donorprefix + p.getName() + " " + ChatColor.YELLOW + event.getMessage());
		}
		else if (RanksSetup.normal.contains(p.getName())) {
			event.setFormat(RanksSetup.normalprefix + p.getName() + " " + ChatColor.YELLOW + event.getMessage());
		}
	}
}

package me.beefstew2007.arcandianetwork;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class RanksJoinListener implements Listener {

	@EventHandler
	public void onJoin(PlayerJoinEvent event){
		Player p = event.getPlayer();
		if (!RanksSetup.owner.contains(p.getName())) {
			if (!RanksSetup.dev.contains(p.getName())) {
				if (!RanksSetup.jrdev.contains(p.getName())) {
					if (!RanksSetup.admin.contains(p.getName())) {
						if (!RanksSetup.staffsr.contains(p.getName())) {
							if (!RanksSetup.staffjr.contains(p.getName())) {
								if (!RanksSetup.trainee.contains(p.getName())) {
									if (!RanksSetup.donor.contains(p.getName())) {
										if (!RanksSetup.normal.contains(p.getName())) {
											RanksSetup.normal.add(p.getName());
										}
									}
								}
							}
						}
					}

				}
			}
		}
	}
}

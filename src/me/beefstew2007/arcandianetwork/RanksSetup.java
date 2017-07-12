package me.beefstew2007.arcandianetwork;

import java.util.ArrayList;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class RanksSetup implements CommandExecutor {

	public static ArrayList<String> owner = new ArrayList<String>();
	public static ArrayList<String> dev = new ArrayList<String>();
	public static ArrayList<String> jrdev = new ArrayList<String>();
	public static ArrayList<String> admin = new ArrayList<String>();
	public static ArrayList<String> staffsr = new ArrayList<String>();
	public static ArrayList<String> staffjr = new ArrayList<String>();
	public static ArrayList<String> trainee = new ArrayList<String>();
	public static ArrayList<String> donor = new ArrayList<String>();
	public static ArrayList<String> normal = new ArrayList<String>();
	
	public static String ownerprefix = "";
	public static String devprefix = "";
	public static String jrdevprefix = "";
	public static String adminprefix = "";
	public static String staffsrprefix = "";
	public static String staffjrprefix = "";
	public static String traineeprefix = "";
	public static String donorprefix = "";
	public static String normalprefix = "";

	public boolean onCommand(CommandSender sender, Command command, String label, String[] args){
		if (command.getName().equalsIgnoreCase("r-reload")) {
			Player p = (Player) sender;
			if (p.isOp()) {
				p.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.GOLD + "Ranks" + ChatColor.DARK_GRAY + "]" + ChatColor.GRAY + " Ranks set to beginning prefixes!");
				ownerprefix = ChatColor.RED + ChatColor.BOLD.toString() + "OWNER " +ChatColor.RESET.toString()+ ChatColor.GRAY;
				devprefix = ChatColor.DARK_RED + ChatColor.BOLD.toString() + "DEV " +ChatColor.RESET.toString()+ ChatColor.GRAY;
				jrdevprefix = ChatColor.DARK_RED + ChatColor.BOLD.toString() + "JR.DEV " +ChatColor.RESET.toString()+ ChatColor.GRAY;
				adminprefix = ChatColor.GOLD + ChatColor.BOLD.toString() + "ADMIN " +ChatColor.RESET.toString()+ ChatColor.GRAY;
				staffsrprefix = ChatColor.GOLD + ChatColor.BOLD.toString() + "SR.STAFF " +ChatColor.RESET.toString()+ ChatColor.GRAY;
				staffjrprefix = ChatColor.GOLD + ChatColor.BOLD.toString() + "JR.STAFF " +ChatColor.RESET.toString()+ ChatColor.GRAY;
				traineeprefix = ChatColor.GOLD + ChatColor.BOLD.toString() + "TRAINEE " +ChatColor.RESET.toString()+ ChatColor.GRAY;
				donorprefix = ChatColor.AQUA + ChatColor.BOLD.toString() + "DONOR " +ChatColor.RESET.toString()+ ChatColor.GRAY;
				normalprefix = ChatColor.GREEN + ChatColor.BOLD.toString() + "DEFAULT " + ChatColor.RESET.toString() + ChatColor.GRAY;
				p.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.GOLD + "Ranks" + ChatColor.DARK_GRAY + "]" + ChatColor.GRAY + " Owner = " + ownerprefix);
				p.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.GOLD + "Ranks" + ChatColor.DARK_GRAY + "]" + ChatColor.GRAY + " Dev = " + devprefix);
				p.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.GOLD + "Ranks" + ChatColor.DARK_GRAY + "]" + ChatColor.GRAY + " JrDev = " + jrdevprefix);
				p.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.GOLD + "Ranks" + ChatColor.DARK_GRAY + "]" + ChatColor.GRAY + " Admin = " + adminprefix);
				p.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.GOLD + "Ranks" + ChatColor.DARK_GRAY + "]" + ChatColor.GRAY + " SrStaff = " + staffsrprefix);
				p.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.GOLD + "Ranks" + ChatColor.DARK_GRAY + "]" + ChatColor.GRAY + " JrStaff = " + staffjrprefix);
				p.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.GOLD + "Ranks" + ChatColor.DARK_GRAY + "]" + ChatColor.GRAY + " Trainee = " + traineeprefix);
				p.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.GOLD + "Ranks" + ChatColor.DARK_GRAY + "]" + ChatColor.GRAY + " Donor = " + donorprefix);
				p.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.GOLD + "Ranks" + ChatColor.DARK_GRAY + "]" + ChatColor.GRAY + " Normal = " + normalprefix);
			} else {
				p.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.GOLD + "Ranks" + ChatColor.DARK_GRAY + "]" + ChatColor.GRAY + " You don't have permission!");
			}
			
		
		}
		return false;	
	}
}

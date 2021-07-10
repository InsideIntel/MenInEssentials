package me.insideintel.mic.essentials.commands;

import me.insideintel.mic.essentials.MenInEssentials;
import me.insideintel.mic.essentials.utils.HexChat;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;
import org.bukkit.util.StringUtil;

import java.util.*;

public class MobGrief implements CommandExecutor, TabCompleter {
    MenInEssentials plugin;

    public MobGrief(MenInEssentials plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender.hasPermission(plugin.getConfig().getString("mobgrief-cmd")))){
            sender.sendMessage(HexChat.translateHexCodes(plugin.getConfig().getString("messages.no-perm"), plugin));
            return false;
        }
        if (args.length != 2) {
            sender.sendMessage("Types: creeper, zombie, enderman, ghast, wither, enderdragon, rabbit, sheep, villager");
            sender.sendMessage("Try again, /mobgrief <type> <boolean>");
            return false;
        }
        if (args[0].equalsIgnoreCase("creeper")) {
            if (args[1].equalsIgnoreCase("true")) {
                plugin.getConfig().set("mobgrief.creeper", true);
                plugin.saveConfig();
                sender.sendMessage(HexChat.translateHexCodes("&aCreeper griefing is now allowed!", plugin));
                return false;
            }
            if (args[1].equalsIgnoreCase("false")) {
                plugin.getConfig().set("mobgrief.creeper", false);
                plugin.saveConfig();
                sender.sendMessage(HexChat.translateHexCodes("&aCreeper griefing is now denied!", plugin));

                return false;
            }
            sender.sendMessage("Please use true or false, example: /mobgrief creeper true");
            return false;
        }
        if (args[0].equalsIgnoreCase("zombie")) {
            if (args[1].equalsIgnoreCase("true")) {
                plugin.getConfig().set("mobgrief.zombie", true);
                sender.sendMessage(HexChat.translateHexCodes("&aZombie griefing is now allowed!", plugin));
                plugin.saveConfig();
                return false;
            }
            if (args[1].equalsIgnoreCase("false")) {
                plugin.getConfig().set("mobgrief.zombie", false);
                plugin.saveConfig();
                sender.sendMessage(HexChat.translateHexCodes("&aZombie griefing is now denied!", plugin));

                return false;
            }
            sender.sendMessage("Please use true or false, example: /mobgrief creeper true");
            return false;
        }
        if (args[0].equalsIgnoreCase("enderman")) {
            if (args[1].equalsIgnoreCase("true")) {
                plugin.getConfig().set("mobgrief.enderman", true);
                plugin.saveConfig();
                sender.sendMessage(HexChat.translateHexCodes("&aEnderman griefing is now allowed!", plugin));
                return false;
            }
            if (args[1].equalsIgnoreCase("false")) {
                plugin.getConfig().set("mobgrief.enderman", false);
                plugin.saveConfig();
                sender.sendMessage(HexChat.translateHexCodes("&aEnderman griefing is now denied!", plugin));

                return false;
            }
            sender.sendMessage("Please use true or false, example: /mobgrief creeper true");
            return false;
        }
        if (args[0].equalsIgnoreCase("ghast")) {
            if (args[1].equalsIgnoreCase("true")) {
                plugin.getConfig().set("mobgrief.ghast", true);
                plugin.saveConfig();
                sender.sendMessage(HexChat.translateHexCodes("&aGhast griefing is now allowed!", plugin));
                return false;
            }
            if (args[1].equalsIgnoreCase("false")) {
                plugin.getConfig().set("mobgrief.ghast", false);
                plugin.saveConfig();
                sender.sendMessage(HexChat.translateHexCodes("&aGhast griefing is now denied!", plugin));

                return false;
            }
            sender.sendMessage("Please use true or false, example: /mobgrief creeper true");
            return false;
        }
        if (args[0].equalsIgnoreCase("wither")) {
            if (args[1].equalsIgnoreCase("true")) {
                plugin.getConfig().set("mobgrief.wither", true);
                plugin.saveConfig();
                sender.sendMessage(HexChat.translateHexCodes("&aWither griefing is now allowed!", plugin));
                return false;
            }
            if (args[1].equalsIgnoreCase("false")) {
                plugin.getConfig().set("mobgrief.wither", false);
                plugin.saveConfig();
                sender.sendMessage(HexChat.translateHexCodes("&aWither griefing is now denied!", plugin));

                return false;
            }
            sender.sendMessage("Please use true or false, example: /mobgrief creeper true");
            return false;
        }
        if (args[0].equalsIgnoreCase("enderdragon")) {
            if (args[1].equalsIgnoreCase("true")) {
                plugin.getConfig().set("mobgrief.enderdragon", true);
                plugin.saveConfig();
                sender.sendMessage(HexChat.translateHexCodes("&aEnderdragon griefing is now allowed!", plugin));
                return false;
            }
            if (args[1].equalsIgnoreCase("false")) {
                plugin.getConfig().set("mobgrief.enderdragon", false);
                plugin.saveConfig();
                sender.sendMessage(HexChat.translateHexCodes("&aEnderdragon griefing is now denied!", plugin));

                return false;
            }
            sender.sendMessage("Please use true or false, example: /mobgrief creeper true");
            return false;
        }
        if (args[0].equalsIgnoreCase("rabbit")) {
            if (args[1].equalsIgnoreCase("true")) {
                plugin.getConfig().set("mobgrief.rabbit", true);
                plugin.saveConfig();
                sender.sendMessage(HexChat.translateHexCodes("&aRabbit griefing is now allowed!", plugin));
                return false;
            }
            if (args[1].equalsIgnoreCase("false")) {
                plugin.getConfig().set("mobgrief.rabbit", false);
                plugin.saveConfig();
                sender.sendMessage(HexChat.translateHexCodes("&aRabbit griefing is now denied!", plugin));

                return false;
            }
            sender.sendMessage("Please use true or false, example: /mobgrief creeper true");
            return false;
        }
        if (args[0].equalsIgnoreCase("sheep")) {
            if (args[1].equalsIgnoreCase("true")) {
                plugin.getConfig().set("mobgrief.sheep", true);
                plugin.saveConfig();
                sender.sendMessage(HexChat.translateHexCodes("&aSheep griefing is now allowed!", plugin));
                return false;
            }
            if (args[1].equalsIgnoreCase("false")) {
                plugin.getConfig().set("mobgrief.sheep", false);
                plugin.saveConfig();
                sender.sendMessage(HexChat.translateHexCodes("&aSheep is now denied!", plugin));

                return false;
            }
            sender.sendMessage("Please use true or false, example: /mobgrief creeper true");
            return false;
        }
        if (args[0].equalsIgnoreCase("villager")) {
            if (args[1].equalsIgnoreCase("true")) {
                plugin.getConfig().set("mobgrief.villager", true);
                plugin.saveConfig();
                sender.sendMessage(HexChat.translateHexCodes("&aVillager griefing is now allowed!", plugin));
                return false;
            }
            if (args[1].equalsIgnoreCase("false")) {
                plugin.getConfig().set("mobgrief.villager", false);
                plugin.saveConfig();
                sender.sendMessage(HexChat.translateHexCodes("&aVillager griefing is now denied!", plugin));

                return false;
            }
            sender.sendMessage("Please use true or false, example: /mobgrief creeper true");
            return false;
        }
        if (args[0].equalsIgnoreCase("snowman")) {
            if (args[1].equalsIgnoreCase("true")) {
                plugin.getConfig().set("mobgrief.snowman", true);
                plugin.saveConfig();
                sender.sendMessage(HexChat.translateHexCodes("&aSnowman griefing is now allowed!", plugin));
                return false;
            }
            if (args[1].equalsIgnoreCase("false")) {
                plugin.getConfig().set("mobgrief.snowman", false);
                plugin.saveConfig();
                sender.sendMessage(HexChat.translateHexCodes("&aSnowman griefing is now denied!", plugin));

                return false;
            }
            sender.sendMessage("Please use true or false, example: /mobgrief creeper true");
            return false;
        }
        if (args[0].equalsIgnoreCase("silverfish")) {
            if (args[1].equalsIgnoreCase("true")) {
                plugin.getConfig().set("mobgrief.silverfish", true);
                plugin.saveConfig();
                sender.sendMessage(HexChat.translateHexCodes("&aSilverfish griefing is now allowed!", plugin));
                return false;
            }
            if (args[1].equalsIgnoreCase("false")) {
                plugin.getConfig().set("mobgrief.silverfish", false);
                plugin.saveConfig();
                sender.sendMessage(HexChat.translateHexCodes("&aSilverfish griefing is now denied!", plugin));

                return false;
            }
            sender.sendMessage("Please use true or false, example: /mobgrief creeper true");
            return false;
        }
        if (args[0].equalsIgnoreCase("ravager")) {
            if (args[1].equalsIgnoreCase("true")) {
                plugin.getConfig().set("mobgrief.ravager", true);
                plugin.saveConfig();
                sender.sendMessage(HexChat.translateHexCodes("&aRavager griefing is now allowed!", plugin));
                return false;
            }
            if (args[1].equalsIgnoreCase("false")) {
                plugin.getConfig().set("mobgrief.ravager", false);
                plugin.saveConfig();
                sender.sendMessage(HexChat.translateHexCodes("&aRavager griefing is now denied!", plugin));

                return false;
            }
            sender.sendMessage("Please use true or false, example: /mobgrief creeper true");
            return false;
        }
        if (args[0].equalsIgnoreCase("turtle_egg")) {
            if (args[1].equalsIgnoreCase("true")) {
                plugin.getConfig().set("mobgrief.turtle_egg", true);
                plugin.saveConfig();
                sender.sendMessage(HexChat.translateHexCodes("&aTurtle Egg trampling is now allowed!", plugin));
                return false;
            }
            if (args[1].equalsIgnoreCase("false")) {
                plugin.getConfig().set("mobgrief.turtle_egg", false);
                plugin.saveConfig();
                sender.sendMessage(HexChat.translateHexCodes("&aTurtle Egg trampling is now denied!", plugin));

                return false;
            }
            sender.sendMessage("Please use true or false, example: /mobgrief creeper true");
            return false;
        }



        return false;
    }
    private final String[] COMMANDS = { "creeper", "zombie", "enderman", "ghast","wither","enderdragon","rabbit","sheep","villager","snowman","silverfish","ravager", "turtle_egg"};
    private final String[] BOOLEANS = { "true", "false"};
    List<String> arguments = new ArrayList<String>();
    List<String> arguments2 = new ArrayList<String>();
    @Override
    public List<String> onTabComplete(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender.hasPermission(plugin.getConfig().getString("mobgrief-cmd")))){
            return null;
        }
        if (arguments.isEmpty()) {
            for (String string: COMMANDS) {
                arguments.add(string);
            }
        }
        if (arguments2.isEmpty()) {
            for (String string: BOOLEANS) {
                arguments2.add(string);
            }
        }
        List<String> result = new ArrayList<String>();
        if (args.length == 1) {
            for (String a : arguments) {
                if (a.toLowerCase().startsWith(args[0].toLowerCase()))
                    result.add(a);
            }
            return result;
        }
        if (args.length == 2) {
            for (String a : arguments2) {
                if (a.toLowerCase().startsWith(args[1].toLowerCase()))
                    result.add(a);
            }
            return result;
        }

        return null;
    }
}

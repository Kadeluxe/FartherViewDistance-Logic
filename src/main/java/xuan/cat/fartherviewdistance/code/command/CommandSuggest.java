package xuan.cat.fartherviewdistance.code.command;

import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import xuan.cat.fartherviewdistance.code.ChunkServer;
import xuan.cat.fartherviewdistance.code.data.ConfigData;

import java.util.ArrayList;
import java.util.List;

public final class CommandSuggest implements TabCompleter {

    private final ChunkServer chunkServer;
    private final ConfigData configData;

    public CommandSuggest(ChunkServer chunkServer, ConfigData configData) {
        this.chunkServer = chunkServer;
        this.configData = configData;
    }

    public List<String> onTabComplete(CommandSender sender, Command command, String s, String[] parameters) {
        if (!sender.hasPermission("command.viewdistance")) {
            return new ArrayList<>();
        }

        List<String> list = new ArrayList<>();

        if (parameters.length == 1) {
            list.add("start");
            list.add("stop");
            list.add("reload");
            list.add("report");
        } else if (parameters.length == 2) {
            switch (parameters[0]) {
                case "report":
                    list.add("server");
                    list.add("thread");
                    list.add("world");
                    list.add("player");
                    break;
            }
        }

        return list;
    }
}

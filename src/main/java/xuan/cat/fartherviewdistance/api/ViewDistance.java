package xuan.cat.fartherviewdistance.api;

import org.bukkit.entity.Player;
import xuan.cat.fartherviewdistance.api.data.PlayerView;
import xuan.cat.fartherviewdistance.code.Index;
import xuan.cat.fartherviewdistance.code.data.PlayerChunkView;

public final class ViewDistance {
    private ViewDistance() {
    }


    public static PlayerView getPlayerView(Player player) {
        PlayerChunkView view = Index.getChunkServer().getView(player);
        return view != null ? view.viewAPI : null;
    }
}

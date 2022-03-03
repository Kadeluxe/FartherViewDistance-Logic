package xuan.cat.fartherviewdistance.code;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.*;
import org.bukkit.event.world.WorldInitEvent;
import org.bukkit.event.world.WorldUnloadEvent;
import xuan.cat.fartherviewdistance.api.branch.BranchPacket;

public final class ChunkEvent implements Listener {
    private final ChunkServer chunkServer;
    private final BranchPacket branchPacket;


    public ChunkEvent(ChunkServer chunkServer, BranchPacket branchPacket) {
        this.chunkServer    = chunkServer;
        this.branchPacket   = branchPacket;
    }


    /**
     * @param event 玩家傳送
     */
    @EventHandler(priority = EventPriority.NORMAL, ignoreCancelled = true)
    public void event(PlayerTeleportEvent event) {
        chunkServer.unloadView(event.getPlayer(), event.getFrom(), event.getTo());
    }

    /**
     * @param event 玩家移動
     */
    @EventHandler(priority = EventPriority.NORMAL, ignoreCancelled = true)
    public void event(PlayerMoveEvent event) {
//        chunkServer.unloadView(event.getPlayer(), event.getFrom(), event.getTo());
    }

    /**
     * @param event 玩家重生
     */
    @EventHandler(priority = EventPriority.NORMAL, ignoreCancelled = true)
    public void event(PlayerRespawnEvent event) {
        chunkServer.respawnView(event.getPlayer());
    }



    /**
     * @param event 玩家登入
     */
    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void on(PlayerJoinEvent event) {
        chunkServer.initView(event.getPlayer());
    }
    /**
     * @param event 玩家登出
     */
    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void on(PlayerQuitEvent event) {
        chunkServer.clearView(event.getPlayer());
    }



    /**
     * @param event 世界初始化
     */
    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void on(WorldInitEvent event) {
        chunkServer.initWorld(event.getWorld());
    }

    /**
     * @param event 世界卸載
     */
    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void on(WorldUnloadEvent event) {
        chunkServer.clearWorld(event.getWorld());
    }

}

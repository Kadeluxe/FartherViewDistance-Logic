package xuan.cat.fartherviewdistance.api.branch;

import com.comphenix.protocol.events.PacketContainer;
import org.bukkit.entity.Player;

import java.util.function.Consumer;

public interface BranchPacket {
    /**
     * @return [chunkX,chunkZ]
     */
    int[] readChunkLocation(PacketContainer container);

    int readViewDistance(PacketContainer container);

    long readKeepAlive(PacketContainer container);

    void sendPacket(Player player, PacketContainer container);

    void sendViewDistance(Player player, int viewDistance);

    void sendUnloadChunk(Player player, int chunkX, int chunkZ);

    Consumer<Player> sendChunkAndLight(org.bukkit.Chunk chunk, BranchChunkLight light, boolean needTile, Consumer<Integer> consumeTraffic);

    void sendKeepAlive(Player player, long id);
}

package xuan.cat.fartherviewdistance.code.branch.v16_R3;

import com.comphenix.protocol.events.PacketContainer;
import org.bukkit.Chunk;
import org.bukkit.entity.Player;
import xuan.cat.fartherviewdistance.api.branch.BranchChunkLight;
import xuan.cat.fartherviewdistance.api.branch.BranchPacket;

import java.util.function.Consumer;

public final class Branch_16_R3_Packet implements BranchPacket {
    @Override
    public int[] readChunkLocation(PacketContainer container) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int readViewDistance(PacketContainer container) {
        throw new UnsupportedOperationException();
    }

    @Override
    public long readKeepAlive(PacketContainer container) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void sendPacket(Player player, PacketContainer container) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void sendViewDistance(Player player, int viewDistance) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void sendUnloadChunk(Player player, int chunkX, int chunkZ) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Consumer<Player> sendChunkAndLight(Chunk chunk, BranchChunkLight light, boolean needTile, Consumer<Integer> consumeTraffic) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void sendKeepAlive(Player player, long id) {
        throw new UnsupportedOperationException();
    }
}

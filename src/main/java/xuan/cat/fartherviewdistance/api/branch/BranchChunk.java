package xuan.cat.fartherviewdistance.api.branch;

import org.bukkit.Chunk;
import org.bukkit.block.data.BlockData;

import java.util.List;

public interface BranchChunk {
    BranchNBT toNBT(BranchChunkLight light, List<Runnable> asyncRunnable);

    Chunk getChunk();

    int getX();
    int getZ();

    Status getStatus();

//    BlockData getBlockData(int x, int y, int z);
//    void setBlockData(int x, int y, int z, BlockData blockData, boolean applyPhysics);
//
//    default int replaceAllMaterial(BlockData[] target, BlockData to) {
//        return replaceAllMaterial(target, to, true);
//    }

//    void recalculateBlockCounts();

    void replaceAllMaterial(BlockData[] target, BlockData to);

    enum Status {
        EMPTY               (0),
        STRUCTURE_STARTS    (1),
        STRUCTURE_REFERENCES(2),
        BIOMES              (3),
        NOISE               (4),
        SURFACE             (5),
        CARVERS             (6),
        LIQUID_CARVERS      (7),
        FEATURES            (8),
        LIGHT               (9),
        SPAWN               (10),
        HEIGHTMAPS          (11),
        FULL                (12);

        private final int sequence;
        Status(int sequence) {
            this.sequence = sequence;
        }

        public boolean isAbove(Status status) {
            return this.sequence >= status.sequence;
        }
        public boolean isUnder(Status status) {
            return this.sequence <= status.sequence;
        }
    }
}

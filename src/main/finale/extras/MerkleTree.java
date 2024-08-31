package main.finale.extras;

import java.util.*;

class MerkleTree {
    List<String> dataBlocks;
    List<String> versionRoots = new ArrayList<>();

    public MerkleTree(List<String> initialData) {
        this.dataBlocks = initialData;
        versionRoots.add(computeMerkleRoot(dataBlocks));
    }

    public static void main(String[] args) {
        List<String> data = Arrays.asList("block1", "block2", "block3");
        MerkleTree tree = new MerkleTree(data);

        // Create new versions
        tree.updateBlock(1, "newBlock2");
        tree.updateBlock(2, "newBlock3");

        // Get Merkle roots for each version
        System.out.println(tree.getVersionRoot(0)); // Initial version
        System.out.println(tree.getVersionRoot(1)); // After first update
        System.out.println(tree.getVersionRoot(2)); // After second update
    }

    public String computeMerkleRoot(List<String> blocks) {
        List<String> hashes = new ArrayList<>();
        for (String block : blocks) {
            hashes.add(hash(block));
        }
        return computeRoot(hashes);
    }

    private String computeRoot(List<String> hashes) {
        while (hashes.size() > 1) {
            List<String> newHashes = new ArrayList<>();
            for (int i = 0; i < hashes.size(); i += 2) {
                String left = hashes.get(i);
                String right = (i + 1 < hashes.size()) ? hashes.get(i + 1) : left;
                newHashes.add(hash(left + right));
            }
            hashes = newHashes;
        }
        return hashes.get(0); // Merkle root
    }

    public void updateBlock(int index, String newData) {
        dataBlocks.set(index, newData);
        versionRoots.add(computeMerkleRoot(dataBlocks));
    }

    public String getVersionRoot(int version) {
        return versionRoots.get(version);
    }

    private String hash(String data) {
        // Simple hashing function (for example purposes)
        return Integer.toString(data.hashCode());
    }
}


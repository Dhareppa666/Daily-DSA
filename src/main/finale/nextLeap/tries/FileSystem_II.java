package main.finale.nextLeap.tries;

import java.util.HashMap;

//Using Hasmap
public class FileSystem_II {
    HashMap<String, Integer> paths;

    public FileSystem_II() {
        this.paths = new HashMap<String, Integer>();
    }

    public boolean createPath(String path, int value) {

        // Step-1: basic path validations
        if (path.isEmpty() || (path.length() == 1 && path.equals("/")) || this.paths.containsKey(path)) {
            return false;
        }

        int delimIndex = path.lastIndexOf("/");
        String parent = path.substring(0, delimIndex);

        // Step-2: if the parent doesn't exist. Note that "/" is a valid parent.
        if (parent.length() > 1 && !this.paths.containsKey(parent)) {
            return false;
        }

        // Step-3: add this new path and return true.
        this.paths.put(path, value);
        return true;
    }

    public int get(String path) {
        return this.paths.getOrDefault(path, -1);
    }
}

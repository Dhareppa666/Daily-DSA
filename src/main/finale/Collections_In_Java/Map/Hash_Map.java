package main.finale.Collections_In_Java.Map;

import java.util.HashMap;

// It allows to store the null keys as well, but there should be only one null
// key object and there can be any number of null values.
// This class makes no guarantees as to the order of the map.

// HashMap is known as HashMap because it uses a technique called Hashing.
// Hashing is a technique of converting a large String to small String that
// represents the same String. A shorter value helps in indexing and faster searches.
// HashSet also uses HashMap internally.
public class Hash_Map {

    public static void main(String[] args) {
        // Create an empty hash map
        HashMap<String, Integer> map = new HashMap<>();

        map.put(null, null);
        map.put(null, 1);
        map.put(null, 4);
        System.out.println(map);


        // Add elements to the map
        map.put("vishal", 10);
        map.put("sachin", 30);
        map.put("vaibhav", 20);

        // Print size and content
        System.out.println("Size of map is:- "
                + map.size());
        System.out.println(map);

        // Check if a key is present and if
        // present, print value
        if (map.containsKey("vishal")) {
            Integer a = map.get("vishal");
            System.out.println("value for key"
                    + " \"vishal\" is:- " + a);
        }
    }
}

package main.finale.Collections_In_Java;

import java.util.*;

public class Test {

    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap <>();
        map.put("Z", 26);
        map.put("A", 1);
        map.put("C", 3);
        map.put("B", 2);
        System.out.println(map);

        Map<String, Integer> map2 = new LinkedHashMap <>();
        map2.put("Z", 26);
        map2.put("A", 1);
        map2.put("C", 3);
        map2.put("B", 2);
        System.out.println(map2);

        Map<String, Integer> map3 = new Hashtable<>();
        map3.put("Z", 26);
        map3.put("A", 1);
        map3.put("C", 3);
        map3.put("B", 2);
        System.out.println(map3);
        map3.get("C");
    }

}

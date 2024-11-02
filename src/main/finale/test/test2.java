package main.finale.test;

import java.util.HashMap;

public class test2 {

    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put(1, "test");
        map.put(1, "test2");
        map.put(null, "test");
        map.put(null, "test2");
        map.put(null, "test3");
        System.out.println(map);
    }
}

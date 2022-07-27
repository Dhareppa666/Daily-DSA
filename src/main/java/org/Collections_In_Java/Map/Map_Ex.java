package org.Collections_In_Java.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//Since Map is an interface, it can be used only with a class
// that implements this interface.

public class Map_Ex {
    public static void main(String[] args) {
        /*Map<String, Integer> hm = new HashMap<>();

        hm.put("a", 100);
        hm.put("b", 200);
        hm.put("c", 300);
        hm.put("d", 400);

        // Traversing through the map
        for (Map.Entry<String, Integer> me : hm.entrySet()) {
            System.out.print(me.getKey() + ":");
            System.out.println(me.getValue());
        }*/

        ArrayList<Integer> list = new ArrayList();
        list.add(20);
        list.add(20);
        list.add(20);
        list.add(20);
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }
}

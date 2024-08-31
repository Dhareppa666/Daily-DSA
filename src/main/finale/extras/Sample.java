package main.finale.extras;

import main.finale.DSA.trees._test;

import java.util.*;

public class Sample {

    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put(12368798,1);
        map.put(52563278,11);

        map.put(32423422,1111);
        map.put(4353533,1111);
        map.put(52353454,11111111);
        System.out.println(map);

        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(12368798,1);
        linkedHashMap.put(52563278,11);

        linkedHashMap.put(32423422,1111);
        linkedHashMap.put(4353533,11111);
        linkedHashMap.put(52353454,111111111);
        System.out.println(linkedHashMap);

        TreeMap treeMap = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                System.out.println(o1);
                return (int)o2-(int)o1;
            }
        });
        treeMap.put(999,1);
        treeMap.put(111,11);

        treeMap.put(123,1111);
        treeMap.put(654,11111);
        treeMap.put(234,111111111);
        System.out.println("Treemap is: " + treeMap);

        System.out.println(map.entrySet());
        Set entrySet = map.entrySet();

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(11);
        stack.push(111);
        stack.push(1111);
        stack.push(11111);

        System.out.println(stack.get(0));
    }
}

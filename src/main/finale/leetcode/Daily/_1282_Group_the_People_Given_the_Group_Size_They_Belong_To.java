package main.finale.leetcode.Daily;

import java.util.*;

public class _1282_Group_the_People_Given_the_Group_Size_They_Belong_To {

    public static void main(String[] args) {
        List<List<Integer>> res = groupThePeople2(new int[]{3, 3, 3, 3, 3, 1, 3});
        System.out.println(res);
    }

    public static List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> res = new ArrayList<>();
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < groupSizes.length; i++) {
            int gsize = groupSizes[i];
            if (map.containsKey(gsize)) {
                List<Integer> list = map.get(gsize);
                if (list.size() == gsize) {
                    res.add(list);
                    map.remove(gsize);
                    map.put(gsize, new ArrayList<>(Arrays.asList(i)));
                } else {
                    list.add(i);
                    map.put(gsize, list);
                }
            } else {
                map.put(gsize, new ArrayList<>(Arrays.asList(i)));
            }
        }
        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet())
        {
            res.add(entry.getValue());
        }
        return res;
    }

    public static  List<List<Integer>> groupThePeople2(int[] groupSizes) {
        List<List<Integer>> res = new ArrayList<>();
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < groupSizes.length; i++) {
            List<Integer> list = map.computeIfAbsent(groupSizes[i], k -> new ArrayList());
            list.add(i);
            if(list.size() == groupSizes[i]) {
                res.add(list);
                map.put(groupSizes[i], new ArrayList());
            }
        }
        return res;
    }
}

package main.finale.leetcode.Daily;

import java.util.*;

public class _1481_Least_Number_of_Unique_Integers_after_K_Removals {

    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int a : arr)
            count.put(a, 1 + count.getOrDefault(a, 0));
        PriorityQueue<Integer> pq = new PriorityQueue<>(count.values());
        while (k > 0)
            k -= pq.poll();
        return k < 0 ? pq.size() + 1 : pq.size();
    }

    public int findLeastNumOfUniqueInts2(int[] arr, int k) {
        int res = 0;
        SortedMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        System.out.println(map);
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(
                list,
                new Comparator<Map.Entry<Integer, Integer>>() {

                    public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                        return o1.getValue().compareTo(o2.getValue());
                    }
                }
        );
        System.out.println(list);

        System.out.println(list.get(0).getKey());
        int index = 0;
        while (k > 0 && list.size() > 0) {
            int val = list.get(index).getValue();
            k = k - val;
            list.remove(index);
        }
        System.out.println(list);
        return k < 0 ? list.size() + 1 : list.size();
    }
}

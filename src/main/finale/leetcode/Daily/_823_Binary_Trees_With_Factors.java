package main.finale.leetcode.Daily;

import java.util.*;

//Input: arr = [2,4]
//Output: 3
//Explanation: We can make these trees: [2], [4], [4, 2, 2]

public class _823_Binary_Trees_With_Factors {

    public int numFactoredBinaryTrees(int[] arr) {
        long mod = (long) 1e9 + 7;
        Arrays.sort(arr);
        HashMap<Integer, Long> map = new HashMap<>();
        map.put(arr[0], 1l);
        for (int i = 1; i < arr.length; i++) {
            map.put(arr[i], 1l);
            for (int j = 0; j < i; j++) {
                if (arr[i] % arr[j] == 0) {
                    int left = arr[j];
                    int right = arr[i] / arr[j];
                    if (map.containsKey(right)) {
                        map.put(arr[i], (Long) (map.get(arr[i]) + (map.get(left) * map.get(right))));
                    }
                }
            }
        }
        long res = 0;
        for (Map.Entry<Integer, Long> m : map.entrySet()) {
            res = ((res + m.getValue()) % mod);
        }
        return (int) res;
    }
}

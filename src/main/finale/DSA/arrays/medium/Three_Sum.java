package main.finale.DSA.arrays.medium;

import java.util.*;

public class Three_Sum {

    public static void main(String[] args) {
//        List<List<Integer>> res = get3Sum(new int[]{-1,0,1,2,-1,-4}, 1);
//        System.out.println(res);

        List<List<Integer>> res = threeSum(new int[]{-1, 0, 1, 2, -1, -4});
        System.out.println(res);
    }

    public static List<List<Integer>> get3Sum(int[] arr, int key) {
        ArrayList<List<Integer>> res = new ArrayList<>();//IMP the type
        if (arr.length < 3) {
            return new ArrayList<>(res);
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 2; i++) {
            int j = i + 1, k = arr.length - 1;
            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];
                if (sum == key) {
                    res.add(Arrays.asList(arr[i], arr[j++], arr[k--]));
                } else if (sum < key) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return new ArrayList<>(res);
    }


    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            Set<Integer> set = new HashSet<>();
            set.add(nums[i]);
            for (int j = i + 1; j < nums.length - 1; j++) {
                int x = nums[j] + nums[i];
                if (set.contains(x != 0 ? -x : 0)) {
                    List<Integer> arrList = new ArrayList<>();
                    arrList.add(nums[i]);
                    arrList.add(-x);
                    arrList.add(nums[j]);
                    list.add(arrList);
                }
                set.add(nums[j]);
            }
        }
        return list;
    }


}

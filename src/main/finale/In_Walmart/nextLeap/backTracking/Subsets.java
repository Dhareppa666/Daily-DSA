package main.finale.In_Walmart.nextLeap.backTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets {

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3};

        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backTrack(list, new ArrayList<>(), nums, 0);
        System.out.println(list);
    }

    public static void backTrack(List<List<Integer>> list, List<Integer> subList, int[] nums, int start) {
        list.add(new ArrayList(subList));
        for(int i=start; i<nums.length; i++) {
            if(i > start && nums[i] == nums[i-1]) continue; // skip duplicates
            subList.add(nums[i]);
            backTrack(list, subList, nums, i+1);
            subList.remove(subList.size()-1);
        }
    }
}

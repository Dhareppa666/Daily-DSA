package main.finale.arrays;

import java.util.ArrayList;
import java.util.List;

public class SubsetOfAnArray {
    public static void main(String[] args) {
        subsets(new int[]{1,2,3});
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        generateSubsets(0, nums, new ArrayList<Integer>(), subsets);
        for(List<Integer> i : subsets){
            System.out.println(i);
        }
        return subsets;
    }

    public static void generateSubsets(int index, int[] nums, ArrayList<Integer> current,
                                       List<List<Integer>> subsets){
        subsets.add(new ArrayList<>(current));
        for(int i=index; i<nums.length; i++){
            current.add(nums[i]);
            generateSubsets(i+1, nums, current, subsets);
            current.remove(current.size()-1);
        }
    }
}

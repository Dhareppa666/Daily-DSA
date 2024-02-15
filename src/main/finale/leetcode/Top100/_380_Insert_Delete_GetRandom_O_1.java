package main.finale.leetcode.Top100;

import java.util.*;

public class _380_Insert_Delete_GetRandom_O_1 {

    public ArrayList<Integer> nums;
    public HashMap<Integer, Integer> locs;
    java.util.Random rand = new java.util.Random();

    public _380_Insert_Delete_GetRandom_O_1() {
        this.nums = new ArrayList<>();
        this.locs = new HashMap<>();
    }

    public boolean insert(int val) {
        boolean contain = locs.containsKey(val);
        if (contain) {
            return false;
        }
        locs.put(val, nums.size());
        nums.add(val);
        return true;
    }

    public boolean remove(int val) {
        boolean contain = locs.containsKey(val);
        if (!contain) {
            return false;
        }
        int loc = locs.get(val);
        if (loc < nums.size() - 1) {
            int lastone = nums.get(nums.size() - 1);
            nums.set(loc, lastone);
            locs.put(lastone, loc);
        }
        locs.remove(val);
        nums.remove(nums.size() - 1);
        return true;
    }

    public int getRandom() {
        return nums.get(rand.nextInt(nums.size()));
    }
}

package main.finale.DSA.arrays;

import java.util.*;

public class _496_Next_Greater_Element_I {

    public static void main(String[] args) {
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2,5};
        int[] res = nextGreaterElement(nums1, nums2);
        System.out.println(Arrays.toString(res));
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums2) {
            while (!stack.isEmpty() && stack.peek() < n) {
                map.put(stack.pop(), n);
            }
            stack.push(n);
        }
        while (!stack.isEmpty()) {
            map.put(stack.pop(), -1);
        }
         System.out.println(map);

        int[] res = new int[nums1.length];
        for(int x=0; x<nums1.length; x++) {
            res[x] = map.get(nums1[x]);
        }

        return res;
    }
}

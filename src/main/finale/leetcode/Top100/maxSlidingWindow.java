package main.finale.leetcode.Top100;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class maxSlidingWindow {

    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int[] res = maxSlidingWindow(nums, k);
        System.out.println(Arrays.toString(res));
    }

    public static int[] maxSlidingWindow(int[] a, int k) {
        if (a == null || k <= 0) {
            return new int[0];
        }
        int n = a.length;
        int[] r = new int[n - k + 1];
        int ri = 0;
        // store index
        Deque<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < a.length; i++) {
            // remove numbers out of range k
            while (!q.isEmpty() && q.peek() < i - k + 1) {
                q.pollFirst();
            }
            // remove smaller numbers in k range as they are useless
            while (!q.isEmpty() && a[q.peekLast()] < a[i]) {
                q.pollLast();
            }
            // q contains index... r contains content
            q.offer(i);
            if (i >= k - 1) {
                r[ri++] = a[q.peek()];
            }
        }
        return r;
    }

    public static int[] maxSlidingWindow2(int[] nums, int k) {
        int[] res = new int[nums.length-k+1];
        Deque<Integer> deque = new ArrayDeque<>();
        int idx = 0;

        for(int i=0; i<nums.length; i++) {
            // Remove prev window elements if more than k elements
            while(!deque.isEmpty() && deque.peek() < i - k + 1) {
                deque.pollFirst();
            }

            while(!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }

            deque.offer(i);

            if(i>=k-1) {
                res[idx++] = nums[deque.peek()];
            }
        }

        return res;
    }
}
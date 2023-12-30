package main.finale.nextLeap.arrays.medium;

import java.util.*;

public class MaxDifference {

    public static void main(String[] args) {
        int res = getMaxDifference("110000100011");
        System.out.println(res);
    }

    public static int getMaxDifference(String s) {
        int max = -1, curr = 0;
        for(int i=0; i<s.length(); i++) {
            curr += s.charAt(i) == '0' ? 1: -1;
            if(curr<0) {
                curr = 0;
            }
            max = Math.max(curr, max);
        }
        return max ==0 ? -1 : max;
    }

    public static class maximum_of_every_subarray_of_size_K {

        public static void main(String[] args) {
            //nums=[1,2,3,1,4,5,2,3,6] , k=3
            int[] arr = {1,2,3,1,4,5,2,3,6};
            maxOfSubArray3(arr, 3);
            System.out.println(Arrays.toString(arr));

            Deque<Integer> deque = new ArrayDeque<>();
            deque.add(1);
            deque.add(2);
            deque.add(1);
            System.out.println(deque);
        }

        public List<Integer> maxOfSubArray(int[] arr, int k) {
            int n = arr.length;
            Deque<Integer> dq = new ArrayDeque<Integer>();
            List<Integer> ans = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                while (dq.size() != 0 && dq.getFirst() <= (i - k)) {
                    dq.removeFirst();
                }
                while (dq.size() != 0 && arr[i] >= arr[dq.getLast()]) {
                    dq.removeLast();
                }
                dq.addLast(i);
                if ((i - k + 1) >= 0) {
                    ans.add(arr[dq.getFirst()]);
                }
            }
            return ans;
        }

        public static void maxOfSubArray3(int[] arr, int k) {
            for(int i=0; i<arr.length; i++) {
                int max = arr[i];
                for(int j=i; j<i+k && j<arr.length; j++) {
                    if(arr[j] > max) {
                        max = arr[j];
                    }
                }
                arr[i] = max;
            }
        }

        public List<Integer> maxOfSubArray2(int[] arr, int k) {
            List<Integer> list = new ArrayList<>();
            for(int i=0; i<arr.length-(k-1); i++) {
                int max = arr[i];
                for(int j=i; j<i+k && j<arr.length; j++) {
                    if(arr[j] > max) {
                        max = arr[j];
                    }
                }
                list.add(max);
            }
            return list;
        }
    }
}

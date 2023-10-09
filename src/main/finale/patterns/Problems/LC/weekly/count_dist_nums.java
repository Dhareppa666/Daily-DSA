package main.finale.patterns.Problems.LC.weekly;

import java.util.HashSet;

//6205. Count Number of Distinct Integers After Reverse Operations
public class count_dist_nums {

    public static void main(String[] args) {
        count_dist_nums nums = new count_dist_nums();
        int res  = nums.countDistinctIntegers(new int[]{1,13,10,12,31});
        System.out.println(res);
    }

    public int countDistinctIntegers(int[] nums) {
        int length = nums.length;
        int[] arr = new int[length*2];
        int index = length;
        for(int i=0; i<length; i++){
            arr[i] = nums[i];
            arr[index++] = reverseNum(nums[i]);
        }

        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(set.add(arr[i])){
                count++;
            }
        }
        return count;
    }

    public int reverseNum(int num) {//123
        int res = 0;
        while(num>0){
            int mod = num %10;//3
            res = (res * 10) +mod;//3
            num = num/10;//12
        }
        return res;
    }
}

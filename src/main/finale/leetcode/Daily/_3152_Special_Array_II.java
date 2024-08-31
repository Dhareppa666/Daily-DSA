package main.finale.leetcode.Daily;

import java.util.Arrays;

public class _3152_Special_Array_II {

    public static void main(String[] args) {
        int[] nums = {4,3,1,6}, queries[] = {{0,2},{2,3}};
        boolean[] res = isArraySpecial(nums, queries);
        System.out.println(Arrays.toString(res));
    }

    public static boolean[] isArraySpecial(int[] nums, int[][] queries) {
        boolean []ans = new boolean[queries.length]; //Answer array
        int []pre = new int[nums.length]; //Prefix sum array
        //This array denotes number of elements that follow alternating parity till ith index
        pre[0]=1;

        for(int i=1; i<nums.length; i++){
            if(nums[i]%2==0 && nums[i-1]%2!=0) //If alternating parity, set pre[i] = 1 + pre[i-1]
                pre[i]=pre[i-1]+1;
            else if(nums[i]%2!=0 && nums[i-1]%2==0) //If alternating parity, set pre[i] = 1 + pre[i-1]
                pre[i]=pre[i-1]+1;
            else //Else, set pre[i] =  pre[i-1]
                pre[i] = pre[i-1];
        }
        for(int i=0; i<queries.length; i++){
            ans[i] = queries[i][1]-queries[i][0] <= pre[queries[i][1]]-pre[queries[i][0]];
        }
        return ans;
    }
}

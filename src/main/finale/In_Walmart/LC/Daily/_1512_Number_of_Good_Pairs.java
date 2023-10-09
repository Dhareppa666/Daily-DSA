package main.finale.In_Walmart.LC.Daily;

//https://leetcode.com/problems/number-of-good-pairs/?envType=daily-question&envId=2023-10-03
public class _1512_Number_of_Good_Pairs {

    public static void main(String[] args) {
        int res = numIdenticalPairs(new int[]{1,1,1,1});
        System.out.println(res);
    }

    public static int numIdenticalPairs(int[] nums) {
        int count = 0;
        int[] temp = new int[101];
        for(int a: nums) {
            count += temp[a]++;
        }
        return count;
    }
}

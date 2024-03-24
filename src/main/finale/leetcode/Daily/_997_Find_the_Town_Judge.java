package main.finale.leetcode.Daily;

//https://leetcode.com/problems/find-the-town-judge/?envType=daily-question&envId=2024-02-22
public class _997_Find_the_Town_Judge {

    public static void main(String[] args) {
        int n = 2;
        int[][] trust = {{1,2}};
        System.out.println(findJudge(n, trust));
    }

    public static int findJudge(int n, int[][] trust) {
        int[] freq = new int[n + 1];
        for (int[] arr : trust) {
            freq[arr[0]]--;
            freq[arr[1]]++;
        }
        for (int i = 1; i < freq.length; i++) {
            if (freq[i] == n - 1) {
                return i;
            }
        }
        return -1;
    }
}

package main.finale.leetcode.Daily;

import java.util.Arrays;

//https://leetcode.com/problems/assign-cookies/description/?envType=daily-question&envId=2024-01-01
public class _455_Assign_Cookies {

    public static void main(String[] args) {
        int[] g = {1,2,3}, s = {1,1};
        int res = findContentChildren(g, s);
        System.out.println(res);
    }

    public static int findContentChildren(int[] g, int[] s) {
        int res = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int index = 0;
        for(int i=0; i<s.length && index < g.length ; i++) {
            if(s[i] >= g[index]) {
                res++;
                index++;
            }
        }
        return res;
    }
}

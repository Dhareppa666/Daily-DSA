package main.finale.leetcode.Daily;

//https://leetcode.com/problems/compare-version-numbers/?envType=daily-question&envId=2024-05-03
public class _165_Compare_Version_Numbers {

    public static void main(String[] args) {
        int res = compareVersion("1.01","1.002");
        System.out.println(res);
    }

    public static int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        for (int i = 0; i < Math.max(v1.length, v2.length); i++) {
            int num1 = i < v1.length ? Integer.parseInt(v1[i]) : 0;
            int num2 = i < v2.length ? Integer.parseInt(v2[i]) : 0;
            if (num1 < num2) {
                return -1;
            }
            if (num1 > num2) {
                return 1;
            }
        }
        return 0;
    }
}

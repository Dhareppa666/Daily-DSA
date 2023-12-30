package main.finale.leetcode.Daily;

//https://leetcode.com/problems/count-number-of-homogenous-substrings/description/?envType=daily-question&envId=2023-11-09
public class _1759_Count_Number_of_Homogenous_Substrings {

    //Input: s = "abbcccaa"
    //Output: 13
    //Explanation: The homogenous substrings are listed as below:
    //"a"   appears 3 times.
    //"aa"  appears 1 time.
    //"b"   appears 2 times.
    //"bb"  appears 1 time.
    //"c"   appears 3 times.
    //"cc"  appears 2 times.
    //"ccc" appears 1 time.
    //3 + 1 + 2 + 1 + 3 + 2 + 1 = 13.

    public static void main(String[] args) {
        int count = countHomogenous("abbcccaa");//13
        System.out.println(count);
    }

    public static int countHomogenous(String s) {
        int res = 0, prev = 0, count = 0, mod = 1_000_000_007;
        for (int i = 0; i < s.length(); ++i) {
            count = s.charAt(i) == prev ? count + 1 : 1;
            prev = s.charAt(i);
            res = (res + count) % mod;
        }
        return res;
    }
}

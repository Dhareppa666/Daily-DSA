package main.intvs.int2023_24.yulu;

//6th-nov-2024
public class Round_01 {

    // LC HARD: https://leetcode.com/problems/minimum-insertion-steps-to-make-a-string-palindrome/description/
    // What is memory Leak in plain java.
    // defer and async in HTML

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        // input = "abcba",5/2->3  "abcxba" => "abbb" => "aaabaa"
        // go till mid/2 then


        String input = "abc";//"aaabaa";//abcxba // "abcxa" // "aaxac" // "aaba baa"
        if(isPal(input)) {
            //sout... 0
        }
        int leftIdx = 0, rightIdx = input.length()-1;
        int count = input.length() % 2 == 0 ? input.length() : input.length()-1;//4
        while(leftIdx < rightIdx) {
            if(input.charAt(leftIdx) == input.charAt(rightIdx)) {
                count--;//3
            } else {
                break;
            }
            leftIdx++;
            rightIdx--;
        }

        System.out.println("Minimum number of characters to be inserted: " + count);
    }

    public static boolean isPal(String s) {
        int left = 0, right = s.length()-1;
        while(left<right) {
            if(s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

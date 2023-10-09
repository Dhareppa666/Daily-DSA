package main.finale.LeetCode;

class Solution {
    public static void main(String[] args) {
        int x = myAtoi(" -48");
        System.out.println(x);
    }

    public static int myAtoi(String s) {
        if(s == null || s.length()== 0){
            return 0;
        }
        int isNeg = 1;
        int res = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == ' ' || s.charAt(i) > 9 || s.charAt(i) == '-'){

            } else {
                res = (res*10) + Integer.parseInt(String.valueOf(s.charAt(i)));
            }
        }
        if(s.contains("-")){
            isNeg = -1;
        }
        return res*isNeg;
    }
}
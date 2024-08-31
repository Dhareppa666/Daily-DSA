package main.finale.leetcode.Blind_75;

import java.util.Stack;

public class _227_Basic_Calculator_II {

    public static void main(String[] args) {
//        String s = "3+2*2";
        String s = " 3+5 / 2 ";
        int res = calculate(s);
        System.out.println(res);
    }

    public static int calculate(String s) {
        if(s==null || s.length() == 0) {
            return 0;
        }
        int len = s.length();

        Stack<Integer> stack = new Stack<>();
        int num = 0;
        char sign = '+';
        for(int i=0; i<len; i++) {
            if(Character.isDigit(s.charAt(i))) {
                num = (num * 10) + (s.charAt(i)-'0');
            }
            if((!Character.isDigit(s.charAt(i)) && ' ' != s.charAt(i)) || i == len-1) {
                if(sign == '-') {
                    stack.push(-num);
                }
                if(sign == '+') {
                    stack.push(num);
                }
                if(sign == '*') {
                    stack.push(stack.pop()*num);
                }
                if(sign == '/') {
                    stack.push(stack.pop()/num);
                }
                sign = s.charAt(i);
                num = 0;
            }
        }
        int res = 0;
        while(!stack.isEmpty()) {
            res += stack.pop();
        }
        return res;
    }
}

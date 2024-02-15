package main.finale.leetcode.Daily;

import java.util.Stack;

public class _150_Evaluate_Reverse_Polish_Notation {

    public static void main(String[] args) {
        String[] tokens = {"4","13","5","/","+"};
        int res = evalRPN(tokens);
        System.out.println(res);
    }

    public static int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        int res = 0;
        for (String t : tokens) {
            if (stack.isEmpty()) {
                stack.push(t);
            } else {
                if (t.equals("+") || t.equals("-") || t.equals("*") || t.equals("/")) {
                    if (stack.size() < 2) {
                        return -1;
                    } else {
                        String peek1  = stack.pop();
                        String peek2  = stack.pop();
                        res = getForamttedValue(peek2, peek1, t);
                        stack.push(String.valueOf(res));
                    }
                } else {
                    stack.push(t);
                }
            }
        }
        System.out.println(stack);
        return res;
    }

    public static int getForamttedValue(String op1, String op2, String operation) {
        switch (operation) {
            case "-":
                return Integer.valueOf(op1) - Integer.valueOf(op2);
            case "*":
                return Integer.valueOf(op1) * Integer.valueOf(op2);
            case "/":
                return Integer.valueOf(op1) / Integer.valueOf(op2);
            default:
                return Integer.valueOf(op1) + Integer.valueOf(op2);
        }
    }
}

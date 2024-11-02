package main.finale.leetcode.Top100;

import java.util.Stack;

public class PostfixToInfix {

    public static String convertPostfixToInfix(String postfix) {
        Stack<String> stack = new Stack<>();

        for (char c : postfix.toCharArray()) {
            // If the character is an operand, push it to the stack
            if (Character.isLetter(c)) {
                stack.push(String.valueOf(c));
            }
            // If the character is an operator
            else {
                String operand2 = stack.pop(); // Pop the top element
                String operand1 = stack.pop(); // Pop the next top element

                String newExpr = "";
                // Determine if parentheses are needed
                if (c == '+' && !operand1.equals("") && !operand2.equals("")) {
                    newExpr = operand1 + "+" + operand2;
                } else if (c == '*') {
                    if (operand1.contains("+")) {
                        newExpr = "(" + operand1 + ")" + "*" + operand2;
                    } else if (operand2.contains("+")) {
                        newExpr = operand1 + "*" + "(" + operand2 + ")";
                    } else {
                        newExpr = operand1 + "*" + operand2;
                    }
                } else {
                    newExpr = operand1 + c + operand2;
                }
                stack.push(newExpr);
            }
        }

        return stack.pop(); // The final expression is at the top of the stack
    }

    public static void main(String[] args) {
        String postfix1 = "abc+*";
        String postfix2 = "abc*+";

        System.out.println("Infix of " + postfix1 + ": " + convertPostfixToInfix(postfix1)); // Output: a*(b+c)
        System.out.println("Infix of " + postfix2 + ": " + convertPostfixToInfix(postfix2)); // Output: a+b*c
    }
}

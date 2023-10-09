package main.intvs.moothot;
//Q1.
//Find the first repeating element in an array of integers.
//Input: arr[] = {10, 5, 3, 4, 3, 5, 6}
//Output: 5

//Q2.
//2. given a string "abbaccddc" remove the adjacent duplicates in a recursive manner.
//.  such that the output
// o/p: c

//abbeaccddc
//output " aeac

// Double d = 1.5;
// Float f = 1.5f;

import java.util.Stack;

public class Test {

    public static void main(String[] args) {
        String input = "abbeaccddc";
        Q2(input);
    }

    public static void Q2(String input) {
        if (input == null || input.length() <= 1) {
            //return input;
            return;
        }
        Stack<Character> stack = new Stack<>();
        for (int index = 0; index < input.length(); index++) {
            char currentChar = input.charAt(index);
            if (stack.isEmpty()) {
                stack.push(currentChar);
            } else {
                char peekElement = stack.peek();
                if (currentChar == peekElement) {
                    stack.pop();
                } else {
                    stack.push(currentChar);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            char currentChar = (Character) stack.pop();
            sb.append(currentChar);
        }
        System.out.println(sb.reverse().toString());
    }

}

package main.finale.DSA_Through_C.Questiones;

import java.util.Stack;

public class Paratntesis_Check {

    static char arr[];

    static int MAX = 10;

    static int top;

    Paratntesis_Check(int capacity) {
        arr = new char[capacity];
        top = -1;
    }

    public static void main(String[] args) {
        String s = "[{()}]";
        new Paratntesis_Check(10);
        arr = new char[s.length()];
        if (check(s)) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }
    }

    private static boolean check(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                System.out.println("Pushed : "+c);
                push(c);
            } else {
                if (isEmpty()){
                    System.out.println("Invaid Parathns..");
                    return false;
                }
                char peek = peekElement();
                if ((c == ')' && peek == '(') ||
                        (c == '}' && peek == '{') ||
                        (c == ']' && peek == '[')) {
                    System.out.println("Popped : "+c);
                    pop(c);
                } else {
                    System.out.println("Invalid Chars");
                    return false;
                }
            }

        }
        return isEmpty();
    }

    private static boolean isEmpty() {
        return top == -1;
    }

    private static char peekElement() {
        return arr[top];
    }

    private static void pop(char c) {
        if (top == -1) {
            System.out.println("Stack is Underflow.");
            return;
        }
        arr[top] = '\u0000';
        top--;
    }

    private static void push(char c) {
        if (top == MAX - 1) {
            System.out.println("Stack is Overflow.");
            return;
        }
        top++;
        arr[top] = c;
    }

    private static boolean checkk(String s) {
        Stack<Character> stack = new Stack();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                System.out.println("Pushed : "+c);
                stack.push(c);
            } else {
                if (isEmpty()){
                    System.out.println("Invaid Parathns..");
                    return false;
                }
                char peek = stack.pop();
                if ((c == ')' && peek == '(') ||
                        (c == '}' && peek == '{') ||
                        (c == ']' && peek == '[')) {
                    System.out.println("Popped : "+c);
                    pop(c);
                } else {
                    System.out.println("Invalid Chars");
                    return false;
                }
            }

        }
        if (isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}

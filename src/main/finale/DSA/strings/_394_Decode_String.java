package main.finale.DSA.strings;

import java.util.*;

public class _394_Decode_String {

    public static void main(String[] args) {
        String s1 = "3[a]2[bc]";
        String s2 = "3[a2[c]]";
        String res = decodeString(s2);
        System.out.println(res);
    }

    public static String decodeString(String s) {
        String res = "";
        Stack<Integer> counterStack = new Stack<>();
        Stack<String> resStack = new Stack<>();
        int index = 0;
        while (index < s.length()) {
            if (Character.isDigit(s.charAt(index))) {
                int count = 0;
                while (Character.isDigit(s.charAt(index))) {
                    count = 10 * count + (s.charAt(index) - '0');
                    index++;
                }
                counterStack.push(count);
            } else if (s.charAt(index) == '[') {
                resStack.push(res);
                res = "";
                index++;
            } else if (s.charAt(index) == ']') {
                StringBuilder temp = new StringBuilder(resStack.pop());
                int repeatTimes = counterStack.pop();
                for (int i = 0; i < repeatTimes; i++) {
                    temp.append(res);
                }
                res = temp.toString();
                index++;
            } else {
                res += s.charAt(index++);
            }
        }
        return res;
    }

}

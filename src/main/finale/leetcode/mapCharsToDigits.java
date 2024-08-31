package main.finale.leetcode;

import java.util.*;

public class mapCharsToDigits {

    public static void main(String[] args) {
        String res = mapCharsToDigits("b fz");
        System.out.println(res);
    }

    public static String mapCharsToDigits(String input) {
        Map<Character, String> charToDigitMap = new HashMap<>();

        // Mapping characters to corresponding digits
        charToDigitMap.put('a', "2");
        charToDigitMap.put('b', "22");
        charToDigitMap.put('c', "222");
        charToDigitMap.put('d', "3");
        charToDigitMap.put('e', "33");
        charToDigitMap.put('f', "333");
        charToDigitMap.put('g', "4");
        charToDigitMap.put('h', "44");
        charToDigitMap.put('i', "444");
        charToDigitMap.put('j', "5");
        charToDigitMap.put('k', "55");
        charToDigitMap.put('l', "555");
        charToDigitMap.put('m', "6");
        charToDigitMap.put('n', "66");
        charToDigitMap.put('o', "666");
        charToDigitMap.put('p', "7");
        charToDigitMap.put('q', "77");
        charToDigitMap.put('r', "777");
        charToDigitMap.put('s', "7777");
        charToDigitMap.put('t', "8");
        charToDigitMap.put('u', "88");
        charToDigitMap.put('v', "888");
        charToDigitMap.put('w', "9");
        charToDigitMap.put('x', "99");
        charToDigitMap.put('y', "999");
        charToDigitMap.put('z', "9999");
        charToDigitMap.put(' ', "0");

        StringBuilder result = new StringBuilder();
        for (char c : input.toLowerCase().toCharArray()) {
            result.append(charToDigitMap.getOrDefault(c, ""));
        }

        return result.toString();
    }
}

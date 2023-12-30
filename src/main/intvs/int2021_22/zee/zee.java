package main.finale.REAL_TIME_COMP_QUES.zee;

import java.util.*;

public class zee {
    public static void main(String[] args) {
        String str = "kunal";
        List<String> nonRepeatedList = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            String comChar = String.valueOf(str.charAt(i));
            String newString = str.substring(i, str.length() - 1);
            if (!newString.contains(comChar))
                nonRepeatedList.add(comChar);
        }
//        System.out.println(nonRepeatedList);
//        System.out.println(nonRepeatedList.get(1));\
        //////////////
//        nonRepeate1stChar_01();
//        nonRepeate1stChar_02();
        System.out.println(nonRepeate1stChar_03());
    }

    public static void nonRepeate1stChar_01() {
        String inputStr = "btexeter";

        for (char i : inputStr.toCharArray()) {
            if (inputStr.indexOf(i) == inputStr.lastIndexOf(i)) {
                System.out.println("First non-repeating character is: " + i);
                break;
            }
        }
    }

    public static void nonRepeate1stChar_02() {
        String inputStr = "teeter";

        char[] charArray = inputStr.toCharArray();
        for (char c : charArray)
            System.out.print(c + ",");
        System.out.println();

        for (char i : inputStr.toCharArray()) {
            if (inputStr.indexOf(i) == inputStr.lastIndexOf(i)) {
                System.out.println("First non-repeating character is: " + i);
                break;
            }
        }
    }

    public static Character nonRepeate1stChar_03() {
        String str = "teeter";

        HashMap<Character, Integer> map = new LinkedHashMap<>();
        int length = str.length();

        // Scan string and build hash table
        for (int i = 0; i < length; i++) {
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1)
                return entry.getKey();
        }
        return null;
    }
}

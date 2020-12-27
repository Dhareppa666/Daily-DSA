package org.util;

public class formatting {
    public static void main(String[] args) {
        String trackData = "123456789012345678901234567";
        String res = String.format("%s... <length %d>", trackData.substring(0, 3), trackData.length());
        System.out.println(res);
    }
}

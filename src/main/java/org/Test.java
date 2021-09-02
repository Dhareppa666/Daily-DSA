package org;

import java.util.Map;

public class Test {
    public static void main(String[] args) {
        m1(null);
        System.out.println("done");
    }

    private static void m1(Map<String, String > o) {

        o.put("abc", "xyz");
    }
}

package org.LeDurga.Durga_Classes;

public class from_1_to_10 {
    public static void main(String[] args) {
        call01();
        call02();
        call03();
        call04();
    }

    private static void call04() {
        String s = "ABCD123XYZ1";
        System.out.println(s.replaceAll("[A-Z]", "*"));
    }

    private static void call03() {
        String s = "  ABCDDD      ";
        s = s.trim();
        System.out.println(":"+s+":");
    }

    private static void call02() {
        Integer s1 = new Integer(101);
        Integer s2 = new Integer(101);
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }

    private static void call01() {
        String s1 = new String("ABCD");
        String s2 = new String("ABCD");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}

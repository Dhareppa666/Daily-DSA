package org.test;

import javax.validation.constraints.NotNull;

public class test {
    public static void main(String[] args) {

        //int[] x = new int[2147483647]; // *4 == mem Locations
        //System.out.println(x.length);

        /*int[] a = new int[10];
        System.out.println(a);
        System.out.println(a[5]);

        String[] a1 = new String[10];
        System.out.println(a1);
        System.out.println(a1[5]);*/

        String a = m1("XYZ");
        System.out.println(a);

    }

    static String m1(@NotNull String s){
        StringBuilder sb = new StringBuilder("SBC");
        return sb.toString();
    }
}

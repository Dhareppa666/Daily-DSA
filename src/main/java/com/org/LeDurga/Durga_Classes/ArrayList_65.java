package com.org.LeDurga.Durga_Classes;

import java.util.ArrayList;

public class ArrayList_65 {
    public static void main(String[] args) {
        A_List();
    }

    static void A_List() {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(null);
        arr.add(2);
        arr.remove(arr.size() - 1);
        System.out.println(arr);
    }
}

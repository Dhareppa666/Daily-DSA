package main.finale.Java.Collections_In_Java.List;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Example {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("XY");
        al.add("ABC");
        System.out.println();
        //System.out.println(al);

        //==============

        ArrayList<Integer> al2 = new ArrayList<>();
        al2.add(123);
        //=========

        List l1 = new ArrayList<String>(1);
        l1.add("abc");
        l1.add(123);
        l1.add("xyz");
        //l1.remove("xyz");
        l1.add(1);
        l1.remove(2);
        l1.add(2,2);
        System.out.println(l1);
        //===============

        List<Integer> l2 = new ArrayList();
        l2.add(2);

        //Shallow copy---------------------------------------------------------------
        ArrayList<String> ArrList1
                = new ArrayList<String>();

        // Insert elements in ArrayList
        ArrList1.add("Mukul");
        ArrList1.add("Rahul");
        ArrList1.add("Suraj");
        ArrList1.add("Mayank");

        // print ArrayList1
        System.out.println("Original ArrayList = "
                + ArrList1);

        // clone ArrayList
        ArrayList ArrList2
                = (ArrayList)ArrList1.clone();

        ArrList2.add("JB2");

        // print ArrayList2
        System.out.println("Clone ArrayList2 = "
                + ArrList2);

        System.out.println(ArrList1 == ArrList2);
        System.out.println(ArrList1.equals(ArrList2));

    }
}

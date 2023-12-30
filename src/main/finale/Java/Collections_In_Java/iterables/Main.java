package main.finale.Java.Collections_In_Java.iterables;

import main.finale.Java.Collections_In_Java.iterables.OurGenericList;

public class Main {

    public static void main(String[] args) {
        OurGenericList<Integer> list = new OurGenericList<>();
        list.addItem(1);
        list.addItem(2);
        list.addItem(3);

        for(Integer x: list){
            System.out.println(x);
        }
    }
}

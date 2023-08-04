package org.Collections_In_Java.iterables;

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

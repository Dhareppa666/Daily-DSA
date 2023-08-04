package org.LeDurga.extra;

public class Test {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.m1();
        //p.m2();

        Child c = new Child();
        c.m2();
        c.m1();

//        Parent p = new Child();
//        p.m1();
//        //p.m2();

    }
}

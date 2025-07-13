package main.intvs.int2021_22.nokia;

public class Child extends Parent{

    public static void main(String[] args) {
        Child c = new Child();
        c.m2();
        c.m1();
        System.out.println(c.counter);
        System.out.println(counter2);
    }

    @Override
    public void m1() {
        System.out.println("In Child m1()");
    }
}

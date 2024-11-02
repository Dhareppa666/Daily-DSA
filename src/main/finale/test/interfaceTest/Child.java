package main.finale.test.interfaceTest;

public class Child implements Parent{
    @Override
    public void m1() {
        System.out.println("m1 from child");
    }

//    public void m3() {
//        System.out.println("m3 from child");
//    }

    public static void main(String[] args) {
        Parent child = new Child();
        child.m1();
        child.m3();
        Parent.m2();

        System.out.println(Parent.x);
        System.out.println(Parent.y);
    }
}

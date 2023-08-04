package org.LeDurga.interf;

interface p1{
    default void m1(){
        System.out.println("p1");
    }
}

interface p2{
    default void m1(){
        System.out.println("p2");
    }
}

abstract class C implements p1,p2{
    public static void m11(){
        System.out.println("I am in child");
    }
    abstract void mm();

    @Override
    public void m1() {

    }

}

//class all extends C{
//    public static void main(String[] args) {
//        m1();
//    }
//
//    @Override
//    void mm() {
//
//    }
//}

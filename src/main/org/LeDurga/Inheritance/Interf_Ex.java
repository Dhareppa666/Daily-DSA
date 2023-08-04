package org.LeDurga.Inheritance;

interface Interf_Ex {

    void m1(); // By Default public.
    public void m2(); // Normal decl
    default void m3(){} //
    static void m4(){}
}

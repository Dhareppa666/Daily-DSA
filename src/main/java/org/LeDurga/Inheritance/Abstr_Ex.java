package org.LeDurga.Inheritance;

abstract public class Abstr_Ex {

    //Instance variable
    int x;

    //Static variables
    static int y;

    //Constructors
    Abstr_Ex(){ }
    Abstr_Ex(int data){ this.x= data; }

    //Instance block
    {
       int z;
    }

    //Static block
    static {
        int z;
    }

    //Abstract methods
    public abstract void m1();

    //Concrete methods
    public void m2() {
    }

    //Final methods
    public final void m3() {
    }

}

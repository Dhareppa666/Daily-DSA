package org.streams;

class Root {
    {
        System.out.println("Init1");
    }

    public Root() {
        System.out.println("Root Constructor");
    }
}


class Parent extends Root {

    static {
        System.out.println("stat1");
    }

    public Parent() {
        System.out.println("Parent Construtor");
    }

    {
        System.out.println("Int 2");
    }

    static {
        System.out.println("stat2");
    }

}

public class InitStaticBlocks extends Parent {

    public static void main(String[] args) {

        System.out.println("InitStaticBlock");

        new InitStaticBlocks();
    }

}
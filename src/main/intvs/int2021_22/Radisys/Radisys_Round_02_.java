package main.intvs.int2021_22.Radisys;

class Radisyss{
    {
        System.out.println("Instance");
    }
    static {
        System.out.println("Static");
    }
    public Radisyss(){
        System.out.println("Constr");
    }
}
//Static will be called only once.
//Instance block followed by constructor will be called all time.

public class Radisys_Round_02_ {
    public static void main(String[] args) {
        System.out.println("Main-Started.");
        Radisyss radisys = new Radisyss();
        Radisyss radisys2 = new Radisyss();
        System.out.println("Main-Ended.");
    }
}

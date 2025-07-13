package main.intvs.int2021_22.Radisys;

class Radisys{
    // If we have this means Stack Overflow.
    // means calling the same class again and again.
    private Radisys radisys = new Radisys();
    public Radisys(){
        System.out.println("In Radisys Constructor.");
    }
}


public class Radisys_Round_02 {

    public static void main(String[] args) {
        System.out.println("Main-Started.");
        Radisys radisys = new Radisys();

        System.out.println("Main-Ended.");
    }
}

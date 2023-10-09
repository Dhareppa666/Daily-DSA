package main.finale.LeDurga.Inheritance;

//If main class is present in child class, then child class main method execute, else parent class main().
// -> this is called method hiding
public class child extends parent{
    public static void main(String[] args) {
        System.out.println("In Child..");
    }
}

class parent {
    public static void main(String[] args) {
        System.out.println("In Parent..");
    }
}

package main.finale.Design_Pattern.Creational.Factory;

public class MyMain {
    public static void main(String[] args) {
        ProfessionFactory factory = new ProfessionFactory();
        Profession engineer = factory.getProfession("Engineer");

        engineer.print();
    }
}

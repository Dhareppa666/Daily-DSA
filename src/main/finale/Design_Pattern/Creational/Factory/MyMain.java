package main.finale.Design_Pattern.Creational.Factory;

import main.finale.aa.Design_Pattern.Creational.Factory.Profession;
import main.finale.aa.Design_Pattern.Creational.Factory.ProfessionFactory;

public class MyMain {
    public static void main(String[] args) {
        ProfessionFactory factory = new ProfessionFactory();
        Profession engineer = factory.getProfession("Engineer");

        engineer.print();
    }
}

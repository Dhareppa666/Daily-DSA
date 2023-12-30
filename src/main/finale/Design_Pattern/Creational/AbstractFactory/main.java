package main.finale.Design_Pattern.Creational.AbstractFactory;

import main.finale.Design_Pattern.Creational.AbstractFactory.AbstractFactory;
import main.finale.Design_Pattern.Creational.AbstractFactory.AbstractFactoryProducer;

public class main {

    public static void main(String[] args) {
        AbstractFactory profession = AbstractFactoryProducer.getProfession(true);
        profession.getProfession("Engineer").print();
    }
}

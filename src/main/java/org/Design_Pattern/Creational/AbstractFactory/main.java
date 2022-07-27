package org.Design_Pattern.Creational.AbstractFactory;

import java.util.Optional;

public class main {

    public static void main(String[] args) {
        AbstractFactory profession = AbstractFactoryProducer.getProfession(true);
        profession.getProfession("Engineer").print();
    }
}

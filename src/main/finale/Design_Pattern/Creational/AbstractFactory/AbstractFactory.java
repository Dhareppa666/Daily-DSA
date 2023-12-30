package main.finale.Design_Pattern.Creational.AbstractFactory;


import main.finale.aa.Design_Pattern.Creational.AbstractFactory.Profession;

public abstract class AbstractFactory {

    abstract Profession getProfession(String typeOfProfession);

}

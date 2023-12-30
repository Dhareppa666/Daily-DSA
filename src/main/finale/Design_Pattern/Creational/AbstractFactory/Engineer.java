package main.finale.Design_Pattern.Creational.AbstractFactory;

import main.finale.Design_Pattern.Creational.AbstractFactory.Profession;

public class Engineer implements Profession {

    @Override
    public void print() {
        System.out.println("In Print of Engineer class");
    }
}
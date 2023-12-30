package main.finale.Design_Pattern.Creational.Factory;

import main.finale.Design_Pattern.Creational.Factory.Profession;

public class Engineer implements Profession {
    @Override
    public void print() {
        System.out.println("I am Engineer");
    }
}

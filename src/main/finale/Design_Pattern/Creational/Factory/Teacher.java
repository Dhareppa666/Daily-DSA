package main.finale.Design_Pattern.Creational.Factory;

import main.finale.aa.Design_Pattern.Creational.Factory.Profession;

public class Teacher implements Profession {
    @Override
    public void print() {
        System.out.println("I am Teacher");
    }
}

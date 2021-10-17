package org.Design_Pattern.Creational.Singleton;

public class Employee {

    private static Employee singletonInstance = new Employee();

    private Employee() {

    }

    //Get the only object available
    public static Employee getInstance() {
        return singletonInstance;
    }

}

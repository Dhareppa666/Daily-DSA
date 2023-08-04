package org.Design_Pattern.Behavioral.Strategy;

public class Main {

    public static void main(String[] args) {
        Vehicle vehicle = new GoodsVehicle();
        vehicle.drive();

        Vehicle vehicle2 = new OffroadVehicle();
        vehicle2.drive();

        Vehicle vehicle3 = new SportyVehile();
        vehicle3.drive();
    }
}

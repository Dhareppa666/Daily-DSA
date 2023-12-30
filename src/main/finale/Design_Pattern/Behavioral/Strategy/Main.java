package main.finale.Design_Pattern.Behavioral.Strategy;

import main.finale.Design_Pattern.Behavioral.Strategy.GoodsVehicle;
import main.finale.Design_Pattern.Behavioral.Strategy.OffroadVehicle;
import main.finale.Design_Pattern.Behavioral.Strategy.SportyVehile;
import main.finale.Design_Pattern.Behavioral.Strategy.Vehicle;

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

package main.finale.Design_Pattern.Behavioral.Strategy;

import main.finale.Design_Pattern.Behavioral.Strategy.Strategyy.SpecialVehicle;
import main.finale.Design_Pattern.Behavioral.Strategy.Vehicle;

public class OffroadVehicle extends Vehicle {

    public OffroadVehicle() {
        super(new SpecialVehicle());
    }
}

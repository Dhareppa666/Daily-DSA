package main.finale.Design_Pattern.Behavioral.Strategy;

import main.finale.Design_Pattern.Behavioral.Strategy.Strategyy.SpecialVehicle;

public class OffroadVehicle extends Vehicle{

    public OffroadVehicle() {
        super(new SpecialVehicle());
    }
}

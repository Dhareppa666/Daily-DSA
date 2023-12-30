package main.finale.Design_Pattern.Behavioral.Strategy;

import main.finale.Design_Pattern.Behavioral.Strategy.Strategyy.SpecialVehicle;
import main.finale.Design_Pattern.Behavioral.Strategy.Vehicle;

public class SportyVehile extends Vehicle {

    public SportyVehile() {
        super(new SpecialVehicle());
    }
}

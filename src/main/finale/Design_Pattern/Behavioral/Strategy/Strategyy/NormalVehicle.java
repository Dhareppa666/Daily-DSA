package main.finale.Design_Pattern.Behavioral.Strategy.Strategyy;

import main.finale.aa.Design_Pattern.Behavioral.Strategy.Strategyy.Strategy;

public class NormalVehicle implements Strategy {
    @Override
    public void drive() {
        System.out.println("Normal Vehicle");
    }
}

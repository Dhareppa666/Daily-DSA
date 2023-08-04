package org.Design_Pattern.Behavioral.Strategy.Strategyy;

public class NormalVehicle implements Strategy{
    @Override
    public void drive() {
        System.out.println("Normal Vehicle");
    }
}

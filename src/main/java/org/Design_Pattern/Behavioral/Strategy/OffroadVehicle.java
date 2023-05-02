package org.Design_Pattern.Behavioral.Strategy;

import org.Design_Pattern.Behavioral.Strategy.Strategyy.SpecialVehicle;

public class OffroadVehicle extends Vehicle{

    public OffroadVehicle() {
        super(new SpecialVehicle());
    }
}

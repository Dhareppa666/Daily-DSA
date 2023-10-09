package org.Design_Pattern.Behavioral.Strategy;

import org.Design_Pattern.Behavioral.Strategy.Strategyy.SpecialVehicle;

public class SportyVehile extends Vehicle{

    public SportyVehile() {
        super(new SpecialVehicle());
    }
}

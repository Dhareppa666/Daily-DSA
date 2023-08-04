package org.Design_Pattern.Behavioral.Strategy;

import org.Design_Pattern.Behavioral.Strategy.Strategyy.NormalVehicle;

public class GoodsVehicle extends Vehicle{
    public GoodsVehicle() {
        super(new NormalVehicle());
    }
}

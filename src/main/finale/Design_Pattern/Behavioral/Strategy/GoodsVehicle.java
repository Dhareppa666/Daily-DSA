package main.finale.Design_Pattern.Behavioral.Strategy;

import main.finale.Design_Pattern.Behavioral.Strategy.Strategyy.NormalVehicle;

public class GoodsVehicle extends Vehicle{
    public GoodsVehicle() {
        super(new NormalVehicle());
    }
}

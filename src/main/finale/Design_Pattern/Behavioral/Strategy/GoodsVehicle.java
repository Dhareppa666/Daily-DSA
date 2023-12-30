package main.finale.Design_Pattern.Behavioral.Strategy;

import main.finale.aa.Design_Pattern.Behavioral.Strategy.Strategyy.NormalVehicle;
import main.finale.aa.Design_Pattern.Behavioral.Strategy.Vehicle;

public class GoodsVehicle extends Vehicle {
    public GoodsVehicle() {
        super(new NormalVehicle());
    }
}

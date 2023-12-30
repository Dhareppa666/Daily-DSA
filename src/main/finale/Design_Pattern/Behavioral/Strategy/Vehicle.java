package main.finale.Design_Pattern.Behavioral.Strategy;

import main.finale.Design_Pattern.Behavioral.Strategy.Strategyy.Strategy;

public class Vehicle {

    public Strategy strategy;

    public Vehicle(Strategy obj){
        this.strategy = obj;
    }

    public void drive(){
        strategy.drive();
    }

}

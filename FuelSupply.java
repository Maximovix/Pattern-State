package com.company;

public abstract class FuelSupply {
    FuelIndicator fuelIndicator;

    FuelSupply (FuelIndicator fuelIndicator){
        this.fuelIndicator = fuelIndicator;
    }

    public abstract String notifyFuelSupply();
    public abstract String notFullFefueling();
    public abstract String fullFefueling();
    public abstract String notFarTrip();
    public abstract String farTrip();
}

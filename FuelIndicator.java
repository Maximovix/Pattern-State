package com.company;

public class FuelIndicator {
    private FuelSupply fuelSupply;

    FuelIndicator(FuelSupply fuelSupply){
        this.fuelSupply = fuelSupply;
    }

    public void changeState(FuelSupply fuelSupply){
        this.fuelSupply = fuelSupply;
    }

    public FuelSupply getState(){
        return this.fuelSupply;
    }
}

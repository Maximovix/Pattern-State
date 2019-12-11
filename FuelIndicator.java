package com.company;

public class FuelIndicator {
    private FuelSupply fuelSupply;

    FuelIndicator(){
        this.fuelSupply = new Empty(this,0);
    }

    public void changeState(FuelSupply fuelSupply){
        this.fuelSupply = fuelSupply;
    }

    public FuelSupply getState(){
        return this.fuelSupply;
    }
}

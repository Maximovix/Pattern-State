package com.company;

public class FuelIndicator {
    private FuelSupply fuelSupply;
    private int indicatorValue = 0;

    FuelIndicator(){
        this.fuelSupply = new Empty(this,0);
    }

    public void changeState(FuelSupply fuelSupply){
        this.fuelSupply = fuelSupply;
    }

    public FuelSupply getState(){
        return this.fuelSupply;
    }

    public void setIndicatorValue(int value){
        this.indicatorValue = value;
    }

    public int getIndicatorValue(){
        return this.indicatorValue;
    }
}

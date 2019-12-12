package com.company;

public class Full extends FuelSupply {
    private int refill;

    Full(FuelIndicator fuelIndicator, int refill) {
        super(fuelIndicator);
        this.refill = refill;
    }

    @Override
    public String notifyFuelSupply() {
        return "Топлива полный бак!";
    }

    @Override
    public String notFullFefueling() {
        return "В неполной заправке нет необходимости.";
    }

    @Override
    public String fullFefueling() {
        return "В полной заправке нет необходимости.";
    }

    @Override
    public String notFarTrip() {
        refill = refill - 34;
        fuelIndicator.setIndicatorValue(refill);
        fuelIndicator.changeState(new Enough(fuelIndicator, refill));
        return "В небольшой поездке израсходовалось немного топливо.";
    }

    @Override
    public String farTrip() {
        refill = 0;
        fuelIndicator.setIndicatorValue(refill);
        fuelIndicator.changeState(new Empty(fuelIndicator, refill));
        return "В большой поездке израсходовалось все топливо.";
    }
}

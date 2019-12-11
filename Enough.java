package com.company;

public class Enough extends FuelSupply {
    private int refill;

    Enough(FuelIndicator fuelIndicator, int refill) {
        super(fuelIndicator);
        this.refill = refill;
    }

    @Override
    public String notifyFuelSupply() {
        return "Топлива достаточно. Можно немного прокатиться";
    }

    @Override
    public String notFullFefueling() {
        refill = 100;
        fuelIndicator.changeState(new Full(fuelIndicator, refill));
        return "Небольшая заправка. Можно отправиться куда подальше";
    }

    @Override
    public String FullFefueling() {
        return "В полной заправке нет необходимости";
    }

    @Override
    public String notFarTrip() {
        refill = 0;
        fuelIndicator.changeState(new Empty(fuelIndicator, refill));
        return "В небольшой поездке израсходовалось все топливо";
    }

    @Override
    public String FarTrip() {
        return "Поездка невозможна";
    }
}

package com.company;

public class Enough extends FuelSupply {
    private int refill;

    Enough(FuelIndicator fuelIndicator, int refill) {
        super(fuelIndicator);
        this.refill = refill;
    }

    @Override
    public String notifyFuelSupply() {
        return "Топлива достаточно. Можно немного прокатиться.";
    }

    @Override
    public String notFullFefueling() {
        refill = refill + 34;
        fuelIndicator.setIndicatorValue(refill);
        if (refill < 100){
            fuelIndicator.changeState(new Enough(fuelIndicator,refill));
            return "Неполная заправка. Можно немного прокатиться.";
        }else {
            fuelIndicator.changeState(new Full(fuelIndicator, refill));
            return "Полная заправка. Можно отправиться куда подальше.";
        }
    }

    @Override
    public String fullFefueling() {
        refill = 100;
        fuelIndicator.setIndicatorValue(refill);
        fuelIndicator.changeState(new Full(fuelIndicator, refill));
        return "Полная заправка. Можно отправиться куда подальше.";
    }

    @Override
    public String notFarTrip() {
        refill = refill - 34;
        fuelIndicator.setIndicatorValue(refill);
        if (refill <= 0){
            fuelIndicator.changeState(new Empty(fuelIndicator,refill));
            return "В небольшой поездке израсходовалось все топливо.";
        }else {
            fuelIndicator.changeState(new Enough(fuelIndicator, refill));
            return "В небольшой поездке израсходовалось немного топливо.";
        }
    }

    @Override
    public String farTrip() {
        return "Поездка невозможна.";
    }
}

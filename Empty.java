package com.company;

public class Empty extends FuelSupply {
    private int refill;

    Empty(FuelIndicator fuelIndicator,int refill) {
        super(fuelIndicator);
        this.refill = refill;
    }

    @Override
    public String notifyFuelSupply() {
        return "Запас топлива пуст, необходимо заправиться";
    }

    @Override
    public String notFullFefueling() {
        refill = refill + 30;
        fuelIndicator.changeState(new Enough(fuelIndicator,refill));
        return "Неполная заправка. Можно немного прокатиться";
    }

    @Override
    public String FullFefueling() {
        refill = 100;
        fuelIndicator.changeState(new Full(fuelIndicator,refill));
        return "Полная заправка. Можно отправиться куда подальше";
    }

    @Override
    public String notFarTrip() {
        return "Поездка невозможна";
    }

    @Override
    public String FarTrip() {
        return "Поездка невозможна";
    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
        FuelIndicator indicator = new FuelIndicator();
        System.out.println(indicator.getState().notifyFuelSupply());
        System.out.println(indicator.getState().notFullFefueling());
        System.out.println(indicator.getState().notifyFuelSupply());
        System.out.println(indicator.getState().notFullFefueling());
        System.out.println(indicator.getState().notifyFuelSupply());
        System.out.println(indicator.getState().FarTrip());
        System.out.println(indicator.getState().notifyFuelSupply());
    }
}

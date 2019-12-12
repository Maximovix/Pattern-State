package com.company;

public class Main {

    public static void main(String[] args) {
        FuelIndicator indicator = new FuelIndicator();
        GUI gui = new GUI(indicator);
        gui.GUI();
    }
}

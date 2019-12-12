package com.company;

import javax.swing.*;
import java.awt.*;

public class GUI {
    private FuelIndicator fuelIndicator;

    GUI (FuelIndicator fuelIndicator){
        this.fuelIndicator = fuelIndicator;
    }

    public void GUI(){
        JFrame frame = new JFrame("Indicator of Fuel");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPanel context = new JPanel();
        frame.setBounds(600,500,700,180);
        frame.setVisible(true);

        JPanel text = new JPanel();
        JTextField textField = new JTextField();
        textField.setColumns(60);
        text.add(textField);

        JPanel indicator = new JPanel();
        JLabel lebelIndicator = new JLabel("Индикатор топлива");
        JProgressBar progress = new JProgressBar();
        progress.setValue(63);
        indicator.add(lebelIndicator);
        indicator.add(progress);

        JPanel buttons = new JPanel();
        JButton notFullFefueling = new JButton("Не полная заправка");
        JButton fullFefueling = new JButton("Полная заправка");
        JButton notFarTrip = new JButton("Не большая поездка");
        JButton farTrip = new JButton("Дальняя поездка");
        buttons.add(notFullFefueling);
        buttons.add(fullFefueling);
        buttons.add(notFarTrip);
        buttons.add(farTrip);

        context.add(text, BorderLayout.NORTH);
        context.add(indicator, BorderLayout.CENTER);
        context.add(buttons, BorderLayout.SOUTH);
        frame.getContentPane().add(context);
    }
}

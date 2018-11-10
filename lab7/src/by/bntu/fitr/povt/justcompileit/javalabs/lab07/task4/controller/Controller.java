package by.bntu.fitr.povt.justcompileit.javalabs.lab07.task4.controller;

import by.bntu.fitr.povt.justcompileit.javalabs.lab07.printer.Printer;
import by.bntu.fitr.povt.justcompileit.javalabs.lab07.task4.model.Dice;

public class Controller {

    public static void main(String[] args) {

        Dice dice1 = new Dice();
        Dice dice2 = new Dice();

        Printer.view("Dropped first num: " + dice1.getDroppedNumber());
        Printer.view("Dropped second num: " + dice2.getDroppedNumber());
        Printer.view("Total sum: " + (dice1.getDroppedNumber() + dice2.getDroppedNumber()));
    }

}

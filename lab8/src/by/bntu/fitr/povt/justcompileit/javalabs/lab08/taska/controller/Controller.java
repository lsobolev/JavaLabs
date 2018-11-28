package by.bntu.fitr.povt.justcompileit.javalabs.lab08.taska.controller;

import by.bntu.fitr.povt.justcompileit.javalabs.lab08.printer.Printer;
import by.bntu.fitr.povt.justcompileit.javalabs.lab08.taska.model.NumberWorker;
import by.bntu.fitr.povt.justcompileit.javalabs.lab08.userinput.UserInput;

public class Controller {

    public static void main(String[] args) {

        int num = UserInput.inputNaturalNumber("Input your number: ");
        String result = NumberWorker.calculateSumOfNumberOfDigit(num);

        Printer.view(result);
    }
}

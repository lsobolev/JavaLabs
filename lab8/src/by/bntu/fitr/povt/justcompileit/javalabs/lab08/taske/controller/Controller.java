package by.bntu.fitr.povt.justcompileit.javalabs.lab08.taske.controller;

import by.bntu.fitr.povt.justcompileit.javalabs.lab08.printer.Printer;
import by.bntu.fitr.povt.justcompileit.javalabs.lab08.taske.model.NumberWorker;
import by.bntu.fitr.povt.justcompileit.javalabs.lab08.userinput.UserInput;

public class Controller {

    public static void main(String[] args) {
        int num = UserInput.inputInt("Input number of element: ");

        String result = NumberWorker.getFibonacciSequence(num);

        Printer.view("\nFibonacci sequence:\n" + result);
    }

}

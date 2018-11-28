package by.bntu.fitr.povt.justcompileit.javalabs.lab08.taskc.controller;

import by.bntu.fitr.povt.justcompileit.javalabs.lab08.printer.Printer;
import by.bntu.fitr.povt.justcompileit.javalabs.lab08.taskc.model.NumberWorker;
import by.bntu.fitr.povt.justcompileit.javalabs.lab08.userinput.UserInput;

public class Controller {

    public static void main(String[] args) {
        long num = UserInput.inputLong("Input your number: ");

        String result = NumberWorker.isSequence(num);

        Printer.view(result);
    }
}

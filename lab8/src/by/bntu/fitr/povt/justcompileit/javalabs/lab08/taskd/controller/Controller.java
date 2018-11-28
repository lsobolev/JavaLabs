package by.bntu.fitr.povt.justcompileit.javalabs.lab08.taskd.controller;

import by.bntu.fitr.povt.justcompileit.javalabs.lab08.printer.Printer;
import by.bntu.fitr.povt.justcompileit.javalabs.lab08.taskd.model.NumberWorker;
import by.bntu.fitr.povt.justcompileit.javalabs.lab08.userinput.UserInput;

public class Controller {

    public static void main(String[] args) {

        long num = UserInput.inputLong("Input your number: ");

        long result = NumberWorker.duplicationMaxNum(num);

        Printer.view(result);
    }
}

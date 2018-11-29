package by.bntu.fitr.povt.justcompileit.javalabs.lab08.taskb.controller;

import by.bntu.fitr.povt.justcompileit.javalabs.lab08.printer.Printer;
import by.bntu.fitr.povt.justcompileit.javalabs.lab08.taskb.model.NumberWorker;
import by.bntu.fitr.povt.justcompileit.javalabs.lab08.userinput.UserInput;

public class Controller {

    public static void main(String[] args) {

        int num = UserInput.inputInt("Input your number: ");

        String result = NumberWorker.checkContainNumberEvenNumbers(num);

        Printer.view(result);
    }

}

package by.bntu.fitr.povt.justcompileit.javalabs.lab07.task2.сontroller;

import by.bntu.fitr.povt.justcompileit.javalabs.lab07.userinput.UserInput;
import by.bntu.fitr.povt.justcompileit.javalabs.lab07.printer.Printer;
import by.bntu.fitr.povt.justcompileit.javalabs.lab07.task2.model.Number;

public class Controller {

    public static void main(String[] args) {

        double num1 = UserInput.inputDouble("Input first num: ");
        double num2 = UserInput.inputDouble("Input second num: ");
        double num3 = UserInput.inputDouble("Input third num: ");

        String result = Number.maxNumber(num1, num2, num3);

        Printer.view(result);

    }
}

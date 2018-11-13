package by.bntu.fitr.povt.justcompileit.javalabs.lab07.task1.controller;


import by.bntu.fitr.povt.justcompileit.javalabs.lab07.printer.Printer;
import by.bntu.fitr.povt.justcompileit.javalabs.lab07.userinput.UserInput;
import by.bntu.fitr.povt.justcompileit.javalabs.lab07.task1.model.Dragon;


public class Controller {
    public static void main(String[] args) {

        String name = UserInput.inputString("Input Dragon name: ");
        int age = UserInput.inputInt("Input Age: ");

        Dragon dragon = new Dragon(name, age);

        Printer.view(dragon);

    }
}

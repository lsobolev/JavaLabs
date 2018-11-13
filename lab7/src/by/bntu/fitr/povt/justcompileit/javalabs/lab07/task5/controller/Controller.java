package by.bntu.fitr.povt.justcompileit.javalabs.lab07.task5.controller;

import by.bntu.fitr.povt.justcompileit.javalabs.lab07.printer.Printer;
import by.bntu.fitr.povt.justcompileit.javalabs.lab07.task5.model.Letter;
import by.bntu.fitr.povt.justcompileit.javalabs.lab07.userinput.UserInput;


public class Controller {

    public static void main(String[] args) {

        char letter = UserInput.inputChar("Input letter: ");

        String result = Letter.isVowel(letter);

        Printer.view("Letter " + "\'" + letter + "\'" + " is " + result + "." );

    }

}

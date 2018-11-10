package by.bntu.fitr.povt.justcompileit.javalabs.lab07.task5.controller;

import by.bntu.fitr.povt.justcompileit.javalabs.lab07.userinput.UserInput;
import by.bntu.fitr.povt.justcompileit.javalabs.lab07.printer.Printer;
import by.bntu.fitr.povt.justcompileit.javalabs.lab07.task5.model.Letter;

public class Controller {

    public static void main(String[] args) {

        char letter = UserInput.inputChar("Input letter: ");

        boolean result = Letter.isVowels(letter);

        Printer.view("Letter " + "\'" + letter + "\'" + " is " + (result ? "vowel." : "consonant."));

    }

}

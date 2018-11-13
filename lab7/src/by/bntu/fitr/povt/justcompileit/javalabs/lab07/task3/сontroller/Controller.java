package by.bntu.fitr.povt.justcompileit.javalabs.lab07.task3.сontroller;

import by.bntu.fitr.povt.justcompileit.javalabs.lab07.printer.Printer;
import by.bntu.fitr.povt.justcompileit.javalabs.lab07.task3.model.MyMood;


public class Controller {
    public static void main(String[] args) {

        MyMood myMood = new MyMood();

        Printer.view("Your mood is now: " + myMood.getMyMood());

    }
}

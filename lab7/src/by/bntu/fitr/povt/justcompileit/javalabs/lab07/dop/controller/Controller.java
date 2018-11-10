package by.bntu.fitr.povt.justcompileit.javalabs.lab07.dop.controller;

import by.bntu.fitr.povt.justcompileit.javalabs.lab07.dop.model.MyCalendar;
import by.bntu.fitr.povt.justcompileit.javalabs.lab07.printer.Printer;
import by.bntu.fitr.povt.justcompileit.javalabs.lab07.userinput.UserInput;


public class Controller {

    public static void main(String[] args) {

        int day = UserInput.inputInt("Input day: ");
        int month = UserInput.inputInt("Input month: ");
        int year = UserInput.inputInt("Input year: ");

        MyCalendar myCalendar = new MyCalendar(year, month, day);

        String nextDay = myCalendar.calculateNextDay();

        Printer.view(myCalendar);
        Printer.view("Next day: " + nextDay);

    }

}

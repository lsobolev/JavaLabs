package by.bntu.fitr.povt.justcompileit.javatasks.task3.controller;

import by.bntu.fitr.povt.justcompileit.javatasks.task3.model.entity.IntegerVector;
import by.bntu.fitr.povt.justcompileit.javatasks.task3.printer.Printer;

public class Controller {

    public static void main(String[] args) {

        IntegerVector vector = new IntegerVector(new int[]{1, 2, 3});
        Printer.view(vector.toString());
    }

}

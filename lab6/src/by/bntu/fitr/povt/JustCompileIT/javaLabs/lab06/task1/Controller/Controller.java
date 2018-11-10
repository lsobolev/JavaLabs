package by.bntu.fitr.povt.JustCompileIT.javaLabs.lab06.task1.Controller;

import by.bntu.fitr.povt.JustCompileIT.javaLabs.lab06.Printer.Printer;
import by.bntu.fitr.povt.JustCompileIT.javaLabs.lab06.UserInput.UserInput;
import by.bntu.fitr.povt.JustCompileIT.javaLabs.lab06.task1.Model.Entity.Triangle;
import by.bntu.fitr.povt.JustCompileIT.javaLabs.lab06.task1.Model.Logic.TriangleWorker;

public class Controller {
    public static void main(String[] args) {
        double a = UserInput.inputDouble("Input side a: ");
        double b = UserInput.inputDouble("Input side b: ");

        Triangle triangle = new Triangle(a, b);

        double hypotenuse = TriangleWorker.calculateHypotenuse(triangle);
        double perimeter = TriangleWorker.calculatePerimeter(triangle);
        double square = TriangleWorker.calculateSquare(triangle);

        Printer.view(triangle);
        Printer.view("Hypotenuse: " + hypotenuse);
        Printer.view("Perimeter: " + perimeter);
        Printer.view("Square: " + square);
    }
}

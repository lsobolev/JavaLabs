package by.bntu.fitr.povt.JustCompileIT.javaLabs.lab06.task2.Controller;

import by.bntu.fitr.povt.JustCompileIT.javaLabs.lab06.Printer.Printer;
import by.bntu.fitr.povt.JustCompileIT.javaLabs.lab06.UserInput.UserInput;
import by.bntu.fitr.povt.JustCompileIT.javaLabs.lab06.task2.Model.Entity.Ring;
import by.bntu.fitr.povt.JustCompileIT.javaLabs.lab06.task2.Model.Logic.RingWorker;

/**
 * @author Just compile IT
 * @since 1.0
 */
public class Controller {
    public static void main(String[] args) {
        double outerRadius = UserInput.inputDouble("Input outer radius Ring: ");
        double innerRadius = UserInput.inputDouble("Input inner radius Ring: ");
        Ring ring = new Ring(outerRadius, innerRadius);
        double square = RingWorker.calculateSquareRing(ring);
        Printer.view(ring);
        Printer.view("Square Ring: " + square);
    }
}

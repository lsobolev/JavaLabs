package by.bntu.fitr.povt.JustCompileIT.javaLabs.lab06.task1.Model.Entity;

/**
 * @author Just compile IT
 * @since 1.0
 * This class represents triangle model
 */

public class Triangle {

    private double sideA;
    private double sideB;

    public Triangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    @Override
    public String toString() {
        return "Triangle:" +
                " Side A = " + sideA +
                ", Side B = " + sideB;
    }
}

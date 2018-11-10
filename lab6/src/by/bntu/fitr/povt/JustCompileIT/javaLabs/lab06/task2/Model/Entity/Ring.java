package by.bntu.fitr.povt.JustCompileIT.javaLabs.lab06.task2.Model.Entity;

/**
 * @author Just compile IT
 * @since 1.0
 * This class represents ring model
 */

public class Ring {

    private double outerRadius, innerRadius;

    public Ring(double outerRadius, double innerRadius) {
        this.innerRadius = innerRadius;
        this.outerRadius = outerRadius;
    }

    public double getOuterRadius() {
        return outerRadius;
    }

    public double getInnerRadius() {
        return innerRadius;
    }

    @Override
    public String toString() {
        return "Ring: " +
                "Outer Radius = " + outerRadius +
                ", Inner Radius = " + innerRadius;
    }
}

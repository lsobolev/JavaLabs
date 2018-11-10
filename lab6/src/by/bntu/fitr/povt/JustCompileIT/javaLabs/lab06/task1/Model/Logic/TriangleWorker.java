package by.bntu.fitr.povt.JustCompileIT.javaLabs.lab06.task1.Model.Logic;

import by.bntu.fitr.povt.JustCompileIT.javaLabs.lab06.task1.Model.Entity.Triangle;

/**
 * This class represents a set of methods for work with triangle model
 * @author Just compile IT
 * @since 1.0
 */

public class TriangleWorker {

    /**
     * Calculate value hypotenuse triangle
     * @param obj
     * @return value hypotenuse triangle
     */

    public static double calculateHypotenuse(Triangle obj) {
        double sideA = obj.getSideA();
        double sideB = obj.getSideB();
        return Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));
    }

    /**
     * Calculate value square triangle
     * @param obj
     * @return value square triangle
     */

    public static double calculateSquare(Triangle obj) {
        return 0.5 * obj.getSideA() * obj.getSideB();
    }

    /**
     * Calculate value perimeter triangle
     * @param obj
     * @return value perimeter triangle
     */

    public static double calculatePerimeter(Triangle obj) {
        double sideA = obj.getSideA();
        double sideB = obj.getSideB();
        return calculateHypotenuse(obj) + sideA + sideB;
    }

}

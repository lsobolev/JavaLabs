package by.bntu.fitr.povt.JustCompileIT.javaLabs.lab06.task2.Model.Logic;

import by.bntu.fitr.povt.JustCompileIT.javaLabs.lab06.task2.Model.Entity.Ring;

/**
 * This class represents a set of methods for work with ring model
 * @author Just compile IT
 * @since 1.0
 */

public class RingWorker {

    /**
     * The method calculates the square of a ring
     * @param obj
     * @return Square Ring
     */

    public static double calculateSquareRing(Ring obj) {
        double outerRadius = obj.getOuterRadius();
        double innerRadius = obj.getInnerRadius();
        return Math.PI * (Math.pow(outerRadius, 2) - Math.pow(innerRadius, 2));
    }
}

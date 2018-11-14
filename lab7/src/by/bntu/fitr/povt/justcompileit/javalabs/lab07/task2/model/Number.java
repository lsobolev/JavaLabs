package by.bntu.fitr.povt.justcompileit.javalabs.lab07.task2.model;

public class Number {

    public static int maxNumber(int num1, int num2, int num3) {

        int result;

        if (num1 > num2 && num1 > num3) {
            result = num1;
        } else if (num2 > num1 && num2 > num3) {
            result = num2;
        } else {
            result = num3;
        }

        return result;
    }

    public static double maxNumber(double num1, double num2, double num3) {

        double result;

        if (num1 > num2 && num1 > num3) {
            result = num1;
        } else if (num2 > num1 && num2 > num3) {
            result = num2;
        } else {
            result = num3;
        }

        return result;
    }
}

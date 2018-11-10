package by.bntu.fitr.povt.justcompileit.javalabs.lab07.task2.model;

public class Number {

    public static String maxNumber(double num1, double num2, double num3) {

        StringBuilder result = new StringBuilder();

        if (num1 == num2 && num1 == num3) {
            result.append("\nAll numbers are equal!\n");
        } else if (num1 == num2) {
            result.append("\nFirst number is the equal to the second number!\n");
        } else if (num1 == num3) {
            result.append("\nFirst number is the equal to the third number!\n");
        } else if (num2 == num3) {
            result.append("\nSecond number is the equal to the third!\n");
        }

        if (num1 > num2 && num1 > num3) {
            result.append("Max num: ");
            result.append(Double.toString(num1));
        } else if (num2 > num3 && num2 > num3) {
            result.append("Max num: ");
            result.append(Double.toString(num2));
        } else {
            result.append("Max num: ");
            result.append(Double.toString(num3));
        }
        return result.toString();
    }
}

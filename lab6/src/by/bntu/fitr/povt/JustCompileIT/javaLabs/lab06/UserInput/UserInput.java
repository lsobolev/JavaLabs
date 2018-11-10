package by.bntu.fitr.povt.JustCompileIT.javaLabs.lab06.UserInput;


import java.util.Scanner;

/**
 * The user class for work with the system console.
 * Allows to obtain data which the user enters into the system console.
 *
 * @author Just compile IT
 */

public class UserInput {


    /**
     * Method for receiving Integer number
     *
     * @param string
     * @return Int numb
     */
    public static int inputInt(String string) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(string);
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else {
            System.out.println("Not num!");
            return inputInt(string);
        }
    }

    /**
     * Method for receiving Double number
     *
     * @param string
     * @return Double num
     */

    public static double inputDouble(String string) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(string);
        if (scanner.hasNextDouble()) {
            return scanner.nextDouble();
        } else {
            System.out.println("Not num!");
            return inputDouble(string);
        }
    }

}
package by.bntu.fitr.povt.justcompileit.javalabs.lab08.taska.model;

public class NumberWorker {

    private static final int DECIMAL_BASE = 10;
    private static final String DEFAULT_ANSWER = "Sum digits of number is: ";

    public static String calculateSumOfNumberOfDigit(int num) {

        int sum = 0;

        while (num > 0) {
            sum += num % DECIMAL_BASE;
            num /= DECIMAL_BASE;
        }
        return String.format(DEFAULT_ANSWER + "%d", sum);
    }

}

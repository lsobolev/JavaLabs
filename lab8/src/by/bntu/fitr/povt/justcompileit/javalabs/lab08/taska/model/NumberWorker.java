package by.bntu.fitr.povt.justcompileit.javalabs.lab08.taska.model;

public class NumberWorker {

    private static final int DECIMAL_BASE = 10;
    private static final int MIN_DIGIT_IN_DECIMAL_BASE = 0;
    private static final String DEFAULT_ANSWER = "Sum digits of number is: ";

    public static String calculateSumOfNumberOfDigit(int num) {

        int sum = MIN_DIGIT_IN_DECIMAL_BASE;

        while (num > MIN_DIGIT_IN_DECIMAL_BASE) {
            sum += num % DECIMAL_BASE;
            num /= DECIMAL_BASE;
        }
        return String.format(DEFAULT_ANSWER + "%d", sum);
    }

}

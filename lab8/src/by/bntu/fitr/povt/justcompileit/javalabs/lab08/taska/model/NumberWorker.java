package by.bntu.fitr.povt.justcompileit.javalabs.lab08.taska.model;

public class NumberWorker {

    private static final int DECIMAL_BASE = 10;
    private static final int MIN_DIGIT_IN_DECIMAL_BASE = 0;

    private static final String INVALID_DATA = "Invalid data!";
    private static final String DEFAULT_ANSWER = "Sum digits of number is: ";

    public static String calculateSumOfNumberOfDigit(int num) {

        String result = DEFAULT_ANSWER;

        if (num > 0) {
            int sum = MIN_DIGIT_IN_DECIMAL_BASE;

            while (num > MIN_DIGIT_IN_DECIMAL_BASE) {
                sum += num % DECIMAL_BASE;
                num /= DECIMAL_BASE;
            }
            result += sum;
        } else {
            result = INVALID_DATA;
        }
        return result;
    }

}

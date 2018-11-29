package by.bntu.fitr.povt.justcompileit.javalabs.lab08.taskc.model;

public class NumberWorker {

    private static final long DECIMAL_BASE = 10;
    private static final int MIN_DIGIT_IN_DECIMAL_BASE = 0;

    private static final String INVALID_DATA = "Invalid data!";
    private static final String DEFAULT_DECREASE = "Sequence don't decrease";
    private static final String DEFAULT_INCREASE = "Sequence don't increase";
    private static final String TRUE_RESULT = "Sequence is increase";
    private static final String FALSE_RESULT = "Sequence is decrease";


    public static String isDecreaseSequence(long num) {

        String result = FALSE_RESULT;

        boolean isIncrease = false;

        if (num > 0) {
            while (num / DECIMAL_BASE > MIN_DIGIT_IN_DECIMAL_BASE) {

                long digit = num % DECIMAL_BASE;
                num /= DECIMAL_BASE;
                long nextDigit = num % DECIMAL_BASE;

                if (!(nextDigit > digit)) {
                    result = DEFAULT_DECREASE;
                    break;
                }
            }

        } else {
            result = INVALID_DATA;
        }

        return result;
    }

    public static String isIncreaseSequence(long num) {

        String result = TRUE_RESULT;

        boolean isDecrease = false;

        if (num > 0) {
            while (num / DECIMAL_BASE > MIN_DIGIT_IN_DECIMAL_BASE) {

                long digit = num % DECIMAL_BASE;
                num /= DECIMAL_BASE;

                long nextDigit = num % DECIMAL_BASE;

                if (!(nextDigit < digit)) {
                    result = DEFAULT_INCREASE;
                    break;
                }
            }

        } else {
            result = INVALID_DATA;
        }

        return result;
    }

}

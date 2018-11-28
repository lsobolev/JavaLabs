package by.bntu.fitr.povt.justcompileit.javalabs.lab08.taskc.model;

public class NumberWorker {

    private static final long DECIMAL_BASE = 10;
    private static final String DEFAULT_RESULT = "Sequence not decrease and not increase";
    private static final String TRUE_RESULT = "Sequence is increase";
    private static final String FALSE_RESULT = "Sequence is decrease";


    public static String isSequence(long num) {

        String result = DEFAULT_RESULT;

        boolean isIncrease = false;
        boolean isDecrease = false;

        while (num / DECIMAL_BASE > 0) {

            long digit = num % DECIMAL_BASE;
            num /= DECIMAL_BASE;
            long nextDigit = num % DECIMAL_BASE;

            if (nextDigit > digit && !isIncrease) {
                isDecrease = true;
            } else if (nextDigit < digit && !isDecrease) {
                isIncrease = true;
            } else {
                isIncrease = false;
                isDecrease = false;
                break;
            }
        }

        if (isIncrease) {
            result = TRUE_RESULT;
        } else if (isDecrease) {
            result = FALSE_RESULT;
        }

        return result;
    }

}

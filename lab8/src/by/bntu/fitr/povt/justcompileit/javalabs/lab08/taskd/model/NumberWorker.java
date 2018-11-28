package by.bntu.fitr.povt.justcompileit.javalabs.lab08.taskd.model;

public class NumberWorker {

    private static final int DECIMAL_BASE = 10;
    private static final int MIN_DIGIT_IN_DECIMAL_BASE = 0;


    public static long duplicationMaxNum(long num) {

        int maxNumber = maxDigit(num);
        long newNumber = MIN_DIGIT_IN_DECIMAL_BASE;

        int i = 0; // power 10

        while (num > MIN_DIGIT_IN_DECIMAL_BASE) {

            int digit = (int) (num % DECIMAL_BASE);

            if (digit == maxNumber) {
                newNumber += digit * Math.pow(DECIMAL_BASE, i);
                i++;
            }
            newNumber += digit * Math.pow(DECIMAL_BASE, i);
            i++;

            num /= DECIMAL_BASE;
        }
        return newNumber;
    }


    public static int maxDigit(long num) {

        int max = MIN_DIGIT_IN_DECIMAL_BASE;

        while (num > MIN_DIGIT_IN_DECIMAL_BASE) {

            int digit = (int) (num % DECIMAL_BASE);

            if (digit > max) {
                max = digit;
            }
            num /= DECIMAL_BASE;
        }
        return max;
    }
}

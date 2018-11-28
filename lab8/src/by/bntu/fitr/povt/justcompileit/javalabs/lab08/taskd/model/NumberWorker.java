package by.bntu.fitr.povt.justcompileit.javalabs.lab08.taskd.model;

public class NumberWorker {

    private static final int DECIMAL_BASE = 10;


    public static long duplicationMaxNum(long num) {

        int maxDigit = maxDigit(num);
        long newNumber = 0;

        int i = 0;

        while (num > 0) {

            int digit = (int) (num % DECIMAL_BASE);

            if (digit == maxDigit) {
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

        int max = 0;

        while (num > 0) {

            int digit = (int) (num % DECIMAL_BASE);

            if (digit > max) {
                max = digit;
            }
            num /= DECIMAL_BASE;
        }
        return max;
    }
}

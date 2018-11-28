package by.bntu.fitr.povt.justcompileit.javalabs.lab08.taskb.model;

public class NumberWorker {

    private static final int DECIMAL_BASE = 10;
    private static final int SIGN_OF_DIVIDING_NUMBER = 2;
    private static final int MIN_DIGIT_IN_DECIMAL_BASE = 0;
    private static final String FALSE_RESULT = "Number not contain even numbers.";
    private static final String TRUE_RESULT = "Number contain even numbers.";


    public static String checkContainNumberEvenNumbers(int num) {

        String result = FALSE_RESULT;

        while (num > MIN_DIGIT_IN_DECIMAL_BASE) {

            if ((num % DECIMAL_BASE) % SIGN_OF_DIVIDING_NUMBER == MIN_DIGIT_IN_DECIMAL_BASE){
                result = TRUE_RESULT;
                break;
            }
            num /= DECIMAL_BASE;
        }

        return result;
    }

}

package by.bntu.fitr.povt.justcompileit.javalabs.lab08.taskb.model;

public class NumberWorker {

    private static final int DECIMAL_BASE = 10;
    private static final int SIGN_OF_DIVIDING_NUMBER = 2;
    private static final String FALSE_RESULT = "Number does not contain even numbers.";
    private static final String TRUE_RESULT = "Number does contain even numbers.";


    public static String checkContainNumberEvenNumbers(int num) {

        String result = FALSE_RESULT;

        while (num > 0) {

            if ((num % DECIMAL_BASE) % SIGN_OF_DIVIDING_NUMBER == 0){
                result = TRUE_RESULT;
            }
            num /= DECIMAL_BASE;
        }

        return result;
    }

}

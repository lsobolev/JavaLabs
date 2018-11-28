package by.bntu.fitr.povt.justcompileit.javalabs.lab08.taske.model;

public class NumberWorker {

    private static final int FIRST_FIBONACCI_NUM = 0;
    private static final int SECOND_FIBONACCI_NUM = 1;
    private static final int MIN_DIGIT_IN_DECIMAL_BASE = 0;


    public static String getFibonacciSequence(int num) {

        StringBuilder sequence = new StringBuilder();

        int firstNum = FIRST_FIBONACCI_NUM;
        int secondNum = SECOND_FIBONACCI_NUM;


        while (num > MIN_DIGIT_IN_DECIMAL_BASE) {

            sequence.append(String.format("%d ", firstNum));

            int swap_el = secondNum;
            secondNum = firstNum + secondNum;
            firstNum = swap_el;

            num--;
        }

        return sequence.toString();
    }


}

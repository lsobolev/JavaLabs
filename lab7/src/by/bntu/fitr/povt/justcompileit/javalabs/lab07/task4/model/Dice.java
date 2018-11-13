package by.bntu.fitr.povt.justcompileit.javalabs.lab07.task4.model;

import java.util.Random;

public class Dice {

    private final int MIN_NUM = 1;
    private final int MAX_NUM = 6;

    private int droppedNumber;

    public Dice() {
        droppedNumber = dropDice();
    }

    public int getDroppedNumber() {
        return droppedNumber;
    }

    public int dropDice() {
        return new Random().nextInt(MAX_NUM) + MIN_NUM;
    }

}

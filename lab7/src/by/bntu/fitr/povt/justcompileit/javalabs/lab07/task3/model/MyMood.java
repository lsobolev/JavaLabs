package by.bntu.fitr.povt.justcompileit.javalabs.lab07.task3.model;

import java.util.Random;


public class MyMood {

    private final String MOOD_1 = "\u0f3c( \u0361\u2299 \u0a0a \u0361\u2299)\u0f3d";
    private final String MOOD_2 = "\u10da ( \u25d5 \u15dc \u25d5 ) \u10da";
    private final String MOOD_3 = "( \u0361\u2191 \u035c\u0296 \u0361\u2191)";
    private final String MOOD_4 = "\u2570( . \u2022\u0301 \u035c\u0296 \u2022\u0300 . )\u256f";
    private final String MOOD_5 = "\u250c( \u055e \u06a1 \u055e )\u2510";
    private final String MOOD_6 = "\u1566\u0ed2( \u055e \u25e1 \u055e )\u096d\u1564";
    private final String MOOD_7 = "\u0f3c \u25d4 \u035c\u0296 \u25d4 \u0f3d";
    private final String MOOD_8 = "o\u0361\u0361\u0361\u256e\u0f3c \u2022 \u0296\u032f \u2022 \u0f3d\u256do\u0361\u0361\u0361";
    private final String MOOD_9 = "\u1555( \u0f40 \u0296\u032f \u0f40)\u1557";
    private final String MOOD_10 = "( \u25d5 \u0296\u032f \u25d5 )";
    private final String MOOD_11 = "o\u0361\u0361\u0361\u256e\u0f3c . \u2022\u0301 _\u0296 \u2022\u0300 . \u0f3d\u256do\u0361\u0361\u0361";
    private final String MOOD_12 = ".\u2022\u00b4\u00af(>\u2582<)\u00b4\u00af\u2022.";
    private final String MOOD_13 = "(\u033f\u0ca0 \u033f\u0139\u032f\u033f\u033f\u0ca0 \u033f)\u0304";
    private final String DEFAULT_MOOD = ":-(";

    public final int NUM_ALL_MOOD = 13;

    private int numRandomMood;


    public MyMood() {
        numRandomMood = new Random().nextInt(NUM_ALL_MOOD) + 1;
    }


    public String getMyMood() {

        String mood;

        switch (numRandomMood) {
            case 1:
                mood = MOOD_1;
                break;
            case 2:
                mood = MOOD_2;
                break;
            case 3:
                mood = MOOD_3;
                break;
            case 4:
                mood = MOOD_4;
                break;
            case 5:
                mood = MOOD_5;
                break;
            case 6:
                mood = MOOD_6;
                break;
            case 7:
                mood = MOOD_7;
                break;
            case 8:
                mood = MOOD_8;
                break;
            case 9:
                mood = MOOD_9;
                break;
            case 10:
                mood = MOOD_10;
                break;
            case 11:
                mood = MOOD_11;
                break;
            case 12:
                mood = MOOD_12;
                break;
            case 13:
                mood = MOOD_13;
                break;
            default:
                mood = DEFAULT_MOOD;
        }
        return mood;
    }

    public String getNextMyMood() {
        this.numRandomMood = new Random().nextInt(NUM_ALL_MOOD) + 1;
        return getMyMood();
    }

    @Override
    public String toString() {
        return "My Mood: " + getMyMood();
    }
}

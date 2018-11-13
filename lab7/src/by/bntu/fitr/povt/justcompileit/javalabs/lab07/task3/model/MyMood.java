package by.bntu.fitr.povt.justcompileit.javalabs.lab07.task3.model;

import java.util.Random;


public class MyMood {

    public final int NUM_ALL_MOOD = 13;
    private int numRandomMood;


    public MyMood() {
        numRandomMood = new Random().nextInt(NUM_ALL_MOOD) + 1;
    }


    public String getMyMood() {

        String mood;

        switch (numRandomMood) {
            case 1:
                mood = "༼( ͡⊙ ਊ ͡⊙)༽";
                break;
            case 2:
                mood = "ლ ( ◕ ᗜ ◕ ) ლ";
                break;
            case 3:
                mood = "( ͡↑ ͜ʖ ͡↑)";
                break;
            case 4:
                mood = "╰( . •́ ͜ʖ •̀ . )╯";
                break;
            case 5:
                mood = "┌( ՞ ڡ ՞ )┐";
                break;
            case 6:
                mood = "ᕦ໒( ՞ ◡ ՞ )७ᕤ";
                break;
            case 7:
                mood = "༼ ◔ ͜ʖ ◔ ༽";
                break;
            case 8:
                mood = "o͡͡͡╮༼ • ʖ̯ • ༽╭o͡͡͡";
                break;
            case 9:
                mood = "ᕕ( ཀ ʖ̯ ཀ)ᕗ";
                break;
            case 10:
                mood = "( ◕ ʖ̯ ◕ )";
                break;
            case 11:
                mood = "o͡͡͡╮༼ . •́ _ʖ •̀ . ༽╭o͡͡͡";
                break;
            case 12:
                mood = ".•´¯(>▂<)´¯•.";
                break;
            case 13:
                mood = "(̿ಠ ̿Ĺ̯̿̿ಠ ̿)̄";
                break;
            default:
                mood = ":-(";
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

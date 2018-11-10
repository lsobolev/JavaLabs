package by.bntu.fitr.povt.justcompileit.javalabs.lab07.task5.model;

public class Letter {

    public static boolean isVowels(char letter) {
        switch (Character.toLowerCase(letter)) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'y':
                return true;
            default:
                return false;
        }
    }

    public static boolean isConsonant(char letter) {
        return !isVowels(letter);
    }

}

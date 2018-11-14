package by.bntu.fitr.povt.justcompileit.javalabs.lab07.task5.model;

public class Letter {

    public static String isVowel(char letter) {

        StringBuilder result = new StringBuilder();

        if (Character.isLetter(letter)) {
            switch (Character.toLowerCase(letter)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'y':
                    result.append("vowel letter");
                    break;
                default:
                    result.append("consonant letter");
            }
        } else {
            result.append("not a letter");
        }
        return result.toString();
    }

    public static String isVowel1(char letter) {

        StringBuilder result = new StringBuilder();

        if (Character.isLetter(letter)) {
            letter = Character.toLowerCase(letter);

            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter == 'y') {
                result.append("vowel letter");
            } else {
                result.append("not a letter");
            }
        }
        else {
            result.append("not a letter");
        }
        return result.toString();
    }
}

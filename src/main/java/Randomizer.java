package src.main.java;

import java.util.Random;

public class Randomizer {

    public static char letter() {
        Random r = new Random();
        String alphabet = Constants.alphabet;
        char letter = 0;
        for (int i = 0; i < 1; i++) {
            letter = alphabet.charAt(r.nextInt(alphabet.length()));
        }
        return letter;
    }

    public static char number() {
        Random r = new Random();
        String alphabet = Constants.alphabetNumbers;
        char number = 0;
        for (int i = 0; i < 1; i++) {
            number = alphabet.charAt(r.nextInt(alphabet.length()));
        }
        return number;
    }

    public static int regions() {
        int min = 1;
        int max = 199;
        return (int) Math.floor(Math.random() * (max - min + 1) + min);
    }
}

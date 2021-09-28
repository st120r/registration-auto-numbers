package src.main.java;

public class Number {

    public static void number() {
        String number = "" + Randomizer.letter() + Randomizer.number() + Randomizer.number() + Randomizer.number() + Randomizer.letter() + Randomizer.letter() + Randomizer.regions();
        System.out.println(number);
    }
}

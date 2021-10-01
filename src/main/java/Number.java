package src.main.java;

import static src.main.java.LocalRepoLists.*;

public class Number {


    public static void number() {

        while (!isFull()) {
            String number = "" + Randomizer.letter() + Randomizer.number() + Randomizer.number() + Randomizer.number() + Randomizer.letter() + Randomizer.letter() + Randomizer.regions();
            addToArrays(number);
        }
        System.out.println(getArrayList());
    }
}

// Simple dice class
import java.util.Random;

public class Dice {
    int sides;   
    Random die = new Random();

    Dice(int n) {
        sides = n;
    }

    int roll() {
        return die.nextInt(sides) + 1;
    }
}

class main {
    public static void main(String args[]) {
        Dice die = new Dice(6);
        int n;

        n = die.roll();
        System.out.println(n);
    }
}

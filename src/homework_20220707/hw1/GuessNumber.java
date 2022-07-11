package homework_20220707.hw1;

import java.util.Random;

public class GuessNumber {
    int generateRandomNumber(int range) {
        Random random = new Random();

        return random.nextInt(range);
    }

    boolean assertIsEqual(int expected, int actual) {
        return expected == actual;
    }
}

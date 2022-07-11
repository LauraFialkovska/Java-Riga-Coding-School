package homework_20220707.hw1;

public class GuessNumberDemo {
    public static void main(String[] args) {
        Prompter prompter = new Prompter();
        GuessNumber guess = new GuessNumber();

        int numberRange = prompter.askForNumberRange();
        int randomNumber = guess.generateRandomNumber(numberRange); // Expected
        int guessedNumber = prompter.guessNumber(randomNumber); // Actual

        boolean guessStatus = guess.assertIsEqual(randomNumber, guessedNumber);

        while (!guessStatus) {
            guessedNumber = prompter.tryOneMoreTime();
            guessStatus = guess.assertIsEqual(randomNumber, guessedNumber);
        }

        System.out.println("\n" + "Yes, correct answer is: " + randomNumber);
    }
}

package homework_20220707.hw1;

import java.util.Scanner;

public class Prompter {
    Scanner scan = new Scanner(System.in);

    int askForNumberRange() {
        System.out.print("Input your number range: ");

        return scan.nextInt();
    }

    int guessNumber(int number) {
        int fakeNumber1 = number + 3;
        int fakeNumber2 = number - 1;

        System.out.print("\n" + "Numbers to guess: ");
        if (number > 2) {
            System.out.println(fakeNumber1 + "; " + fakeNumber2 + "; " + number);
        } else {
            System.out.println(fakeNumber2 + "; " + number + "; " + fakeNumber1);
        }

        System.out.print("Guess number: ");
        return scan.nextInt();
    }

    int tryOneMoreTime() {
        System.out.println("\n" + "Try one more time!");
        System.out.print("Number: ");

        return scan.nextInt();
    }
}

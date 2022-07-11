package homework_20220707.hw2;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Prompter prompter = new Prompter();
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

		// Speletaja dati
        int userHp = 14;
		// PC dati
        int pcHp = 14;
        int pcAtt = 2;
        int pcReg = 2;

        String warrior = prompter.askForWarrior();
        System.out.println("\n" + ".:: Let the battle begins ::.");

        while (pcHp > 0) {
            String action = prompter.askForAction();
            Action userAttRand = new Action();
			
            int userAtt = 0;
            int userBlock = 0;
            int userReg = 0;
			// PC attack ratio (2-6)
            int pcAttRand = rand.nextInt(5);
			
			// Players updated stats
            switch (warrior) {
                case "k":
                    userAtt = userAttRand.knightPow();
                    userBlock = userAttRand.knightBlock();
                    userReg = userAttRand.knightReg();
                    break;
                case "b":
                    userAtt = userAttRand.barbarPow();
                    userBlock = userAttRand.barbarBlock();
                    userReg = userAttRand.barbarReg();
                    break;
                case "w":
                    userAtt = userAttRand.wizardPow();
                    userBlock = userAttRand.barbarBlock();
                    userReg = userAttRand.wizardReg();
                    break;
            }
			
            switch (action) {
				// Attack description
                case "a":
                    pcHp = pcHp - userAtt;
                    System.out.println("\n" + "You hit " + userAtt + " points" );
                    System.out.println("PC left " + pcHp + " health points");
                    
					userHp = userHp - (pcAtt + pcAttRand);
                    System.out.println("\n" + "PC hit " + (pcAtt + pcAttRand) + " points" );
                    System.out.println("User left " + userHp + " health points");
                    break;
				// Block description
                case "b":
                    userHp = userHp + userReg;
					
					if ((pcAtt + pcAttRand) > userBlock) {
						userHp = userHp - ((pcAtt + pcAttRand) - userBlock);
						System.out.println("\n" + "You used block, but PC was stronger and dameged your HP by " +
                                ((pcAtt + pcAttRand) - userBlock));
						System.out.println("User left " + userHp + " health points");
					} else {
						System.out.println("\n" + "You block PC's attack and regenerated " + userReg + " HP.");
						System.out.println("User left " + userHp + " health points");
					}
					
                    System.out.println("\n" + "User left " + userHp + " health points");
                    break;
            }
			
			if (pcHp <= 0) {
				System.out.println("\n" + "You won!");
				break;
			} else if (userHp <= 0) {
				System.out.println("\n" + "You lost!");
				break;
			}
        }
    }
}

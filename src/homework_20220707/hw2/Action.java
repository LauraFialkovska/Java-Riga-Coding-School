package homework_20220707.hw2;

import java.util.Random;

public class Action {
    Random rand = new Random();
	
	// Knight attack power(1-8)
    public int knightPow() {
        int attRatio = rand.nextInt(8);
        return 1 + attRatio;
    }
	
    // Barbarian attack power(1-6)
    public int barbarPow() {
        int attRatio = rand.nextInt(5);
        return 2 + attRatio;
    }
	
    // Wizard attack power(3-4)
    public int wizardPow() {
        return 3;
    }
	
    // Knight blocks PC attack(4-7)
    public int knightBlock() {
        int attRatio = rand.nextInt(4);
        return 4 + attRatio;
    }
	
    // Barbarian blocks PC attack(3-5)
    public int barbarBlock() {
        int attRatio = rand.nextInt(3);
        return 3 + attRatio;
    }
	
    // Wizard blocks PC attack(1-2)
    public int wizardBlock() {
        int attRatio = rand.nextInt(2);
        return 1 + attRatio;
    }
	
    // Knight regenerates health points(1)
    public int knightReg() {
        return 1;
    }
	
    // Barbarian regenerates health points(2-3)
    public int barbarReg() {
        int attRatio = rand.nextInt(1);
        return 2 + attRatio;
    }
	
    // Wizard regenerates health points(3-5)
    public int wizardReg() {
        int attRatio = rand.nextInt(3);
        return 3 + attRatio;
    }

}

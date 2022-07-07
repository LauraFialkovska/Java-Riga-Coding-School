package lesson_20220707;

import java.util.Scanner;

public class CalculatorDemo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("Input:");
        System.out.print("Int1: ");
        int amount1 = scan.nextInt();

        System.out.print("Int2: ");
        int amount2 = scan.nextInt();

        System.out.print("Math action: ");
        String action = scan.next();

        System.out.print("\n" + "Result: ");
        switch (action) {
            case "+":
                System.out.print(calculator.sum(amount1, amount2));
                break;
            case "-":
                System.out.print(calculator.sub(amount1, amount2));
                break;
            case "*":
                System.out.print(calculator.mul(amount1, amount2));
                break;
            case "/":
                System.out.print(calculator.div(amount1, amount2));
                break;
        }
    }
}

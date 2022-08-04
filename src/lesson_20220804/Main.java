package lesson_20220804;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Guess the day: ");
        String day1 = scan.next();
        Day day = Day.valueOf(day1);

        if (day == Day.SUNDAY) {
            System.out.print("\n" + "Border: ");
            int borderSize = scan.nextInt();

            Square square = new Square();

            System.out.println("\n" + "Square");

            int area = square.area(borderSize);
            System.out.println("Area = " + area);

            int perimeter = square.perimeter(borderSize);
            System.out.println("Perimeter = " + perimeter);
        } else {
            System.out.println("\n" + "Find in SUNDAY!");
        }
    }

    public enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
}

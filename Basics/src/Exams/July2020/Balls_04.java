package Exams.July2020;

import java.util.Scanner;

public class Balls_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int red = 0;
        int orange = 0;
        int yellow = 0;
        int white = 0;
        int black = 0;
        int other = 0;
        double total = 0;

        for (int i = 1; i <= n; i++){
            String color = scanner.nextLine();
            if (color.equals("red")){
                red++;
                total += 5;
            } else if (color.equals("orange")){
                orange++;
                total += 10;
            } else if (color.equals("yellow")){
                yellow++;
                total += 15;
            } else if (color.equals("white")){
                white++;
                total += 20;
            } else if (color.equals("black")){
                black++;
                total = Math.floor(total / 2);
            } else {
                other++;
            }
        }
        System.out.printf("Total points: %.0f%n", total);
        System.out.printf("Red balls: %s%n", red);
        System.out.printf("Orange balls: %s%n", orange);
        System.out.printf("Yellow balls: %s%n", yellow);
        System.out.printf("White balls: %s%n", white);
        System.out.printf("Other colors picked: %s%n", other);
        System.out.printf("Divides from black balls: %s%n", black);
    }
}

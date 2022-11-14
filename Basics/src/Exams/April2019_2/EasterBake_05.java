package Exams.April2019_2;

import java.util.Scanner;

public class EasterBake_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double totalSugar = 0;
        double totalFlour = 0;
        int maxSugar = Integer.MIN_VALUE;
        int maxFlour = Integer.MIN_VALUE;


        for (int i = 1; i <= n; i++){
            int sugar = Integer.parseInt(scanner.nextLine());
            int flour = Integer.parseInt(scanner.nextLine());

            totalSugar += sugar;
            totalFlour += flour;

            if (sugar > maxSugar){
                maxSugar = sugar;
            }
            if (flour > maxFlour){
                maxFlour = flour;
            }
        }

        double packagesSugar = Math.ceil(totalSugar / 950);
        double packagesFlour = Math.ceil(totalFlour / 750);;

        System.out.printf("Sugar: %.0f%n", packagesSugar);
        System.out.printf("Flour: %.0f%n", packagesFlour);
        System.out.printf("Max used flour is %s grams, max used sugar is %s grams.", maxFlour, maxSugar);
    }
}

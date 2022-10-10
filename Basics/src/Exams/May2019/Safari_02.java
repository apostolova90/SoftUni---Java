package Exams.May2019;

import java.util.Scanner;

public class Safari_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double littersNeeded = Double.parseDouble(scanner.nextLine());
        String day = scanner.nextLine();

        double priceForAllLitters = littersNeeded * 2.10;
        double totalSum = priceForAllLitters + 100;

        if (day.equals("Saturday")){
            totalSum = totalSum * 0.90;
        } else {
            totalSum = totalSum * 0.80;
        }

        double difference = Math.abs(budget - totalSum);

        if (budget >= totalSum){
            System.out.printf("Safari time! Money left: %.2f lv.", difference);
        } else {
            System.out.printf("Not enough money! Money needed: %.2f lv.", difference);
        }
    }
}

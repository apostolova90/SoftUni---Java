package Exams.June2019;

import java.util.Scanner;

public class MovieDestination_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String destination = scanner.nextLine();
        String season = scanner.nextLine();
        int numberOfDays = Integer.parseInt(scanner.nextLine());

        double totalSum = 0;

        switch (destination){
            case "Dubai":
                if (season.equals("Winter")){
                    double pricePerDay = 45000;
                    totalSum = (pricePerDay * numberOfDays) * 0.70;
                } else {
                    double pricePerDay = 40000;
                    totalSum = (pricePerDay * numberOfDays) * 0.70;
                }
                break;

            case "Sofia":
                if (season.equals("Winter")){
                    double pricePerDay = 17000;
                    totalSum = pricePerDay * numberOfDays;
                    totalSum += totalSum * 0.25;
                } else {
                    double pricePerDay = 12500;
                    totalSum = pricePerDay * numberOfDays;
                    totalSum += totalSum * 0.25;
                }
                break;

            case "London":
                if (season.equals("Winter")){
                    double pricePerDay = 24000;
                    totalSum = pricePerDay * numberOfDays;
                } else {
                    double pricePerDay = 20250;
                    totalSum = pricePerDay * numberOfDays;
                }
                break;
        }

        double difference = Math.abs(budget -totalSum);

        if (budget >= totalSum){
            System.out.printf("The budget for the movie is enough! We have %.2f leva left!", difference);
        } else {
            System.out.printf("The director needs %.2f leva more!",difference);
        }

    }
}

package Exams.July2019;

import java.util.Scanner;

public class FamilyTrip_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int numberNights = Integer.parseInt(scanner.nextLine());
        double pricePerNight = Double.parseDouble(scanner.nextLine());
        int percentAdditionalCosts = Integer.parseInt(scanner.nextLine());

        double additionalCosts = budget * percentAdditionalCosts / 100;

        if (numberNights >= 7){
            pricePerNight = pricePerNight * 0.95;
        }

        double totalPriceNeeded = (numberNights * pricePerNight) + additionalCosts;

        double difference = Math.abs(budget - totalPriceNeeded);

        if (budget >= totalPriceNeeded){
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", difference);
        } else {
            System.out.printf("%.2f leva needed.", difference);
        }
    }
}

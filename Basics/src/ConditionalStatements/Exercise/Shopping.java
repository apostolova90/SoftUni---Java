package ConditionalStatements.Exercise;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int numberVideocards = Integer.parseInt(scanner.nextLine());
        int numberProcesors = Integer.parseInt(scanner.nextLine());
        int numberRam = Integer.parseInt(scanner.nextLine());

        double priceVideocard = 250;
        double procesorPrice = (priceVideocard * numberVideocards) * 0.35;
        double priceRam = (priceVideocard * numberVideocards) * 0.10;

        double totalSum = (numberVideocards * priceVideocard) + (numberProcesors * procesorPrice) + (numberRam * priceRam);

        if (numberVideocards > numberProcesors){
            totalSum = totalSum * 0.85;
        }

        double difference = Math.abs(budget - totalSum);
        if (budget >= totalSum){
            System.out.printf("You have %.2f leva left!", difference);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", difference);
        }
    }
}

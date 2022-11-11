package Exams.April2019;

import java.util.Scanner;

public class GodzillavsKong_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int numberOfWorkers = Integer.parseInt(scanner.nextLine());
        double priceClothes = Double.parseDouble(scanner.nextLine());

        double decor = budget * 0.10;
        double priceAllClothes = numberOfWorkers * priceClothes;
        if (numberOfWorkers > 150){
            priceAllClothes = priceAllClothes * 0.90;
        }

        double totalPriceNeeded = decor + priceAllClothes;
        double difference = Math.abs(budget - totalPriceNeeded);

        if (budget >= totalPriceNeeded){
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", difference);
        } else {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", difference);
        }
    }
}

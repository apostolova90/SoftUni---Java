package ConditionalStatements.Exercise;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double vacationPrice = Double.parseDouble(scanner.nextLine());
        int puzzleCount = Integer.parseInt(scanner.nextLine());
        int dollCount = Integer.parseInt(scanner.nextLine());
        int bearCount = Integer.parseInt(scanner.nextLine());
        int minionsCount = Integer.parseInt(scanner.nextLine());
        int truckCount = Integer.parseInt(scanner.nextLine());

        double allPuzzlePrice = puzzleCount * 2.60;
        double allDollPrice = dollCount * 3;
        double allBearPrice = bearCount * 4.10;
        double allMinionsPrice = minionsCount * 8.20;
        double allTruckPrice = truckCount * 2;

        int totalToysCount = puzzleCount + dollCount + bearCount + minionsCount + truckCount;

        double priceForAllBeforeDiscount = allPuzzlePrice + allDollPrice + allBearPrice + allMinionsPrice + allTruckPrice;

        if (totalToysCount >= 50){
            priceForAllBeforeDiscount = priceForAllBeforeDiscount * 0.75;
        }

        double priceAfterRent = priceForAllBeforeDiscount * 0.90;

        double difference = Math.abs(vacationPrice - priceAfterRent);

        if (priceAfterRent >= vacationPrice){
            System.out.printf("Yes! %.2f lv left.", difference);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", difference);
        }
    }
}

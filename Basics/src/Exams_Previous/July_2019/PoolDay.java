package Exams_Previous.July_2019;

import java.util.Scanner;

public class PoolDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numberOfPeople = Double.parseDouble(scanner.nextLine());
        double priceEntrance = Double.parseDouble(scanner.nextLine());
        double priceDeckChair = Double.parseDouble(scanner.nextLine());
        double priceUmbrella = Double.parseDouble(scanner.nextLine());

        double umbrellasNeeded = Math.ceil(numberOfPeople / 2);
        double deckchairsNeeded = Math.ceil(numberOfPeople * 0.75);

        double priceAllDeckchairs = deckchairsNeeded * priceDeckChair;
        double priceAllUmbrellas = umbrellasNeeded * priceUmbrella;
        double entranceAllPeople = numberOfPeople * priceEntrance;

        double totalPriceToBePaid = priceAllDeckchairs + priceAllUmbrellas + entranceAllPeople;

        System.out.println(totalPriceToBePaid + " lv.");

    }
}

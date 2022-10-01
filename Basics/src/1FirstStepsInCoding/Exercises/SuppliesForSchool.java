package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pensPacks = Integer.parseInt(scanner.nextLine());
        int markerPacks = Integer.parseInt(scanner.nextLine());
        int detergentLiters = Integer.parseInt(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());

        double pensTotalPrice = pensPacks * 5.80;
        double markerTotalPrice = markerPacks * 7.20;
        double detergentTotalPrice = detergentLiters * 1.20;
        double priceNoDiscount = pensTotalPrice + markerTotalPrice + detergentTotalPrice;

        double finalPrice = priceNoDiscount - (priceNoDiscount * discount / 100);
        System.out.println(finalPrice);
    }
}

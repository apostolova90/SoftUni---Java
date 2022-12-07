package Exams.May2019;

import java.util.Scanner;

public class FruitMarket_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceQgodi = Double.parseDouble(scanner.nextLine());
        double priceMalini = priceQgodi * 0.5;
        double pricePortokali = priceMalini * 0.6;
        double priceBanani = priceMalini * 0.2;

        double kgBanani = Double.parseDouble(scanner.nextLine());
        double kgPortokali = Double.parseDouble(scanner.nextLine());
        double kgMalini = Double.parseDouble(scanner.nextLine());
        double kgQgodi = Double.parseDouble(scanner.nextLine());

        double totalPriceForAll = (priceQgodi * kgQgodi) + (priceMalini * kgMalini) + (pricePortokali * kgPortokali) + (priceBanani * kgBanani);

        System.out.printf("%.2f", totalPriceForAll);
    }
}

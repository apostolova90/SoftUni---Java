package Exams.April2019_2;

import java.util.Scanner;

public class EasterBakery_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceFlour = Double.parseDouble(scanner.nextLine());
        double kgFlour = Double.parseDouble(scanner.nextLine());
        double priceSugar = priceFlour * 0.75;
        double kgSugar = Double.parseDouble(scanner.nextLine());
        double priceBoxEggs = priceFlour * 1.1;
        int numBoxesEggs = Integer.parseInt(scanner.nextLine());
        double priceMaq = priceSugar * 0.20;
        int maq = Integer.parseInt(scanner.nextLine());

        double totoalFOrall = (priceFlour * kgFlour) + (priceSugar * kgSugar) + (priceBoxEggs * numBoxesEggs) + (priceMaq * maq);

        System.out.printf("%.2f", totoalFOrall);
    }
}

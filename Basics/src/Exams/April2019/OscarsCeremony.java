package Exams.April2019;

import java.util.Scanner;

public class OscarsCeremony {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int priceRoom = Integer.parseInt(scanner.nextLine());
        double priceStatue = priceRoom * 0.70;
        double priceCatering = priceStatue * 0.85;
        double priceMusic = priceCatering * 0.5;

        double totalPrice = priceRoom + priceStatue + priceCatering + priceMusic;

        System.out.printf("%.2f", totalPrice);

    }
}

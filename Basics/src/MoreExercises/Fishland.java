package MoreExercises;

import java.util.Scanner;

public class Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double scumriqPrice = Double.parseDouble(scanner.nextLine());
        double cacaPrice = Double.parseDouble(scanner.nextLine());
        double palamudPrice = (double) scumriqPrice + (scumriqPrice * 60 / 100);
        double safridPrice = (double) cacaPrice + (cacaPrice * 80 / 100);
        double midiPrice = 7.50;

        double palamudKg = Double.parseDouble(scanner.nextLine());
        double safridKg = Double.parseDouble(scanner.nextLine());
        int midiKg = Integer.parseInt(scanner.nextLine());

        double pricePalamud = palamudKg * palamudPrice;
        double priceSafrid = safridKg * safridPrice;
        double priceMidi = midiKg * midiPrice;
        double totalPrice = pricePalamud + priceSafrid + priceMidi;
        System.out.printf("%.2f", totalPrice);


    }
}

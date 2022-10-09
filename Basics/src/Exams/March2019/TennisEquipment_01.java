package Exams.March2019;

import java.util.Scanner;

public class TennisEquipment_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceTennisRacket = Double.parseDouble(scanner.nextLine());
        double priseShoes = priceTennisRacket * 1/6;
        int numTennisRacket = Integer.parseInt(scanner.nextLine());
        int numShoes = Integer.parseInt(scanner.nextLine());

        double all = (priseShoes * numShoes) + (priceTennisRacket * numTennisRacket);
        double otherStuff = all * 0.20;

        double total = all + otherStuff;
        double toBePaidByDjoko = total / 8;
        double toBePaidBySponsors = total - toBePaidByDjoko;

        System.out.printf("Price to be paid by Djokovic %.0f%n", Math.floor(toBePaidByDjoko));
        System.out.printf("Price to be paid by sponsors %.0f%n", Math.ceil(toBePaidBySponsors));
    }
}

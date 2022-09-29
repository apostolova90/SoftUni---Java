package ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int numberOfPeople = Integer.parseInt(scanner.nextLine());

        double price = 0;

        if (season.equals("Spring")){
            price = 3000;
        } else if (season.equals("Summer") || season.equals("Autumn")){
            price = 4200;
        } else if (season.equals("Winter")) {
            price = 2600;
        }

        if (numberOfPeople <= 6) {
            price = price * 0.90;
        } else if (numberOfPeople >= 7 && numberOfPeople <= 11) {
            price = price * 0.85;
        } if (numberOfPeople >= 12) {
            price = price * 0.75;
        }

        if (numberOfPeople % 2 == 0 && !season.equals("Autumn")){
            price = price * 0.95;
        }

        double difference = Math.abs(budget - price);

        if (budget >= price){
            System.out.printf("Yes! You have %.2f leva left.", difference);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", difference);
        }

    }
}

package Exams.April2019_2;

import java.util.Scanner;

public class EasterParty_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numGuests = Integer.parseInt(scanner.nextLine());
        double pricePerPerson = Double.parseDouble(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());
        double priceCake = budget * 0.10;


        if (numGuests >= 10 && numGuests <= 15){
            pricePerPerson = pricePerPerson * 0.85;
        } else if (numGuests > 15 && numGuests <= 20){
            pricePerPerson = pricePerPerson * 0.80;
        } else if (numGuests > 20){
            pricePerPerson = pricePerPerson * 0.75;
        }

        double totalPrice = priceCake + (numGuests * pricePerPerson);

        double difference = Math.abs(totalPrice - budget);

        if (totalPrice > budget){
            System.out.printf("No party! %.2f leva needed.", difference);
        } else {
            System.out.printf("It is party time! %.2f leva left.", difference);
        }

    }
}

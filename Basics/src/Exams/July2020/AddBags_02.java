package Exams.July2020;

import java.util.Scanner;

public class AddBags_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceOver20 = Double.parseDouble(scanner.nextLine());
        double kg = Double.parseDouble(scanner.nextLine());
        int numDays = Integer.parseInt(scanner.nextLine());
        int numberLanguage = Integer.parseInt(scanner.nextLine());

        double totalPrice = 0;

        if (kg < 10){
            totalPrice = priceOver20 * 0.20;
        } else if (kg >= 10 && kg <= 20){
            totalPrice = priceOver20 * 0.5;
        } else {
            totalPrice = priceOver20;
        }

        if (numDays < 7){
            totalPrice += totalPrice * 0.40;
        } else if (numDays >= 7 && numDays <= 30){
            totalPrice += totalPrice * 0.15;
        } else {
            totalPrice += totalPrice * 0.1;
        }

        System.out.printf("The total price of bags is: %.2f lv.", totalPrice * numberLanguage);
    }
}

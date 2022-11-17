package Exams.July2019;

import java.util.Scanner;

public class CoffeeMachine_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String drink = scanner.nextLine();
        String sugarOrNot = scanner.nextLine();
        int number = Integer.parseInt(scanner.nextLine());

        double priceDrink = 0;

        switch (drink){
            case "Espresso":
                if (sugarOrNot.equals("Without")){
                    priceDrink = 0.90;
                    priceDrink = priceDrink * 0.65;
                } else if (sugarOrNot.equals("Normal")){
                    priceDrink = 1;
                } else if (sugarOrNot.equals("Extra")){
                    priceDrink = 1.20;
                }
                if (number >= 5){
                    priceDrink = priceDrink * 0.75;
                }
                break;
            case "Cappuccino":
                if (sugarOrNot.equals("Without")){
                    priceDrink = 1;
                    priceDrink = priceDrink * 0.65;
                } else if (sugarOrNot.equals("Normal")){
                    priceDrink = 1.20;
                } else if (sugarOrNot.equals("Extra")){
                    priceDrink = 1.60;
                }
                break;
            case "Tea":
                if (sugarOrNot.equals("Without")){
                    priceDrink = 0.50;
                    priceDrink = priceDrink * 0.65;
                } else if (sugarOrNot.equals("Normal")){
                    priceDrink = 0.60;
                } else if (sugarOrNot.equals("Extra")){
                    priceDrink = 0.70;
                }
                break;
        }

        double totalPrice = number * priceDrink;

        if (totalPrice > 15){
            totalPrice = totalPrice * 0.80;
        }

        System.out.printf("You bought %d cups of %s for %.2f lv.", number, drink, totalPrice);
    }
}
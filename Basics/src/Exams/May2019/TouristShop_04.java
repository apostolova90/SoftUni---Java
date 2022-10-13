package Exams.May2019;

import java.util.Scanner;

public class TouristShop_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());

        double priceForAllEquipment = 0;
        int counter = 0;
        double difference = 0;

        boolean noMoreMoney = false;

        String command = scanner.nextLine();

        while (!command.equals("Stop")){

            String typeOdEquipment = command;
            double price = Double.parseDouble(scanner.nextLine());

            counter++;
            if (counter % 3 == 0) {
                price = price * 0.5;
            }

            if (budget < price){
                noMoreMoney = true;
                difference = price - budget;
                break;
            }
                budget -= price;
                priceForAllEquipment += price;

            command = scanner.nextLine();
        }

        if (noMoreMoney){
            System.out.println("You don't have enough money!");
            System.out.printf("You need %.2f leva!", difference);
        } else {
            System.out.printf("You bought %s products for %.2f leva.", counter, priceForAllEquipment);
        }
    }
}

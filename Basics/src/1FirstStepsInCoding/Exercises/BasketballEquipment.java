package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pricePerYear = Integer.parseInt(scanner.nextLine());
        double priceTrainers = pricePerYear - pricePerYear * 40 / 100;
        double priceClothes = priceTrainers - priceTrainers * 20 / 100;
        double priceBall = priceClothes / 4;
        double priceAccesories = priceBall / 5;
        double totalPrice = pricePerYear + priceTrainers + priceClothes + priceBall + priceAccesories;

        System.out.println(totalPrice);
    }
}

package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chickenCount = Integer.parseInt(scanner.nextLine());
        int fishCount = Integer.parseInt(scanner.nextLine());
        int veggieCount = Integer.parseInt(scanner.nextLine());

        double chickenTotalPrice = chickenCount * 10.35;
        double fishTotalPrice = fishCount * 12.40;
        double veggieTotalPrice = veggieCount * 8.15;
        double totalForAllMeals = chickenTotalPrice + fishTotalPrice + veggieTotalPrice;
        double desertPrice = totalForAllMeals * 0.20;

        double totalPriceWithDelivery = totalForAllMeals + desertPrice + 2.50;

        System.out.println(totalPriceWithDelivery);
    }
}

package Exams.March2020;

import java.util.Scanner;

public class FoodForPets_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int totalFoodForBoth = Integer.parseInt(scanner.nextLine());
        double biscuits = 0;
        double eatenByDog = 0;
        double eatenByCat = 0;
        double totalFoodEaten = 0;

        for (int i = 1; i <= days; i++){
            double foodDog = Double.parseDouble(scanner.nextLine());
            double foodCat = Double.parseDouble(scanner.nextLine());
            eatenByDog += foodDog;
            eatenByCat += foodCat;
            double totalFoodPerDay = foodDog + foodCat;
            totalFoodEaten += totalFoodPerDay;
            if (i % 3 == 0){
                biscuits += totalFoodPerDay * 0.10;
            }
        }

        double percentageEatenFood = totalFoodEaten / totalFoodForBoth * 100;
        double percentageEatenByCat = eatenByCat / totalFoodEaten * 100;
        double percentageEatenByDog = eatenByDog / totalFoodEaten * 100;


        System.out.printf("Total eaten biscuits: %.0fgr.%n", biscuits);
        System.out.printf("%.2f%% of the food has been eaten.%n", percentageEatenFood);
        System.out.printf("%.2f%% eaten from the dog.%n", percentageEatenByDog);
        System.out.printf("%.2f%% eaten from the cat.%n", percentageEatenByCat);

    }
}

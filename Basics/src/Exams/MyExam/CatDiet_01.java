package Exams.MyExam;

import java.util.Scanner;

public class CatDiet_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double fats = Integer.parseInt(scanner.nextLine());
        double proteins = Integer.parseInt(scanner.nextLine());
        double carbohydrates = Integer.parseInt(scanner.nextLine());
        double totalCalories = Integer.parseInt(scanner.nextLine());
        double percentWater = Integer.parseInt(scanner.nextLine());

        double totalGramsFats =  (totalCalories * fats / 100) / 9;
        double totalGramsProteins =  (totalCalories * proteins / 100) / 4;
        double totalGramsCarbohydrates = (totalCalories * carbohydrates / 100) / 4;

        double totalFood = totalGramsFats + totalGramsProteins + totalGramsCarbohydrates;
        double caloriesForOneGram = totalCalories / totalFood;

        double percentFoodWithoutWater = 100 - percentWater;
        double caloriesInOneGram = caloriesForOneGram * percentFoodWithoutWater / 100;

        System.out.printf("%.4f", caloriesInOneGram);
    }
}

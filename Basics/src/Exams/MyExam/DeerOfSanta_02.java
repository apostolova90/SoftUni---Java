package Exams.MyExam;

import java.util.Scanner;

public class DeerOfSanta_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int foodInKg = Integer.parseInt(scanner.nextLine());
        double foodPerDayDeer1 = Double.parseDouble(scanner.nextLine());
        double foodPerDayDeer2 = Double.parseDouble(scanner.nextLine());
        double foodPerDayDeer3 = Double.parseDouble(scanner.nextLine());

        double totalFoodDeer1 = days * foodPerDayDeer1;
        double totalFoodDeer2 = days * foodPerDayDeer2;
        double totalFoodDeer3 = days * foodPerDayDeer3;

        double foodForAll = totalFoodDeer1 + totalFoodDeer2 + totalFoodDeer3;

        if (foodForAll > foodInKg){
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(foodForAll - foodInKg));
        } else {
            System.out.printf("%.0f kilos of food left.", Math.floor(foodInKg - foodForAll));
        }

    }
}

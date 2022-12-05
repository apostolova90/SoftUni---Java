package Exams.March2020;

import java.util.Scanner;

public class CatWalking_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int minutesWalk = Integer.parseInt(scanner.nextLine());
        int numberWalks = Integer.parseInt(scanner.nextLine());
        double calories = Integer.parseInt(scanner.nextLine());

        double halfCalories = calories / 2;
        double totalCaloriesBurned = (minutesWalk * numberWalks) * 5;

        if (totalCaloriesBurned >= halfCalories){
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %.0f.", totalCaloriesBurned);
        } else {
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %.0f.", totalCaloriesBurned);
        }

    }
}

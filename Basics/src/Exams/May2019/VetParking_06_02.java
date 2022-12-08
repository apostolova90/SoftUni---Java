package Exams.May2019;

import java.util.Scanner;

public class VetParking_06_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalLeva = 0;

        int days = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        for (int day = 1; day <= days; day++){

            double moneyCurrentDay = 0;
            for (int hour = 1; hour <= hours; hour++){

                if (day % 2 == 0 && hour % 2 == 1){
                    moneyCurrentDay += 2.50;
                } else if (day % 2 == 1 && hour % 2 == 0){
                    moneyCurrentDay += 1.25;
                } else {
                    moneyCurrentDay += 1;
                }
            }
            totalLeva += moneyCurrentDay;
            System.out.printf("Day: %s - %.2f leva%n", day, moneyCurrentDay);
            moneyCurrentDay = 0;
        }

        System.out.printf("Total: %.2f leva", totalLeva);

    }
}

package Exams.May2019;

import java.util.Scanner;

public class VetParking_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    int days = Integer.parseInt(scanner.nextLine());
    int hours = Integer.parseInt(scanner.nextLine());

    double totalMoney = 0;
    double totalPerDay = 0;

    for (int currentDay = 1; currentDay <= days; currentDay++){
        for (int currentHour = 1; currentHour <= hours; currentHour++){
            if ((currentDay % 2 == 0) && (currentHour % 2 == 1)){
                totalPerDay += 2.50;
            } else if ((currentDay % 2 == 1) && (currentHour % 2 == 0)){
                totalPerDay += 1.25;
            } else {
                totalPerDay += 1;
            }
        }
        totalMoney += totalPerDay;
        System.out.printf("Day: %s - %.2f leva%n", currentDay, totalPerDay);
        totalPerDay = 0;
    }

        System.out.printf("Total: %.2f leva", totalMoney);
    }
}

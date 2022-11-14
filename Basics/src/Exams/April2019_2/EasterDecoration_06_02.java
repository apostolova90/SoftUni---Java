package Exams.April2019_2;

import java.util.Scanner;

public class EasterDecoration_06_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalMoneyPerDay = 0;
        double totalMoney = 0;
        int n = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        for (int i = 1; i <= n; i++){
            String command = scanner.nextLine();
            while(!command.equals("Finish")){
                String type = command;
                counter++;
                if (type.equals("basket")){
                    totalMoneyPerDay += 1.50;
                } else if (type.equals("wreath")){
                    totalMoneyPerDay += 3.80;
                } else {
                    totalMoneyPerDay += 7;
                }

                command = scanner.nextLine();
            }
            if (counter % 2 == 0) {
                totalMoneyPerDay = totalMoneyPerDay * 0.80;
                totalMoney += totalMoneyPerDay;
                System.out.printf("You purchased %s items for %.2f leva.%n", counter, totalMoneyPerDay);
            } else {
                totalMoney += totalMoneyPerDay;
                System.out.printf("You purchased %s items for %.2f leva.%n", counter, totalMoneyPerDay);
            }
            counter = 0;
            totalMoneyPerDay = 0;
        }

        System.out.printf("Average bill per client is: %.2f leva.", totalMoney / n);
    }
}

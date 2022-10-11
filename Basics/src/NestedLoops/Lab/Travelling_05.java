package NestedLoops.Lab;

import java.util.Scanner;

public class Travelling_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("End")){
            String destination = input;
            double neededBudget = Double.parseDouble(scanner.nextLine());

            double sum = 0;

            while (sum < neededBudget){
                double currentMoney = Double.parseDouble(scanner.nextLine());
                sum += currentMoney;

                // тук не слагаме нищо за завъртането
            }

            System.out.printf("Going to %s!%n", destination);
            input = scanner.nextLine();
        }
    }
}

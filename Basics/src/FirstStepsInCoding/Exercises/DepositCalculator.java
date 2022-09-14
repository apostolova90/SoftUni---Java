package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int depositSum = Integer.parseInt(scanner.nextLine());
        int period = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double interest = depositSum * percent / 100;
        double interestPerMonth = interest / 12;

        double finalSum = depositSum + (period * interestPerMonth);
        System.out.println(finalSum);

    }
}

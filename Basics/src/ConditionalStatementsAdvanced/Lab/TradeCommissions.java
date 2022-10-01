package ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();
        double num = Double.parseDouble(scanner.nextLine());

        boolean isValid = true;
        double commision = 0;

        if (town.equals("Sofia")) {
            if (num >= 0 && num <= 500) {
                commision = num * 0.05;
            } else if (num > 500 && num <= 1000) {
                commision = num * 0.07;
            } else if (num > 1000 && num <= 10000) {
                commision = num * 0.08;
            } else if (num > 10000) {
                commision = num * 0.12;
            } else {
                isValid = false;
            }

        } else if (town.equals("Varna")) {
            if (num >= 0 && num <= 500) {
                commision = num * 0.045;
            } else if (num > 500 && num <= 1000) {
                commision = num * 0.075;
            } else if (num > 1000 && num <= 10000) {
                commision = num * 0.10;
            } else if (num > 10000) {
                commision = num * 0.13;
            } else {
                isValid = false;
            }

        } else if (town.equals("Plovdiv")) {
            if (num >= 0 && num <= 500) {
                commision = num * 0.055;
            } else if (num > 500 && num <= 1000) {
                commision = num * 0.08;
            } else if (num > 1000 && num <= 10000) {
                commision = num * 0.12;
            } else if (num > 10000) {
                commision = num * 0.145;
            } else {
                isValid = false;
            }
        } else {
            isValid = false;
        }

        if (isValid) {
            System.out.printf("%.2f", commision);
        } else {
            System.out.println("error");
        }
    }
}

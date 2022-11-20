package Exams.July2019;

import java.util.Scanner;

public class Club_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double wantedProfit = Double.parseDouble(scanner.nextLine());

        double totalProfit = 0;
        String command = scanner.nextLine();

        boolean isTrue = false;
        while (!command.equals("Party!")){
            String cocktailName = command;
            int numberOfCocktails = Integer.parseInt(scanner.nextLine());

            double currentOrder = cocktailName.length() * numberOfCocktails;

            boolean isOdd = currentOrder % 2 ==0;
            if (!isOdd) {
                currentOrder = currentOrder * 0.75;
            }

            totalProfit += currentOrder;

            wantedProfit -= currentOrder;

            if (wantedProfit <= 0){
                isTrue = true;
                break;
            }
            command = scanner.nextLine();
        }

        if (isTrue) {
            System.out.println("Target acquired.");
            System.out.printf("Club income - %.2f leva.", totalProfit);
        } else {
            System.out.printf("We need %.2f leva more.%n", wantedProfit);
            System.out.printf("Club income - %.2f leva.", totalProfit);
        }
    }
}

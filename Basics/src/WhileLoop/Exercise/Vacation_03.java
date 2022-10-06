package WhileLoop.Exercise;

import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int spendStrike = 0;
        int daysCounter = 0;

        boolean isSpendTooManyDays = false;
        double excursionPrice = Double.parseDouble(scanner.nextLine());
        double currentMoney = Double.parseDouble(scanner.nextLine());

        while (currentMoney < excursionPrice){
            String command = scanner.nextLine();
            double currentSum = Double.parseDouble(scanner.nextLine());

            daysCounter++;

            if (command.equals("spend")){
                spendStrike++; // ако е ден, в койт харчи, го бройм за един
                currentMoney -= currentSum;
                if (currentMoney < 0){
                    currentMoney = 0;
                }
            } else {
                spendStrike = 0; // ако е ден, в който спестява, нулираме брояча на дрните за харчене, защото ние търсим 5 последователни дни
                currentMoney += currentSum;
            }

            if (spendStrike == 5){
                isSpendTooManyDays = true;
                break;
            }
        }

        if (isSpendTooManyDays){
            System.out.println("You can't save the money.");
            System.out.println(daysCounter);
        } else {
            System.out.printf("You saved the money for %s days.", daysCounter);
        }

    }
}

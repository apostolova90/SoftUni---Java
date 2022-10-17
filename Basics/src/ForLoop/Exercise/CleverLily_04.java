package ForLoop.Exercise;

import java.util.Scanner;

public class CleverLily_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int yearsLily = Integer.parseInt(scanner.nextLine());
        double priceWashingMachine = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());

        double giftedMoney = 0;
        double savedMoney = 0;
        int toyCounter = 0;

        for (int i = 1; i <= yearsLily; i++) {
            if (i % 2 == 0) {
                giftedMoney += 10;
                savedMoney += giftedMoney - 1;
            } else {
                toyCounter++;
            }
        }

        double totalMoneyLily = savedMoney + (toyCounter * toyPrice);

        double difference = Math.abs(totalMoneyLily - priceWashingMachine);
        if (totalMoneyLily >= priceWashingMachine){
            System.out.printf("Yes! %.2f", difference);
        } else {
            System.out.printf("No! %.2f", difference);
        }

    }
}

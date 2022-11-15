package Exams.April2019_2;

import java.util.Scanner;

public class EasterShop_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int numberOfEggs = Integer.parseInt(scanner.nextLine());
        boolean notEnoughEggs = false;
        int totalEggsSold = 0;

        String command = scanner.nextLine();
        while(!command.equals("Close")){
            String buyOrFill = command;
            int number = Integer.parseInt(scanner.nextLine());

            if (number > numberOfEggs && buyOrFill.equals("Buy")){
                notEnoughEggs = true;
                break;
            }

            if (buyOrFill.equals("Buy")){
                numberOfEggs -= number;
                totalEggsSold += number;
            } else {
                numberOfEggs += number;
            }

            command = scanner.nextLine();
        }

        if (notEnoughEggs){
            System.out.printf("Not enough eggs in store!%n");
            System.out.printf("You can buy only %s.", numberOfEggs);
        } else {
            System.out.printf("Store is closed!%n");
            System.out.printf("%s eggs sold.", totalEggsSold);
        }
    }
}

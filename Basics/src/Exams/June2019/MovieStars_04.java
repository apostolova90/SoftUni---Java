package Exams.June2019;

import java.util.Scanner;

public class MovieStars_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());

        boolean noMoneyLeft = false;
        double difference = 0;
        double moneyForAll = 0;

        String command = scanner.nextLine();

        while(!command.equals("ACTION")){
            String name = command;
//
            double money = 0;
            if (name.length() <= 15){
                money = Double.parseDouble(scanner.nextLine());
            }

            if (name.length() > 15){
                money = budget * 0.2;
            }


            if (budget < money){
                noMoneyLeft = true;
                difference = money - budget;
                break;
            }
            budget -= money;
            moneyForAll += money;


            command = scanner.nextLine();
        }

        if (noMoneyLeft){
            System.out.printf("We need %.2f leva for our actors.", difference);
        } else {
            System.out.printf("We are left with %.2f leva.", budget);
        }
    }
}

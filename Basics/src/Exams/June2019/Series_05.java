package Exams.June2019;

import java.util.Scanner;

public class Series_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        double moneyNeededForAll = 0;

        for (int i = 1; i <= n; i++){
        String name = scanner.nextLine();
        double price = Double.parseDouble(scanner.nextLine());

        if (name.equals("Thrones")){
            price = price * 0.5;
        } else if(name.equals("Lucifer")){
            price = price * 0.6;
        }
        else if(name.equals("Protector")){
            price = price * 0.7;
        }
        else if(name.equals("TotalDrama")){
            price = price * 0.8;
        }
        else if(name.equals("Area")){
            price = price * 0.9;
        }

            moneyNeededForAll += price;
        }

        double difference = Math.abs(budget - moneyNeededForAll);

        if (budget >= moneyNeededForAll){
            System.out.printf("You bought all the series and left with %.2f lv.", difference);
        } else {
            System.out.printf("You need %.2f lv. more to buy the series!", difference);
        }
    }
}

package Exams.March2020;

import java.util.Scanner;

public class FitnessCard_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String maleOrFemale = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String sport = scanner.nextLine();

        double pricePerMonth = 0;

        switch(sport){
            case "Gym":
                if (maleOrFemale.equals("m")){
                    pricePerMonth = 42;
                } else {
                    pricePerMonth = 35;
                }
                break;
            case "Boxing":
                if (maleOrFemale.equals("m")){
                    pricePerMonth = 41;
                } else {
                    pricePerMonth = 37;
                }
                break;
            case "Yoga":
                if (maleOrFemale.equals("m")){
                    pricePerMonth = 45;
                } else {
                    pricePerMonth = 42;
                }
                break;
            case "Zumba":
                if (maleOrFemale.equals("m")){
                    pricePerMonth = 34;
                } else {
                    pricePerMonth = 31;
                }
                break;
            case "Dances":
                if (maleOrFemale.equals("m")){
                    pricePerMonth = 51;
                } else {
                    pricePerMonth = 53;
                }
                break;
            case "Pilates":
                if (maleOrFemale.equals("m")){
                    pricePerMonth = 39;
                } else {
                    pricePerMonth = 37;
                }
                break;
        }

        if (age <= 19){
            pricePerMonth = pricePerMonth * 0.80;
        }
        if (budget >= pricePerMonth){
            System.out.printf("You purchased a 1 month pass for %s.", sport);
        } else {
            double difference = pricePerMonth - budget;
            System.out.printf("You don't have enough money! You need $%.2f more.", difference);
        }

    }
}

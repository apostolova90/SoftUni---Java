package Exams.May2019;

import java.util.Scanner;

public class MobileOperator_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String years = scanner.nextLine();
        String typeOfContract = scanner.nextLine();
        String withInternetOrNot = scanner.nextLine();
        int numOfMonths = Integer.parseInt(scanner.nextLine());

        double tax = 0;

        switch (typeOfContract){
            case "Small":
                if (years.equals("one")){
                    tax += 9.98;
                } else {
                    tax += 8.58;
                }
                break;
            case "Middle":
                if (years.equals("one")){
                    tax += 18.99;
                } else {
                    tax += 17.09;
                }
                break;
            case "Large":
                if (years.equals("one")){
                    tax += 25.98;
                } else {
                    tax += 23.59;
                }
                break;
            case "ExtraLarge":
                if (years.equals("one")){
                    tax += 35.99;
                } else {
                    tax += 31.79;
                }
                break;
        }

        if (withInternetOrNot.equals("yes") && tax <= 10){
            tax += 5.50;
        } else if (withInternetOrNot.equals("yes") && tax > 10 && tax <= 30){
            tax += 4.35;
        } else if (withInternetOrNot.equals("yes") && tax > 30){
            tax += 3.85;
        }

        double total = tax * numOfMonths;

        if (years.equals("two")){
            total -= total * 3.75 /100;
        }

        System.out.printf("%.2f lv.", total);
    }
}

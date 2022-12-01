package Exams.March2020;

import java.util.Scanner;

public class EnergyBooster_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String smallOrBig = scanner.nextLine();
        int num = Integer.parseInt(scanner.nextLine());

        double price = 0;

        switch(fruit){
            case "Watermelon":
                if(smallOrBig.equals("small")){
                    price = 56 * 2 * num;
                } else {
                    price = 28.70 * 5 * num;
                }
                break;
            case "Mango":
                if(smallOrBig.equals("small")){
                    price = 36.66 * 2 * num;
                } else {
                    price = 19.60 * 5 * num;
                }
                break;
            case "Pineapple":
                if(smallOrBig.equals("small")){
                    price = 42.10 * 2 * num;
                } else {
                    price = 24.80 * 5 * num;
                }
                break;
            case "Raspberry":
                if(smallOrBig.equals("small")){
                    price = 20 * 2 * num;
                } else {
                    price = 15.20 * 5 * num;
                }
                break;
        }

        if (price >= 400 && price <= 1000){
            price = price * 0.85;
        } else if (price > 1000){
            price = price * 0.5;
        }

        System.out.printf("%.2f lv.", price);
    }
}

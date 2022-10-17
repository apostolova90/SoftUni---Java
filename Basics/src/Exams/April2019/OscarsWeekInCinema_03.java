package Exams.April2019;

import java.util.Scanner;

public class OscarsWeekInCinema_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String type = scanner.nextLine();
        int num = Integer.parseInt(scanner.nextLine());

        double totalMoney = 0;

        switch (name){
            case "A Star Is Born":
                if (type.equals("normal")){
                    totalMoney = num * 7.50;
                } else if (type.equals("luxury")){
                    totalMoney = num * 10.50;
                } else {
                    totalMoney = num * 13.50;
                }
                break;
            case "Bohemian Rhapsody":
                if (type.equals("normal")){
                    totalMoney = num * 7.35;
                } else if (type.equals("luxury")){
                    totalMoney = num * 9.45;
                } else {
                    totalMoney = num * 12.75;
                }
                break;
            case "Green Book":
                if (type.equals("normal")){
                    totalMoney = num * 8.15;
                } else if (type.equals("luxury")){
                    totalMoney = num * 10.25;
                } else {
                    totalMoney = num * 13.25;
                }
                break;
            case "The Favourite":
                if (type.equals("normal")){
                    totalMoney = num * 8.75;
                } else if (type.equals("luxury")){
                    totalMoney = num * 11.55;
                } else {
                    totalMoney = num * 13.95;
                }
                break;
        }

        System.out.printf("%s -> %.2f lv.", name, totalMoney);
    }
}

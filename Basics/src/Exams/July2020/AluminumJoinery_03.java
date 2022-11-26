package Exams.July2020;

import java.util.Scanner;

public class AluminumJoinery_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String deliveryOrNot = scanner.nextLine();

        double total = 0;

        switch(type){
            case "90X130":
                total += num * 110;
                if (num >= 30 && num < 60) {
                    total -= total * 0.05;
                } else if (num  >= 60) {
                    total -= total * 0.08;
                }
                break;
            case "100X150":
                total += num * 140;
                if (num >= 40 && num < 80) {
                    total -= total * 0.06;
                } else if (num  >= 80) {
                    total -= total * 0.1;
                }
                break;
            case "130X180":
                total += num * 190;
                if (num >= 20 && num < 50) {
                    total -= total * 0.07;
                } else if (num  >= 50) {
                    total -= total * 0.12;
                }
                break;
            case "200X300":
                total += num * 250;
                if (num >= 25 && num < 50) {
                    total -= total * 0.09;
                } else if (num  >= 50) {
                    total -= total * 0.14;
                }
                break;
        }

        if (deliveryOrNot.equals("With delivery")){
            total += 60;
        }

        if (num > 99){
            total -= total * 0.04;
        }

        if (num < 10){
            System.out.println("Invalid order");
        } else {
            System.out.printf("%.2f BGN", total);
        }
    }
}

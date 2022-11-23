package Exams.July2019;

import java.util.Scanner;

public class TravelAgency_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();
        String typePackage = scanner.nextLine();
        String vipDiscountOrNo = scanner.nextLine();
        int numberOfDays = Integer.parseInt(scanner.nextLine());

        boolean isTrueTown = town.equals("Bansko") || town.equals("Borovets") || town.equals("Varna") || town.equals("Burgas");
        boolean isTruePackage = typePackage.equals("noEquipment") || typePackage.equals("withEquipment") || typePackage.equals("noBreakfast") || typePackage.equals("withBreakfast");

        if (numberOfDays > 7) {
            numberOfDays -= 1;
        }

        double pricePerNight = 0;

        if (!isTrueTown || !isTruePackage) {
            System.out.println("Invalid input!");
        } else if (numberOfDays < 1){
            System.out.println("Days must be positive number!");
        } else {
            switch (town) {
                case "Bansko":
                case "Borovets":
                    if (typePackage.equals("withEquipment")) {
                        pricePerNight = 100;
                        if (vipDiscountOrNo.equals("yes")) {
                            pricePerNight = pricePerNight * 0.90;
                        }
                    } else if (typePackage.equals("noEquipment")) {
                        pricePerNight = 80;
                        if (vipDiscountOrNo.equals("yes")) {
                            pricePerNight = pricePerNight * 0.95;
                        }
                    }
                    break;
                case "Varna":
                case "Burgas":
                    if (typePackage.equals("withBreakfast")) {
                        pricePerNight = 130;
                        if (vipDiscountOrNo.equals("yes")) {
                            pricePerNight = pricePerNight * 0.88;
                        }
                    } else if (typePackage.equals("noBreakfast")) {
                        pricePerNight = 100;
                        if (vipDiscountOrNo.equals("yes")) {
                            pricePerNight = pricePerNight * 0.93;
                        }
                    }
                    break;
            }

            double total = pricePerNight * numberOfDays;
            System.out.printf("The price is %.2flv! Have a nice time!", total);
        }

    }
}

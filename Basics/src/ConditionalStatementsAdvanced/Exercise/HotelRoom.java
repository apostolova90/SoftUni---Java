package ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int numberOfNights = Integer.parseInt(scanner.nextLine());

        double priceStudio = 0;
        double priceApartment = 0;

        if (month.equals("May") || month.equals("October")){
            priceStudio = numberOfNights * 50;
            priceApartment = numberOfNights * 65;
            if (numberOfNights > 14){
                priceStudio = priceStudio * 0.70;
                priceApartment = priceApartment * 0.90;
            } else if (numberOfNights > 7) {
                priceStudio = priceStudio * 0.95;
            }

        } else if (month.equals("June") || month.equals("September")) {
            priceStudio = numberOfNights * 75.20;
            priceApartment = numberOfNights * 68.70;
            if (numberOfNights > 14) {
                priceStudio = priceStudio * 0.80;
                priceApartment = priceApartment * 0.90;
            }

        } else if (month.equals("July") || month.equals("August")) {
            priceStudio = numberOfNights * 76;
            priceApartment = numberOfNights * 77;
            if (numberOfNights > 14) {
                priceApartment = priceApartment * 0.90;
            }
        }

        System.out.printf("Apartment: %.2f lv.%n", priceApartment);
        System.out.printf("Studio: %.2f lv.", priceStudio);
    }
}

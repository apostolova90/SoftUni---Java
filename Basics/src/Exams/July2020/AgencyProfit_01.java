package Exams.July2020;

import java.util.Scanner;

public class AgencyProfit_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int numAdults = Integer.parseInt(scanner.nextLine());
        int numKids = Integer.parseInt(scanner.nextLine());
        double priceAdults = Double.parseDouble(scanner.nextLine());
        double priceTax = Double.parseDouble(scanner.nextLine());

        double priceKids = priceAdults * 0.30;
        double finalPriceAdult = priceAdults + priceTax;
        double finalPriceKid = priceKids + priceTax;

        double totalPrice = ((numAdults * finalPriceAdult) + (numKids * finalPriceKid));
        double profit = 0.20 * totalPrice;

        System.out.printf("The profit of your agency from %s tickets is %.2f lv.", name, profit);

    }
}

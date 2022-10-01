package FirstStepsInCoding.Lab;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double area = Double.parseDouble(scanner.nextLine());
        double totalPriceNoDiscount = area * 7.61;
        double discount = totalPriceNoDiscount * 0.18;
        double totalPrice = totalPriceNoDiscount - discount;

        System.out.println("The final price is: " + totalPrice + " lv.");
        System.out.println("The discount is: " + discount + " lv.");
    }
}

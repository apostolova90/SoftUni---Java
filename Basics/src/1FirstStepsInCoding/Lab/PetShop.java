package FirstStepsInCoding.Lab;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int packagesDog = Integer.parseInt(scanner.nextLine());
        int packagesCat = Integer.parseInt(scanner.nextLine());
        double totalPriceDog = packagesDog * 2.50;
        double totalPriceCat = packagesCat * 4;
        double totalPriceForBoth = totalPriceDog + totalPriceCat;

        System.out.println(totalPriceForBoth + " lv.");
    }
}

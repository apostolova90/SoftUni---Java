package ConditionalStatements.Exercise;

import java.util.Scanner;

public class GodzillavsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());
        double priceClothes = Double.parseDouble(scanner.nextLine());

        double decor = budget * 0.10;
        double priceAllClothes = workers * priceClothes;
        if (workers > 150){
            priceAllClothes = priceAllClothes * 0.90;
        }

        double totalMoneyNeeded = decor + priceAllClothes;
        double difference = Math.abs(budget - totalMoneyNeeded);

        if (budget >= totalMoneyNeeded){
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", difference);
        } else {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", difference);
        }
    }
}

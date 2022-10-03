package ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flowerType = scanner.nextLine();
        int countOfFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double price = 0;

        if (flowerType.equals("Roses")){
            price = countOfFlowers * 5;
            if (countOfFlowers > 80){
                price = price * 0.90;
            }
        } else if (flowerType.equals("Dahlias")) {
            price = countOfFlowers * 3.80;
            if (countOfFlowers > 90){
                price = price * 0.85;
            }
        }
        else if (flowerType.equals("Tulips")) {
            price = countOfFlowers * 2.80;
            if (countOfFlowers > 80){
                price = price * 0.85;
            }
        }
        else if (flowerType.equals("Narcissus")) {
            price = countOfFlowers * 3;
            if (countOfFlowers < 120){
                price = price + (price * 0.15);
            }
        }
        else if (flowerType.equals("Gladiolus")) {
            price = countOfFlowers * 2.50;
            if (countOfFlowers < 80){
                price = price + (price * 0.20);
            }
        }

        double difference = Math.abs(budget - price);

        if (budget >= price){
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", countOfFlowers, flowerType, difference);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", difference);
        }
    }
}

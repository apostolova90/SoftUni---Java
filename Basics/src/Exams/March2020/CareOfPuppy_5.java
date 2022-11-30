package Exams.March2020;

import java.util.Scanner;

public class CareOfPuppy_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int foodKg = Integer.parseInt(scanner.nextLine());
        double food = foodKg * 1000;
        double eatenFood = 0;

        String command = scanner.nextLine();

        while(!command.equals("Adopted")){
            double foodPerDay = Integer.parseInt(command);

            eatenFood += foodPerDay;
            command = scanner.nextLine();
        }

        if (eatenFood > food){
            double difference = eatenFood - food;
            System.out.printf("Food is not enough. You need %.0f grams more.", difference);
        } else {
            double difference = food - eatenFood;
            System.out.printf("Food is enough! Leftovers: %.0f grams.", difference);
        }
    }
}

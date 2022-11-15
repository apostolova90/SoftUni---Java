package Exams.April2019_2;

import java.util.Scanner;

public class EasterDecoration_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numPeople = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        double totalPrice = 0;
        double pricePerClient = 0;

        for (int i = 1; i <= numPeople; i++){
            String command = scanner.nextLine();
                while(!command.equals("Finish")){
                    counter++;
                    if (command.equals("basket")){
                        pricePerClient += 1.50;
                    } else if (command.equals("wreath")) {
                        pricePerClient += 3.80;
                    } else {
                        pricePerClient += 7;
                    }
                    command = scanner.nextLine();
                }

            if (counter % 2 == 0){
                pricePerClient = pricePerClient * 0.80;
                totalPrice += pricePerClient;
            } else {
                totalPrice += pricePerClient;
            }

            System.out.printf("You purchased %s items for %.2f leva.%n", counter, pricePerClient);
            pricePerClient = 0;
            counter = 0;
        }

        double evgBill = totalPrice / numPeople;
        System.out.printf("Average bill per client is: %.2f leva.", evgBill);
    }
}

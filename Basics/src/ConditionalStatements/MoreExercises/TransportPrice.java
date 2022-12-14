package ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kilometers = Integer.parseInt(scanner.nextLine());
        String dayTime = scanner.nextLine().toLowerCase();
        double price = 0;
        if (kilometers < 20) {
            if (dayTime.equals("day")) {
                price = 0.7 + 0.79 * kilometers;
            } else if (dayTime.equals("night")) {
                price = 0.7 + 0.9 * kilometers;

            }
            System.out.printf("%.2f", price);
        } else if (kilometers >= 20 && kilometers < 100) {
            price = kilometers * 0.09;
            System.out.printf("%.2f", price);
        } else if (kilometers >= 100) {
            price = kilometers * 0.06;
            System.out.printf("%.2f", price);
        }
    }
}

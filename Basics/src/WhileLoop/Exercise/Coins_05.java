package WhileLoop.Exercise;

import java.util.Scanner;

public class Coins_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = Double.parseDouble(scanner.nextLine());
        double sumInCoins = sum * 100;

        int countCoins = 0;

        while (sumInCoins > 0) {

            if (sumInCoins >= 200) {
                sumInCoins -= 200;
                countCoins++;
            } else if (sumInCoins >= 100) {
                countCoins++;
                sumInCoins -= 100;
            } else if (sumInCoins >= 50) {
                countCoins++;
                sumInCoins -= 50;
            } else if (sumInCoins >= 20) {
                countCoins++;
                sumInCoins -= 20;
            } else if (sumInCoins >= 10) {
                countCoins++;
                sumInCoins -= 10;
            } else if (sumInCoins >= 5) {
                countCoins++;
                sumInCoins -= 5;
            } else if (sumInCoins >= 2) {
                countCoins++;
                sumInCoins -= 2;
            } else if (sumInCoins >= 1) {
                countCoins++;
                sumInCoins -= 1;
            } else {
                break;
            }
        }

        System.out.println(countCoins);
    }
}

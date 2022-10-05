package Exams.May2019;

import java.util.Scanner;

public class DivisionWithoutRemainder_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double p1 = 0;
        double p2 = 0;
        double p3 = 0;

        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            if (number % 2 == 0){
                p1++;
            }
            if (number % 3 == 0){
                p2++;
            }
            if (number % 4 == 0){
                p3++;
            }
        }

        double percentageP1 = p1 / n * 100;
        double percentageP2 = p2 / n * 100;
        double percentageP3 = p3 / n * 100;

        System.out.printf("%.2f%%%n", percentageP1);
        System.out.printf("%.2f%%%n", percentageP2);
        System.out.printf("%.2f%%", percentageP3);
    }
}

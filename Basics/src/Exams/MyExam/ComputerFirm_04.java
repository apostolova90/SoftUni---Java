package Exams.MyExam;

import java.util.Scanner;

public class ComputerFirm_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalRating = 0;
        double totalSells = 0;

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++){
            int currentNum = Integer.parseInt(scanner.nextLine());
            int lastDigit = currentNum % 10;
            int sells = currentNum / 10;
            totalRating += lastDigit;
            if (lastDigit == 2){
                totalSells += 0;
            } else if (lastDigit == 3){
                totalSells += sells * 0.5;
            } else if (lastDigit == 4){
                totalSells += sells * 0.7;
            } else if (lastDigit == 5){
                totalSells += sells * 0.85;
            } else if (lastDigit == 6){
                totalSells += sells;
            }
        }

        double evgRating = totalRating / n;

        System.out.printf("%.2f%n", totalSells);
        System.out.printf("%.2f", evgRating);

    }
}

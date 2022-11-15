package Exams.April2019_2;

import java.util.Scanner;

public class EasterLunch_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numKozunaci = Integer.parseInt(scanner.nextLine());
        int numEggsBoxes = Integer.parseInt(scanner.nextLine());
        int kgCookies = Integer.parseInt(scanner.nextLine());

        int numEggs = numEggsBoxes * 12;

        double totalMoney = (numKozunaci * 3.20) + (numEggsBoxes * 4.35) + (kgCookies * 5.40) + (numEggs * 0.15);

        System.out.printf("%.2f", totalMoney);
    }
}

package Exams.March2020;

import java.util.Scanner;

public class ChangeBureau_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bitcoin = Integer.parseInt(scanner.nextLine());
        double uan = Double.parseDouble(scanner.nextLine());
        double commission = Double.parseDouble(scanner.nextLine());

        double leva = (bitcoin * 1168) + (uan * 0.15 * 1.76);
        double euro = leva / 1.95;
        double commissionTotal = euro * commission / 100;
        double finalMoney = euro - commissionTotal;

        System.out.printf("%.2f", finalMoney);

    }
}

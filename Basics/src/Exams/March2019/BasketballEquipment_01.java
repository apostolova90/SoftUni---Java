package Exams.March2019;

import java.util.Scanner;

public class BasketballEquipment_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int tax = Integer.parseInt(scanner.nextLine());
        double shoes = tax * 0.60;
        double clothes = shoes * 0.80;
        double baw = clothes * 1/4;
        double accessories = baw * 1/5;

        double total = tax + shoes + clothes + baw + accessories;
        System.out.printf("%.2f", total);
    }
}

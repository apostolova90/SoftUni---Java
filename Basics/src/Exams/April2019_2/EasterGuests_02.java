package Exams.April2019_2;

import java.util.Scanner;

public class EasterGuests_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numGuests = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double easterBread  = Math.ceil(numGuests / 3);
        double eggs = numGuests * 2;

        double totalMoneyEasterBread = easterBread * 4;
        double totalMoneyEggs = eggs * 0.45;

        double totalMoney = totalMoneyEggs + totalMoneyEasterBread;
        double difference = Math.abs(totalMoney - budget);

        if (totalMoney > budget){
            System.out.printf("Lyubo doesn't have enough money.%n");
            System.out.printf("He needs %.2f lv. more.", difference);
        } else {
            System.out.printf("Lyubo bought %.0f Easter bread and %.0f eggs.%n", easterBread, eggs);
            System.out.printf("He has %.2f lv. left.", difference);
        }
    }
}

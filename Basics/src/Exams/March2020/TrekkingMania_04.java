package Exams.March2020;

import java.util.Scanner;

public class TrekkingMania_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double musala = 0;
        double monblan = 0;
        double kilimandjaro = 0;
        double k2 = 0;
        double everest = 0;
        double total = 0;

        int groups = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= groups; i++){
            int countPeople = Integer.parseInt(scanner.nextLine());
            total += countPeople;
            if (countPeople <= 5){
                musala += countPeople;
            } else if (countPeople >= 6 && countPeople <= 12){
                monblan += countPeople;
            } else if (countPeople >= 13 && countPeople <= 25){
                kilimandjaro += countPeople;
            } else if (countPeople >= 26 && countPeople <= 40){
                k2 += countPeople;
            } else {
                everest += countPeople;
            }
        }

        double percentageMusala = musala / total * 100;
        double percentageMonblan = monblan / total * 100;
        double percentageKilimandjaro = kilimandjaro / total * 100;
        double percentagek2 = k2 / total * 100;
        double percentageEverest = everest / total * 100;

        System.out.printf("%.2f%%%n", percentageMusala);
        System.out.printf("%.2f%%%n", percentageMonblan);
        System.out.printf("%.2f%%%n", percentageKilimandjaro);
        System.out.printf("%.2f%%%n", percentagek2);
        System.out.printf("%.2f%%", percentageEverest);
    }
}

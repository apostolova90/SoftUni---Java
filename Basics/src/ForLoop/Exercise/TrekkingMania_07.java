package ForLoop.Exercise;

import java.util.Scanner;

public class TrekkingMania_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfGroups = Integer.parseInt(scanner.nextLine());

        double musala = 0;
        double monblan = 0;
        double kilimandjaro = 0;
        double k2 = 0;
        double everest = 0;

        int total = 0;

        for (int i = 1; i <= numberOfGroups; i++){

            int peopleInCurrentGroup = Integer.parseInt(scanner.nextLine());

            total += peopleInCurrentGroup;

            if (peopleInCurrentGroup <= 5){
                musala += peopleInCurrentGroup;
            } else if (peopleInCurrentGroup >= 6 && peopleInCurrentGroup <= 12){
                monblan += peopleInCurrentGroup;
            } else if (peopleInCurrentGroup >= 13 && peopleInCurrentGroup <= 25){
                kilimandjaro += peopleInCurrentGroup;
            } else if (peopleInCurrentGroup >= 26 && peopleInCurrentGroup <= 40){
                k2 += peopleInCurrentGroup;
            } else {
                everest += peopleInCurrentGroup;
            }
        }

        double musalaProcentage = musala / total * 100;
        double monblanProcentage = monblan / total * 100;
        double kilimandjaroProcentage = kilimandjaro / total * 100;
        double k2Procentage = k2 / total * 100;
        double everestProcentage = everest / total * 100;

        System.out.printf("%.2f%%%n", musalaProcentage);
        System.out.printf("%.2f%%%n", monblanProcentage);
        System.out.printf("%.2f%%%n", kilimandjaroProcentage);
        System.out.printf("%.2f%%%n", k2Procentage);
        System.out.printf("%.2f%%%n", everestProcentage);

    }
}

package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nylonNeeded = Integer.parseInt(scanner.nextLine());
        double nylonNeededPlusExtra = nylonNeeded + 2;
        int paintNeeded = Integer.parseInt(scanner.nextLine());
        double paintNeededPlusExtra = paintNeeded + (paintNeeded * 0.10);
        int thinnerNeeded = Integer.parseInt(scanner.nextLine());
        int workersHoursNeeded = Integer.parseInt(scanner.nextLine());


        double nylonPrice = nylonNeededPlusExtra * 1.50;
        double paintPrice = paintNeededPlusExtra * 14.50;
        double thinnerPrice = thinnerNeeded * 5.00;
        double totalPrice = nylonPrice + paintPrice + thinnerPrice + 0.40;
        double workersPricePerHour = totalPrice * 0.30;
        double totalPriceForAllWorkers = workersHoursNeeded * workersPricePerHour;

        double totalMoneyNeeded = totalPrice + totalPriceForAllWorkers;

        System.out.println(totalMoneyNeeded);

    }
}

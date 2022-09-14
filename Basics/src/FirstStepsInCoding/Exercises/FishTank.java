package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double otherThingsInTheTank = Double.parseDouble(scanner.nextLine());

        double totalCapacity = length * width * height;
        double totalCapacityInLiters = totalCapacity / 1000;
        double litersNeeded = totalCapacityInLiters - totalCapacityInLiters * otherThingsInTheTank / 100;

        System.out.println(litersNeeded);
    }
}

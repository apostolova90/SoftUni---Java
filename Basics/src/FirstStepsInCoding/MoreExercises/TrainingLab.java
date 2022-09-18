package FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double lengthMeters = Double.parseDouble(scanner.nextLine());
        double widthMeters = Double.parseDouble(scanner.nextLine());
        double lengthCentimeters = lengthMeters * 100;
        double widthCentimeters = widthMeters * 100;
        double widthCentimetersWithoutCentimeters = widthCentimeters - 100;

        double numberTablesWidth = ((double) (Math.floor(widthCentimetersWithoutCentimeters / 70)));
        double numberTablesLength = ((double) (Math.floor(lengthCentimeters / 120)));

        double result = numberTablesWidth * numberTablesLength - 3;
        System.out.println(result);

    }
}

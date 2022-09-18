package FirstStepsInCoding.MoreExercises;

import java.util.Scanner;

public class CircleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double r = Double.parseDouble(scanner.nextLine());

        double calculatedArea = (Math.PI * r * r);
        double calculatedParameter = (Math.PI * r * 2);

        System.out.printf("%.2f%n", calculatedArea);
        System.out.printf("%.2f%n", calculatedParameter);
    }
}

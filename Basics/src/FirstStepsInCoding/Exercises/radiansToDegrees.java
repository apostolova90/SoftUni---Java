package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class radiansToDegrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double radiаn = Double.parseDouble(scanner.nextLine());
        double degrees = radiаn * 180 / Math.PI;
        System.out.println(degrees);
    }
}

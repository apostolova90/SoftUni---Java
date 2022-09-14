package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class USDtoBGN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numberOfDollars = Double.parseDouble(scanner.nextLine());
        double dollarsIntoUSD = numberOfDollars * 1.79549;
        System.out.println(dollarsIntoUSD);
    }
}

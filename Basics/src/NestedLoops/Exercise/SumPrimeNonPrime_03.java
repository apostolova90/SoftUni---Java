package NestedLoops.Exercise;

import java.util.Scanner;

public class SumPrimeNonPrime_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int sumPrime = 0;
        int sumNonPrime = 0;

        while (!input.equals("stop")){
            int currentNum = Integer.parseInt(input);

            if (currentNum < 0) {
                System.out.println("Number is negative.");
                input = scanner.nextLine(); // слагаме го тук, за да вземем нова променлива след continue, иначе ще направим безкраен цикъл
                continue; // няма да продължи надолу, а ще се върне и ще завърти наново
            }


            int counter = 0;
            for (int i = 1; i <= currentNum; i++) { // защото простите числа се делят само на 1 и на себе си

                if (currentNum % i == 0) {
                    counter++;
                }
            }

            if (counter == 2) {
                sumPrime += currentNum;
            } else {
                sumNonPrime += currentNum;
            }

            input = scanner.nextLine();

        }

        System.out.printf("Sum of all prime numbers is: %s%n", sumPrime);
        System.out.printf("Sum of all non prime numbers is: %s%n", sumNonPrime);

    }
}

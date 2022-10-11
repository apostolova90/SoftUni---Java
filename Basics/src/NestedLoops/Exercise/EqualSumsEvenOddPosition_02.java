package NestedLoops.Exercise;

import java.util.Scanner;

public class EqualSumsEvenOddPosition_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    int start = Integer.parseInt(scanner.nextLine());
    int end = Integer.parseInt(scanner.nextLine());

        for (int i = start; i <= end; i++){

            int currentNum = i;
            int evenSum = 0;
            int oddSum = 0;

            for (int j = 6; j >= 1; j--){
                int digit = currentNum % 10;
                if (j % 2 ==0){
                    evenSum += digit;
                } else {
                    oddSum += digit;
                }
                currentNum = currentNum / 10; // махаме последното число ( от 100000, ще стане 10000)
            }

            if (evenSum == oddSum){
                System.out.print(i + " ");
            }
        }

    }
}

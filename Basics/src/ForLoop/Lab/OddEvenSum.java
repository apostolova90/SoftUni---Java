package ForLoop.Lab;

import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 1; i <= n; i++){
            int currentNum = Integer.parseInt(scanner.nextLine()); // записваме поредно число под променлива
            if (i % 2 == 0){ // проверяваме дали сме на четна или не1етна позиция
                sumEven = sumEven + currentNum;
            } else {
                sumOdd = sumOdd + currentNum;
            }
        }

        if (sumOdd == sumEven){
            System.out.println("Yes");
            System.out.printf("Sum = %d", sumEven);
        } else {
            int difference = Math.abs(sumEven - sumOdd);
            System.out.println("No");
            System.out.printf("Diff = %d", difference);
        }

    }
}

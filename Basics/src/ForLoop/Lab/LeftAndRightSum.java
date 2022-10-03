package ForLoop.Lab;

import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sum1 = 0;
        int sum2 = 0;

        for (int i = 1; i <= n; i++){
            int currentNum = Integer.parseInt(scanner.nextLine());
            sum1 = sum1 + currentNum;
        }

        for (int i = 1; i <= n; i++){
            int currentNum = Integer.parseInt(scanner.nextLine());
            sum2 = sum2 + currentNum;
        }

        if (sum1 == sum2){
            System.out.printf("Yes, sum = %d", sum1);
        } else {
            int difference = Math.abs(sum1 - sum2);
            System.out.printf("No, diff = %d", difference);
        }
    }
}

package ForLoop.Lab;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.pars                               eInt(scanner.nextLine());

        int sum = 0;

        for (int i = 1; i <= n; i++){ // завъртаме толкова пъти, колкото са ни дадени на първа позиция
            int currentNum = Integer.parseInt(scanner.nextLine()); // взимам последователно всяко от соатналите във входа числа
            sum = sum + currentNum;
        }

        System.out.println(sum);
    }
}

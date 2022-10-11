package NestedLoops.Lab;

import java.util.Scanner;

public class SumOfTwoNumbers_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int magicNum = Integer.parseInt(scanner.nextLine());

        int counter = 0;
        boolean isValid = false;

        for (int num1 = n1; num1 <= n2; num1++){
            for (int num2 = n1; num2 <= n2; num2++){
                counter++;
                if (num1 + num2 == magicNum){
                    isValid = true;
                    System.out.printf("Combination N:%s (%s + %s = %s)", counter, num1, num2, magicNum);
                    break;
                }
            }
            if (isValid){  // приклучваме горния for цикъл
                break;
            }
        }
        if (!isValid){
            System.out.printf("%s combinations - neither equals %s", counter, magicNum);
        }
    }
}

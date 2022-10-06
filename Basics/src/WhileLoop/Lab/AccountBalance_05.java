package WhileLoop.Lab;

import java.util.Scanner;

public class AccountBalance_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine(); // задаваме първия ред като стринг, защото може да са и числа и текст -    "100"    "5.55"   "NoMoreMoney"

        double sum = 0;

        while (!inputLine.equals("NoMoreMoney")){
            double num = Double.parseDouble(inputLine); // превръщаме стринга с число

            if (num < 0){
                System.out.println("Invalid operation!");
                break;
            } else {
                sum += num;

                System.out.printf("Increase: %.2f%n", num);

                inputLine = scanner.nextLine(); // за да се завърти
            }
        }
        System.out.printf("Total: %.2f%n", sum);
    }
}

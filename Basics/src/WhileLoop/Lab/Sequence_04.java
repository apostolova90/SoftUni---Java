package WhileLoop.Lab;

import java.util.Scanner;

public class Sequence_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        int n = 1;

        while(n <= num){
            System.out.println(n);
            n = n * 2 + 1;
        }
    }
}

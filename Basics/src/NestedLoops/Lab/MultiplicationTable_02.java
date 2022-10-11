package NestedLoops.Lab;

import java.util.Scanner;

public class MultiplicationTable_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 10; i++){
            for (int n = 1; n <= 10; n++){
                System.out.printf("%d * %d = %d%n", i, n, i*n);
            }

        }

    }
}

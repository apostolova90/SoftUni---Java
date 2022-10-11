package NestedLoops.Lab;

import java.util.Scanner;

public class Combinations_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        for (int n1 = 0; n1 <= n; n1++){
            for (int n2 = 0; n2 <= n; n2++){
                for (int n3 = 0; n3 <= n; n3++){

                    if (n1 + n2 + n3 == n){
                        counter++;
                    }
                }
            }
        }

        System.out.println(counter);

    }
}

package NestedLoops.Exercise;

import java.util.Scanner;

public class NumberPyramid_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int current = 1;
        boolean isBigger = false;

        for(int rows = 1; rows <= n; rows++){
            for (int cols = 1; cols <= rows; cols++){
                if (current > n){
                    isBigger = true;
                    break;
                }
                System.out.print(current + " ");
                current++;
            }
            if (isBigger){ //приклучваме горния for цикъл
                break;
            }
            System.out.println(); // нов ред
        }
    }
}

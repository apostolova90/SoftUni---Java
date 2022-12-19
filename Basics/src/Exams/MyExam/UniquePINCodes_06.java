package Exams.MyExam;

import java.util.Scanner;

public class UniquePINCodes_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        for (int i = 2; i <= num1; i++){
            for (int j = 2; j <= num2; j++){
                for (int l = 2; l <= num3; l++) {
                    if (i % 2 == 0 && l % 2 == 0){
                        if (j == 2){
                            System.out.printf("%s %s %s%n", i, j, l);
                        } else if (j > 2 && j % 2 == 1){
                            if (j > 7){
                                continue;
                            } else {
                                System.out.printf("%s %s %s%n", i, j, l);
                            }
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
    }
}

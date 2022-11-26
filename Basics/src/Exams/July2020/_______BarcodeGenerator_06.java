package Exams.July2020;

import java.util.Scanner;

public class _______BarcodeGenerator_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());


        int firstN = n / 1000;
        int secondN = (n / 100) % 10;
        int thirdN = (n / 10) % 10;
        int fourthN = n % 10;

        int firstM = m / 1000;
        int secondM = (m / 100) % 10;
        int thirdM = (m / 10) % 10;
        int fourthM = m % 10;

        for (int i = firstN; i <= firstM; i++) {
            for (int j = secondN; j <= secondM; j++) {
                for (int k = thirdN; k <= thirdM; k++) {
                    for (int l = fourthN; l <= fourthM; l++) {
                        if (i % 2 != 0 && j % 2 != 0 && k % 2 != 0 && l % 2 != 0) {
                            System.out.printf("%d%d%d%d ", i, j, k, l);
                        }
                    }
                }
            }
        }

    }
}

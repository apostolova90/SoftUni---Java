package ForLoop.Exercise;

import java.util.Scanner;

public class Histogram_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int p1Counter = 0;
        int p2Counter = 0;
        int p3Counter = 0;
        int p4Counter = 0;
        int p5Counter = 0;


        for (int number = 0; number < n; number ++){
            int num = Integer.parseInt(scanner.nextLine());

            if (num < 200){
                p1Counter++;
            } else if (num >= 200 && num <= 399){
                p2Counter++;
            } else if (num >= 400 && num <= 599){
                p3Counter++;
            } else if (num >= 600 && num <= 799){
                p4Counter++;
            } else if (num >= 800) {
                p5Counter++;
            }
        }

        double p1Percentage = p1Counter * 1.0 / n * 100; // умножаваме по 1.0, защото числото ни е цяло и ако го разделим на друго, няма да получим дробно такова, а цяло
        double p2Percentage = p2Counter * 1.0 / n * 100;
        double p3Percentage = p3Counter * 1.0 / n * 100;
        double p4Percentage = p4Counter * 1.0 / n * 100;
        double p5Percentage = p5Counter * 1.0 / n * 100;

        System.out.printf("%.2f%%%n", p1Percentage); // ако искаме да отпешачатаме %, трябва да напишем два пъти %%, защото програмата ще очаква стойност след % и ако напишем само един, програмата ще помисли че има проблем
        System.out.printf("%.2f%%%n", p2Percentage);
        System.out.printf("%.2f%%%n", p3Percentage);
        System.out.printf("%.2f%%%n", p4Percentage);
        System.out.printf("%.2f%%%n", p5Percentage);
    }
}

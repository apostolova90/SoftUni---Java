package Exams.March2020;

import java.util.Scanner;

public class BirthdayParty_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double rentPlace = Double.parseDouble(scanner.nextLine());
        double cake = rentPlace * 0.20;
        double drinks = cake * 0.55;
        double animantion = rentPlace / 3;

        double total = rentPlace + cake + drinks + animantion;

        System.out.printf("%.1f", total);
    }
}

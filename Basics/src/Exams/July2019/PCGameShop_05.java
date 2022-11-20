package Exams.July2019;

import java.util.Scanner;

public class PCGameShop_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        double numberHearthstone = 0;
        double numberFortnite = 0;
        double numberOverwatch = 0;
        double numberOthers = 0;

        for (int i = 1; i <= number; i++){
            String name = scanner.nextLine();

            if (name.equals("Hearthstone")){
                numberHearthstone++;
            } else if (name.equals("Fornite")){
                numberFortnite++;
            } else if (name.equals("Overwatch")){
                numberOverwatch++;
            } else {
                numberOthers++;
            }
        }

        double percentageHearthstone = numberHearthstone / number * 100;
        double percentageFortnite = numberFortnite / number * 100;
        double percentageOverwatch  = numberOverwatch / number * 100;
        double percentageOthers = numberOthers / number * 100;

        System.out.printf("Hearthstone - %.2f%%%n", percentageHearthstone);
        System.out.printf("Fornite - %.2f%%%n", percentageFortnite);
        System.out.printf("Overwatch - %.2f%%%n", percentageOverwatch);
        System.out.printf("Others - %.2f%%%n", percentageOthers);
    }
}

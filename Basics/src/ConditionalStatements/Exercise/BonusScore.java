package ConditionalStatements.Exercise;

import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        double bonusPoints = 0;

        if (num <= 100){
            bonusPoints = 5;
        } else if (num > 1000){
            bonusPoints = bonusPoints * 0.10;
        } else {
            bonusPoints = bonusPoints * 0.20;
        }

        if (num % 2 == 0){
            bonusPoints = bonusPoints + 1;
        } else if (num % 10 == 5){
            bonusPoints = bonusPoints + 5;
        }

        System.out.println(bonusPoints);
        System.out.println(num + bonusPoints);

    }
}

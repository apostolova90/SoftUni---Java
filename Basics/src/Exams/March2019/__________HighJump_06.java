
        package Exams.March2019;

import java.util.Scanner;

public class __________HighJump_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wantedAchievement = Integer.parseInt(scanner.nextLine());

        int startingFrom = wantedAchievement - 30;

        boolean fail = false;
        int jumpsCounting = 0;
        int failsCount = 0;
        int currentHigh = 0;
        while(startingFrom <= wantedAchievement || currentHigh <= wantedAchievement){
            for (int j = 1; j <= 3; j++){
                currentHigh = Integer.parseInt(scanner.nextLine());
                jumpsCounting++;

                if (currentHigh > startingFrom){
                    startingFrom += 5;
                    failsCount = 0;
                    break;
                } else {
                    failsCount++;
                }
            }
            if (failsCount == 3) {
                fail = true;
                break;
            }
        }

        if (fail){
            System.out.printf("Tihomir failed at %scm after %s jumps.", startingFrom, jumpsCounting);
        } else {
            System.out.printf("Tihomir succeeded, he jumped over %scm after %s jumps.", wantedAchievement, jumpsCounting);
        }
    }
}
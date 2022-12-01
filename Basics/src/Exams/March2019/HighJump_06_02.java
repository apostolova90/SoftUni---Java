package Exams.March2019;

import java.util.Scanner;

public class HighJump_06_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wantedHigh = Integer.parseInt(scanner.nextLine());
        int startHigh = wantedHigh - 30;

        boolean tooManyFails = false;
        int jumpsCount = 0;
        int failedJumps = 0;
        int currentJump = 0;

        while(startHigh <= wantedHigh || currentJump <= wantedHigh){

            for (int i = 1; i <= 3; i++) {
                currentJump = Integer.parseInt(scanner.nextLine());
                jumpsCount++;

                if (currentJump > startHigh) {
                    startHigh += 5;
                    failedJumps = 0;
                    break;
                } else {
                    failedJumps++;
                }
            }
            if (failedJumps == 3){
                tooManyFails = true;
                break;
            }
        }

        if (tooManyFails){
            System.out.printf("Tihomir failed at %scm after %s jumps.", startHigh, jumpsCount);
        } else {
            System.out.printf("Tihomir succeeded, he jumped over %scm after %s jumps.", wantedHigh, jumpsCount);
        }
    }
}

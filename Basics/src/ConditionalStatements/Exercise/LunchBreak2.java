package ConditionalStatements.Exercise;

import java.util.Scanner;

public class LunchBreak2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String tvShowName = scanner.nextLine();
        int showCountTime = Integer.parseInt(scanner.nextLine());
        int breakInMinutes = Integer.parseInt(scanner.nextLine());

        double lunchTime = breakInMinutes / 8.0;
        double timeForRelax = breakInMinutes / 4.0;

        double remainingTime = breakInMinutes - lunchTime - timeForRelax;
        double difference = Math.abs(remainingTime - showCountTime);

        if (remainingTime >= showCountTime){
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", tvShowName, difference);
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", tvShowName, difference);
        }
    }
}

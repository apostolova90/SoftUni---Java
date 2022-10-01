package ConditionalStatements.Exercise;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double recordInSeconds = Double.parseDouble(scanner.nextLine());
        double distanceInMeters = Double.parseDouble(scanner.nextLine());
        double secondsForOneMeter = Double.parseDouble(scanner.nextLine());

        double timeIvanNeedsForDistance = distanceInMeters * secondsForOneMeter;
        double extraTime = Math.floor(distanceInMeters / 15) * 12.5;
        double totalTimeNeeded = timeIvanNeedsForDistance + extraTime;

        double difference = Math.abs(recordInSeconds - totalTimeNeeded);

        if (totalTimeNeeded < recordInSeconds){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTimeNeeded);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", difference);
        }
    }
}

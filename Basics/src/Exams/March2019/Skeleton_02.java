package Exams.March2019;

import java.util.Scanner;

public class Skeleton_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minutesQuota = Integer.parseInt(scanner.nextLine());
        int secondsQuota = Integer.parseInt(scanner.nextLine());
        int totalSecondsQuota = secondsQuota + (minutesQuota * 60);

        double meters = Double.parseDouble(scanner.nextLine());
        int secondsFor100Meters = Integer.parseInt(scanner.nextLine());

        double timeToTake = (meters / 120) * 2.5;
        double totalTimeForAll = (meters / 100 * secondsFor100Meters) - timeToTake;

        if (totalTimeForAll <= totalSecondsQuota){
            System.out.println("Marin Bangiev won an Olympic quota!");
            System.out.printf("His time is %.3f.", totalTimeForAll);
        } else {
            System.out.printf("No, Marin failed! He was %.3f second slower.", totalTimeForAll - totalSecondsQuota);
        }
    }
}

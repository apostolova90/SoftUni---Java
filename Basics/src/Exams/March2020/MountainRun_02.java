package Exams.March2020;

import java.util.Scanner;

public class MountainRun_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double recordSeconds = Double.parseDouble(scanner.nextLine());
        double meters = Double.parseDouble(scanner.nextLine());
        double secondsFor1Meeter = Double.parseDouble(scanner.nextLine());

        double timeGeorge = secondsFor1Meeter * meters;

        double additionalTime = 30 * (Math.floor(meters / 50));
        double totalTimeGeorge = timeGeorge + additionalTime;

        if (totalTimeGeorge >= recordSeconds){
            double difference = totalTimeGeorge - recordSeconds;
            System.out.printf("No! He was %.2f seconds slower.", difference);
        } else {
            System.out.printf("Yes! The new record is %.2f seconds.", totalTimeGeorge);
        }
    }
}

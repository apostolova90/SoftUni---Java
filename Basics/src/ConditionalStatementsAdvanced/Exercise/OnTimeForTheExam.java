package ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hourOfExam = Integer.parseInt(scanner.nextLine());
        int minutesOfExam = Integer.parseInt(scanner.nextLine());
        int hourOfArrival = Integer.parseInt(scanner.nextLine());
        int minutesOfArrival = Integer.parseInt(scanner.nextLine());

        int totalMinutesOfExam = hourOfExam * 60 + minutesOfExam;
        int totalMinutesOfArrival = hourOfArrival * 60 + minutesOfArrival;
        int diff = totalMinutesOfExam - totalMinutesOfArrival;

        if (diff == 0) {
            System.out.println("On time");
        } else if (diff > 0 && diff <= 30) {
            System.out.printf("On time%n%d minutes before the start", Math.abs(diff));
        } else if (diff < 0) {
            diff = Math.abs(diff);
            System.out.println("Late");
            if (diff >= 60) {
                hourOfExam = diff / 60;
                minutesOfExam = diff % 60;
                System.out.printf("%d:%02d hours after the start", hourOfExam, minutesOfExam);
            } else {
                System.out.printf("%d minutes after the start",diff);
            }
        } else {
            System.out.println("Early");
            if (diff >= 60) {
                hourOfExam = diff / 60;
                minutesOfExam = diff % 60;
                System.out.printf("%d:%02d hours before the start", hourOfExam, minutesOfExam);
            } else {
                System.out.printf("%d minutes before the start",diff);
            }
        }
    }
}

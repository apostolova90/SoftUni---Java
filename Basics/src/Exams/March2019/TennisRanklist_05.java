package Exams.March2019;

import java.util.Scanner;

public class TennisRanklist_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfTournaments = Integer.parseInt(scanner.nextLine());
        int points = Integer.parseInt(scanner.nextLine());

        double winsCounter = 0;
        int totalWinsPoints = 0;

        for (int i = 1; i <= numberOfTournaments; i++){
            String type = scanner.nextLine();
            if (type.equals("W")){
                winsCounter++;
                points += 2000;
                totalWinsPoints += 2000;
            } else if (type.equals("F")){
                points += 1200;
                totalWinsPoints += 1200;
            } else {
                points += 720;
                totalWinsPoints += 720;
            }
        }

        int evgPoint = totalWinsPoints / numberOfTournaments;
        double percentWins = winsCounter / numberOfTournaments * 100;

        System.out.printf("Final points: %s%n", points);
        System.out.printf("Average points: %s%n", evgPoint);
        System.out.printf("%.2f%%", percentWins);

    }
}

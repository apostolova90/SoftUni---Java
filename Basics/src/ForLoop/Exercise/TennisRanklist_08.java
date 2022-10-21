package ForLoop.Exercise;

import java.util.Scanner;

public class TennisRanklist_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfTournaments = Integer.parseInt(scanner.nextLine());
        int startPoints = Integer.parseInt(scanner.nextLine());

        double wins = 0;
        int pointsFromTournaments = 0;

        for (int i = 1; i <= numberOfTournaments; i++){

            String position = scanner.nextLine();

            if (position.equals("W")){
                startPoints += 2000;
                pointsFromTournaments += 2000;
                wins++;

            } else if (position.equals("F")){
                startPoints += 1200;
                pointsFromTournaments += 1200;
            }else if (position.equals("SF")){
                startPoints += 720;
                pointsFromTournaments += 720;
            }
        }

        int avgPoints = pointsFromTournaments / numberOfTournaments;
        double percentWins = wins / numberOfTournaments * 100;
        System.out.printf("Final points: %s%n", startPoints);
        System.out.printf("Average points: %s%n", avgPoints);
        System.out.printf("%.2f%%", percentWins);

    }
}

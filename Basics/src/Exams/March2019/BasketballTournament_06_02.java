package Exams.March2019;

import java.util.Scanner;

public class BasketballTournament_06_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double win = 0;
        double lost = 0;
        double gamesCount = 0;
        double currentGames = 0;

        String command = scanner.nextLine();
        while(!command.equals("End of tournaments")){
            String name = command;
            int num = Integer.parseInt(scanner.nextLine());

            for (int i = 1; i <= num; i++) {
                int points1 = Integer.parseInt(scanner.nextLine());
                int points2 = Integer.parseInt(scanner.nextLine());
                currentGames++;
                gamesCount++;

                    if (points1 > points2) {
                        win++;
                        System.out.printf("Game %.0f of tournament %s: win with %s points.%n", currentGames, name, points1 - points2);
                    } else {
                        lost++;
                        System.out.printf("Game %.0f of tournament %s: lost with %s points.%n", currentGames, name, points2 - points1);
                    }
            }
            currentGames = 0;
            command = scanner.nextLine();
        }

        double percentageWon = win / gamesCount * 100;
        double percentageLost = lost / gamesCount * 100;

        System.out.printf("%.2f%% matches win%n", percentageWon);
        System.out.printf("%.2f%% matches lost", percentageLost);
    }
}

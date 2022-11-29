package Exams.March2019;

import java.util.Scanner;

public class BasketballTournament_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double gameCounter = 0;
        double winGames = 0;
        double lostGames = 0;
        int gamesPerTournament = 0;

        String command = scanner.nextLine();
        while(!command.equals("End of tournaments")) {
            String name = command;
            int numberOfGames = Integer.parseInt(scanner.nextLine());

            for (int i = 1; i <= numberOfGames; i++){
                gameCounter++;
                gamesPerTournament++;
                int result1 = Integer.parseInt(scanner.nextLine());
                int result2 = Integer.parseInt(scanner.nextLine());
                if (result1 > result2){
                    winGames++;
                    int difference = result1 - result2;
                    System.out.printf("Game %s of tournament %s: win with %s points.%n", gamesPerTournament, name, difference);
                } else {
                    int difference = result2 - result1;
                    lostGames++;
                    System.out.printf("Game %s of tournament %s: lost with %s points.%n", gamesPerTournament, name, difference);
                }
            }
            gamesPerTournament = 0;
            command = scanner.nextLine();
        }

        double percentWin = winGames / gameCounter * 100;
        double percentLost = lostGames / gameCounter * 100;
        System.out.printf("%.2f%% matches win%n", percentWin);
        System.out.printf("%.2f%% matches lost", percentLost);
    }
}

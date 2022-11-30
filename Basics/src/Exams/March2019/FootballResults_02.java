package Exams.March2019;

import java.util.Scanner;

public class FootballResults_02 {
    public static void main(String[] args) {

        int won = 0;
        int lost = 0;
        int drawn = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 3; i++){
            String currentMatch = scanner.nextLine();
            char firstTeamResultChar = currentMatch.charAt(0);
            char secondTeamResultChar = currentMatch.charAt(2);

            if (firstTeamResultChar > secondTeamResultChar){
                won++;
            } else if (firstTeamResultChar < secondTeamResultChar) {
                lost++;
            } else {
                drawn++;
            }
        }

        System.out.printf("Team won %s games.%n", won);
        System.out.printf("Team lost %s games.%n", lost);
        System.out.printf("Drawn games: %s", drawn);

    }
}

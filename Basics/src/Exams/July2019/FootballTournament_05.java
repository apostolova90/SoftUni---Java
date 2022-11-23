package Exams.July2019;

import java.util.Scanner;

public class FootballTournament_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double n = Integer.parseInt(scanner.nextLine());

        if (n <= 0){
            System.out.printf("%s hasn't played any games during this season.", name);
        } else {
            int totalScore = 0;

            int numberW = 0;
            int numberD = 0;
            int numberL = 0;

            for (int i = 1; i <= n; i++) {
                String score = scanner.nextLine();

                if (score.equals("W")) {
                    numberW++;
                    totalScore += 3;
                } else if (score.equals("D")) {
                    numberD++;
                    totalScore += 1;
                } else if (score.equals("L")) {
                    numberL++;
                }
            }

            double percentageWins = numberW / n * 100;

            System.out.printf("%s has won %s points during this season.%n", name, totalScore);
            System.out.println("Total stats:");
            System.out.printf("## W: %s%n", numberW);
            System.out.printf("## D: %s%n", numberD);
            System.out.printf("## L: %s%n", numberL);
            System.out.printf("Win rate: %.2f%%", percentageWins);
        }
    }
}

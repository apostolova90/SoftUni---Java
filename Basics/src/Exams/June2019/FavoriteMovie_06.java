package Exams.June2019;

import java.util.Scanner;

public class FavoriteMovie_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int movieCounter = 0;
        int totalMoviePoints = 0;
        int maxScoreMovie = Integer.MIN_VALUE;
        String movieWinner = "";

        String command = scanner.nextLine();

        while(!command.equals("STOP")){
            String name = command;

            movieCounter++;
            if (movieCounter == 7){
                System.out.println("The limit is reached.");
                break;
            }

            int currentNameLength = name.length();
            int currentCharPoints = 0;

            for (int i = 0; i < name.length(); i++){
                currentCharPoints = name.charAt(i);

                if (currentCharPoints >= 97 && currentCharPoints <= 122){
                    currentCharPoints -= 2 * currentNameLength;
                } else if (currentCharPoints >= 65 && currentCharPoints <= 90){
                    currentCharPoints -= currentNameLength;
                }

                totalMoviePoints += currentCharPoints;

            }

            if (totalMoviePoints > maxScoreMovie){
                maxScoreMovie = totalMoviePoints;
                movieWinner = name;
            }

            currentCharPoints = 0;
            totalMoviePoints = 0;
            command = scanner.nextLine();
        }

        System.out.printf("The best movie for you is %s with %s ASCII sum.", movieWinner, maxScoreMovie);
    }
}

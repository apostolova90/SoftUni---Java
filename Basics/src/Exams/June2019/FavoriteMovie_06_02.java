package Exams.June2019;

import java.util.Scanner;

public class FavoriteMovie_06_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalPoints = 0;
        int counter = 0;

        String winnerName = "";
        int max = Integer.MIN_VALUE;

        String command = scanner.nextLine();

        while(!command.equals("STOP")) {


            counter++;

            if (counter == 7){
                System.out.println("The limit is reached.");
                break;
            }


            String movieName = command;
            int length = movieName.length();

            for (int i = 0; i < length; i++){
                int currentCharacterPoints = movieName.charAt(i) ;

                if (currentCharacterPoints >= 97 && currentCharacterPoints <= 122){
                    currentCharacterPoints -= 2 * length;
                } else if (currentCharacterPoints >= 65 && currentCharacterPoints <= 90){
                    currentCharacterPoints -= length;
                }

                totalPoints += currentCharacterPoints;
            }

            if (totalPoints > max){
                max = totalPoints;
                winnerName = movieName;
            }
            totalPoints = 0;
            command = scanner.nextLine();
        }

        System.out.printf("The best movie for you is %s with %s ASCII sum.", winnerName, max);
    }
}

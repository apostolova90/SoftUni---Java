package Exams.July2019;

import java.util.Scanner;

public class NameGame_06_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalPoints = 0;
        int winnerPoints = 0;
        String winnerName = "";

        String command = scanner.nextLine();
        while(!command.equals("Stop")){
            String name = command;
            int length = name.length();

            for (int i = 0; i < length; i++){
                int currentLetterAscii = name.charAt(i);
                int currentNum = Integer.parseInt(scanner.nextLine());

                if (currentNum == currentLetterAscii){
                    totalPoints += 10;
                } else {
                    totalPoints += 2;
                }
            }
            if (totalPoints >= winnerPoints){
                winnerPoints = totalPoints;
                winnerName = name;
            }

            totalPoints = 0;
            command = scanner.nextLine();
        }

        System.out.printf("The winner is %s with %s points!", winnerName, winnerPoints);
    }
}

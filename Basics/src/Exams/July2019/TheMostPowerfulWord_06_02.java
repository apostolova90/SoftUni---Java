package Exams.July2019;

import java.util.Scanner;

public class TheMostPowerfulWord_06_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        double totalPoints = 0;
        double max = Integer.MIN_VALUE;
        String winnerWord = "";

        while(!command.equals("End of words")){
            String currentWord = command;
            int length = currentWord.length();

            char firstLetter = currentWord.charAt(0);
            char intoSmall = Character.toLowerCase(firstLetter);

            for (int i = 0; i < length; i++){
                int currentCharAscii = currentWord.charAt(i);
                totalPoints += currentCharAscii;
            }

            if (intoSmall == 'y' || intoSmall == 'a' || intoSmall == 'e' || intoSmall == 'i' || intoSmall == 'o' || intoSmall == 'u') {
                totalPoints = totalPoints * length;
            } else {
                totalPoints = Math.round(totalPoints / length);
            }

            if (totalPoints > max){
                max = totalPoints;
                winnerWord = currentWord;

            }
            totalPoints = 0;
            command = scanner.nextLine();
        }

        System.out.printf("The most powerful word is %s - %.0f", winnerWord, max);
    }
}

package Exams.July2019;

import java.util.Scanner;

public class TheMostPowerfulWord_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumWords = 0;
        int maxSum = Integer.MIN_VALUE;
        String theMostPoworful = "";

        String command = scanner.nextLine();
        while(!command.equals("End of words")){
            for (int i = 0; i < command.length(); i++){
                sumWords += command.charAt(i);
            }

            char firstLetter = command.charAt(0);
            char toLowerCase = Character.toLowerCase(firstLetter);
            if (toLowerCase == 'y' || toLowerCase == 'a' || toLowerCase == 'e' || toLowerCase == 'i' || toLowerCase == 'o' || toLowerCase == 'u') {
                sumWords *= command.length();
            } else {
                sumWords = Math.round(sumWords / command.length());
            }

            if (sumWords > maxSum){
                maxSum = sumWords;
                theMostPoworful = command;
            }
            sumWords = 0;
            command = scanner.nextLine();
        }

        System.out.printf("The most powerful word is %s - %s", theMostPoworful, maxSum);
    }
}

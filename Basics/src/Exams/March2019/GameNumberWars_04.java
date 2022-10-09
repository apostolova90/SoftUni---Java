package Exams.March2019;

import java.util.Scanner;

public class GameNumberWars_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String namePlayer1 = scanner.nextLine();
        String namePlayer2 = scanner.nextLine();

        boolean isEnd = false;
        int totalPlayer1 = 0;
        int totalPlayer2 = 0;
        String winner = "";

        String command = scanner.nextLine();
        while(!command.equals("End of game")){
            int firstNum = Integer.parseInt(command);
            int secondNum = Integer.parseInt(scanner.nextLine());

            if (firstNum > secondNum){
                totalPlayer1 += firstNum - secondNum;
                winner = namePlayer1;
            } else if (firstNum < secondNum) {
                totalPlayer2 += secondNum - firstNum;
                winner = namePlayer2;
            } else {
                isEnd = true;
                int firstBeforeEnd = Integer.parseInt(scanner.nextLine());
                int secondBeforeEnd = Integer.parseInt(scanner.nextLine());
                    if (firstBeforeEnd > secondBeforeEnd){
                        winner = namePlayer1;
                    } else if (firstBeforeEnd < secondBeforeEnd) {
                        winner = namePlayer2;
                    }
                    break;
            }
            command = scanner.nextLine();
        }

        if (isEnd) {
            System.out.println("Number wars!");
            if (winner.equals(namePlayer1)) {
                System.out.printf("%s is winner with %s points", winner, totalPlayer1);
            } else {
                System.out.printf("%s is winner with %s points", winner, totalPlayer2);
            }
        } else {
            System.out.printf("%s has %s points%n", namePlayer1, totalPlayer1);
            System.out.printf("%s has %s points", namePlayer2, totalPlayer2);
        }
    }
}

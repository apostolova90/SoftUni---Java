package Exams.July2020;

import java.util.Scanner;

public class BestPlayer_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        boolean hatTrick = false;
        String winner = "";
        int winnerGoals = 0;

        String command = scanner.nextLine();

        while(!command.equals("END")){
            String name = command;
            int goals = Integer.parseInt(scanner.nextLine());
             if (goals > max){
                 max = goals;
                 if (goals >= 3){
                     hatTrick = true;
                 }
                 winner = name;
                 winnerGoals = goals;
             }

            if (goals >= 10){
                break;
            }

            command = scanner.nextLine();
        }

        System.out.printf("%s is the best player!%n", winner);

        if (hatTrick){
            System.out.printf("He has scored %s goals and made a hat-trick !!!", winnerGoals);
        } else {
            System.out.printf("He has scored %s goals.", winnerGoals);
        }

    }
}

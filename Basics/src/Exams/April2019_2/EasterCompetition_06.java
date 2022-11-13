package Exams.April2019_2;

import java.util.Scanner;

public class EasterCompetition_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    int num = Integer.parseInt(scanner.nextLine());

    int max = Integer.MIN_VALUE;
    String winnerName = "";
    int currentPoints = 0;

    for (int i = 1; i <= num; i++){

        String name = scanner.nextLine();
        String command = scanner.nextLine();

        while(!command.equals("Stop")){
            int points = Integer.parseInt(command);
            currentPoints += points;

            command = scanner.nextLine();
        }
        System.out.printf("%s has %s points.%n", name, currentPoints);

        if (currentPoints > max){
            max = currentPoints;
            winnerName = name;
            System.out.printf("%s is the new number 1!%n", name);
        }
        currentPoints = 0;
    }

        System.out.printf("%s won competition with %s points!%n", winnerName, max);
    }
}

package Exams.July2019;

import java.util.Scanner;

public class NameGame_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pointsName = 0;
        double currentPoints = 0;

        String winner = "";
        String command = scanner.nextLine();

        while(!command.equals("Stop")){
            String name = command;

            for (int i = 0; i < name.length(); i++){
                double currentNumber = name.charAt(i);

                int number = Integer.parseInt(scanner.nextLine());

                if (number == currentNumber){
                    currentPoints += 10;
                } else {
                    currentPoints += 2;
                }
            }

            if (currentPoints >= pointsName){
                pointsName = currentPoints;
                winner = name;
            }

            currentPoints = 0;
            command = scanner.nextLine();
        }

        System.out.printf("The winner is %s with %.0f points!", winner, pointsName);
    }
}

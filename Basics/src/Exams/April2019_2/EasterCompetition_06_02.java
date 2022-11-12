package Exams.April2019_2;

import java.util.Scanner;

public class EasterCompetition_06_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pointsGamer = 0;
        int max = Integer.MIN_VALUE;
        String winner = "";

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++){

            String name = scanner.nextLine();
            String command = scanner.nextLine();
            while(!command.equals("Stop")){
                double currentPoints = Double.parseDouble(command);
                pointsGamer += currentPoints;

                command = scanner.nextLine();
            }

            System.out.printf("%s has %s points.%n", name, pointsGamer);
            if (pointsGamer > max){
                max = pointsGamer;
                winner = name;
                System.out.printf("%s is the new number 1!%n", name);
            }
            pointsGamer = 0;
        }

        System.out.printf("%s won competition with %s points!", winner, max);
    }
}

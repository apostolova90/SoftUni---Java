package Exams.June2019;

import java.util.Scanner;

public class Oscars_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double startPoints = Double.parseDouble(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++){
            String judge = scanner.nextLine();
            double pointsJudge = Double.parseDouble(scanner.nextLine());

            double currentPoints = (judge.length() * pointsJudge) / 2;
            startPoints += currentPoints;
            if (startPoints >= 1250.5){
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", name, startPoints);
                break;
            }
        }

        double difference = Math.abs(1250.5 - startPoints);
        if (startPoints < 1250.5){
            System.out.printf("Sorry, %s you need %.1f more!", name, difference);
        }

    }
}

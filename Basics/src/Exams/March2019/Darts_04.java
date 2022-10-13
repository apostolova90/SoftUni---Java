package Exams.March2019;

import java.util.Scanner;

public class Darts_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int points = 301;
        int counter = 0;
        int notGoodCounter = 0;
        boolean noMorePoints = false;
        String command = scanner.nextLine();

        while(!command.equals("Retire")){
            String type = command;
            int currentPoints = Integer.parseInt(scanner.nextLine());
            int currentPointsToAdd = 0;

            if (type.equals("Single")){
                currentPointsToAdd += currentPoints;
            } else if (type.equals("Double")){
                currentPointsToAdd += 2 * currentPoints;
            } else {
                currentPointsToAdd += 3 * currentPoints;
            }

            if (currentPointsToAdd > points){
                notGoodCounter++;
            } else if (currentPointsToAdd < points){
                counter++;
                points -= currentPointsToAdd;
            } else {
                counter++;
                points -= currentPointsToAdd;
                noMorePoints = true;
                break;
            }

            command = scanner.nextLine();
        }

        if (noMorePoints){
            System.out.printf("%s won the leg with %s shots.", name, counter);
        } else {
            System.out.printf("%s retired after %s unsuccessful shots.", name, notGoodCounter);
        }
    }
}

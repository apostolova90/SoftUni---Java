package Exams.July2019;

import java.util.Scanner;

public class Renovation_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = Integer.parseInt(scanner.nextLine());
        int a = Integer.parseInt(scanner.nextLine());
        int percent = Integer.parseInt(scanner.nextLine());
        int allWalls = h * a * 4;
        int totalForPainting = allWalls - (allWalls * percent / 100);

        boolean isReady = false;
        String command = scanner.nextLine();
        while (!command.equals("Tired!")){

            int painted = Integer.parseInt(command);
            totalForPainting -= painted;

            if (totalForPainting <= 0){
                isReady = true;
                break;
            }

            command = scanner.nextLine();
        }

        if (isReady){
            if (totalForPainting == 0) {
                System.out.println("All walls are painted! Great job, Pesho!");
            } else {
                System.out.printf("All walls are painted and you have %s l paint left!", Math.abs(totalForPainting));
            }
        } else {
            System.out.printf("%s quadratic m left.", totalForPainting);
        }
    }
}

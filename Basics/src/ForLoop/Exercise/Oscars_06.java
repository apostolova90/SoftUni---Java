package ForLoop.Exercise;

import java.util.Scanner;

public class Oscars_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double points = Double.parseDouble(scanner.nextLine());
        int juryCount = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <= juryCount; i++){

            String nameJury = scanner.nextLine();
            double tempPoints = Double.parseDouble(scanner.nextLine());

            double pointHeGets = nameJury.length() * tempPoints / 2;
            points += pointHeGets;

            if (points >= 1250.5){
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", name, points);
            break;
            }

        }

        if (points < 1250.5){
            double difference = 1250.5 - points;
            System.out.printf("Sorry, %s you need %.1f more!", name, difference);
        }
    }
}

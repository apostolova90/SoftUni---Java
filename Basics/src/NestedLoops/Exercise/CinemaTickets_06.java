package NestedLoops.Exercise;

import java.util.Scanner;

public class CinemaTickets_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double countTotalTickets = 0;
        double standard = 0;
        double kid = 0;
        double students = 0;

        String command = scanner.nextLine();

            while(!command.equals("Finish")){
                String movie = command;
                int seats = Integer.parseInt(scanner.nextLine());

                int countCurrentTickets = 0;

                String type = scanner.nextLine();

                while (!type.equals("End")){
                    countCurrentTickets++;
                    countTotalTickets++;

                     if (type.equals("standard")){
                         standard++;
                     } else if (type.equals("kid")){
                         kid++;
                     } else {
                         students++;
                     }

                    if (countCurrentTickets >= seats){
                        break;
                    }
                    type = scanner.nextLine();
                }

                System.out.printf("%s - %.2f%% full.%n", movie, countCurrentTickets * 1.0 / seats * 100);
                command = scanner.nextLine();
            }

            double percentageStandard = standard / countTotalTickets * 100;
            double percentageKid = kid / countTotalTickets * 100;
            double percentageStudent = students / countTotalTickets * 100;

        System.out.printf("Total tickets: %.0f%n", countTotalTickets);
        System.out.printf("%.2f%% student tickets.%n", percentageStudent);
        System.out.printf("%.2f%% standard tickets.%n", percentageStandard);
        System.out.printf("%.2f%% kids tickets.", percentageKid);
    }
}

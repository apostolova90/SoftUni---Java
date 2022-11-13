package Exams.April2019;

import java.util.Scanner;

public class CinemaTickets_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double standard = 0;
        double kid = 0;
        double student = 0;

        double totalSeatsSold = 0;
        double seatsSoldPerMovie = 0;

        String command = scanner.nextLine();
        while(!command.equals("Finish")){
            String movieName = command;
            int seats = Integer.parseInt(scanner.nextLine());

            String type = scanner.nextLine();
                while(!type.equals("End")){
                    if (type.equals("standard")){
                        standard++;
                    } else if (type.equals("kid")){
                        kid++;
                    } else {
                        student++;
                    }
                    seatsSoldPerMovie++;
                    totalSeatsSold++;

                    if (seatsSoldPerMovie >= seats){
                        break;
                    }

                    type = scanner.nextLine();
                }

            System.out.printf("%s - %.2f%% full.%n", movieName, seatsSoldPerMovie / seats * 100);

                seatsSoldPerMovie = 0;
            command = scanner.nextLine();
        }

        double percentageStandard = standard / totalSeatsSold * 100;
        double percentageKid = kid / totalSeatsSold * 100;
        double percentageStudent = student / totalSeatsSold * 100;

        System.out.printf("Total tickets: %.0f%n", totalSeatsSold);
        System.out.printf("%.2f%% student tickets.%n", percentageStudent);
        System.out.printf("%.2f%% standard tickets.%n", percentageStandard);
        System.out.printf("%.2f%% kids tickets.", percentageKid);
    }
}

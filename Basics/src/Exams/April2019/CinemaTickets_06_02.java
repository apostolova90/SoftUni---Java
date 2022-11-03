package Exams.April2019;

import java.util.Scanner;

public class CinemaTickets_06_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double standard = 0;
        double kids = 0;
        double students = 0;
        double currentMovieTickets = 0;
        double totalTicketsSold = 0;

        String command = scanner.nextLine();
        while(!command.equals("Finish")){
            String movieName = command;
            int seats = Integer.parseInt(scanner.nextLine());

            String type = scanner.nextLine();

            while(!type.equals("End")){

                if (type.equals("standard")){
                    standard++;
                } else if (type.equals("kid")){
                    kids++;
                }
                else if (type.equals("student")){
                    students++;
                }


                totalTicketsSold++;
                currentMovieTickets++;

                if (currentMovieTickets == seats){
                    break;
                }

                type = scanner.nextLine();
            }

            double percentageCurrentSold = currentMovieTickets / seats * 100;
            System.out.printf("%s - %.2f%% full.%n", movieName, percentageCurrentSold);
            currentMovieTickets = 0;
            command = scanner.nextLine();
        }

        double percentageStandard = standard / totalTicketsSold * 100;
        double percentageKids = kids / totalTicketsSold * 100;
        double percentageStudent = students / totalTicketsSold * 100;

        System.out.printf("Total tickets: %.0f%n", totalTicketsSold);
        System.out.printf("%.2f%% student tickets.%n", percentageStudent);
        System.out.printf("%.2f%% standard tickets.%n", percentageStandard);
        System.out.printf("%.2f%% kids tickets.%n", percentageKids);

    }
}

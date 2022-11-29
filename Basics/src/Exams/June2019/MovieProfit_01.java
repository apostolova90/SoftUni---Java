package Exams.June2019;

import java.util.Scanner;

public class MovieProfit_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameOfMovie = scanner.nextLine();
        int numberOfDays = Integer.parseInt(scanner.nextLine());
        int numberOfTickets = Integer.parseInt(scanner.nextLine());
        double pricePerTicket = Double.parseDouble(scanner.nextLine());
        double percentForTheTeater = Integer.parseInt(scanner.nextLine());

        double moneyFromFilm = numberOfDays * (numberOfTickets * pricePerTicket);

        double profit = moneyFromFilm - (moneyFromFilm * (percentForTheTeater / 100));

        System.out.printf("The profit from the movie %s is %.2f lv.", nameOfMovie, profit);
    }
}

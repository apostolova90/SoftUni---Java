package Exams.June2019;

import java.util.Scanner;

public class FilmPremiere_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameOfMovie = scanner.nextLine();
        String type = scanner.nextLine();
        int numberOfTickets = Integer.parseInt(scanner.nextLine());

        double moneyFOrAllTickets = 0;

        switch (nameOfMovie){
            case "John Wick":
                if (type.equals("Drink")){
                    double price = numberOfTickets * 12;
                    moneyFOrAllTickets += price;
                } else if (type.equals("Popcorn")){
                    double price = numberOfTickets * 15;
                    moneyFOrAllTickets += price;
                } else if (type.equals("Menu")){
                    double price = numberOfTickets * 19;
                    moneyFOrAllTickets += price;
                }
                break;

            case "Star Wars":
                if (type.equals("Drink")){
                    double price = numberOfTickets * 18;
                    moneyFOrAllTickets += price;
                } else if (type.equals("Popcorn")){
                    double price = numberOfTickets * 25;
                    moneyFOrAllTickets += price;
                } else if (type.equals("Menu")){
                    double price = numberOfTickets * 30;
                    moneyFOrAllTickets += price;
                }
                if (numberOfTickets >= 4){
                    moneyFOrAllTickets = moneyFOrAllTickets * 0.70;
                }
                break;

            case "Jumanji":
                if (type.equals("Drink")){
                    double price = numberOfTickets * 9;
                    moneyFOrAllTickets += price;
                } else if (type.equals("Popcorn")){
                    double price = numberOfTickets * 11;
                    moneyFOrAllTickets += price;
                } else if (type.equals("Menu")){
                    double price = numberOfTickets * 14;
                    moneyFOrAllTickets += price;
                }
                if (numberOfTickets == 2){
                    moneyFOrAllTickets = moneyFOrAllTickets * 0.85;
                }
                break;
        }

        System.out.printf("Your bill is %.2f leva.", moneyFOrAllTickets);
    }
}

package Exams.March2019;

import java.util.Scanner;

public class WorldSnookerChampionship_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stage = scanner.nextLine();
        String typeTicket = scanner.nextLine();
        double numberTickets = Integer.parseInt(scanner.nextLine());
        String pictureOrNo = scanner.nextLine();

        double totalPriceForAll = 0;

        switch(stage){
            case "Quarter final":
                if (typeTicket.equals("Standard")){
                    totalPriceForAll += numberTickets * 55.50;
                } else if (typeTicket.equals("Premium")){
                    totalPriceForAll += numberTickets * 105.20;
                } else if (typeTicket.equals("VIP")){
                    totalPriceForAll += numberTickets * 118.90;
                }
                break;
            case "Semi final":
                if (typeTicket.equals("Standard")){
                    totalPriceForAll += numberTickets * 75.88;
                } else if (typeTicket.equals("Premium")){
                    totalPriceForAll += numberTickets * 125.22;
                } else if (typeTicket.equals("VIP")){
                    totalPriceForAll += numberTickets * 300.40;
                }
                break;
            case "Final":
                if (typeTicket.equals("Standard")){
                    totalPriceForAll += numberTickets * 110.10;
                } else if (typeTicket.equals("Premium")){
                    totalPriceForAll += numberTickets * 160.66;
                } else if (typeTicket.equals("VIP")){
                    totalPriceForAll += numberTickets * 400;
                }
                break;
        }

        if (totalPriceForAll > 2500 && totalPriceForAll <= 4000) {
            totalPriceForAll = totalPriceForAll * 0.90;
            if (pictureOrNo.equals("Y")) {
                totalPriceForAll += numberTickets * 40;
            }
        } else if (totalPriceForAll > 4000){
            totalPriceForAll = totalPriceForAll * 0.75;
        } else {
            if(pictureOrNo.equals("Y"))
                totalPriceForAll += numberTickets * 40;
        }

        System.out.printf("%.2f", totalPriceForAll);

    }
}

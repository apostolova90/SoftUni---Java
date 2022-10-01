package ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfDays = Integer.parseInt(scanner.nextLine());
        String typeOfRoom = scanner.nextLine();
        String rating = scanner.nextLine();

        int numberOfNights = numberOfDays - 1;  //защото броя на дните не е равен ан броя на нощувките

        double totalPrice = 0;

        switch (typeOfRoom){
            case "room for one person":
                totalPrice = numberOfNights * 18;
                break;
            case "apartment":
                totalPrice = numberOfNights * 25;
                if (numberOfNights < 10){
                    totalPrice = totalPrice * 0.70;
                } else if (numberOfNights >= 10 && numberOfNights <= 15 ){
                    totalPrice = totalPrice * 0.65;
                } else if (numberOfNights > 15 ){
                    totalPrice = totalPrice * 0.5;
                }
                break;
            case "president apartment":
                totalPrice = numberOfNights * 35;
                if (numberOfNights < 10){
                    totalPrice = totalPrice * 0.90;
                } else if (numberOfNights >= 10 && numberOfNights <= 15 ){
                    totalPrice = totalPrice * 0.85;
                } else if (numberOfNights > 15 ){
                    totalPrice = totalPrice * 0.8;
                }
                break;
        }

        if (rating.equals("positive")){
            totalPrice = totalPrice + (totalPrice * 0.25);
        } else {
            totalPrice = totalPrice * 0.90;
        }

        System.out.printf("%.2f", totalPrice);
    }
}

package Exams.April2019;

import java.util.Scanner;

public class CinemaVoucher_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int coupon = Integer.parseInt(scanner.nextLine());
        int numberOfMovies = 0;
        int numberOfOther = 0;

        boolean isNotEnough = false;
        String command = scanner.nextLine();

        while (!command.equals("End")){
            String currentPurchase = command;

            int movieLength = currentPurchase.length();
            int currentPrice = 0;

            if(movieLength > 8){
                currentPrice = currentPurchase.charAt(0) + currentPurchase.charAt(1);
            } else {
                currentPrice = currentPurchase.charAt(0);
            }

            if (coupon >= currentPrice){
                coupon -= currentPrice;
                if (movieLength > 8){
                    numberOfMovies++;
                } else {
                    numberOfOther++;
                }
            } else {
                break;
            }

            command = scanner.nextLine();
        }

//        if (isNotEnough){
//            System.out.println();
//        } else {
//            System.out.println();
//        }

        System.out.println(numberOfMovies);
        System.out.println(numberOfOther);
    }
}

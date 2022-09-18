package MoreExercises;

import java.util.Scanner;

public class WeatherForecast2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weather = Double.parseDouble(scanner.nextLine());
        if (weather >= 26.00 && weather <=35.00){
            System.out.println("Hot");
        } else if (weather >= 20.1 && weather <= 25.9){
            System.out.println("Warm");
        } else if (weather >= 15.00 && weather <= 20.00){
            System.out.println("Mild");
        } else if (weather >= 12.00 && weather <= 14.9){
            System.out.println("Cool");
        } else if (weather >= 5.00 && weather <= 11.9){
            System.out.println("Cold");
        } else {
            System.out.println("unknown");
        }
    }
}

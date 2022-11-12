package Exams.April2019_2;

import java.util.Scanner;

public class EasterEggs_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int red = 0;
        int orange = 0;
        int blue = 0;
        int green = 0;
        int max = Integer.MIN_VALUE;

        int num = Integer.parseInt(scanner.nextLine());
        String colorWin = "";
        for (int i = 1; i <= num; i++){
            String color = scanner.nextLine();
            if (color.equals("red")){
                red++;
            } else if (color.equals("orange")){
                orange++;
            } else if (color.equals("blue")){
                blue++;
            } else if (color.equals("green")){
                green++;
            }
        }

        if (red > max){
            max = red;
            colorWin = "red";
        }
        if (orange > max){
            max = orange;
            colorWin = "orange";
        }
        if (blue > max){
            max = blue;
            colorWin = "blue";
        }
        if (green > max){
            max = green;
            colorWin = "green";
        }

        System.out.printf("Red eggs: %s%n", red);
        System.out.printf("Orange eggs: %s%n", orange);
        System.out.printf("Blue eggs: %s%n", blue);
        System.out.printf("Green eggs: %s%n", green);
        System.out.printf("Max eggs: %s -> %s", max, colorWin);
    }
}

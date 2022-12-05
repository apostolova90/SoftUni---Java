package Exams.March2019;

import java.util.Locale;
import java.util.Scanner;

public class Gymnastics_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String country = scanner.nextLine();
        String device = scanner.nextLine();

        int maxRating = 20;

        double difficulty = 0;
        double performance = 0;

        switch (country){
            case "Russia":
                if (device.equals("ribbon")){
                    difficulty += 9.100;
                    performance += 9.400;
                } else if (device.equals("hoop")){
                    difficulty += 9.300;
                    performance += 9.800;
                } else if (device.equals("rope")){
                    difficulty += 9.600;
                    performance += 9.000;
                }
                break;
            case "Bulgaria":
                if (device.equals("ribbon")){
                    difficulty += 9.600;
                    performance += 9.400;
                } else if (device.equals("hoop")){
                    difficulty += 9.550;
                    performance += 9.750;
                } else if (device.equals("rope")){
                    difficulty += 9.500;
                    performance += 9.400;
                }
                break;
            case "Italy":
                if (device.equals("ribbon")){
                    difficulty += 9.200;
                    performance += 9.500;
                } else if (device.equals("hoop")){
                    difficulty += 9.450;
                    performance += 9.350;
                } else if (device.equals("rope")){
                    difficulty += 9.700;
                    performance += 9.150;
                }
                break;
        }

        double totalForBoth = difficulty + performance;
        double percentage = (maxRating - totalForBoth) / 20 * 100;

        System.out.printf("The team of %s get %.3f on %s.%n", country, totalForBoth, device);
        System.out.printf("%.2f%%", percentage);
    }
}

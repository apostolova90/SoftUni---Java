package ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        int lines = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        double income = 0;

        if (type.equals("Premiere")){
            income = lines * columns * 12;
        } else if (type.equals("Normal")){
            income = lines * columns * 7.50;
        } else if (type.equals("Discount")){
            income = lines * columns * 5;
        }

        System.out.printf("%.2f leva", income);
    }
}

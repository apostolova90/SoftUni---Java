package Exams.March2020;

import java.util.Scanner;

public class SuitcasesLoad_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double capacity = Double.parseDouble(scanner.nextLine());
        String command = scanner.nextLine();

        int counter = 0;

        boolean noMoreSpace = false;
        while(!command.equals("End")){
            double num = Double.parseDouble(command);
            counter++;

            if (counter % 3 == 0){
                num = num + num * 0.10;
            }

            if (capacity < num){
                noMoreSpace = true;
                counter--;
                break;
            } else {
                capacity -= num;
            }


            command = scanner.nextLine();
        }

        if (noMoreSpace){
            System.out.printf("No more space!%n");
        } else {
            System.out.printf("Congratulations! All suitcases are loaded!%n");
        }

        System.out.printf("Statistic: %s suitcases loaded.", counter);
    }
}

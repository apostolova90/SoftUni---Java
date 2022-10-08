package Exams.June2019;

import java.util.Scanner;

public class Cinema_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacity = Integer.parseInt(scanner.nextLine());
        int totalIncome = 0;

        boolean isFull = false;
        String command = scanner.nextLine();

        while(!command.equals("Movie time!")){
            int peoplePerGroup = Integer.parseInt(command);

            int currentIncome = peoplePerGroup * 5;

            if (peoplePerGroup % 3 == 0){
                currentIncome = currentIncome - 5;
            }

            totalIncome += currentIncome;
            capacity -= peoplePerGroup;

            if (capacity < 0){
                totalIncome -= currentIncome;
                System.out.println("The cinema is full.");
                System.out.printf("Cinema income - %s lv.", totalIncome);
                break;
            }
            command = scanner.nextLine();

        }

            if (capacity >= 0){
            System.out.printf("There are %s seats left in the cinema.%n", capacity);
            System.out.printf("Cinema income - %s lv.", totalIncome);
        }

    }
}

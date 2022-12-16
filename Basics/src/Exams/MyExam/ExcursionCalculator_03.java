package Exams.MyExam;

import java.util.Scanner;

public class ExcursionCalculator_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();

        double totalMoney = 0;

        switch(season){
            case "spring":
                if (numberOfPeople <= 5){
                    totalMoney = numberOfPeople * 50;
                } else {
                    totalMoney = numberOfPeople * 48;
                }
                break;
            case "summer":
                if (numberOfPeople <= 5){
                    totalMoney = numberOfPeople * 48.5;
                } else {
                    totalMoney = numberOfPeople * 45;
                }
                totalMoney -= totalMoney * 0.15;
                break;
            case "autumn":
                if (numberOfPeople <= 5){
                    totalMoney = numberOfPeople * 60;
                } else {
                    totalMoney = numberOfPeople * 49.50;
                }
                break;
            case "winter":
                if (numberOfPeople <= 5){
                    totalMoney = numberOfPeople * 86;
                } else {
                    totalMoney = numberOfPeople * 85;
                }
                totalMoney += totalMoney * 0.08;
                break;
        }

        System.out.printf("%.2f leva.", totalMoney);
    }
}

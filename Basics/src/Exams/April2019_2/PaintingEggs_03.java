package Exams.April2019_2;

import java.util.Scanner;

public class PaintingEggs_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String size = scanner.nextLine();
        String color = scanner.nextLine();
        int num = Integer.parseInt(scanner.nextLine());

        double totalIncome = 0;

        switch (size){
            case "Large":
                if (color.equals("Red")){
                    totalIncome += num * 16;
                } else if (color.equals("Green")){
                    totalIncome += num * 12;
                } else if (color.equals("Yellow")){
                    totalIncome += num * 9;
                }
                break;
            case "Medium":
                if (color.equals("Red")){
                    totalIncome += num * 13;
                } else if (color.equals("Green")){
                    totalIncome += num * 9;
                } else if (color.equals("Yellow")){
                    totalIncome += num * 7;
                }
                break;
            case "Small":
                if (color.equals("Red")){
                    totalIncome += num * 9;
                } else if (color.equals("Green")){
                    totalIncome += num * 8;
                } else if (color.equals("Yellow")){
                    totalIncome += num * 5;
                }
                break;
        }

        double finalMoney = totalIncome - (totalIncome * 0.35);
        System.out.printf("%.2f leva.", finalMoney);
    }
}

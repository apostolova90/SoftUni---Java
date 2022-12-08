package Exams.MyExam;

import java.util.Scanner;

public class everest_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startMeters = 5364;
        int wantedMeters = 8848;
        int totalDays = 1;

        boolean noMoreDays = false;
        boolean achieved = false;

        String command = scanner.nextLine();
        while(!command.equals("END")){
            String takesBreak = command;
            int currentMeters = Integer.parseInt(scanner.nextLine());

            if (takesBreak.equals("Yes")){
                totalDays++;
            }
            if (totalDays > 5){
                noMoreDays = true;
                break;
            } else {
                startMeters += currentMeters;
            }

            if (startMeters >= wantedMeters){
                achieved = true;
                break;
            }
            command = scanner.nextLine();
        }

        if (noMoreDays || startMeters < wantedMeters){
            System.out.printf("Failed!%n");
            System.out.printf("%s",startMeters);
        } else {
            System.out.printf("Goal reached for %s days!", totalDays);
        }
    }
}

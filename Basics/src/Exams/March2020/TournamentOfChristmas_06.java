package Exams.March2020;

import java.util.Scanner;

public class TournamentOfChristmas_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int winsPerDay = 0;
        int lostPerDay = 0;
        int winsTournament = 0;
        int lostTournament = 0;

        double moneyPerDay = 0;
        double totalMoney = 0;

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++){
            String command = scanner.nextLine();

            while(!command.equals("Finish")){
                String game = command;
                String winOrLose = scanner.nextLine();
                if (winOrLose.equals("win")){
                    moneyPerDay += 20;
                    winsPerDay++;
                } else {
                    lostPerDay++;
                }
                command = scanner.nextLine();
            }

            if (winsPerDay > lostPerDay){
                moneyPerDay = moneyPerDay + (moneyPerDay * 0.10);
                winsTournament++;
            } else {
                lostTournament++;
            }

            totalMoney += moneyPerDay;
            winsPerDay = 0;
            lostPerDay = 0;
            moneyPerDay = 0;
        }

        if (winsTournament > lostTournament){
            totalMoney = totalMoney + totalMoney * 0.20;
            System.out.printf("You won the tournament! Total raised money: %.2f", totalMoney);
        } else {
            System.out.printf("You lost the tournament! Total raised money: %.2f", totalMoney);
        }

    }
}

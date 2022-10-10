package Exams.June2019;

import java.util.Scanner;

public class MovieDay_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int timeWeHave = Integer.parseInt(scanner.nextLine());
        int numberOfScenes = Integer.parseInt(scanner.nextLine());
        int timeFOrOneScene = Integer.parseInt(scanner.nextLine());

        double prepping = timeWeHave * 0.15;
        double timeForAllScenes = numberOfScenes * timeFOrOneScene;
        double neededTime = prepping + timeForAllScenes;

        double difference = Math.abs(timeWeHave - neededTime);

        if (timeWeHave >= neededTime){
            System.out.printf("You managed to finish the movie on time! You have %.0f minutes left!", difference);
        } else {
            System.out.printf("Time is up! To complete the movie you need %.0f minutes.", difference);
        }
    }
}

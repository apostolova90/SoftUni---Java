package Exams.April2019;

import java.util.Scanner;

public class MovieRatings_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double maxNum = Integer.MIN_VALUE;
        double minNum = Integer.MAX_VALUE;

        double totalSumAllRatings = 0;
        String maxMovie = "";
        String minMovie = "";

        for (int i = 1; i <= n; i++){
            String name = scanner.nextLine();
            double rating = Double.parseDouble(scanner.nextLine());
            totalSumAllRatings += rating;

            if (rating > maxNum){
                maxNum = rating;
                maxMovie = name;
            }

            if (rating < minNum){
                minNum = rating;
                minMovie = name;
            }
        }

        double averageRating = totalSumAllRatings / n;

        System.out.printf("%s is with highest rating: %s%n", maxMovie, maxNum);
        System.out.printf("%s is with lowest rating: %s%n", minMovie, minNum);
        System.out.printf("Average rating: %.1f", averageRating);
    }
}

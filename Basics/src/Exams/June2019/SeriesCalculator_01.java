package Exams.June2019;

import java.util.Scanner;

public class SeriesCalculator_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameOfMovie = scanner.nextLine();
        int numberOfSeasons = Integer.parseInt(scanner.nextLine());
        int numberOfSeriesIn1Seoson = Integer.parseInt(scanner.nextLine());
        double timeOfEachSeries = Double.parseDouble(scanner.nextLine());

        double totalTimeForEachSeries = timeOfEachSeries + (timeOfEachSeries * 0.2);
        double totalTimeForEachSeason = (numberOfSeriesIn1Seoson * totalTimeForEachSeries) + 10;

        double totalTimeForAll = numberOfSeasons * totalTimeForEachSeason;

        System.out.printf("Total time needed to watch the %s series is %.0f minutes.", nameOfMovie, totalTimeForAll);
    }
}

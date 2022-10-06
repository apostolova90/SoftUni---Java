package WhileLoop.Lab;

import java.util.Scanner;

public class Graduation_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        int years = 1;
        double sumAllGrades = 0;
        int poorGradesCount = 0;


        boolean isExcluded = false;
        while(years <= 12) {

            if (poorGradesCount > 1){
                isExcluded = true;
                break;
            }

            double currentGrade = Double.parseDouble(scanner.nextLine());

            if (currentGrade < 4){
                poorGradesCount++;
                continue;
            }

            sumAllGrades += currentGrade;
            years++;
        }

        if (isExcluded){
            System.out.printf("%s has been excluded at %s grade%n", name, years);
        } else {
            double avgGrade = sumAllGrades / 12;
            System.out.printf("%s graduated. Average grade: %.2f", name, avgGrade);
        }
    }
}

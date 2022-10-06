package WhileLoop.Exercise;

import java.util.Scanner;

public class ExamPreparation_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfBadGrades = Integer.parseInt(scanner.nextLine());

        int counterBadGrades = 0;
        double totalAllGrades = 0;
        int gradesCounter = 0;

        String currentProblem = "";
        boolean isExcluded = false;

        String command = scanner.nextLine(); // взимаме командата

        while (!command.equals("Enough")){ // въртим, докато тя е равна на "Enough"

            currentProblem = command; // името на проблема, ще е равно на името на командата
            double currentGrade = Double.parseDouble(scanner.nextLine()); // под нова порменлива, взимаме оценката

            gradesCounter++;

            if (currentGrade <= 4){
                counterBadGrades++;
            }

            if (counterBadGrades == countOfBadGrades){
                isExcluded = true;
                break;
            }

            totalAllGrades += currentGrade;

            command = scanner.nextLine();
        }

        if (isExcluded){
            System.out.printf("You need a break, %s poor grades.", countOfBadGrades);
        } else {
            double evgGrade = totalAllGrades / gradesCounter;
            System.out.printf("Average score: %.2f%n", evgGrade);
            System.out.printf("Number of problems: %s%n", gradesCounter);
            System.out.printf("Last problem: %s", currentProblem);
        }
    }
}

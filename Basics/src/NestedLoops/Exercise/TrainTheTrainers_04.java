package NestedLoops.Exercise;

import java.util.Scanner;

public class TrainTheTrainers_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        double finalAssessment = 0;
        int counter = 0;

        while(!command.equals("Finish")){
            String name = command;
            counter++;
            double sumFOrEach = 0;
            for (int i = 1; i <= n; i++){
                double current = Double.parseDouble(scanner.nextLine());
                sumFOrEach += current;
            }
            finalAssessment += sumFOrEach;
            System.out.printf("%s - %.2f.%n", name, sumFOrEach / n);

            command = scanner.nextLine();
        }

        System.out.printf("Student's final assessment is %.2f.", finalAssessment / (counter * n));

    }
}

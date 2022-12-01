package Exams.March2019;

import java.util.Scanner;

public class FitnessCenter_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int back = 0;
        int chest = 0;
        int legs = 0;
        int abs = 0;
        int proteinShake = 0;
        int proteinBar = 0;


        for (int i = 1; i <= n; i++){
            String type = scanner.nextLine();

            if (type.equals("Back")){
                back++;
            } else if (type.equals("Chest")){
                chest++;
            } else if (type.equals("Legs")){
                legs++;
            } else if (type.equals("Abs")){
                abs++;
            } else if (type.equals("Protein shake")){
                proteinShake++;
            } else if (type.equals("Protein bar")){
                proteinBar++;
            }
        }

        double numberOfActuallyTraining = back + chest + legs + abs;
        double protein = proteinShake + proteinBar;

        double percentTraining = numberOfActuallyTraining / n * 100;
        double percentProtein = protein / n * 100;

        System.out.printf("%s - back%n", back);
        System.out.printf("%s - chest%n", chest);
        System.out.printf("%s - legs%n", legs);
        System.out.printf("%s - abs%n", abs);
        System.out.printf("%s - protein shake%n", proteinShake);
        System.out.printf("%s - protein bar%n", proteinBar);
        System.out.printf("%.2f%% - work out%n", percentTraining);
        System.out.printf("%.2f%% - protein", percentProtein);
    }
}

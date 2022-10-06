package WhileLoop.Exercise;

import java.util.Scanner;

public class Walking_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int allStepsMade = 0;
        boolean isGoingHome = false;

        while(allStepsMade < 10000){

            String input = scanner.nextLine();

            if (input.equals("Going home")){ // ако получа тази команда, прескачам и всимам следващия ред в инпута
                isGoingHome = true;
                int steps = Integer.parseInt(scanner.nextLine());
                allStepsMade += steps;
                break;
            } else {
                int steps = Integer.parseInt(input);
                allStepsMade += steps;
            }
        }

        if (isGoingHome && allStepsMade < 10000){
            System.out.printf("%s more steps to reach goal.", 10000 - allStepsMade);
        } else {
            System.out.println("Goal reached! Good job!");
            System.out.printf("%s steps over the goal!", allStepsMade - 10000);
        }
    }
}

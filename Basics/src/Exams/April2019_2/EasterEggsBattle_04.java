package Exams.April2019_2;

import java.util.Scanner;

public class EasterEggsBattle_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int eggsFirstPlayer = Integer.parseInt(scanner.nextLine());
        int eggsSecondPlayer = Integer.parseInt(scanner.nextLine());

        boolean isTrue = false;

        String command = scanner.nextLine();

        while(!command.equals("End")){

            if (command.equals("one")){
                eggsSecondPlayer -= 1;
            } else {
                eggsFirstPlayer -= 1;
            }

            if (eggsFirstPlayer == 0){
                isTrue = true;
                System.out.printf("Player one is out of eggs. Player two has %s eggs left.", eggsSecondPlayer);
                break;
            } else if (eggsSecondPlayer == 0) {
                isTrue = true;
                System.out.printf("Player two is out of eggs. Player one has %s eggs left.", eggsFirstPlayer);
                break;
            }

            command = scanner.nextLine();
        }

        if (!isTrue){
            System.out.printf("Player one has %s eggs left.%n", eggsFirstPlayer);
            System.out.printf("Player two has %s eggs left.", eggsSecondPlayer);
        }

    }
}

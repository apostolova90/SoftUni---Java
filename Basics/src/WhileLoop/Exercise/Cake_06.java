package WhileLoop.Exercise;

import java.util.Scanner;

public class Cake_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int piecesOfCake = width * length;

        boolean isNotEnough = false;
        String command = scanner.nextLine();

        while (!command.equals("STOP")){
            int piecesTaken = Integer.parseInt(command);

            piecesOfCake -= piecesTaken;
            if (piecesOfCake < 0){
                isNotEnough = true;
                break;
            }

            command = scanner.nextLine();
        }

        if (isNotEnough){
            System.out.printf("No more cake left! You need %s pieces more.", Math.abs(piecesOfCake));
        } else {
            System.out.printf("%s pieces are left.", piecesOfCake);
        }
    }
}

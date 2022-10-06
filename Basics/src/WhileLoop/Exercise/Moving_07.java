package WhileLoop.Exercise;

import java.util.Scanner;

public class Moving_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    int a = Integer.parseInt(scanner.nextLine());
    int b = Integer.parseInt(scanner.nextLine());
    int h = Integer.parseInt(scanner.nextLine());

    boolean isNoMoreSpace = false;
    int totalSpace = a * b * h;

    String command = scanner.nextLine();

    while (!command.equals("Done")){

        int boxes = Integer.parseInt(command);
        totalSpace -= boxes;

        if (totalSpace < 0){
            isNoMoreSpace = true;
            break;
        }

        command = scanner.nextLine();
    }

    if (isNoMoreSpace){
        System.out.printf("No more free space! You need %s Cubic meters more.", Math.abs(totalSpace));
    } else {
        System.out.printf("%s Cubic meters left.", totalSpace);
    }

    }
}

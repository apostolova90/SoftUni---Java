package WhileLoop.Exercise;

import java.util.Scanner;

public class OldBooks_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String wantedBook = scanner.nextLine();
        String input = scanner.nextLine();

        int counter = 0;
        boolean isFound = false; // създаваме булева, за д аможем след while цикъла да проверим за главното условие и да принтираме

        while (!input.equals("No More Books")) {

            if (input.equals(wantedBook)) {
                isFound = true;
                break;
            }
            counter++;

            input = scanner.nextLine();
        }

        if (isFound){
            System.out.printf("You checked %s books and found it.", counter);
        } else {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %s books.", counter);
        }
    }
}

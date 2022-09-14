package FirstStepsInCoding.Lab;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   // прочитане на входни данни от конзолата:
        int a = Integer.parseInt(scanner.nextLine()); // създаваме променлива 1, като я променяме от стринг към число
        int b = Integer.parseInt(scanner.nextLine()); // създаваме променлива 1, като я променяме от стринг към число

        int area = a * b; //обработка на данни (аритметрични операции)
        System.out.println(area); // принтиране на резултата
    }
}

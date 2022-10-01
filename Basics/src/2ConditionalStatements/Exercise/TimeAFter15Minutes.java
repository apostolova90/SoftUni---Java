package ConditionalStatements.Exercise;

import java.util.Scanner;

public class TimeAFter15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int totalMinutes = (hour * 60) + minutes + 15;

        int hourAfter15 = totalMinutes / 60;
        int minutesAfter15 = totalMinutes % 60;

        if (hourAfter15 == 24){
            hourAfter15 = 0;
        }

        if (minutesAfter15 < 10){
            System.out.printf("%d:0%d", hourAfter15, minutesAfter15);
        } else {
            System.out.printf("%d:%d", hourAfter15, minutesAfter15);
        }
    }
}

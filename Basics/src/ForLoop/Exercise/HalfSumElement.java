package ForLoop.Exercise;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        int maxNum = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++){
            int currentNum = Integer.parseInt(scanner.nextLine());
            sum += currentNum; // първо намираме сбора на всички числа, но в него е включено и най- голямо число

            if (currentNum > maxNum){ // затова намираме кое е то, записваме стойността му
                maxNum = currentNum;
            }
        }

        sum = sum - maxNum; // и го изваждаме от общата сума на всички числа

        if (maxNum == sum){
            System.out.println("Yes");
            System.out.printf("Sum = %d", maxNum);
        } else {
            int difference = Math.abs(maxNum - sum);
            System.out.println("No");
            System.out.printf("Diff = %d", difference);
        }
    }
}

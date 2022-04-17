package Arrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

        for (int index = 0; index <= numbers.length - 1; index++) {
            int number = numbers[index];
            if (index == numbers.length - 1) {//ако е последното число
                System.out.print(number);
                break;
            }
            boolean topInteger = false;
            for (int i = index + 1; i <= numbers.length - 1; i++) {
                if (number > numbers[i]) {
                    topInteger = true;
                } else {
                    topInteger = false;
                    break;
                }
            }
            if (topInteger) {
                System.out.print(number + " ");
            }

        }
    }
}

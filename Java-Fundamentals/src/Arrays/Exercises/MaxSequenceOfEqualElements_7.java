package Arrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int count = 0;
        int maxCount = 0;
        int digit = 0;

        for (int index = 0; index < numbers.length - 1; index++) {
            //трябва да проверя дали числото на моя индекс е равно на следващото, дали следващото число е равно на това до него и така нататък
            // иска се да отпечатам най-левите равни числа, ако има две или три поредни равни числа
            if (numbers[index] == numbers[index + 1]) {
                count++;

                if (count > maxCount) {
                    maxCount = count;
                    digit = numbers[index];
                }
            } else {
                count = 0;
            }
        }
        for (int i = 1; i <= maxCount + 1; i++) {
            System.out.print(digit + " ");
        }

    }
}


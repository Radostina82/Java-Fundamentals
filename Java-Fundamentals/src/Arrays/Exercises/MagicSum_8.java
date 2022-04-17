package Arrays.Exercises;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MagicSum_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numbers.length - 1; i++) {
            int num = numbers[i];
            for (int j = i + 1; j <= numbers.length - 1; j++) {
                int num2 = numbers[j];
                if (num + num2== n) {
                    System.out.println(num + " " + num2);
                }
            }
        }

    }
}

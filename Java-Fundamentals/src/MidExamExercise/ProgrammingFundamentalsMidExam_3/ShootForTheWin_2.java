package MidExamExercise.ProgrammingFundamentalsMidExam_3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ShootForTheWin_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] number = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        String input = scanner.nextLine();
        int countTarget = 0;

        while (!input.equals("End")) {
            int index = Integer.parseInt(input);

            if (index > number.length - 1) {
                input=scanner.nextLine();
                continue;
            }
            int digit = number[index];
            if (digit != -1) {
                number[index] = -1;
                countTarget++;
            }
            for (int i = 0; i <= number.length - 1; i++) {
                int element = number[i];

                if (digit < element) {
                    number[i] = element - digit;
                } else if (digit >= element && element != -1) {
                    number[i]= element + digit;
                }
            }

            input = scanner.nextLine();
        }
        System.out.printf("Shot targets: %d -> ", countTarget);
        for (int i : number) {
            System.out.print(i + " ");

        }
    }
}

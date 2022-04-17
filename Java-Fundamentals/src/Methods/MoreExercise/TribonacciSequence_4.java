package Methods.MoreExercise;

import java.util.Scanner;

public class TribonacciSequence_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        long[] number = tribonacciSequence(n);

        for (long num : number) {
            System.out.print(num + " ");
        }
    }

    public static long[] tribonacciSequence(int n) {
        long[] result = new long[n];

        for (int i = 0; i <= n - 1; i++) {
            if (i == 0) {
                result[i] = 1;
            } else if (i == 1) {
                result[i] = 1;
            } else if (i == 2) {
                result[i] = 2;
            } else {
                result[i] = result[i - 3] + result[i - 2] + result[i - 1];
            }
        }
        return result;
    }
}

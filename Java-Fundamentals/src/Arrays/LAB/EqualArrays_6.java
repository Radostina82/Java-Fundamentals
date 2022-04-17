package Arrays.LAB;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num1 = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int[] num2 = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int sum = 0;
        boolean isDiferrent = false;
        for (int i = 0; i <= num1.length - 1; i++) {

            if (num1[i] == num2[i]) {
                sum += num1[i];
            } else {
                isDiferrent = true;
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                break;
            }
        }
        if (!isDiferrent) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }
    }
}


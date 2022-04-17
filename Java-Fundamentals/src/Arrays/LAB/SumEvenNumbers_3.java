package Arrays.LAB;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int sum = 0;
        for (int i = 0; i <= num.length - 1; i++) {
            if (num[i] % 2 == 0) {
                sum += num[i];
            }
        }
        System.out.println(sum);
    }
}

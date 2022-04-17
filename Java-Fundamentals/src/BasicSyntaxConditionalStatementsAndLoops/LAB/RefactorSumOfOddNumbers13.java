package BasicSyntaxConditionalStatementsAndLoops.LAB;

import java.util.Scanner;

public class RefactorSumOfOddNumbers13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int x = 2 * i + 1;
            if (x % 2 != 0) {
                System.out.println(x);
                sum += x;
            }
        }
        System.out.printf("Sum: %d%n", sum);
    }
}

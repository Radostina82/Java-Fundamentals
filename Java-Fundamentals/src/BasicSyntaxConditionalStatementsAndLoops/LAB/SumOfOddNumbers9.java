package BasicSyntaxConditionalStatementsAndLoops.LAB;

import java.util.Scanner;

public class SumOfOddNumbers9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                n -= 1;
                sum += i;
                System.out.println(i);
            }
            if (n == 0){
                break;
            }
        }
        System.out.printf("Sum: %d", sum);
    }
}

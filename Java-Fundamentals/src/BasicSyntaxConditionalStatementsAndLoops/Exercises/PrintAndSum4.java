package BasicSyntaxConditionalStatementsAndLoops.Exercises;

import java.util.Scanner;

public class PrintAndSum4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = n; i <=b ; i++) {
            System.out.print(i + " ");
            sum += i;
        }
        System.out.println();
        System.out.printf("Sum: %d",sum);
    }
}

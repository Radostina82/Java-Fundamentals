package BasicSyntaxConditionalStatementsAndLoops.LAB;

import java.util.Scanner;

public class MultiplicationTable2011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int x = Integer.parseInt(scanner.nextLine());

        for (int y = x; y <= 10; y++) {
            System.out.printf("%d X %d = %d%n", n, y, n * y);
        }
        if (x > 10) {
            System.out.printf("%d X %d = %d%n", n, x, n * x);
        }
    }
}

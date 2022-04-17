package BasicSyntaxConditionalStatementsAndLoops.LAB;

import java.util.Scanner;

public class MultiplicationTable10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());


            for (int y = 1; y <= 10; y++) {
                System.out.printf("%d X %d = %d%n", n, y, n * y);
        }
    }
}

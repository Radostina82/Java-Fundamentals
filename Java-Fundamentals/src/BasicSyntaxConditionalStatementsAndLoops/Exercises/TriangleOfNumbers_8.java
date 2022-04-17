package BasicSyntaxConditionalStatementsAndLoops.Exercises;

import java.util.Scanner;

public class TriangleOfNumbers_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int output = Integer.parseInt(scanner.nextLine());

        for (int row = 1; row <= output; row++) {
            for (int count = 1; count <= row; count++) {// на реда да има толкова числа колкото номера на реда
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }
}

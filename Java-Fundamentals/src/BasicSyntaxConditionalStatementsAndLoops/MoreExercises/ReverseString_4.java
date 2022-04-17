package BasicSyntaxConditionalStatementsAndLoops.MoreExercises;

import java.util.Scanner;

public class ReverseString_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String output = scanner.nextLine();
        StringBuilder reversesBuilder = new StringBuilder();

        for (int i = output.length() - 1; i >= 0; i--) {
            char currentSimbol = output.charAt(i);
            reversesBuilder.append(currentSimbol);
        }
        String reverses = reversesBuilder.toString();
        System.out.print(reverses);
    }
}

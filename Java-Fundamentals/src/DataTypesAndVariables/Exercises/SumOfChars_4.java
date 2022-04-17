package DataTypesAndVariables.Exercises;

import java.util.Scanner;

public class SumOfChars_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 1; i <= count ; i++) {
            char symbol = scanner.nextLine().charAt(0);
            sum += (int)symbol;
        }
        System.out.printf("The sum equals: %d", sum);
    }
}

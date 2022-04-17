package DataTypesAndVariables.MoreExercise;

import java.util.Scanner;

public class DecryptingMessages_5StringBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int key = Integer.parseInt(scanner.nextLine());
        int count = Integer.parseInt(scanner.nextLine());
        StringBuilder letter = new StringBuilder();
        for (int i = 1; i <= count; i++) {
            char symbol = scanner.nextLine().charAt(0);
            int sum = key + symbol;
            char character = (char)sum;
            letter.append(character);
        }
        String newLetter = letter.toString();
        System.out.println(newLetter);
    }
}

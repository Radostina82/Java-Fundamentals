package TextProcessingExercise;

import java.util.Scanner;

public class ValidUsernames_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");

        for (String word : input) {
            if (isValidUsername(word)) {
                System.out.println(word);
            }

        }
    }

    public static boolean isValidUsername(String username) {
        if (username.length() < 3 || username.length() > 16) {
            return false;
        }
        for (int i = 0; i <= username.length() - 1; i++) {
            char currentSymbol = username.charAt(i);
            if (!Character.isLetterOrDigit(currentSymbol) && currentSymbol != '-' && currentSymbol != '_') {
                return false;
            }
        }
        return true;
    }
}

package Methods.Exercise;

import java.util.Scanner;

public class PalindromeIntegers_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.equals("END")) {
            palindromeIntegers(input);
            input = scanner.nextLine();
        }
    }

    private static void palindromeIntegers(String input) {
        if (checkTheNumberForPalindrome(input)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    private static boolean checkTheNumberForPalindrome(String input) {
        StringBuilder reversedNumber = new StringBuilder();
        for (int i = input.length()-1; i >=0; i--) {
            char symbol = input.charAt(i);
            reversedNumber.append(symbol);
        }
        String newReversedNumber = reversedNumber.toString();
        return newReversedNumber.equals(input);
    }
}

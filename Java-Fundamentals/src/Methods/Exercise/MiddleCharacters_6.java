package Methods.Exercise;

import java.util.Scanner;

public class MiddleCharacters_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
printMiddleCharacter(input);
    }

    private static void printMiddleCharacter(String input) {
        if (input.length() % 2 == 1) {
            System.out.println(input.charAt(input.length()/2));
        }else{
            char symbol1 = input.charAt(input.length()/2-1);
            char symbol2 = input.charAt(input.length()/2);
            System.out.printf("%c%c", symbol1, symbol2);
        }

    }
}

package DataTypesAndVariables.MoreExercise;

import java.util.Scanner;

public class DecryptingMessages_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int key = Integer.parseInt(scanner.nextLine());
        int countCharacter = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        String letter = "";
        for (int i = 1; i <= countCharacter ; i++) {
            char symbol = scanner.nextLine().charAt(0);
            sum = key + symbol;
            char character = (char) sum;
            letter += character;
        }
        System.out.println(letter);
    }
}

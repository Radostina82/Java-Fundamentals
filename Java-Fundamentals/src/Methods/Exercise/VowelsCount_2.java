package Methods.Exercise;

import java.util.Scanner;

public class VowelsCount_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        printsCountVowels(input);

    }

    private static void printsCountVowels(String input) {
        int count = 0;
        for (int i = 0; i <= input.length()-1 ; i++) {
            char letter = input.charAt(i);
            if (letter == 'a' || letter == 'o' || letter == 'e' || letter == 'i' || letter == 'u' || letter == 'A'
            || letter == 'O' || letter == 'E' || letter == 'I' || letter == 'U'){
                count++;
            }
        }
        System.out.println( Integer.toString(count));

    }
}

package TextProcessingExercise;

import java.util.Scanner;

public class CaesarCipher_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder encryptedSentence  = new StringBuilder();

        for (int i = 0; i <= input.length()-1 ; i++) {
            char currentSymbol = input.charAt(i);
           // char encryptedSymbol = (char) (currentSymbol+3);
            encryptedSentence.append((char)(currentSymbol+3));
        }
        System.out.println(encryptedSentence);
    }
}

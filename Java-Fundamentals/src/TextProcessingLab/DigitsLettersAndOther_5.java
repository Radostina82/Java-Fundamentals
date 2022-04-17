package TextProcessingLab;

import java.util.Scanner;

public class DigitsLettersAndOther_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder other = new StringBuilder();

        for (int i = 0; i <= input.length()-1 ; i++) {
            char currentSymbol = input.charAt(i);
            if (Character.isDigit(currentSymbol)){
                digits.append(currentSymbol);
            }else if (Character.isAlphabetic(currentSymbol)){
                letters.append(currentSymbol);
            }else{
                other.append(currentSymbol);
            }
        }
        System.out.println(digits);
        System.out.println(letters);
        System.out.println(other);
    }
}

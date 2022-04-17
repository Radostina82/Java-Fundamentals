package TextProcessingLab;

import java.util.Scanner;

public class TextFilter_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String []forbiddenWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (String forbiddenWord : forbiddenWords) {
            if (text.contains(forbiddenWord)){
                StringBuilder wordOfStars = new StringBuilder();
                for (int i = 0; i <= forbiddenWord.length()-1 ; i++) {
                    wordOfStars.append("*");
                }
                text = text.replace(forbiddenWord, wordOfStars.toString());
            }
        }
        System.out.println(text);
    }
}

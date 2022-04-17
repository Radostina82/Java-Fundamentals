package TextProcessingExercise;

import java.util.Scanner;

public class CharacterMultiplier_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        char[] firstWord = input[0].toCharArray();
        char[] secondWord = input[1].toCharArray();

        int sum = 0;
        int shortes = Math.min(firstWord.length, secondWord.length);
        int longest = Math.max(firstWord.length, secondWord.length);

        for (int i = 0; i <= shortes-1; i++) {
            sum += firstWord[i] * secondWord[i];
        }

        if (firstWord.length > secondWord.length) {
            for (int i = shortes; i <= longest - 1; i++) {
                sum += firstWord[i];
            }
        } else if (firstWord.length < secondWord.length) {
            for (int i = shortes; i <= longest - 1; i++) {
                sum += secondWord[i];
            }
        }
        System.out.println(sum );
    }

}

package TextProcessingExercise;

import java.util.Scanner;

public class LettersChangeNumbers_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
//A12b s17G
        double totalSum = 0.0;
        for (String word : input) {
            char firstLetter = word.charAt(0);
            char secondLetter = word.charAt(word.length()-1);
            double number = Double.parseDouble(word.substring(1,word.length()-1));
            double result = 0.0;

            if (Character.isUpperCase(firstLetter)){
                result = number/(firstLetter-64);
                number=result;
            }else if (Character.isLowerCase(firstLetter)){
                result = number * (firstLetter - 96);
                number = result;
            }

            if (Character.isUpperCase(secondLetter)){
                result = number - (secondLetter-64);
                number = result;
            }else if (Character.isLowerCase(secondLetter)){
                result = number + (secondLetter-96);
                number = result;
            }
            totalSum += number;
        }
        System.out.printf("%.2f", totalSum);
    }
}

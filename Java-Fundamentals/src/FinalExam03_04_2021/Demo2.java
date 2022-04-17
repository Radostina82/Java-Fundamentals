package FinalExam03_04_2021;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n ; i++) {
            String input = scanner.nextLine();
            String regex = "!(?<firstWord>[A-Z][a-z]{2,})!:\\[(?<secondWord>[A-Za-z]{8,})\\]";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()){
                String firstWord = matcher.group("firstWord");
                String secondWord = matcher.group("secondWord");
                List<Integer> wordsInInteger = getWordInInt(secondWord);
                System.out.print(firstWord + ": ");

                for (int j = 0; j <= wordsInInteger.size()-1 ; j++) {
                    int number = wordsInInteger.get(j);
                    if (j==wordsInInteger.size()-1){
                        System.out.print( number);
                        break;
                    }
                    System.out.print(number + " ");
                }
                System.out.println();
            }else{
                System.out.println("The message is invalid");
            }
        }
    }

    private static List<Integer> getWordInInt(String secondWord) {
        List<Integer> integers = new ArrayList<>();

        for (int i = 0; i <= secondWord.length()-1 ; i++) {
            char currentChar = secondWord.charAt(i);
            integers.add((int) currentChar);
        }
        return integers;
    }
}

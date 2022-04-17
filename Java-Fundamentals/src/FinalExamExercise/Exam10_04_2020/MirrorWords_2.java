package FinalExamExercise.Exam10_04_2020;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MirrorWords_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String regex = "([@#])(?<firstWord>[A-Za-z]{3,})\\1\\1(?<secondWord>[A-Za-z]{3,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        List<String> words = new ArrayList<>();
        int count = 0;

        while (matcher.find()) {
            count++;

            String firstWord = matcher.group("firstWord");
            String secondWord = matcher.group("secondWord");
            StringBuilder reversWord = new StringBuilder(firstWord);
            reversWord = reversWord.reverse();
            String revers = reversWord.toString();

            if (revers.equals(secondWord)){
                words.add(String.format("%s <=> %s", firstWord, secondWord));
            }
        }
        if (count==0){
            System.out.println("No word pairs found!");
        }else{
            System.out.println(count + " word pairs found!");
        }
        if (words.isEmpty()){
            System.out.println("No mirror words!");
        }else{
            System.out.println("The mirror words are:");
            System.out.println(String.join(", ", words));
        }
    }
}

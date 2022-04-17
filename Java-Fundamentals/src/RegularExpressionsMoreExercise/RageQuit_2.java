package RegularExpressionsMoreExercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RageQuit_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String regex = "(?<char>[\\D]*)(?<digit>[0-9]+)";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        StringBuilder finalResult = new StringBuilder();

       while (matcher.find()){
           int count = Integer.parseInt(matcher.group("digit"));
           String letters = matcher.group("char").toUpperCase();
           for (int i = 1; i <=count ; i++) {
               finalResult.append(letters);
           }
       }

        System.out.printf("Unique symbols used: %d%n", finalResult.chars().distinct().count());
        System.out.println(finalResult);
    }
}

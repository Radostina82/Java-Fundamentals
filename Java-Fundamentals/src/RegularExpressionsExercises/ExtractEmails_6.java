package RegularExpressionsExercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String regex = "(?<user>[A-Za-z0-9]+\\.*-*_*[a-z0-9]*)@(?<host>[a-z]+-*[a-z]*\\.[a-z]+\\.*[a-z]+)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()){
            System.out.println(matcher.group("user") + "@" + matcher.group("host")) ;
        }
    }
}

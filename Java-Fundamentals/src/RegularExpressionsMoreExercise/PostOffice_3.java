package RegularExpressionsMoreExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PostOffice_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String []input = scanner.nextLine().split("\\|");
        String first = input[0];
        String second = input[1];
        String third = input[2];

        String regexWord = "([#$%*&])(?<group>[A-Z]+)\\1";
        Pattern pattern = Pattern.compile(regexWord);
        Matcher matcher = pattern.matcher(first);
        String capitalLetter = "";
        Map<Character, Integer> letters = new LinkedHashMap<>();

        while (matcher.find()){
            capitalLetter = matcher.group("group");
        }
        for (int i = 0; i <= capitalLetter.length()-1 ; i++) {
            char character = capitalLetter.charAt(i);
            String regexNumber = "([0-9]{2}):([0-9]{2})";
            Pattern pattern1 = Pattern.compile(regexNumber);
            Matcher matcher1 = pattern1.matcher(second);
            while (matcher1.find()){
                int number = Integer.parseInt(matcher1.group(1));
                int length = Integer.parseInt(matcher1.group(2));

                if (character == number && !letters.containsKey(character)){
                    letters.put(character, length+1);
                    break;
                }
            }
        }

        String []word = third.trim().split("\\s+");

        for (int i = 0; i <= capitalLetter.length()-1 ; i++) {
            char firstLetter = capitalLetter.charAt(i);
            int length = letters.get(firstLetter);

            for (String s : word) {
                int lengthS = s.length();
                String firstCapitalLetter = s.substring(0,1);
                char firstChar = firstCapitalLetter.charAt(0);

                if (length==lengthS && firstLetter==firstChar){
                    System.out.println(s);
                }
            }
        }
    }
}

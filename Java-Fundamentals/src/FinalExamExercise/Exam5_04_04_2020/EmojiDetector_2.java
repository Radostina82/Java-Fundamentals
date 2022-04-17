package FinalExamExercise.Exam5_04_04_2020;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiDetector_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String regexDigit = "[0-9]";
        String regexEmoji = "(?<separator>[:*])\\1(?<emoji>[A-Z][a-z]{2,})\\1\\1";
        Pattern patternDigit = Pattern.compile(regexDigit);
        Matcher matcherDigit = patternDigit.matcher(text);

        List<String> coolEmojis = new ArrayList<>();

        long coolThresholdSum = 1;
        while (matcherDigit.find()) {
            int digit = Integer.parseInt(matcherDigit.group());
            coolThresholdSum *= digit;
        }
        System.out.println("Cool threshold: " + coolThresholdSum);

        Pattern patternEmoji = Pattern.compile(regexEmoji);
        Matcher matcherEmoji = patternEmoji.matcher(text);

        int count = 0;
        while (matcherEmoji.find()) {
            count++;

            String symbol = matcherEmoji.group("separator");
            String emoji = matcherEmoji.group("emoji");

           int coolness = getCoolness(emoji);
            if (coolness >= coolThresholdSum) {
                String coolEmoji = symbol + symbol + emoji + symbol + symbol;
                coolEmojis.add(coolEmoji);
            }
        }


        System.out.println(count + " emojis found in the text. The cool ones are:");
        for (String coolEmoji : coolEmojis) {
            System.out.println(coolEmoji);
        }

    }

    private static int getCoolness(String emoji) {
        int coolness = 0;
        for (int i = 0; i <= emoji.length() - 1; i++) {
            char currentSymbol = emoji.charAt(i);
            coolness += currentSymbol;
        }
        return coolness;
    }
}

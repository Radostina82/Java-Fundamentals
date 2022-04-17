package RegularExpressionsMoreExercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SantasSecretHelper_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int key = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        List<String> list = new ArrayList<>();

        while (!input.equals("end")) {
            String subtractingInput = getSubtractingInput(input, key);
            String regex = "@(?<name>[A-Za-z]+)([^@!\\-:>]*)!(?<behaviourType>[GN])!";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(subtractingInput);
            if (matcher.find()) {
                String name = matcher.group("name");
                String behaviourType = matcher.group("behaviourType");
                if (!behaviourType.equals("N")) {
                    list.add(name);
                }
            }

            input = scanner.nextLine();
        }
        for (String s : list) {
            System.out.println(s);
        }
    }

    private static String getSubtractingInput(String input, int key) {
        StringBuilder subtracting = new StringBuilder();

        for (int i = 0; i <= input.length() - 1; i++) {
            char currentChar = input.charAt(i);
            subtracting.append((char) (currentChar - key));
        }
        return subtracting.toString();
    }
}


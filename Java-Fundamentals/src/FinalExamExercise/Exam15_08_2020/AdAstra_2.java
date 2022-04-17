package FinalExamExercise.Exam15_08_2020;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String regex = "([|#])(?<nameProduct>[A-Za-z]+\\s*[A-Za-z]*)\\1(?<date>[0-9]{2}/[0-9]{2}/[0-9]{2})\\1(?<cal>[0-9]+)\\1";
        int allCalories = 0;
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        List<String> allProduct = new ArrayList<>();

        while (matcher.find()) {
            String foodName = matcher.group("nameProduct");
            String date = matcher.group("date");
            int cal = Integer.parseInt(matcher.group("cal"));
            allProduct.add(String.format("Item: %s, Best before: %s, Nutrition: %d", foodName, date, cal));
            allCalories += cal;
        }
        double days = Math.floor(allCalories * 1.0 / 2000);
        if (days > 0) {
            System.out.printf("You have food to last you for: %.0f days!%n", days);
            for (String s : allProduct) {
                System.out.println(s);
            }

        }else{
            System.out.println("You have food to last you for: 0 days!");
        }
    }
}
